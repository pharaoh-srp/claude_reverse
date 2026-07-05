package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xa1 extends wa1 {
    public final /* synthetic */ bz7 e;
    public final /* synthetic */ bz7 f;
    public final /* synthetic */ zy7 g;
    public final /* synthetic */ zy7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa1(boolean z, int i, hq5 hq5Var, n0 n0Var, dm dmVar, zy7 zy7Var) {
        super(z, i);
        this.e = hq5Var;
        this.f = n0Var;
        this.g = dmVar;
        this.h = zy7Var;
    }

    @Override // defpackage.wa1
    public final void a() {
        this.h.a();
    }

    @Override // defpackage.wa1
    public final void b() {
        zy7 zy7Var = this.g;
        if (zy7Var != null) {
            zy7Var.a();
        }
    }

    @Override // defpackage.wa1
    public final void c(za1 za1Var) {
        za1Var.getClass();
        bz7 bz7Var = this.f;
        if (bz7Var != null) {
            bz7Var.invoke(za1Var);
        }
    }

    @Override // defpackage.wa1
    public final void d(za1 za1Var) {
        za1Var.getClass();
        bz7 bz7Var = this.e;
        if (bz7Var != null) {
            bz7Var.invoke(za1Var);
        }
    }
}
