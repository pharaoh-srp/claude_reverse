package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lmh {
    public final long a;

    public lmh(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmh) && this.a == ((lmh) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "ThoughtFor(seconds=", ")");
    }
}
