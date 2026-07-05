package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i0j {
    public static final i0j e = new i0j(0, Double.MAX_VALUE, -1.7976931348623157E308d, 0.0d);
    public final int a;
    public final double b;
    public final double c;
    public final double d;

    public i0j(int i, double d, double d2, double d3) {
        this.a = i;
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0j)) {
            return false;
        }
        i0j i0jVar = (i0j) obj;
        return this.a == i0jVar.a && Double.compare(this.b, i0jVar.b) == 0 && Double.compare(this.c, i0jVar.c) == 0 && Double.compare(this.d, i0jVar.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + fsh.o(this.c, fsh.o(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "VitalInfo(sampleCount=" + this.a + ", minValue=" + this.b + ", maxValue=" + this.c + ", meanValue=" + this.d + ")";
    }
}
