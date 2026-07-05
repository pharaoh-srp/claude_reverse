package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hhd {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public hhd(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhd)) {
            return false;
        }
        hhd hhdVar = (hhd) obj;
        return d54.c(this.a, hhdVar.a) && d54.c(this.b, hhdVar.b) && d54.c(this.c, hhdVar.c) && d54.c(this.d, hhdVar.d);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.d) + vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strI = d54.i(this.a);
        String strI2 = d54.i(this.b);
        return vb7.t(kgh.r("ProcessItemColors(containerColor=", strI, ", contentColor=", strI2, ", disabledContainerColor="), d54.i(this.c), ", disabledContentColor=", d54.i(this.d), ")");
    }
}
