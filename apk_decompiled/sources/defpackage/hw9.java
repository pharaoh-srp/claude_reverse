package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhw9;", "Lnqb;", "Liw9;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class hw9 extends nqb {
    public final float E;
    public final boolean F;

    public hw9(float f, boolean z) {
        this.E = f;
        this.F = z;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        iw9 iw9Var = new iw9();
        iw9Var.S = this.E;
        iw9Var.T = this.F;
        return iw9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        hw9 hw9Var = obj instanceof hw9 ? (hw9) obj : null;
        return hw9Var != null && this.E == hw9Var.E && this.F == hw9Var.F;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.F) + (Float.hashCode(this.E) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        iw9 iw9Var = (iw9) hqbVar;
        iw9Var.S = this.E;
        iw9Var.T = this.F;
    }
}
