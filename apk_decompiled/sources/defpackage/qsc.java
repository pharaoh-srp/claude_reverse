package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqsc;", "Lnqb;", "Lrsc;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class qsc extends nqb {
    public final float E;
    public final wlg F;
    public final wlg G;

    public /* synthetic */ qsc(isc iscVar, isc iscVar2, int i) {
        this((i & 2) != 0 ? null : iscVar, (i & 4) != 0 ? null : iscVar2);
    }

    @Override // defpackage.nqb
    public final hqb create() {
        rsc rscVar = new rsc();
        rscVar.S = this.E;
        rscVar.T = this.F;
        rscVar.U = this.G;
        return rscVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsc)) {
            return false;
        }
        qsc qscVar = (qsc) obj;
        return this.E == qscVar.E && x44.r(this.F, qscVar.F) && x44.r(this.G, qscVar.G);
    }

    public final int hashCode() {
        wlg wlgVar = this.F;
        int iHashCode = (wlgVar != null ? wlgVar.hashCode() : 0) * 31;
        wlg wlgVar2 = this.G;
        return Float.hashCode(this.E) + ((iHashCode + (wlgVar2 != null ? wlgVar2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        rsc rscVar = (rsc) hqbVar;
        rscVar.S = this.E;
        rscVar.T = this.F;
        rscVar.U = this.G;
    }

    public qsc(wlg wlgVar, wlg wlgVar2) {
        this.E = 1.0f;
        this.F = wlgVar;
        this.G = wlgVar2;
    }
}
