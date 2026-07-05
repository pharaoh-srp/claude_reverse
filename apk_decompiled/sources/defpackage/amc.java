package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class amc {
    public final long a;
    public final long b;
    public final long c;

    public amc(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amc)) {
            return false;
        }
        amc amcVar = (amc) obj;
        return d54.c(this.a, amcVar.a) && d54.c(this.b, amcVar.b) && d54.c(this.c, amcVar.c);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.c) + vb7.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = d54.i(this.a);
        String strI2 = d54.i(this.b);
        return ij0.m(kgh.r("OutputItemColors(borderColor=", strI, ", containerColor=", strI2, ", contentColor="), d54.i(this.c), ")");
    }
}
