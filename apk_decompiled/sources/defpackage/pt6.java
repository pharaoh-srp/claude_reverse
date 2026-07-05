package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pt6 implements vt6 {
    public final int a;
    public final st6 b;

    public pt6(int i, st6 st6Var) {
        this.a = i;
        this.b = st6Var;
    }

    @Override // defpackage.vt6
    public final zb0 a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-196558385);
        zb0 zb0VarI = zrk.i(this.a, e18Var);
        e18Var.p(false);
        return zb0VarI;
    }

    @Override // defpackage.vt6
    public final st6 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt6)) {
            return false;
        }
        pt6 pt6Var = (pt6) obj;
        return this.a == pt6Var.a && this.b == pt6Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "GenericMessage(annotatedStringResourceId=" + this.a + ", severity=" + this.b + ")";
    }

    public /* synthetic */ pt6(int i) {
        this(i, st6.E);
    }
}
