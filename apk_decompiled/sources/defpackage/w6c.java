package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w6c extends dx5 implements le5 {
    public final j7g F;

    public w6c(j7g j7gVar) {
        j7gVar.getClass();
        this.F = j7gVar;
    }

    @Override // defpackage.dx5, defpackage.yr9
    public final boolean b0() {
        return false;
    }

    @Override // defpackage.le5
    public final fhi k(yr9 yr9Var) {
        yr9Var.getClass();
        fhi fhiVarK0 = yr9Var.k0();
        if (!fbi.f(fhiVarK0) && !fbi.e(fhiVarK0)) {
            return fhiVarK0;
        }
        if (fhiVarK0 instanceof j7g) {
            j7g j7gVar = (j7g) fhiVarK0;
            j7g j7gVarL0 = j7gVar.l0(false);
            return !fbi.f(j7gVar) ? j7gVarL0 : new w6c(j7gVarL0);
        }
        if (!(fhiVarK0 instanceof sn7)) {
            xh6.d("Incorrect type: ", fhiVarK0);
            return null;
        }
        sn7 sn7Var = (sn7) fhiVarK0;
        j7g j7gVar2 = sn7Var.F;
        j7g j7gVarL02 = j7gVar2.l0(false);
        if (fbi.f(j7gVar2)) {
            j7gVarL02 = new w6c(j7gVarL02);
        }
        j7g j7gVar3 = sn7Var.G;
        j7g j7gVarL03 = j7gVar3.l0(false);
        if (fbi.f(j7gVar3)) {
            j7gVarL03 = new w6c(j7gVarL03);
        }
        return nwk.n(yfd.z(j7gVarL02, j7gVarL03), nwk.f(fhiVarK0));
    }

    @Override // defpackage.le5
    public final boolean m() {
        return true;
    }

    @Override // defpackage.j7g, defpackage.fhi
    public final fhi n0(r9i r9iVar) {
        r9iVar.getClass();
        return new w6c(this.F.n0(r9iVar));
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: o0 */
    public final j7g l0(boolean z) {
        return z ? this.F.l0(true) : this;
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: p0 */
    public final j7g n0(r9i r9iVar) {
        r9iVar.getClass();
        return new w6c(this.F.n0(r9iVar));
    }

    @Override // defpackage.dx5
    public final j7g q0() {
        return this.F;
    }

    @Override // defpackage.dx5
    public final dx5 s0(j7g j7gVar) {
        return new w6c(j7gVar);
    }
}
