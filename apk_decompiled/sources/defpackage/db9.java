package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldb9;", "Lnqb;", "Lfb9;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class db9 extends nqb {
    public final za9 E;

    public db9(za9 za9Var) {
        this.E = za9Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        fb9 fb9Var = new fb9();
        fb9Var.S = this.E;
        fb9Var.T = true;
        return fb9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        db9 db9Var = obj instanceof db9 ? (db9) obj : null;
        return db9Var != null && this.E == db9Var.E;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.E.hashCode() * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        fb9 fb9Var = (fb9) hqbVar;
        fb9Var.S = this.E;
        fb9Var.T = true;
    }
}
