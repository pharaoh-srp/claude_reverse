package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgfh;", "Lnqb;", "Lkfh;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class gfh extends nqb {
    public final boolean E;
    public final boolean F;
    public final akh G;
    public final i5i H;
    public final sih I;
    public final jy1 J;
    public final boolean K;
    public final j9f L;
    public final ukc M;
    public final o1i N;
    public final p5d O;

    public gfh(boolean z, boolean z2, akh akhVar, i5i i5iVar, sih sihVar, jy1 jy1Var, boolean z3, j9f j9fVar, ukc ukcVar, o1i o1iVar, p5d p5dVar) {
        this.E = z;
        this.F = z2;
        this.G = akhVar;
        this.H = i5iVar;
        this.I = sihVar;
        this.J = jy1Var;
        this.K = z3;
        this.L = j9fVar;
        this.M = ukcVar;
        this.N = o1iVar;
        this.O = p5dVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new kfh(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfh)) {
            return false;
        }
        gfh gfhVar = (gfh) obj;
        return this.E == gfhVar.E && this.F == gfhVar.F && x44.r(this.G, gfhVar.G) && x44.r(this.H, gfhVar.H) && x44.r(this.I, gfhVar.I) && x44.r(this.J, gfhVar.J) && this.K == gfhVar.K && x44.r(this.L, gfhVar.L) && this.M == gfhVar.M && x44.r(this.N, gfhVar.N) && x44.r(this.O, gfhVar.O);
    }

    public final int hashCode() {
        int iHashCode = (this.N.hashCode() + ((this.M.hashCode() + ((this.L.hashCode() + fsh.p((this.J.hashCode() + ((this.I.hashCode() + ((this.H.hashCode() + ((this.G.hashCode() + fsh.p(Boolean.hashCode(this.E) * 31, 31, this.F)) * 31)) * 31)) * 31)) * 31, 31, this.K)) * 31)) * 31)) * 31;
        p5d p5dVar = this.O;
        return iHashCode + (p5dVar == null ? 0 : p5dVar.hashCode());
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.E + ", isDragHovered=" + this.F + ", textLayoutState=" + this.G + ", textFieldState=" + this.H + ", textFieldSelectionState=" + this.I + ", cursorBrush=" + this.J + ", writeable=" + this.K + ", scrollState=" + this.L + ", orientation=" + this.M + ", toolbarRequester=" + this.N + ", platformSelectionBehaviors=" + this.O + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        lf9 lf9Var;
        kfh kfhVar = (kfh) hqbVar;
        boolean zS1 = kfhVar.s1();
        boolean z = kfhVar.U;
        i5i i5iVar = kfhVar.X;
        akh akhVar = kfhVar.W;
        sih sihVar = kfhVar.Y;
        j9f j9fVar = kfhVar.b0;
        boolean z2 = this.E;
        kfhVar.U = z2;
        boolean z3 = this.F;
        kfhVar.V = z3;
        akh akhVar2 = this.G;
        kfhVar.W = akhVar2;
        i5i i5iVar2 = this.H;
        kfhVar.X = i5iVar2;
        sih sihVar2 = this.I;
        kfhVar.Y = sihVar2;
        kfhVar.Z = this.J;
        kfhVar.a0 = this.K;
        j9f j9fVar2 = this.L;
        kfhVar.b0 = j9fVar2;
        kfhVar.c0 = this.M;
        o1i o1iVar = this.N;
        kfhVar.d0 = o1iVar;
        kfhVar.e0 = this.O;
        kfhVar.l0.s1(i5iVar2, sihVar2, akhVar2, z2 || z3);
        peh pehVar = kfhVar.m0;
        pehVar.U.a = null;
        pehVar.U = o1iVar;
        o1iVar.a = pehVar;
        o1iVar.b = pehVar.R ? n1i.G : n1i.F;
        if (!kfhVar.s1()) {
            fkg fkgVar = kfhVar.g0;
            if (fkgVar != null) {
                fkgVar.d(null);
            }
            kfhVar.g0 = null;
            pd5 pd5Var = kfhVar.f0;
            if (pd5Var != null && (lf9Var = (lf9) pd5Var.b.getAndSet(null)) != null) {
                lf9Var.d(null);
            }
        } else if (!z || !x44.r(i5iVar, i5iVar2) || !zS1) {
            kfhVar.t1();
        }
        if (x44.r(i5iVar, i5iVar2) && x44.r(akhVar, akhVar2) && x44.r(sihVar, sihVar2) && x44.r(j9fVar, j9fVar2)) {
            return;
        }
        yfd.W(kfhVar).T();
    }
}
