package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uwi {
    public final long a;

    public uwi(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwi) && this.a == ((uwi) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "LongTask(count=", ")");
    }
}
