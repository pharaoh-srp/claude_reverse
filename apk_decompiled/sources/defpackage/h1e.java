package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h1e {
    public static final g1e E = new g1e();
    public static final m3 F;

    static {
        Integer num = uc9.a;
        F = (num == null || num.intValue() >= 34) ? new a6d() : new se7();
    }

    public abstract int a(int i);

    public boolean b() {
        return a(1) != 0;
    }

    public double c() {
        return yuj.e(a(26), a(27));
    }

    public double d(double d, double d2) {
        double dC;
        wjk.j(d, d2);
        double d3 = d2 - d;
        if (!Double.isInfinite(d3) || Math.abs(d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE) {
            dC = d + (c() * d3);
        } else {
            double dC2 = ((d2 / 2.0d) - (d / 2.0d)) * c();
            dC = d + dC2 + dC2;
        }
        return dC >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : dC;
    }

    public float e() {
        return a(24) / 1.6777216E7f;
    }

    public abstract int f();

    public int g(int i) {
        return h(0, 301);
    }

    public int h(int i, int i2) {
        int iF;
        int i3;
        int iA;
        wjk.k(i, i2);
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iA = a(wjk.m(i4));
            } else {
                do {
                    iF = f() >>> 1;
                    i3 = iF % i4;
                } while ((i4 - 1) + (iF - i3) < 0);
                iA = i3;
            }
            return i + iA;
        }
        while (true) {
            int iF2 = f();
            if (i <= iF2 && iF2 < i2) {
                return iF2;
            }
        }
    }

    public long i() {
        return (((long) f()) << 32) + ((long) f());
    }

    public long j(long j) {
        return k(0L, j);
    }

    public long k(long j, long j2) {
        long jI;
        long j3;
        long jA;
        int iF;
        wjk.l(j, j2);
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iF = a(wjk.m(i));
                } else if (i2 == 1) {
                    iF = f();
                } else {
                    jA = (((long) a(wjk.m(i2))) << 32) + (((long) f()) & 4294967295L);
                }
                jA = ((long) iF) & 4294967295L;
            } else {
                do {
                    jI = i() >>> 1;
                    j3 = jI % j4;
                } while ((j4 - 1) + (jI - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jI2 = i();
            if (j <= jI2 && jI2 < j2) {
                return jI2;
            }
        }
    }
}
