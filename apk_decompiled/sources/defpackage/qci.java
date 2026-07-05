package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qci implements Comparable {
    public final long E;

    public /* synthetic */ qci(long j) {
        this.E = j;
    }

    public static String a(long j) {
        if (j >= 0) {
            gb9.q(10);
            String string = Long.toString(j, 10);
            string.getClass();
            return string;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        gb9.q(10);
        String string2 = Long.toString(j2, 10);
        string2.getClass();
        gb9.q(10);
        String string3 = Long.toString(j3, 10);
        string3.getClass();
        return string2.concat(string3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return x44.A(this.E ^ Long.MIN_VALUE, ((qci) obj).E ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qci) {
            return this.E == ((qci) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.E);
    }

    public final String toString() {
        return a(this.E);
    }
}
