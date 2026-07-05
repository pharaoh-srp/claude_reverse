package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uz0 extends ty0 {
    public final boolean a;
    public final vz0 b;

    public uz0(boolean z, vz0 vz0Var) {
        this.a = z;
        this.b = vz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz0)) {
            return false;
        }
        uz0 uz0Var = (uz0) obj;
        return this.a == uz0Var.a && this.b == uz0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AstTableCell(header=" + this.a + ", alignment=" + this.b + ")";
    }
}
