package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ya6 {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) va6.c(a(j))) + ", " + ((Object) va6.c(b(j))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ya6) {
            return this.a == ((ya6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
