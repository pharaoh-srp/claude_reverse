package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class mg1 {
    public static final umg a = new umg(new rc1(2));
    public static Boolean b;

    public static final void a(final zb0 zb0Var, final tkh tkhVar, final wt7 wt7Var, final List list, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Executor executor = (Executor) e18Var.j(a);
        if (executor == null || !b(zb0Var.F.length())) {
            e18Var.a0(-517090505);
            e18Var.p(false);
            return;
        }
        e18Var.a0(-518737659);
        final fu9 fu9Var = (fu9) e18Var.j(ve4.n);
        final cz5 cz5Var = (cz5) e18Var.j(ve4.h);
        try {
            executor.execute(new Runnable() { // from class: kg1
                @Override // java.lang.Runnable
                public final void run() {
                    kwb kwbVarC;
                    tkh tkhVar2 = tkhVar;
                    fu9 fu9Var2 = fu9Var;
                    zb0 zb0Var2 = zb0Var;
                    cz5 cz5Var2 = cz5Var;
                    wt7 wt7Var2 = wt7Var;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        rcg rcgVarJ = ycg.j();
                        kwb kwbVar = rcgVarJ instanceof kwb ? (kwb) rcgVarJ : null;
                        if (kwbVar == null || (kwbVarC = kwbVar.C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            rcg rcgVarJ2 = kwbVarC.j();
                            try {
                                tkh tkhVarY = yfd.Y(tkhVar2, fu9Var2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = lm6.E;
                                }
                                el5 el5Var = new el5(zb0Var2, tkhVarY, list2, cz5Var2, wt7Var2);
                                el5Var.j();
                                el5Var.f();
                                rcg.q(rcgVarJ2);
                                kwbVarC.w().p();
                                kwbVarC.c();
                                Trace.endSection();
                            } catch (Throwable th) {
                                rcg.q(rcgVarJ2);
                                throw th;
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        e18Var.p(false);
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            if (b == null) {
                b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
