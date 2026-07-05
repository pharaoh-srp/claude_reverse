package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvo9;", "Lnqb;", "Lxo9;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class vo9 extends nqb {
    public final bz7 E;
    public final bz7 F;

    public vo9(bz7 bz7Var, bz7 bz7Var2) {
        this.E = bz7Var;
        this.F = bz7Var2;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        xo9 xo9Var = new xo9();
        xo9Var.S = this.E;
        xo9Var.T = this.F;
        return xo9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo9)) {
            return false;
        }
        vo9 vo9Var = (vo9) obj;
        return this.E == vo9Var.E && this.F == vo9Var.F;
    }

    public final int hashCode() {
        bz7 bz7Var = this.E;
        int iHashCode = (bz7Var != null ? bz7Var.hashCode() : 0) * 31;
        bz7 bz7Var2 = this.F;
        return iHashCode + (bz7Var2 != null ? bz7Var2.hashCode() : 0);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        xo9 xo9Var = (xo9) hqbVar;
        xo9Var.S = this.E;
        xo9Var.T = this.F;
    }
}
