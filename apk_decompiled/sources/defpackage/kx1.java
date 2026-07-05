package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkx1;", "Lnqb;", "Lnx1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class kx1 extends nqb {
    public final h70 E;

    public kx1(h70 h70Var) {
        this.E = h70Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new nx1(this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kx1) {
            return this.E == ((kx1) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        nx1 nx1Var = (nx1) hqbVar;
        h70 h70Var = this.E;
        nx1Var.S = h70Var;
        if (nx1Var.R) {
            h70Var.invoke(nx1Var.T);
        }
    }
}
