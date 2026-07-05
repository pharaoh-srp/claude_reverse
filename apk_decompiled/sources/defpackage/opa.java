package defpackage;

import kotlin.NotImplementedError;

/* JADX INFO: loaded from: classes.dex */
public final class opa extends vxi {
    public final lsc b;
    public final lsc c;
    public final wz5 d;

    public opa() {
        dq3 dq3Var;
        Boolean bool = Boolean.FALSE;
        this.b = mpk.P(bool);
        this.c = mpk.P(bool);
        this.d = mpk.w(new dg8(13, this));
        synchronized (wxi.a) {
            dq3Var = (dq3) c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (dq3Var == null) {
                c45 c45Var = im6.E;
                try {
                    ft5 ft5Var = g86.a;
                    c45Var = tpa.a.J;
                } catch (IllegalStateException | NotImplementedError unused) {
                }
                dq3 dq3Var2 = new dq3(c45Var.r0(iuj.g()));
                a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", dq3Var2);
                dq3Var = dq3Var2;
            }
        }
        gb9.D(dq3Var, null, null, new fj(this, null, 21), 3);
    }
}
