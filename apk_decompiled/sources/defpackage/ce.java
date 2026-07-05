package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lce;", "Lnqb;", "Lde;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class ce extends nqb {
    public final pz7 E;

    public ce(pz7 pz7Var) {
        this.E = pz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        de deVar = new de();
        deVar.U = this.E;
        v0 v0Var = new v0(4, deVar);
        be beVar = new be();
        beVar.S = v0Var;
        deVar.p1(beVar);
        return deVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ce) {
            return this.E == ((ce) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((de) hqbVar).U = this.E;
    }
}
