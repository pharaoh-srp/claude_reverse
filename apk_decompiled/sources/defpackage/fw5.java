package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fw5 extends dx5 implements le5 {
    public final j7g F;
    public final boolean G;

    static {
        new am4(3);
    }

    public fw5(j7g j7gVar, boolean z) {
        this.F = j7gVar;
        this.G = z;
    }

    @Override // defpackage.dx5, defpackage.yr9
    public final boolean b0() {
        return false;
    }

    @Override // defpackage.le5
    public final fhi k(yr9 yr9Var) {
        yr9Var.getClass();
        fhi fhiVarK0 = yr9Var.k0();
        fw5 fw5VarW = am4.w(fhiVarK0, this.G);
        if (fw5VarW != null) {
            return fw5VarW;
        }
        j7g j7gVarB = u00.B(fhiVarK0);
        return j7gVarB != null ? j7gVarB : fhiVarK0.l0(false);
    }

    @Override // defpackage.le5
    public final boolean m() {
        j7g j7gVar = this.F;
        j7gVar.O();
        return j7gVar.O().a() instanceof qai;
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: o0 */
    public final j7g l0(boolean z) {
        return z ? this.F.l0(z) : this;
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: p0 */
    public final j7g n0(r9i r9iVar) {
        r9iVar.getClass();
        return new fw5(this.F.n0(r9iVar), this.G);
    }

    @Override // defpackage.dx5
    public final j7g q0() {
        return this.F;
    }

    @Override // defpackage.dx5
    public final dx5 s0(j7g j7gVar) {
        return new fw5(j7gVar, this.G);
    }

    @Override // defpackage.j7g
    public final String toString() {
        return this.F + " & Any";
    }
}
