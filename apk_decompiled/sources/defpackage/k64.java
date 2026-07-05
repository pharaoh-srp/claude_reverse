package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k64 implements ce2 {
    public final double a;
    public final double b;

    public k64(Number number, Number number2) {
        number.getClass();
        number2.getClass();
        double dDoubleValue = number.doubleValue();
        double dDoubleValue2 = number2.doubleValue();
        this.a = dDoubleValue;
        this.b = dDoubleValue2;
    }

    @Override // defpackage.ce2
    public final double a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k64)) {
            return false;
        }
        k64 k64Var = (k64) obj;
        return this.a == k64Var.a && this.b == k64Var.b;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }
}
