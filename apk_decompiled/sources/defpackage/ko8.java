package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lko8;", "Lnqb;", "Llo8;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class ko8 extends nqb {
    public final vo1 E;

    public ko8(vo1 vo1Var) {
        this.E = vo1Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        lo8 lo8Var = new lo8();
        lo8Var.S = this.E;
        return lo8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ko8 ko8Var = obj instanceof ko8 ? (ko8) obj : null;
        if (ko8Var == null) {
            return false;
        }
        return this.E.equals(ko8Var.E);
    }

    public final int hashCode() {
        return Float.hashCode(this.E.a);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((lo8) hqbVar).S = this.E;
    }
}
