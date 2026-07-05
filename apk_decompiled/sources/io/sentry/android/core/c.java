package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import defpackage.cd;
import defpackage.f60;
import defpackage.j01;
import io.sentry.t5;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final io.sentry.util.h a;
    public final SentryAndroidOptions b;
    public final ConcurrentHashMap c;
    public final WeakHashMap d;
    public final q0 e;
    public final io.sentry.util.a f;
    public final io.sentry.util.h g;

    public c(io.sentry.android.core.internal.gestures.h hVar, SentryAndroidOptions sentryAndroidOptions) {
        q0 q0Var = new q0();
        this.c = new ConcurrentHashMap();
        this.d = new WeakHashMap();
        this.f = new io.sentry.util.a();
        this.g = new io.sentry.util.h(new cd(hVar, sentryAndroidOptions.getLogger()));
        this.a = new io.sentry.util.h(new io.sentry.e0(9));
        this.b = sentryAndroidOptions;
        this.e = q0Var;
    }

    public final void a(Activity activity) {
        io.sentry.v vVarA = this.f.a();
        try {
            if (!c()) {
                vVarA.close();
                return;
            }
            d(new j01(this, 17, activity), "FrameMetricsAggregator.add");
            b bVarB = b();
            if (bVarB != null) {
                this.d.put(activity, bVarB);
            }
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final b b() {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!c() || !((Boolean) this.g.a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrE = ((FrameMetricsAggregator) this.a.a()).a.e();
        int i3 = 0;
        if (sparseIntArrayArrE.length <= 0 || (sparseIntArray = sparseIntArrayArrE[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i2 += iValueAt;
                } else if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new b(i3, i, i2);
    }

    public final boolean c() {
        if (!((Boolean) this.g.a()).booleanValue()) {
            return false;
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        return sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2();
    }

    public final void d(Runnable runnable, String str) {
        try {
            if (io.sentry.android.core.internal.util.f.a.c()) {
                runnable.run();
                return;
            }
            q0 q0Var = this.e;
            ((Handler) q0Var.a).post(new f60(this, runnable, str, 12));
        } catch (Throwable unused) {
            if (str != null) {
                this.b.getLogger().h(t5.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }
}
