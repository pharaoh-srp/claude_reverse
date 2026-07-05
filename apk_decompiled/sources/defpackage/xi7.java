package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xi7 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;

    public xi7(long j, long j2, long j3, int i, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = j4;
        this.f = j5;
        this.g = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi7)) {
            return false;
        }
        xi7 xi7Var = (xi7) obj;
        return this.a == xi7Var.a && this.b == xi7Var.b && this.c == xi7Var.c && this.d == xi7Var.d && this.e == xi7Var.e && this.f == xi7Var.f && this.g == xi7Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + vb7.e(vb7.e(vb7.c(this.d, vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "FilePersistenceConfig(recentDelayMs=", ", maxBatchSize=");
        sbW.append(this.b);
        ij0.u(this.c, ", maxItemSize=", ", maxItemsPerBatch=", sbW);
        sbW.append(this.d);
        sbW.append(", oldFileThreshold=");
        sbW.append(this.e);
        ij0.u(this.f, ", maxDiskSpace=", ", cleanupFrequencyThreshold=", sbW);
        return grc.r(this.g, ")", sbW);
    }
}
