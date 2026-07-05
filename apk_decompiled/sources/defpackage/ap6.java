package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lap6;", "Lnqb;", "Llp6;", "animation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class ap6 extends nqb {
    public final a6i E;
    public final q5i F;
    public final q5i G;
    public final q5i H;
    public final wp6 I;
    public final d77 J;
    public final zy7 K;
    public final bp6 L;

    public ap6(a6i a6iVar, q5i q5iVar, q5i q5iVar2, q5i q5iVar3, wp6 wp6Var, d77 d77Var, zy7 zy7Var, bp6 bp6Var) {
        this.E = a6iVar;
        this.F = q5iVar;
        this.G = q5iVar2;
        this.H = q5iVar3;
        this.I = wp6Var;
        this.J = d77Var;
        this.K = zy7Var;
        this.L = bp6Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new lp6(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ap6)) {
            return false;
        }
        ap6 ap6Var = (ap6) obj;
        return ap6Var.E == this.E && x44.r(ap6Var.F, this.F) && x44.r(ap6Var.G, this.G) && x44.r(ap6Var.H, this.H) && ap6Var.I.equals(this.I) && x44.r(ap6Var.J, this.J) && ap6Var.K == this.K && x44.r(ap6Var.L, this.L);
    }

    public final int hashCode() {
        int iHashCode = this.E.hashCode() * 31;
        q5i q5iVar = this.F;
        int iHashCode2 = (iHashCode + (q5iVar != null ? q5iVar.hashCode() : 0)) * 31;
        q5i q5iVar2 = this.G;
        int iHashCode3 = (iHashCode2 + (q5iVar2 != null ? q5iVar2.hashCode() : 0)) * 31;
        q5i q5iVar3 = this.H;
        return this.L.hashCode() + ((this.K.hashCode() + ((this.J.hashCode() + ((this.I.hashCode() + ((iHashCode3 + (q5iVar3 != null ? q5iVar3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        lp6 lp6Var = (lp6) hqbVar;
        lp6Var.S = this.E;
        lp6Var.T = this.F;
        lp6Var.U = this.G;
        lp6Var.V = this.H;
        lp6Var.W = this.I;
        lp6Var.X = this.J;
        lp6Var.Y = this.K;
        lp6Var.Z = this.L;
    }
}
