package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hka {
    public final long a;
    public final gka b;

    public hka(long j, gka gkaVar) {
        this.a = j;
        this.b = gkaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hka)) {
            return false;
        }
        hka hkaVar = (hka) obj;
        return this.a == hkaVar.a && this.b.equals(hkaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LongFrameRegistration(thresholdNs=" + this.a + ", listener=" + this.b + ")";
    }
}
