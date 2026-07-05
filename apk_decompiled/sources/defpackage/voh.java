package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class voh {
    public final xub a;
    public uoh b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public voh() {
        xub xubVar = x69.a;
        this.a = new xub();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(uoh uohVar, long j, long j2, float[] fArr, long j3) {
        long j4 = uohVar.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            uohVar.g = j3;
            uohVar.a(uohVar.e, uohVar.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (y69.b(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!y69.b(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
