package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b02 implements vb0 {
    public static final long d = eve.L(1.0f, 8589934592L);
    public static final b02 e;
    public final long a;
    public final long b;
    public final long c;

    static {
        long jY = eve.y(0.25d);
        e = new b02(jY, jY, eve.y(0.25d));
    }

    public b02(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b02)) {
            return false;
        }
        b02 b02Var = (b02) obj;
        if (!clh.a(this.a, b02Var.a) || !clh.a(this.b, b02Var.b)) {
            return false;
        }
        clh.a(this.c, b02Var.c);
        return false;
    }

    public final int hashCode() {
        int iHashCode = bg3.a.hashCode() * 31;
        dlh[] dlhVarArr = clh.b;
        return qk7.a.hashCode() + vb7.b(Float.NaN, vb7.e(vb7.e(vb7.e(iHashCode, 31, this.a), 31, this.b), 961, this.c), 31);
    }

    public final String toString() {
        return "Bullet(shape=" + bg3.a + ", size=(" + ((Object) clh.d(this.a)) + ", " + ((Object) clh.d(this.b)) + "), padding=" + ((Object) clh.d(this.c)) + ", brush=null, alpha=NaN, drawStyle=" + qk7.a + ')';
    }
}
