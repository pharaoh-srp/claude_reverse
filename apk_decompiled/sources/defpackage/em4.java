package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lem4;", "Lnqb;", "Lfm4;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class em4 extends nqb {
    public final bz7 E;

    public em4(bz7 bz7Var) {
        this.E = bz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        fm4 fm4Var = new fm4();
        fm4Var.U = this.E;
        return fm4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em4) && ((em4) obj).E == this.E;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        fm4 fm4Var = (fm4) hqbVar;
        bz7 bz7Var = fm4Var.U;
        bz7 bz7Var2 = this.E;
        if (bz7Var2 != bz7Var) {
            fm4Var.U = bz7Var2;
        }
    }
}
