package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lty9;", "Lnqb;", "Lwy9;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class ty9 extends nqb {
    public final xy9 E;
    public final n78 F;
    public final boolean G;
    public final ukc H;

    public ty9(xy9 xy9Var, n78 n78Var, boolean z, ukc ukcVar) {
        this.E = xy9Var;
        this.F = n78Var;
        this.G = z;
        this.H = ukcVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        wy9 wy9Var = new wy9();
        wy9Var.S = this.E;
        wy9Var.T = this.F;
        wy9Var.U = this.G;
        wy9Var.V = this.H;
        return wy9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty9)) {
            return false;
        }
        ty9 ty9Var = (ty9) obj;
        return x44.r(this.E, ty9Var.E) && x44.r(this.F, ty9Var.F) && this.G == ty9Var.G && this.H == ty9Var.H;
    }

    public final int hashCode() {
        return this.H.hashCode() + fsh.p((this.F.hashCode() + (this.E.hashCode() * 31)) * 31, 31, this.G);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        wy9 wy9Var = (wy9) hqbVar;
        wy9Var.S = this.E;
        wy9Var.T = this.F;
        wy9Var.U = this.G;
        wy9Var.V = this.H;
    }
}
