package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldeh;", "Lnqb;", "Lfeh;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class deh extends nqb {
    public final pz7 E;

    public deh(pz7 pz7Var) {
        this.E = pz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new feh(this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof deh) {
            return this.E == ((deh) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        pz7 pz7Var = this.E;
        if (pz7Var != null) {
            return pz7Var.hashCode();
        }
        return 0;
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((feh) hqbVar).U = this.E;
    }
}
