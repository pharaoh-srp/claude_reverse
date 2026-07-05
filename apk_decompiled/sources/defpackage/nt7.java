package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnt7;", "Lnqb;", "Lpt7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class nt7 extends nqb {
    public final zub E;

    public nt7(zub zubVar) {
        this.E = zubVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new pt7(this.E, (rfh) null, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nt7) {
            return x44.r(this.E, ((nt7) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        zub zubVar = this.E;
        if (zubVar != null) {
            return zubVar.hashCode();
        }
        return 0;
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((pt7) hqbVar).t1(this.E);
    }
}
