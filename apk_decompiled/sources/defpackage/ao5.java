package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ao5 implements Comparable {
    public final int E;
    public final int F;

    public ao5(int i, int i2) {
        this.E = i;
        this.F = i2;
        if (i2 >= 0) {
            return;
        }
        mr9.q(grc.p(i2, "Digits must be non-negative, but was "));
        throw null;
    }

    public final int a(int i) {
        int[] iArr = etj.d;
        int i2 = this.E;
        int i3 = this.F;
        return i == i3 ? i2 : i > i3 ? i2 * iArr[i - i3] : i2 / iArr[i3 - i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ao5 ao5Var = (ao5) obj;
        ao5Var.getClass();
        int iMax = Math.max(this.F, ao5Var.F);
        return x44.z(a(iMax), ao5Var.a(iMax));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ao5)) {
            return false;
        }
        ao5 ao5Var = (ao5) obj;
        int iMax = Math.max(this.F, ao5Var.F);
        return x44.z(a(iMax), ao5Var.a(iMax)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = etj.d[this.F];
        int i2 = this.E;
        sb.append(i2 / i);
        sb.append('.');
        sb.append(bsg.R0(String.valueOf((i2 % i) + i), "1"));
        return sb.toString();
    }
}
