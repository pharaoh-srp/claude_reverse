package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq6i;", "Lnqb;", "Lr6i;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final /* data */ class q6i extends nqb {
    public final xz9 E;

    public q6i(xz9 xz9Var) {
        this.E = xz9Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        r6i r6iVar = new r6i();
        r6iVar.S = this.E;
        return r6iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6i) && x44.r(this.E, ((q6i) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.E + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((r6i) hqbVar).S = this.E;
    }
}
