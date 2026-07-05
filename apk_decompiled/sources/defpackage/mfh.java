package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmfh;", "Lnqb;", "Lvfh;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class mfh extends nqb {
    public final i5i E;
    public final akh F;
    public final sih G;
    public final k6e H;
    public final boolean I;
    public final mp9 J;
    public final boolean K;
    public final zub L;
    public final jwb M;

    public mfh(i5i i5iVar, akh akhVar, sih sihVar, k6e k6eVar, boolean z, mp9 mp9Var, boolean z2, zub zubVar, jwb jwbVar) {
        this.E = i5iVar;
        this.F = akhVar;
        this.G = sihVar;
        this.H = k6eVar;
        this.I = z;
        this.J = mp9Var;
        this.K = z2;
        this.L = zubVar;
        this.M = jwbVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new vfh(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfh)) {
            return false;
        }
        mfh mfhVar = (mfh) obj;
        return x44.r(this.E, mfhVar.E) && x44.r(this.F, mfhVar.F) && x44.r(this.G, mfhVar.G) && x44.r(this.H, mfhVar.H) && this.I == mfhVar.I && this.J.equals(mfhVar.J) && this.K == mfhVar.K && x44.r(this.L, mfhVar.L) && x44.r(this.M, mfhVar.M);
    }

    public final int hashCode() {
        int iHashCode = (this.G.hashCode() + ((this.F.hashCode() + (this.E.hashCode() * 31)) * 31)) * 31;
        k6e k6eVar = this.H;
        int iP = fsh.p((this.L.hashCode() + fsh.p((this.J.hashCode() + fsh.p(fsh.p((iHashCode + (k6eVar == null ? 0 : k6eVar.hashCode())) * 31, 31, this.I), 31, false)) * 961, 31, this.K)) * 31, 31, false);
        jwb jwbVar = this.M;
        return iP + (jwbVar != null ? jwbVar.hashCode() : 0);
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.E + ", textLayoutState=" + this.F + ", textFieldSelectionState=" + this.G + ", filter=" + this.H + ", enabled=" + this.I + ", readOnly=false, keyboardOptions=" + this.J + ", keyboardActionHandler=null, singleLine=" + this.K + ", interactionSource=" + this.L + ", isPassword=false, stylusHandwritingTrigger=" + this.M + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        fkg fkgVar;
        vfh vfhVar = (vfh) hqbVar;
        e0h e0hVar = vfhVar.d0;
        pt7 pt7Var = vfhVar.c0;
        boolean z = vfhVar.X;
        i5i i5iVar = vfhVar.U;
        mp9 mp9Var = vfhVar.Y;
        sih sihVar = vfhVar.W;
        zub zubVar = vfhVar.a0;
        jwb jwbVar = vfhVar.b0;
        i5i i5iVar2 = this.E;
        vfhVar.U = i5iVar2;
        vfhVar.V = this.F;
        sih sihVar2 = this.G;
        vfhVar.W = sihVar2;
        boolean z2 = this.I;
        vfhVar.X = z2;
        mp9 mp9Var2 = this.J;
        vfhVar.Y = mp9Var2;
        vfhVar.Z = this.K;
        zub zubVar2 = this.L;
        vfhVar.a0 = zubVar2;
        jwb jwbVar2 = this.M;
        vfhVar.b0 = jwbVar2;
        if (z2 != z || !x44.r(i5iVar2, i5iVar) || !mp9Var2.equals(mp9Var) || !x44.r(jwbVar2, jwbVar)) {
            if (z2 && (vfhVar.v1() || vfhVar.k0 != null)) {
                vfhVar.x1(false);
            } else if (!z2) {
                vfhVar.t1();
            }
        }
        if (z2 != z || z2 != z || mp9Var2.b() != mp9Var.b()) {
            yfd.W(vfhVar).V();
        }
        if (!x44.r(sihVar2, sihVar)) {
            e0hVar.r1();
            if (vfhVar.R) {
                sihVar2.n = vfhVar.l0;
                if (vfhVar.v1() && (fkgVar = vfhVar.h0) != null) {
                    fkgVar.d(null);
                    vfhVar.h0 = gb9.D(vfhVar.d1(), null, null, new vf1(sihVar2, null, 4), 3);
                }
            }
            sihVar2.m = new qfh(vfhVar, 0);
        }
        if (!x44.r(zubVar2, zubVar)) {
            e0hVar.r1();
            if (pt7Var.R) {
                pt7Var.t1(zubVar2);
            }
        }
        if (z2 != z) {
            if (!z2) {
                vfhVar.q1(pt7Var);
            } else {
                vfhVar.p1(pt7Var);
                pt7Var.t1(zubVar2);
            }
        }
    }
}
