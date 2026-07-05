package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ua {
    public final long a;

    public ua(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ua) && this.a == ((ua) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "LongTask(count=", ")");
    }
}
