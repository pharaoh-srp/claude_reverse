package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rp0 {
    public final double a;
    public final int b;

    public rp0(double d, int i) {
        this.a = d;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp0)) {
            return false;
        }
        rp0 rp0Var = (rp0) obj;
        return Double.compare(this.a, rp0Var.a) == 0 && this.b == rp0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Arrival(timeSec=" + this.a + ", chars=" + this.b + ")";
    }
}
