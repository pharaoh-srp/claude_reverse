package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lox1;", "Lnqb;", "Lrx1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class ox1 extends nqb {
    public final qx1 E;

    public ox1(qx1 qx1Var) {
        this.E = qx1Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new rx1(this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ox1) {
            return x44.r(this.E, ((ox1) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((rx1) hqbVar).p1(this.E);
    }
}
