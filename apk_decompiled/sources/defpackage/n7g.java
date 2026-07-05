package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n7g extends dx5 implements gbi {
    public final j7g F;
    public final yr9 G;

    public n7g(j7g j7gVar, yr9 yr9Var) {
        j7gVar.getClass();
        yr9Var.getClass();
        this.F = j7gVar;
        this.G = yr9Var;
    }

    @Override // defpackage.gbi
    public final yr9 j() {
        return this.G;
    }

    @Override // defpackage.gbi
    public final fhi o() {
        return this.F;
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: o0 */
    public final j7g l0(boolean z) {
        fhi fhiVarN = nwk.n(this.F.l0(z), this.G.k0().l0(z));
        fhiVarN.getClass();
        return (j7g) fhiVarN;
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: p0 */
    public final j7g n0(r9i r9iVar) {
        r9iVar.getClass();
        fhi fhiVarN = nwk.n(this.F.n0(r9iVar), this.G);
        fhiVarN.getClass();
        return (j7g) fhiVarN;
    }

    @Override // defpackage.dx5
    public final j7g q0() {
        return this.F;
    }

    @Override // defpackage.dx5
    public final dx5 s0(j7g j7gVar) {
        return new n7g(j7gVar, this.G);
    }

    @Override // defpackage.dx5
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final n7g j0(es9 es9Var) {
        es9Var.getClass();
        j7g j7gVar = this.F;
        j7gVar.getClass();
        yr9 yr9Var = this.G;
        yr9Var.getClass();
        return new n7g(j7gVar, yr9Var);
    }

    @Override // defpackage.j7g
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.G + ")] " + this.F;
    }
}
