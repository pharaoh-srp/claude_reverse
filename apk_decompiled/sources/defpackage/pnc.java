package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpnc;", "Lnqb;", "Lsnc;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class pnc extends nqb {
    public final mnc E;

    public pnc(mnc mncVar) {
        this.E = mncVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        snc sncVar = new snc();
        sncVar.S = this.E;
        return sncVar;
    }

    public final boolean equals(Object obj) {
        pnc pncVar = obj instanceof pnc ? (pnc) obj : null;
        if (pncVar == null) {
            return false;
        }
        return x44.r(this.E, pncVar.E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((snc) hqbVar).S = this.E;
    }
}
