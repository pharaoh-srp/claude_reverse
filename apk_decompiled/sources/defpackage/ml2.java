package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ml2 {
    public final int a;
    public final int b;

    public ml2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2)) {
            return false;
        }
        ml2 ml2Var = (ml2) obj;
        return this.a == ml2Var.a && this.b == ml2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return vb7.q("NewlineCounts(multiple=", ", single=", this.a, this.b, ")");
    }
}
