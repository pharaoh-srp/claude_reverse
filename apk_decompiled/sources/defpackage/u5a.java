package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u5a implements ce2 {
    public final double a;
    public final double b;

    public u5a(Number number, Number number2) {
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
        if (!(obj instanceof u5a)) {
            return false;
        }
        u5a u5aVar = (u5a) obj;
        return this.a == u5aVar.a && this.b == u5aVar.b;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }
}
