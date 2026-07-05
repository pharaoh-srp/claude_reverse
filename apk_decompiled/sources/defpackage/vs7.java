package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvs7;", "Lnqb;", "Lzs7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final /* data */ class vs7 extends nqb {
    public final xs7 E;

    public vs7(xs7 xs7Var) {
        this.E = xs7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        zs7 zs7Var = new zs7();
        zs7Var.S = this.E;
        return zs7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vs7) && this.E.equals(((vs7) obj).E);
    }

    public final int hashCode() {
        return this.E.E.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.E + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((zs7) hqbVar).S = this.E;
    }
}
