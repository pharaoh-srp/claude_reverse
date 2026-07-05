package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xg1 {
    public final long a;
    public final long b;

    public xg1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg1)) {
            return false;
        }
        xg1 xg1Var = (xg1) obj;
        return this.a == xg1Var.a && this.b == xg1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return grc.r(this.b, ")", grc.w(this.a, "BatchClosedMetadata(lastTimeWasUsedInMs=", ", eventsCount="));
    }
}
