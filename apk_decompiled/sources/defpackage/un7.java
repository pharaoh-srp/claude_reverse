package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class un7 extends sn7 implements le5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un7(j7g j7gVar, j7g j7gVar2) {
        super(j7gVar, j7gVar2);
        j7gVar.getClass();
        j7gVar2.getClass();
    }

    @Override // defpackage.yr9
    public final yr9 j0(es9 es9Var) {
        es9Var.getClass();
        j7g j7gVar = this.F;
        j7gVar.getClass();
        j7g j7gVar2 = this.G;
        j7gVar2.getClass();
        return new un7(j7gVar, j7gVar2);
    }

    @Override // defpackage.le5
    public final fhi k(yr9 yr9Var) {
        fhi fhiVarZ;
        yr9Var.getClass();
        fhi fhiVarK0 = yr9Var.k0();
        if (fhiVarK0 instanceof sn7) {
            fhiVarZ = fhiVarK0;
        } else {
            if (!(fhiVarK0 instanceof j7g)) {
                wg6.i();
                return null;
            }
            j7g j7gVar = (j7g) fhiVarK0;
            fhiVarZ = yfd.z(j7gVar, j7gVar.l0(true));
        }
        return nwk.h(fhiVarZ, fhiVarK0);
    }

    @Override // defpackage.fhi
    public final fhi l0(boolean z) {
        return yfd.z(this.F.l0(z), this.G.l0(z));
    }

    @Override // defpackage.le5
    public final boolean m() {
        j7g j7gVar = this.F;
        return (j7gVar.O().a() instanceof qai) && x44.r(j7gVar.O(), this.G.O());
    }

    @Override // defpackage.fhi
    /* JADX INFO: renamed from: m0 */
    public final fhi j0(es9 es9Var) {
        es9Var.getClass();
        j7g j7gVar = this.F;
        j7gVar.getClass();
        j7g j7gVar2 = this.G;
        j7gVar2.getClass();
        return new un7(j7gVar, j7gVar2);
    }

    @Override // defpackage.fhi
    public final fhi n0(r9i r9iVar) {
        r9iVar.getClass();
        return yfd.z(this.F.n0(r9iVar), this.G.n0(r9iVar));
    }

    @Override // defpackage.sn7
    public final j7g o0() {
        return this.F;
    }

    @Override // defpackage.sn7
    public final String p0(g06 g06Var, g06 g06Var2) {
        boolean zO = g06Var2.a.o();
        j7g j7gVar = this.G;
        j7g j7gVar2 = this.F;
        if (!zO) {
            return g06Var.G(g06Var.Z(j7gVar2), g06Var.Z(j7gVar), jwk.x(this));
        }
        return "(" + g06Var.Z(j7gVar2) + ".." + g06Var.Z(j7gVar) + ')';
    }

    @Override // defpackage.sn7
    public final String toString() {
        return "(" + this.F + ".." + this.G + ')';
    }
}
