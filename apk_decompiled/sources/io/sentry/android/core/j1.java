package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import defpackage.cd;
import defpackage.xh6;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.s4;
import io.sentry.t4;
import io.sentry.t5;
import io.sentry.v2;
import io.sentry.w6;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {
    public static final long a = SystemClock.uptimeMillis();
    public static final io.sentry.util.a b = new io.sentry.util.a();

    public static void a(w6 w6Var, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (io.sentry.x1 x1Var : w6Var.getIntegrations()) {
            if (z && (x1Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(x1Var);
            }
            if (z2 && (x1Var instanceof SentryTimberIntegration)) {
                arrayList.add(x1Var);
            }
            if (x1Var instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(x1Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                w6Var.getIntegrations().remove((io.sentry.x1) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                w6Var.getIntegrations().remove((io.sentry.x1) arrayList.get(i2));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i3 = 0; i3 < arrayList3.size() - 1; i3++) {
                w6Var.getIntegrations().remove((io.sentry.x1) arrayList3.get(i3));
            }
        }
    }

    public static void b(Context context, t tVar, s4 s4Var) {
        try {
            io.sentry.v vVarA = b.a();
            try {
                t4.h(new v2(), new f(tVar, context, s4Var));
                io.sentry.h1 h1VarG = t4.g();
                if (p0.f()) {
                    if (h1VarG.r().isEnableAutoSessionTracking()) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        h1VarG.w(new cd(21, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            h1VarG.v();
                        }
                    }
                    h1VarG.r().getReplayController().K();
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
        } catch (IllegalAccessException e) {
            tVar.d(t5.FATAL, "Fatal error during SentryAndroid.init(...)", e);
            xh6.f("Failed to initialize Sentry's SDK", e);
        } catch (InstantiationException e2) {
            tVar.d(t5.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
            xh6.f("Failed to initialize Sentry's SDK", e2);
        } catch (NoSuchMethodException e3) {
            tVar.d(t5.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
            xh6.f("Failed to initialize Sentry's SDK", e3);
        } catch (InvocationTargetException e4) {
            tVar.d(t5.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
            xh6.f("Failed to initialize Sentry's SDK", e4);
        }
    }
}
