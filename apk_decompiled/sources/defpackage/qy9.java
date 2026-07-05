package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqy9;", "Lnqb;", "Lry9;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class qy9 extends nqb {
    public final kl7 E;
    public final kl7 F;
    public final kl7 G;

    public qy9(kl7 kl7Var, kl7 kl7Var2, kl7 kl7Var3) {
        this.E = kl7Var;
        this.F = kl7Var2;
        this.G = kl7Var3;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        ry9 ry9Var = new ry9();
        ry9Var.S = this.E;
        ry9Var.T = this.F;
        ry9Var.U = this.G;
        return ry9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy9)) {
            return false;
        }
        qy9 qy9Var = (qy9) obj;
        return x44.r(this.E, qy9Var.E) && x44.r(this.F, qy9Var.F) && x44.r(this.G, qy9Var.G);
    }

    public final int hashCode() {
        kl7 kl7Var = this.E;
        int iHashCode = (kl7Var == null ? 0 : kl7Var.hashCode()) * 31;
        kl7 kl7Var2 = this.F;
        int iHashCode2 = (iHashCode + (kl7Var2 == null ? 0 : kl7Var2.hashCode())) * 31;
        kl7 kl7Var3 = this.G;
        return iHashCode2 + (kl7Var3 != null ? kl7Var3.hashCode() : 0);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.E + ", placementSpec=" + this.F + ", fadeOutSpec=" + this.G + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ry9 ry9Var = (ry9) hqbVar;
        ry9Var.S = this.E;
        ry9Var.T = this.F;
        ry9Var.U = this.G;
    }
}
