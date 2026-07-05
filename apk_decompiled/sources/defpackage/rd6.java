package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lrd6;", "Lnqb;", "Lqd6;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class rd6 extends nqb {
    public final bz7 E;

    public rd6(bz7 bz7Var) {
        this.E = bz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        qd6 qd6Var = new qd6();
        qd6Var.S = this.E;
        return qd6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rd6) {
            return this.E == ((rd6) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((qd6) hqbVar).S = this.E;
    }
}
