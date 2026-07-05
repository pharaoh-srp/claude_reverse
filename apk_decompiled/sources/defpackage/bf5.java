package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bf5 extends ef5 {
    public static final bf5 e = new bf5(-1, "18446744073709551615");
    public final long b;
    public String c;
    public String d;

    public bf5(long j, String str) {
        this.b = j;
        this.c = str;
    }

    public static bf5 f(long j) {
        bf5 bf5Var;
        return (j != 0 || (bf5Var = ef5.a) == null) ? j == -1 ? e : new bf5(j, null) : bf5Var;
    }

    @Override // defpackage.ef5
    public final String b() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String strJ0 = j8.j0(32, this.b);
        this.d = strJ0;
        return strJ0;
    }

    @Override // defpackage.ef5
    public final String c() {
        return j8.j0(16, this.b);
    }

    @Override // defpackage.ef5
    public final long d() {
        return 0L;
    }

    @Override // defpackage.ef5
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf5) && this.b == ((bf5) obj).b;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    @Override // defpackage.ef5
    public final String toString() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        String unsignedString = Long.toUnsignedString(this.b);
        this.c = unsignedString;
        return unsignedString;
    }
}
