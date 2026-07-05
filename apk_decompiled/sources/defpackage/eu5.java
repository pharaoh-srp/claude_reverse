package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eu5 extends wa1 {
    public final bf3 e;
    public final l45 f;
    public final qbd g;
    public final bz7 h;
    public xv8 i;
    public za1 j;
    public final /* synthetic */ fu5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu5(fu5 fu5Var, bf3 bf3Var, l45 l45Var, qbd qbdVar, bz7 bz7Var) {
        super(true, 0);
        bf3Var.getClass();
        l45Var.getClass();
        bz7Var.getClass();
        this.k = fu5Var;
        this.e = bf3Var;
        this.f = l45Var;
        this.g = qbdVar;
        this.h = bz7Var;
    }

    @Override // defpackage.wa1
    public final void a() {
        this.j = null;
        gb9.D(this.f, null, null, new du5(this, this.k, null, 0), 3);
    }

    @Override // defpackage.wa1
    public final void b() {
        this.j = null;
        gb9.D(this.f, null, null, new du5(this, this.k, null, 1), 3);
    }

    @Override // defpackage.wa1
    public final void c(za1 za1Var) {
        za1Var.getClass();
        za1 za1Var2 = this.j;
        int i = 3;
        l45 l45Var = this.f;
        tp4 tp4Var = null;
        if (za1Var2 != null) {
            this.j = null;
            e50 e50Var = (e50) this.g.c.invoke(za1Var2);
            xv8 xv8Var = new xv8(e50Var);
            this.i = xv8Var;
            bf3 bf3Var = this.e;
            ie3 ie3Var = bf3Var.a;
            ie3 ie3Var2 = (ie3) w44.U0(bf3Var.b);
            gff gffVar = (gff) xv8Var.H;
            h7g h7gVar = e50Var != null ? new h7g(new w40(e50Var, i)) : null;
            fu5 fu5Var = this.k;
            this.h.invoke(x44.k(fu5Var.b(ie3Var2, d56.G, gffVar, ie3Var, true, h7gVar), fu5Var.b(ie3Var, d56.F, (gff) xv8Var.G, ie3Var2, true, e50Var != null ? new h7g(new w40(e50Var, 4)) : null)));
            gb9.D(l45Var, null, null, new au5(xv8Var, za1Var2, tp4Var, 2), 3);
        }
        gb9.D(l45Var, null, null, new ed3(this, za1Var, tp4Var, 29), 3);
    }

    @Override // defpackage.wa1
    public final void d(za1 za1Var) {
        za1Var.getClass();
        this.j = za1Var;
    }
}
