package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgu9;", "Lnqb;", "Lnu9;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class gu9 extends nqb {
    public final rz7 E;

    public gu9(rz7 rz7Var) {
        this.E = rz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        nu9 nu9Var = new nu9();
        nu9Var.S = this.E;
        return nu9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gu9) {
            return this.E == ((gu9) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((nu9) hqbVar).S = this.E;
    }
}
