package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fqe {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public fqe(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final long a() {
        return this.d;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.b;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqe)) {
            return false;
        }
        fqe fqeVar = (fqe) obj;
        return this.a == fqeVar.a && this.b == fqeVar.b && this.c == fqeVar.c && this.d == fqeVar.d && this.e == fqeVar.e && this.f == fqeVar.f && this.g == fqeVar.g && this.h == fqeVar.h && this.i == fqeVar.i && this.j == fqeVar.j;
    }

    public final long f() {
        return this.i;
    }

    public final long g() {
        return this.h;
    }

    public final long h() {
        return this.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final long i() {
        return this.f;
    }

    public final long j() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "ResourceTiming(dnsStart=", ", dnsDuration=");
        sbW.append(this.b);
        ij0.u(this.c, ", connectStart=", ", connectDuration=", sbW);
        sbW.append(this.d);
        ij0.u(this.e, ", sslStart=", ", sslDuration=", sbW);
        sbW.append(this.f);
        ij0.u(this.g, ", firstByteStart=", ", firstByteDuration=", sbW);
        sbW.append(this.h);
        ij0.u(this.i, ", downloadStart=", ", downloadDuration=", sbW);
        return grc.r(this.j, ")", sbW);
    }
}
