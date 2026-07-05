package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ulj {
    public final long a;

    public ulj(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ulj) && this.a == ((ulj) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (-724379968) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return grc.r(this.a, "}", new StringBuilder("EventRecord{eventType=3, eventTimestamp="));
    }
}
