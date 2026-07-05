package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhg8;", "Lnqb;", "Lgg8;", "haze_release"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
final /* data */ class hg8 extends nqb {
    public final ng8 E;
    public final og8 F;
    public final a2 G;

    public hg8(ng8 ng8Var, og8 og8Var, a2 a2Var) {
        this.E = ng8Var;
        this.F = og8Var;
        this.G = a2Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new gg8(this.E, this.F, this.G);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hg8) {
            hg8 hg8Var = (hg8) obj;
            return this.E == hg8Var.E && this.F.equals(hg8Var.F) && this.G == hg8Var.G;
        }
        return false;
    }

    public final int hashCode() {
        return this.G.hashCode() + ((this.F.hashCode() + (this.E.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HazeEffectNodeElement(state=" + this.E + ", style=" + this.F + ", block=" + this.G + ")";
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        gg8 gg8Var = (gg8) hqbVar;
        gg8Var.getClass();
        gg8Var.S = this.E;
        og8 og8Var = gg8Var.X;
        og8 og8Var2 = this.F;
        if (!x44.r(og8Var, og8Var2)) {
            gg8Var.q1(gg8Var.X, og8Var2);
            gg8Var.X = og8Var2;
        }
        gg8Var.T = this.G;
        gg8Var.F0();
    }
}
