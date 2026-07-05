package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkfj;", "Lnqb;", "Lo5g;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class kfj extends nqb {
    public final ut E;

    public kfj(ut utVar) {
        this.E = utVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        o5g o5gVar = new o5g();
        o5gVar.S = this.E;
        return o5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        kfj kfjVar = obj instanceof kfj ? (kfj) obj : null;
        if (kfjVar == null) {
            return false;
        }
        return x44.r(this.E, kfjVar.E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((o5g) hqbVar).S = this.E;
    }
}
