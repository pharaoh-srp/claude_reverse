package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lva9;", "Lnqb;", "Lwa9;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class va9 extends nqb {
    public final za9 E;

    public va9(za9 za9Var) {
        this.E = za9Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        wa9 wa9Var = new wa9();
        wa9Var.S = this.E;
        wa9Var.T = true;
        return wa9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        va9 va9Var = obj instanceof va9 ? (va9) obj : null;
        return va9Var != null && this.E == va9Var.E;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.E.hashCode() * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        wa9 wa9Var = (wa9) hqbVar;
        wa9Var.S = this.E;
        wa9Var.T = true;
    }
}
