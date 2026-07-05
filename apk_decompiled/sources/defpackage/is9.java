package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class is9 {
    public final long a;
    public final Long b;

    public is9(long j, Long l) {
        this.a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is9)) {
            return false;
        }
        is9 is9Var = (is9) obj;
        return this.a == is9Var.a && x44.r(this.b, is9Var.b);
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Long l = this.b;
        return i + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "KronosTime(posixTimeMs=" + this.a + ", timeSinceLastNtpSyncMs=" + this.b + ")";
    }
}
