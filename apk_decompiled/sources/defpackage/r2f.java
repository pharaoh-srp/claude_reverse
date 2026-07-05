package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lr2f;", "Lnqb;", "Ls2f;", "material"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
final class r2f extends nqb {
    public final zy7 E;
    public final kl7 F;
    public final bz7 G;
    public final mma H;
    public final boolean I;

    public r2f(zy7 zy7Var, kl7 kl7Var, bz7 bz7Var, mma mmaVar, boolean z) {
        kl7Var.getClass();
        mmaVar.getClass();
        this.E = zy7Var;
        this.F = kl7Var;
        this.G = bz7Var;
        this.H = mmaVar;
        this.I = z;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new s2f(this.E, this.F, this.G, this.H, this.I);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2f)) {
            return false;
        }
        r2f r2fVar = (r2f) obj;
        return this.I == r2fVar.I && this.E == r2fVar.E && x44.r(this.F, r2fVar.F) && this.G == r2fVar.G && x44.r(this.H, r2fVar.H);
    }

    public final int hashCode() {
        return this.H.hashCode() + qy1.e(this.G, (this.F.hashCode() + ((this.E.hashCode() + (Boolean.hashCode(this.I) * 31)) * 31)) * 31, 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        s2f s2fVar = (s2f) hqbVar;
        s2fVar.getClass();
        s2fVar.S = this.E;
        kl7 kl7Var = this.F;
        kl7Var.getClass();
        el5 el5Var = s2fVar.W;
        el5Var.getClass();
        el5Var.E = kl7Var;
        s2fVar.T = this.G;
        mma mmaVar = this.H;
        mmaVar.getClass();
        s2fVar.U = mmaVar;
        s2fVar.V = this.I;
    }
}
