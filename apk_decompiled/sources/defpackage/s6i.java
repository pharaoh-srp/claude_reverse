package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls6i;", "Lnqb;", "Lt6i;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class s6i extends nqb {
    public final wrh E;
    public final zub F;
    public final h19 G;
    public final boolean H;
    public final vue I;
    public final zy7 J;

    public s6i(wrh wrhVar, zub zubVar, h19 h19Var, boolean z, vue vueVar, zy7 zy7Var) {
        this.E = wrhVar;
        this.F = zubVar;
        this.G = h19Var;
        this.H = z;
        this.I = vueVar;
        this.J = zy7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        t6i t6iVar = new t6i(this.F, this.G, false, this.H, null, this.I, this.J);
        t6iVar.r0 = this.E;
        return t6iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s6i.class != obj.getClass()) {
            return false;
        }
        s6i s6iVar = (s6i) obj;
        return this.E == s6iVar.E && x44.r(this.F, s6iVar.F) && x44.r(this.G, s6iVar.G) && this.H == s6iVar.H && this.I.equals(s6iVar.I) && this.J == s6iVar.J;
    }

    public final int hashCode() {
        int iHashCode = this.E.hashCode() * 31;
        zub zubVar = this.F;
        int iHashCode2 = (iHashCode + (zubVar != null ? zubVar.hashCode() : 0)) * 31;
        h19 h19Var = this.G;
        return this.J.hashCode() + vb7.c(this.I.a, fsh.p(fsh.p((iHashCode2 + (h19Var != null ? h19Var.hashCode() : 0)) * 31, 31, false), 31, this.H), 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        t6i t6iVar = (t6i) hqbVar;
        wrh wrhVar = t6iVar.r0;
        wrh wrhVar2 = this.E;
        if (wrhVar != wrhVar2) {
            t6iVar.r0 = wrhVar2;
            yfd.W(t6iVar).V();
        }
        t6iVar.D1(this.F, this.G, false, this.H, null, this.I, this.J);
    }
}
