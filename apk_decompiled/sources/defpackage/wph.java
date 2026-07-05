package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wph {
    public static final wph e = new wph(0, 0, 0, 0);
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public wph(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wph)) {
            return false;
        }
        wph wphVar = (wph) obj;
        return this.a == wphVar.a && this.b == wphVar.b && this.c == wphVar.c && this.d == wphVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "TimeInfo(deviceTimeNs=", ", serverTimeNs=");
        sbW.append(this.b);
        ij0.u(this.c, ", serverTimeOffsetNs=", ", serverTimeOffsetMs=", sbW);
        return grc.r(this.d, ")", sbW);
    }
}
