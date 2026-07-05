package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b68 implements d68 {
    public final String a;
    public final int b;

    public b68(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b68)) {
            return false;
        }
        b68 b68Var = (b68) obj;
        return x44.r(this.a, b68Var.a) && this.b == b68Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return sq6.u("PR(viewUrl=", this.a, this.b, ", prNumber=", ")");
    }
}
