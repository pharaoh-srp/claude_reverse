package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnr1;", "Lnqb;", "Lor1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class nr1 extends nqb {
    public final bz7 E;

    public nr1(bz7 bz7Var) {
        this.E = bz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new or1(this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nr1) {
            return this.E == ((nr1) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        or1 or1Var = (or1) hqbVar;
        bz7 bz7Var = this.E;
        or1Var.S = bz7Var;
        dgj.V(or1Var, bz7Var);
    }
}
