package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class za6 {
    public final long a;

    public static long a(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = d(j);
        }
        if ((i & 2) != 0) {
            f2 = c(j);
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String e(long j) {
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) va6.c(d(j))) + " x " + ((Object) va6.c(c(j)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof za6) {
            return this.a == ((za6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
