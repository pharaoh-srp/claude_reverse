package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zij implements iff {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public zij(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.iff
    public final long a() {
        return this.f;
    }

    @Override // defpackage.vef
    public final boolean b() {
        return this.g != null;
    }

    @Override // defpackage.iff
    public final long c(long j) {
        long j2 = j - this.a;
        if (!b() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.e;
        int iD = tpi.d(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) iD) * j3) / 100;
        long j5 = jArr[iD];
        int i = iD + 1;
        long j6 = (j3 * ((long) i)) / 100;
        return Math.round((j5 == (iD == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.vef
    public final uef e(long j) {
        double d;
        double d2;
        boolean zB = b();
        int i = this.b;
        long j2 = this.a;
        if (!zB) {
            xef xefVar = new xef(0L, j2 + ((long) i));
            return new uef(xefVar, xefVar);
        }
        long jH = tpi.h(j, 0L, this.c);
        double d3 = (jH * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j3 = this.e;
        xef xefVar2 = new xef(jH, j2 + tpi.h(Math.round((d4 / d) * j3), i, j3 - 1));
        return new uef(xefVar2, xefVar2);
    }

    @Override // defpackage.iff
    public final int f() {
        return this.d;
    }

    @Override // defpackage.vef
    public final long g() {
        return this.c;
    }
}
