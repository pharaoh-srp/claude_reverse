package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c64 {
    public double a;
    public double b;
    public float c;
    public float d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c64)) {
            return false;
        }
        c64 c64Var = (c64) obj;
        return Double.compare(this.a, c64Var.a) == 0 && Double.compare(this.b, c64Var.b) == 0 && Float.compare(this.c, c64Var.c) == 0 && Float.compare(this.d, c64Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + vb7.b(this.c, fsh.o(this.b, Double.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "StackInfo(topY=" + this.a + ", bottomY=" + this.b + ", topHeight=" + this.c + ", bottomHeight=" + this.d + ")";
    }
}
