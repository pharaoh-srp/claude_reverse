package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l46 {
    public final int a;
    public final int b;

    public l46(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l46)) {
            return false;
        }
        l46 l46Var = (l46) obj;
        return this.a == l46Var.a && this.b == l46Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return vb7.q("DiffStat(added=", ", removed=", this.a, this.b, ")");
    }
}
