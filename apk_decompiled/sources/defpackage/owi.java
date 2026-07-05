package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class owi {
    public final long a;
    public final long b;

    public owi(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owi)) {
            return false;
        }
        owi owiVar = (owi) obj;
        return this.a == owiVar.a && this.b == owiVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return grc.r(this.b, ")", grc.w(this.a, "InForegroundPeriod(start=", ", duration="));
    }
}
