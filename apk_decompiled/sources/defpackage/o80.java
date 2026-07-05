package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo80;", "Lnqb;", "Lp80;", "adaptive-layout"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
final class o80 extends nqb {
    public final zy7 E;
    public final kl7 F;
    public final bz7 G;
    public final mma H;
    public final boolean I;
    public final j06 J = j06.U;

    public o80(zy7 zy7Var, kl7 kl7Var, bz7 bz7Var, mma mmaVar, boolean z) {
        this.E = zy7Var;
        this.F = kl7Var;
        this.G = bz7Var;
        this.H = mmaVar;
        this.I = z;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new p80(this.E, this.F, this.G, this.H, this.I);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o80)) {
            return false;
        }
        o80 o80Var = (o80) obj;
        return this.I == o80Var.I && this.E == o80Var.E && x44.r(this.F, o80Var.F) && this.G == o80Var.G && x44.r(this.H, o80Var.H) && this.J == o80Var.J;
    }

    public final int hashCode() {
        return this.J.hashCode() + ((this.H.hashCode() + qy1.e(this.G, (this.F.hashCode() + ((this.E.hashCode() + (Boolean.hashCode(this.I) * 31)) * 31)) * 31, 31)) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        p80 p80Var = (p80) hqbVar;
        p80Var.S = this.E;
        p80Var.W.E = this.F;
        p80Var.T = this.G;
        p80Var.U = this.H;
        p80Var.V = this.I;
    }
}
