package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eq3 implements gq3 {
    public final double E;
    public final double F;

    public eq3(double d, double d2) {
        this.E = d;
        this.F = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gq3
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    @Override // defpackage.hq3
    public final Comparable e() {
        return Double.valueOf(this.E);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eq3)) {
            return false;
        }
        double d = this.E;
        double d2 = this.F;
        if (d > d2) {
            eq3 eq3Var = (eq3) obj;
            if (eq3Var.E > eq3Var.F) {
                return true;
            }
        }
        eq3 eq3Var2 = (eq3) obj;
        return d == eq3Var2.E && d2 == eq3Var2.F;
    }

    @Override // defpackage.hq3
    public final Comparable g() {
        return Double.valueOf(this.F);
    }

    public final int hashCode() {
        double d = this.E;
        double d2 = this.F;
        if (d > d2) {
            return -1;
        }
        return Double.hashCode(d2) + (Double.hashCode(d) * 31);
    }

    @Override // defpackage.hq3
    public final boolean isEmpty() {
        return this.E > this.F;
    }

    public final String toString() {
        return this.E + ".." + this.F;
    }
}
