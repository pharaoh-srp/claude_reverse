package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q7d {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof q7d) {
            return this.a == ((q7d) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        return "Point(x=" + Float.intBitsToFloat((int) (j >> 32)) + ", y=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ")";
    }
}
