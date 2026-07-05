package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpsc;", "Lnqb;", "Losc;", "material3"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class psc extends nqb {
    public final l6 E;

    public psc(l6 l6Var) {
        this.E = l6Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        osc oscVar = new osc();
        oscVar.S = this.E;
        return oscVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof psc) {
            return this.E == ((psc) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        osc oscVar = (osc) hqbVar;
        oscVar.S = this.E;
        yfd.W(oscVar).V();
    }
}
