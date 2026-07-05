package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldz9;", "Lnqb;", "Lez9;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final /* data */ class dz9 extends nqb {
    public final hz9 E;

    public dz9(hz9 hz9Var) {
        this.E = hz9Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        ez9 ez9Var = new ez9();
        ez9Var.S = this.E;
        return ez9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz9) && this.E == ((dz9) obj).E;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.E + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ez9 ez9Var = (ez9) hqbVar;
        hz9 hz9Var = ez9Var.S;
        hz9 hz9Var2 = this.E;
        if (x44.r(hz9Var, hz9Var2) || !ez9Var.E.R) {
            return;
        }
        hz9 hz9Var3 = ez9Var.S;
        hz9Var3.e();
        hz9Var3.b = null;
        hz9Var3.c = -1;
        hz9Var2.j = ez9Var;
        ez9Var.S = hz9Var2;
    }
}
