package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lsti;", "Lnqb;", "Ltti;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class sti extends nqb {
    public final wo1 E;

    public sti(wo1 wo1Var) {
        this.E = wo1Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        tti ttiVar = new tti();
        ttiVar.S = this.E;
        return ttiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        sti stiVar = obj instanceof sti ? (sti) obj : null;
        if (stiVar == null) {
            return false;
        }
        return this.E.equals(stiVar.E);
    }

    public final int hashCode() {
        return Float.hashCode(this.E.a);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((tti) hqbVar).S = this.E;
    }
}
