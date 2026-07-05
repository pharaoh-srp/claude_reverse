package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vn7 extends sn7 implements gbi {
    public final sn7 H;
    public final yr9 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn7(sn7 sn7Var, yr9 yr9Var) {
        super(sn7Var.F, sn7Var.G);
        sn7Var.getClass();
        yr9Var.getClass();
        this.H = sn7Var;
        this.I = yr9Var;
    }

    @Override // defpackage.gbi
    public final yr9 j() {
        return this.I;
    }

    @Override // defpackage.yr9
    public final yr9 j0(es9 es9Var) {
        es9Var.getClass();
        sn7 sn7Var = this.H;
        sn7Var.getClass();
        yr9 yr9Var = this.I;
        yr9Var.getClass();
        return new vn7(sn7Var, yr9Var);
    }

    @Override // defpackage.fhi
    public final fhi l0(boolean z) {
        return nwk.n(this.H.l0(z), this.I.k0().l0(z));
    }

    @Override // defpackage.fhi
    /* JADX INFO: renamed from: m0 */
    public final fhi j0(es9 es9Var) {
        es9Var.getClass();
        sn7 sn7Var = this.H;
        sn7Var.getClass();
        yr9 yr9Var = this.I;
        yr9Var.getClass();
        return new vn7(sn7Var, yr9Var);
    }

    @Override // defpackage.fhi
    public final fhi n0(r9i r9iVar) {
        r9iVar.getClass();
        return nwk.n(this.H.n0(r9iVar), this.I);
    }

    @Override // defpackage.gbi
    public final fhi o() {
        return this.H;
    }

    @Override // defpackage.sn7
    public final j7g o0() {
        return this.H.o0();
    }

    @Override // defpackage.sn7
    public final String p0(g06 g06Var, g06 g06Var2) {
        va1 va1Var = g06Var2.a.m;
        wn9 wn9Var = k06.W[11];
        va1Var.getClass();
        wn9Var.getClass();
        return ((Boolean) va1Var.a).booleanValue() ? g06Var.Z(this.I) : this.H.p0(g06Var, g06Var2);
    }

    @Override // defpackage.sn7
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.I + ")] " + this.H;
    }
}
