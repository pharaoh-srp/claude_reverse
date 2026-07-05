package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lrug;", "Lnqb;", "Lsug;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class rug extends nqb {
    public final zy7 E;

    public rug(zy7 zy7Var) {
        this.E = zy7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new sug(this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rug) {
            return this.E == ((rug) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((sug) hqbVar).U = this.E;
    }
}
