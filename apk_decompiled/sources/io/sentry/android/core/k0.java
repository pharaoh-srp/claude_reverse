package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import defpackage.a6;
import io.sentry.n4;
import io.sentry.t5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Runnable {
    public final Context E;
    public final n4 F;
    public final SentryAndroidOptions G;
    public final i0 H;
    public final long I;

    public k0(Context context, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.c cVar, i0 i0Var) {
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext != null ? applicationContext : context;
        this.F = n4.a;
        this.G = sentryAndroidOptions;
        this.H = i0Var;
        cVar.getClass();
        this.I = System.currentTimeMillis() - 7862400000L;
    }

    public final void a(ApplicationExitInfo applicationExitInfo, boolean z) {
        i0 i0Var = this.H;
        j0 j0VarM = i0Var.m(applicationExitInfo, z);
        if (j0VarM == null) {
            return;
        }
        if (this.F.I(j0VarM.c(), j0VarM.g()).equals(io.sentry.protocol.w.F) || j0VarM.e().d()) {
            return;
        }
        this.G.getLogger().h(t5.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", i0Var.h(), j0VarM.c().E);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ApplicationExitInfo applicationExitInfoG;
        ActivityManager activityManager = (ActivityManager) this.E.getSystemService("activity");
        SentryAndroidOptions sentryAndroidOptions = this.G;
        if (activityManager == null) {
            sentryAndroidOptions.getLogger().h(t5.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            sentryAndroidOptions.getLogger().h(t5.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
            if (!cVar.k()) {
                sentryAndroidOptions.getLogger().h(t5.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                cVar.I.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        i0 i0Var = this.H;
        Long lG = i0Var.g();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                applicationExitInfoG = null;
                break;
            }
            applicationExitInfoG = a6.g(it.next());
            if (applicationExitInfoG.getReason() == i0Var.b()) {
                it.remove();
                break;
            }
        }
        if (applicationExitInfoG == null) {
            sentryAndroidOptions.getLogger().h(t5.DEBUG, "No %ss have been found in the historical exit reasons list.", i0Var.h());
            return;
        }
        long timestamp = applicationExitInfoG.getTimestamp();
        long j = this.I;
        if (timestamp < j) {
            sentryAndroidOptions.getLogger().h(t5.DEBUG, "Latest %s happened too long ago, returning early.", i0Var.h());
            return;
        }
        if (lG != null && applicationExitInfoG.getTimestamp() <= lG.longValue()) {
            sentryAndroidOptions.getLogger().h(t5.DEBUG, "Latest %s has already been reported, returning early.", i0Var.h());
            return;
        }
        if (i0Var.l()) {
            Collections.reverse(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ApplicationExitInfo applicationExitInfoG2 = a6.g(it2.next());
                if (applicationExitInfoG2.getReason() == i0Var.b()) {
                    if (applicationExitInfoG2.getTimestamp() < j) {
                        sentryAndroidOptions.getLogger().h(t5.DEBUG, "%s happened too long ago %s.", i0Var.h(), applicationExitInfoG2);
                    } else if (lG == null || applicationExitInfoG2.getTimestamp() > lG.longValue()) {
                        a(applicationExitInfoG2, false);
                    } else {
                        sentryAndroidOptions.getLogger().h(t5.DEBUG, "%s has already been reported %s.", i0Var.h(), applicationExitInfoG2);
                    }
                }
            }
        }
        a(applicationExitInfoG, true);
    }
}
