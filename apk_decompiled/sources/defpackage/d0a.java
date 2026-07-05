package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld0a;", "Lnqb;", "Lg0a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class d0a extends nqb {
    public final zy7 E;
    public final a0a F;
    public final ukc G;
    public final boolean H;
    public final boolean I;

    public d0a(zy7 zy7Var, a0a a0aVar, ukc ukcVar, boolean z, boolean z2) {
        this.E = zy7Var;
        this.F = a0aVar;
        this.G = ukcVar;
        this.H = z;
        this.I = z2;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new g0a(this.E, this.F, this.G, this.H, this.I);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0a)) {
            return false;
        }
        d0a d0aVar = (d0a) obj;
        return this.E == d0aVar.E && x44.r(this.F, d0aVar.F) && this.G == d0aVar.G && this.H == d0aVar.H && this.I == d0aVar.I;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.I) + fsh.p((this.G.hashCode() + ((this.F.hashCode() + (this.E.hashCode() * 31)) * 31)) * 31, 31, this.H);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        g0a g0aVar = (g0a) hqbVar;
        g0aVar.S = this.E;
        g0aVar.T = this.F;
        ukc ukcVar = g0aVar.U;
        ukc ukcVar2 = this.G;
        if (ukcVar != ukcVar2) {
            g0aVar.U = ukcVar2;
            yfd.W(g0aVar).V();
        }
        boolean z = g0aVar.V;
        boolean z2 = this.H;
        boolean z3 = this.I;
        if (z == z2 && g0aVar.W == z3) {
            return;
        }
        g0aVar.V = z2;
        g0aVar.W = z3;
        g0aVar.p1();
        yfd.W(g0aVar).V();
    }
}
