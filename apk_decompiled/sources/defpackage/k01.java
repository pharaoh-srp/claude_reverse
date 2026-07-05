package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k01 implements bz7 {
    public final Executor E;
    public final fv6 F;
    public final Object G;
    public final String H;
    public final h99 I;

    public k01(ob1 ob1Var, fv6 fv6Var, Object obj, String str, h99 h99Var) {
        ob1Var.getClass();
        obj.getClass();
        str.getClass();
        h99Var.getClass();
        this.E = ob1Var;
        this.F = fv6Var;
        this.G = obj;
        this.H = str;
        this.I = h99Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        bz7 bz7Var = (bz7) obj;
        bz7Var.getClass();
        v40.p(this.E, ij0.i("eventWriteScopeInvoke-", this.H), this.I, new j01(this, 0, bz7Var));
        return iei.a;
    }
}
