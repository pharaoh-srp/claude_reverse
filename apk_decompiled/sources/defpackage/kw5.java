package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkw5;", "Lnqb;", "Lmw5;", "adaptive-layout"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
final class kw5 extends nqb {
    public final boolean E;
    public final bz7 F;

    public kw5(bz7 bz7Var, boolean z) {
        this.E = z;
        this.F = bz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        mw5 mw5Var = new mw5();
        mw5Var.S = this.E;
        mw5Var.T = this.F;
        return mw5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw5)) {
            return false;
        }
        kw5 kw5Var = (kw5) obj;
        return this.E == kw5Var.E && this.F == kw5Var.F;
    }

    public final int hashCode() {
        return this.F.hashCode() + (Boolean.hashCode(this.E) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        mw5 mw5Var = (mw5) hqbVar;
        mw5Var.S = this.E;
        mw5Var.T = this.F;
    }
}
