package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Liu9;", "Lnqb;", "Lju9;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final /* data */ class iu9 extends nqb {
    public final Object E;

    public iu9(Object obj) {
        this.E = obj;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        ju9 ju9Var = new ju9();
        ju9Var.S = this.E;
        return ju9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu9) && this.E.equals(((iu9) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.E + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((ju9) hqbVar).S = this.E;
    }
}
