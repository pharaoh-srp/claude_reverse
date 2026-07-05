package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug7 {
    public static final ug7 e = new ug7(524288, 500, 4194304, 64800000);
    public final long a;
    public final int b;
    public final long c;
    public final long d;

    public ug7(long j, int i, long j2, long j3) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug7)) {
            return false;
        }
        ug7 ug7Var = (ug7) obj;
        return this.a == ug7Var.a && this.b == ug7Var.b && this.c == ug7Var.c && this.d == ug7Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + vb7.e(vb7.c(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureStorageConfiguration(maxItemSize=");
        sb.append(this.a);
        sb.append(", maxItemsPerBatch=");
        sb.append(this.b);
        ij0.u(this.c, ", maxBatchSize=", ", oldBatchThreshold=", sb);
        return grc.r(this.d, ")", sb);
    }
}
