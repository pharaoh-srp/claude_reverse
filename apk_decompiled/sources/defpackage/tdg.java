package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tdg {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public tdg(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdg)) {
            return false;
        }
        tdg tdgVar = (tdg) obj;
        return this.a == tdgVar.a && this.b == tdgVar.b && this.c == tdgVar.c && this.d == tdgVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "SntpResult(serverTimeMs=", ", observedAtElapsedMs=");
        sbW.append(this.b);
        ij0.u(this.c, ", offsetMs=", ", roundTripMs=", sbW);
        return grc.r(this.d, ")", sbW);
    }
}
