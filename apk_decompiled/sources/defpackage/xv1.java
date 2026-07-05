package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxv1;", "Lnqb;", "Lyv1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class xv1 extends nqb {
    public final tt E;
    public final boolean F;

    public xv1(tt ttVar, boolean z) {
        this.E = ttVar;
        this.F = z;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        yv1 yv1Var = new yv1();
        yv1Var.S = this.E;
        yv1Var.T = this.F;
        return yv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        xv1 xv1Var = obj instanceof xv1 ? (xv1) obj : null;
        return xv1Var != null && x44.r(this.E, xv1Var.E) && this.F == xv1Var.F;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.F) + (this.E.hashCode() * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        yv1 yv1Var = (yv1) hqbVar;
        yv1Var.S = this.E;
        yv1Var.T = this.F;
    }
}
