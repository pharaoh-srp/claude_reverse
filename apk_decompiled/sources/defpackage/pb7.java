package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpb7;", "Lnqb;", "Lqb7;", "material3"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class pb7 extends nqb {
    public final w95 E;

    public pb7(w95 w95Var) {
        this.E = w95Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        qb7 qb7Var = new qb7();
        qb7Var.S = this.E;
        return qb7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pb7) {
            return this.E == ((pb7) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((qb7) hqbVar).S = this.E;
    }
}
