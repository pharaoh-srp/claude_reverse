package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x57 extends e67 {
    public final double a;
    public final double b;

    public x57(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x57)) {
            return false;
        }
        x57 x57Var = (x57) obj;
        return this.a == x57Var.a && this.b == x57Var.b;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CadenceTarget(minCadence=" + this.a + ", maxCadence=" + this.b + ')';
    }
}
