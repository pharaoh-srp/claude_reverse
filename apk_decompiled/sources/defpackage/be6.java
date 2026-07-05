package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbe6;", "Lnqb;", "Lce6;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class be6 extends nqb {
    public final bz7 E;

    public be6(bz7 bz7Var) {
        this.E = bz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        ce6 ce6Var = new ce6();
        ce6Var.S = this.E;
        return ce6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof be6) {
            return this.E == ((be6) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((ce6) hqbVar).S = this.E;
    }
}
