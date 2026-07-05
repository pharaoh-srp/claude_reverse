package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fl4 implements iff, vef {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final long m;

    public fl4(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        this.h = z2;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
        this.i = j2;
        this.j = i;
        this.k = i2;
        this.l = z;
        this.m = j == -1 ? -1L : j;
    }

    @Override // defpackage.iff
    public final long a() {
        return this.m;
    }

    @Override // defpackage.vef
    public final boolean b() {
        return this.d != -1 || this.g;
    }

    @Override // defpackage.iff
    public final long c(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // defpackage.vef
    public final boolean d() {
        return this.h;
    }

    @Override // defpackage.vef
    public final uef e(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            xef xefVar = new xef(0L, j3);
            return new uef(xefVar, xefVar);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i);
        xef xefVar2 = new xef(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new uef(xefVar2, new xef((Math.max(0L, j5 - j3) * 8000000) / ((long) i), j5));
            }
        }
        return new uef(xefVar2, xefVar2);
    }

    @Override // defpackage.iff
    public final int f() {
        return this.j;
    }

    @Override // defpackage.vef
    public final long g() {
        return this.f;
    }
}
