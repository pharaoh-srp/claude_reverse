package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x91 {
    public int a = 0;
    public double b = 0.0d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x91)) {
            return false;
        }
        x91 x91Var = (x91) obj;
        return this.a == x91Var.a && Double.compare(this.b, x91Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AvgData(count=" + this.a + ", total=" + this.b + ')';
    }
}
