package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class wk4 implements wi7 {
    public static final efk K = new efk(22);
    public final hh1 E;
    public final hh1 F;
    public final fj0 G;
    public final ob1 H;
    public final h99 I;
    public volatile wi7 J;

    public wk4(bl4 bl4Var, hh1 hh1Var, hh1 hh1Var2, fj0 fj0Var, ob1 ob1Var, h99 h99Var) {
        bl4Var.getClass();
        h99Var.getClass();
        this.E = hh1Var;
        this.F = hh1Var2;
        this.G = fj0Var;
        this.H = ob1Var;
        this.I = h99Var;
        l4i l4iVarM = bl4Var.m();
        v40.p(ob1Var, "Data migration", h99Var, new lg1(this, null, a(null), l4iVarM, a(l4iVarM), 1));
        bl4Var.q(this);
    }

    public final wi7 a(l4i l4iVar) {
        int i = l4iVar == null ? -1 : vk4.a[l4iVar.ordinal()];
        if (i == -1 || i == 1) {
            return this.E;
        }
        if (i == 2) {
            return this.F;
        }
        if (i == 3) {
            return K;
        }
        mr9.b();
        return null;
    }

    @Override // defpackage.wi7
    public final File c() {
        wi7 wi7Var = this.J;
        if (wi7Var != null) {
            return wi7Var.c();
        }
        x44.o0("delegateOrchestrator");
        throw null;
    }

    @Override // defpackage.wi7
    public final File l(File file) {
        wi7 wi7Var = this.J;
        if (wi7Var != null) {
            return wi7Var.l(file);
        }
        x44.o0("delegateOrchestrator");
        throw null;
    }

    @Override // defpackage.wi7
    public final File o() {
        return null;
    }
}
