package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j81 {
    public final int a;
    public final long b;

    public j81(int i, long j) {
        if (i == 0) {
            mr9.h("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public static j81 a() {
        return new j81(3, -1L);
    }

    public static j81 d() {
        return new j81(4, -1L);
    }

    public static j81 e(long j) {
        return new j81(1, j);
    }

    public static j81 f() {
        return new j81(2, -1L);
    }

    public final long b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j81)) {
            return false;
        }
        j81 j81Var = (j81) obj;
        return sq6.c(this.a, j81Var.a) && this.b == j81Var.b;
    }

    public final int hashCode() {
        int iF = (sq6.F(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ iF;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(ebh.I(this.a));
        sb.append(", nextRequestWaitMillis=");
        return grc.r(this.b, "}", sb);
    }
}
