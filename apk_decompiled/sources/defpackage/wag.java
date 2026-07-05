package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wag {
    public final long a;
    public long b;

    public wag(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wag)) {
            return false;
        }
        wag wagVar = (wag) obj;
        return this.a == wagVar.a && this.b == wagVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return (this.b / 1000000.0d) + "ms";
    }
}
