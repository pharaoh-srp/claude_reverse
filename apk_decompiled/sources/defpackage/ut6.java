package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ut6 implements vt6 {
    public final int a;

    public ut6(int i) {
        this.a = i;
    }

    @Override // defpackage.vt6
    public final zb0 a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-2011555790);
        zb0 zb0VarI = zrk.i(this.a, e18Var);
        e18Var.p(false);
        return zb0VarI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ut6) && this.a == ((ut6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return grc.u("ValidationError(annotatedStringResourceId=", this.a, ")");
    }
}
