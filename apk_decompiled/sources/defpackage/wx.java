package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lwx;", "T", "Lnqb;", "Lky;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class wx<T> extends nqb {
    public final ry E;
    public final ukc F;
    public final boolean G;
    public final Boolean H;
    public final zub I;
    public final eo7 J;

    public wx(ry ryVar, ukc ukcVar, boolean z, Boolean bool, zub zubVar, eo7 eo7Var) {
        this.E = ryVar;
        this.F = ukcVar;
        this.G = z;
        this.H = bool;
        this.I = zubVar;
        this.J = eo7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        b8 b8Var = fy.a;
        boolean z = this.G;
        zub zubVar = this.I;
        ukc ukcVar = this.F;
        ky kyVar = new ky(b8Var, z, zubVar, ukcVar);
        kyVar.n0 = this.E;
        kyVar.o0 = ukcVar;
        kyVar.p0 = this.H;
        kyVar.q0 = this.J;
        return kyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx)) {
            return false;
        }
        wx wxVar = (wx) obj;
        return x44.r(this.E, wxVar.E) && this.F == wxVar.F && this.G == wxVar.G && x44.r(this.H, wxVar.H) && x44.r(this.I, wxVar.I) && x44.r(this.J, wxVar.J);
    }

    public final int hashCode() {
        int iP = fsh.p((this.F.hashCode() + (this.E.hashCode() * 31)) * 31, 31, this.G);
        Boolean bool = this.H;
        int iHashCode = (iP + (bool != null ? bool.hashCode() : 0)) * 31;
        zub zubVar = this.I;
        int iHashCode2 = (iHashCode + (zubVar != null ? zubVar.hashCode() : 0)) * 29791;
        eo7 eo7Var = this.J;
        return iHashCode2 + (eo7Var != null ? eo7Var.hashCode() : 0);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        boolean z;
        boolean z2;
        ky kyVar = (ky) hqbVar;
        eo7 eo7Var = this.J;
        kyVar.q0 = eo7Var;
        ry ryVar = kyVar.n0;
        ry ryVar2 = this.E;
        if (x44.r(ryVar, ryVar2)) {
            z = false;
        } else {
            kyVar.n0 = ryVar2;
            kyVar.M1(eo7Var);
            z = true;
        }
        ukc ukcVar = kyVar.o0;
        ukc ukcVar2 = this.F;
        if (ukcVar != ukcVar2) {
            kyVar.o0 = ukcVar2;
            z = true;
        }
        Boolean bool = kyVar.p0;
        Boolean bool2 = this.H;
        if (x44.r(bool, bool2)) {
            z2 = z;
        } else {
            kyVar.p0 = bool2;
            z2 = true;
        }
        kyVar.J1(kyVar.V, this.G, this.I, ukcVar2, z2);
    }
}
