package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lsgf;", "Lnqb;", "Lvgf;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class sgf extends nqb {
    public final boolean E;
    public final zub F;
    public final h19 G;
    public final boolean H;
    public final boolean I;
    public final vue J;
    public final zy7 K;

    public sgf(boolean z, zub zubVar, h19 h19Var, boolean z2, boolean z3, vue vueVar, zy7 zy7Var) {
        this.E = z;
        this.F = zubVar;
        this.G = h19Var;
        this.H = z2;
        this.I = z3;
        this.J = vueVar;
        this.K = zy7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        vgf vgfVar = new vgf(this.F, this.G, this.H, this.I, null, this.J, this.K);
        vgfVar.r0 = this.E;
        return vgfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sgf.class != obj.getClass()) {
            return false;
        }
        sgf sgfVar = (sgf) obj;
        return this.E == sgfVar.E && x44.r(this.F, sgfVar.F) && x44.r(this.G, sgfVar.G) && this.H == sgfVar.H && this.I == sgfVar.I && x44.r(this.J, sgfVar.J) && this.K == sgfVar.K;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.E) * 31;
        zub zubVar = this.F;
        int iHashCode2 = (iHashCode + (zubVar != null ? zubVar.hashCode() : 0)) * 31;
        h19 h19Var = this.G;
        int iP = fsh.p(fsh.p((iHashCode2 + (h19Var != null ? h19Var.hashCode() : 0)) * 31, 31, this.H), 31, this.I);
        vue vueVar = this.J;
        return this.K.hashCode() + ((iP + (vueVar != null ? Integer.hashCode(vueVar.a) : 0)) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        vgf vgfVar = (vgf) hqbVar;
        boolean z = vgfVar.r0;
        boolean z2 = this.E;
        if (z != z2) {
            vgfVar.r0 = z2;
            yfd.W(vgfVar).V();
        }
        vgfVar.D1(this.F, this.G, this.H, this.I, null, this.J, this.K);
    }
}
