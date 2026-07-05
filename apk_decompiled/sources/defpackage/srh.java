package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lsrh;", "Lnqb;", "Lvrh;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class srh extends nqb {
    public final boolean E;
    public final zub F;
    public final h19 G;
    public final boolean H;
    public final boolean I;
    public final vue J;
    public final bz7 K;

    public srh(boolean z, zub zubVar, h19 h19Var, boolean z2, boolean z3, vue vueVar, bz7 bz7Var) {
        this.E = z;
        this.F = zubVar;
        this.G = h19Var;
        this.H = z2;
        this.I = z3;
        this.J = vueVar;
        this.K = bz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new vrh(this.E, this.F, this.G, this.H, this.I, this.J, this.K);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || srh.class != obj.getClass()) {
            return false;
        }
        srh srhVar = (srh) obj;
        return this.E == srhVar.E && x44.r(this.F, srhVar.F) && x44.r(this.G, srhVar.G) && this.H == srhVar.H && this.I == srhVar.I && this.J.equals(srhVar.J) && this.K == srhVar.K;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.E) * 31;
        zub zubVar = this.F;
        int iHashCode2 = (iHashCode + (zubVar != null ? zubVar.hashCode() : 0)) * 31;
        h19 h19Var = this.G;
        return this.K.hashCode() + vb7.c(this.J.a, fsh.p(fsh.p((iHashCode2 + (h19Var != null ? h19Var.hashCode() : 0)) * 31, 31, this.H), 31, this.I), 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        vrh vrhVar = (vrh) hqbVar;
        boolean z = vrhVar.r0;
        boolean z2 = this.E;
        if (z != z2) {
            vrhVar.r0 = z2;
            yfd.W(vrhVar).V();
        }
        vrhVar.s0 = this.K;
        vrhVar.D1(this.F, this.G, this.H, this.I, null, this.J, vrhVar.t0);
    }
}
