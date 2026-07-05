package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p58 {
    public final int a;
    public final String b;

    public p58(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p58)) {
            return false;
        }
        p58 p58Var = (p58) obj;
        return this.a == p58Var.a && x44.r(this.b, p58Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "GitOperation(verbRes=" + this.a + ", detail=" + this.b + ")";
    }
}
