package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import org.koin.core.error.ClosedScopeException;

/* JADX INFO: loaded from: classes.dex */
public abstract class gr9 {
    public static final xe4 a = new xe4(new q59(10));
    public static final xe4 b = new xe4(new q59(11));

    public static final void a(er9 er9Var, ta4 ta4Var, ld4 ld4Var, int i) {
        ComponentCallbacks componentCallbacks;
        er9 er9VarE;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1560007908);
        if (((i | 2) & 19) == 18 && e18Var.C()) {
            e18Var.T();
        } else {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                e18Var.a0(256789730);
                Context context = (Context) e18Var.j(w00.b);
                e18Var.a0(5004770);
                boolean zF = e18Var.f(context);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    Object baseContext = context;
                    while (true) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            Context applicationContext = context.getApplicationContext();
                            applicationContext.getClass();
                            componentCallbacks = (Application) applicationContext;
                            break;
                        } else if ((baseContext instanceof hr9) && (baseContext instanceof ComponentCallbacks)) {
                            componentCallbacks = (ComponentCallbacks) baseContext;
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                            baseContext.getClass();
                        }
                    }
                    if (componentCallbacks instanceof hr9) {
                        er9VarE = ((hr9) componentCallbacks).e();
                    } else {
                        er9VarE = zp3.J;
                        if (er9VarE == null) {
                            sz6.j("KoinApplication has not been started");
                            return;
                        }
                    }
                    objN = er9VarE;
                    e18Var.k0(objN);
                }
                er9Var = (er9) objN;
                e18Var.p(false);
                e18Var.p(false);
            } else {
                e18Var.T();
            }
            e18Var.q();
            j8.d(new hvd[]{a.a(er9Var), b.a((m7f) er9Var.c.I)}, ta4Var, e18Var, 56);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow1(er9Var, ta4Var, i, 25);
        }
    }

    public static final m7f b(ld4 ld4Var) {
        m7f m7fVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1668867238);
        try {
            m7fVar = (m7f) e18Var.j(b);
        } catch (ClosedScopeException e) {
            er9 er9VarJ = otj.j();
            if (er9VarJ != null) {
                rok rokVar = er9VarJ.a;
                rokVar.getClass();
                rokVar.u0(k3a.E, "Error while accessing Koin scope. Fallback on default root scope...");
                m7f m7fVar2 = (m7f) er9VarJ.c.I;
                if (m7fVar2 != null) {
                    m7fVar = m7fVar2;
                }
            }
            xh6.d("Can't get Koin scope due to error:", e);
            return null;
        }
        e18Var.p(false);
        return m7fVar;
    }
}
