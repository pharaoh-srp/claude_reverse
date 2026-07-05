package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y57 extends e67 {
    public final double a;
    public final double b;

    public y57(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y57)) {
            return false;
        }
        y57 y57Var = (y57) obj;
        return this.a == y57Var.a && this.b == y57Var.b;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HeartRateTarget(minHeartRate=" + this.a + ", maxHeartRate=" + this.b + ')';
    }
}
