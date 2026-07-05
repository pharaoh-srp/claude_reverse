package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class clh {
    public static final dlh[] b = {new dlh(0), new dlh(4294967296L), new dlh(8589934592L)};
    public static final long c = eve.L(Float.NaN, 0);
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long jB = b(j);
        if (dlh.a(jB, 0L)) {
            return "Unspecified";
        }
        if (dlh.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!dlh.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof clh) {
            return this.a == ((clh) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
