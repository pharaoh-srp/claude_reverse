package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p8d {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;

    public p8d(long j, long j2, long j3, long j4, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8d)) {
            return false;
        }
        p8d p8dVar = (p8d) obj;
        return this.a == p8dVar.a && this.b == p8dVar.b && this.c == p8dVar.c && this.d == p8dVar.d && this.e == p8dVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "PollingRetryConfig(initialDelayMs=", ", delayIncrementMs=");
        sbW.append(this.b);
        ij0.u(this.c, ", maxDelayMs=", ", deadline=", sbW);
        sbW.append(this.d);
        sbW.append(", maxConsecutiveFetchFailed=");
        sbW.append(this.e);
        sbW.append(")");
        return sbW.toString();
    }
}
