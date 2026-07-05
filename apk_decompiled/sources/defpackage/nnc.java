package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnnc;", "Lnqb;", "Lonc;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class nnc extends nqb {
    public final mnc E;

    public nnc(mnc mncVar) {
        this.E = mncVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        onc oncVar = new onc();
        oncVar.U = this.E;
        return oncVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nnc) {
            return x44.r(((nnc) obj).E, this.E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        onc oncVar = (onc) hqbVar;
        mnc mncVar = oncVar.U;
        mnc mncVar2 = this.E;
        if (x44.r(mncVar2, mncVar)) {
            return;
        }
        oncVar.U = mncVar2;
        oncVar.q1();
    }
}
