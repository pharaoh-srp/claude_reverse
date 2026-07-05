package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gxi {
    public final long a;
    public final long b;

    public gxi(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxi)) {
            return false;
        }
        gxi gxiVar = (gxi) obj;
        return this.a == gxiVar.a && this.b == gxiVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return grc.r(this.b, ")", grc.w(this.a, "SlowFrame(start=", ", duration="));
    }
}
