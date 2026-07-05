package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jw1 implements iw1 {
    public int E;
    public int F;
    public int G;
    public int H;
    public Object I;

    public long a() {
        int i = this.G;
        if (i == 0) {
            pmf.d();
            return 0L;
        }
        long[] jArr = (long[]) this.I;
        int i2 = this.E;
        long j = jArr[i2];
        this.E = this.H & (i2 + 1);
        this.G = i - 1;
        return j;
    }

    @Override // defpackage.iw1
    public int f() {
        return -1;
    }

    @Override // defpackage.iw1
    public int l() {
        return this.E;
    }

    @Override // defpackage.iw1
    public int m() {
        ssc sscVar = (ssc) this.I;
        int i = this.F;
        if (i == 8) {
            return sscVar.z();
        }
        if (i == 16) {
            return sscVar.G();
        }
        int i2 = this.G;
        this.G = i2 + 1;
        if (i2 % 2 != 0) {
            return this.H & 15;
        }
        int iZ = sscVar.z();
        this.H = iZ;
        return (iZ & 240) >> 4;
    }
}
