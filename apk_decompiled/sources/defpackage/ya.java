package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ya {
    public final long a;

    public ya(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ya) && this.a == ((ya) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "Resource(count=", ")");
    }
}
