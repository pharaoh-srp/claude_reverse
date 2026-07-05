package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kkh {
    public static final long b = mwa.m(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ kkh(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return (g(j) <= g(j2)) & (f(j2) <= f(j));
    }

    public static boolean b(long j, Object obj) {
        return (obj instanceof kkh) && j == ((kkh) obj).a;
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final boolean d(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int e(long j) {
        return f(j) - g(j);
    }

    public static final int f(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int g(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean h(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String i(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return vb7.r(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return b(this.a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
