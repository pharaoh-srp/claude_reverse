package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgei;", "Lnqb;", "Lhei;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class gei extends nqb {
    public final wbj E;

    public gei(wbj wbjVar) {
        this.E = wbjVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        hei heiVar = new hei();
        heiVar.U = this.E;
        return heiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gei) {
            return x44.r(((gei) obj).E, this.E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        hei heiVar = (hei) hqbVar;
        wbj wbjVar = heiVar.U;
        wbj wbjVar2 = this.E;
        if (x44.r(wbjVar2, wbjVar)) {
            return;
        }
        heiVar.U = wbjVar2;
        heiVar.q1();
    }
}
