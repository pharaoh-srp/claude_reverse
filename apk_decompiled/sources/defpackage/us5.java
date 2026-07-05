package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class us5 implements xcc {
    public final wcc E;
    public final long F;
    public final long G;
    public final iqg H;
    public int I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;

    public us5(iqg iqgVar, long j, long j2, long j3, long j4, boolean z) {
        fd9.E(j >= 0 && j2 > j);
        this.H = iqgVar;
        this.F = j;
        this.G = j2;
        if (j3 == j2 - j || z) {
            this.J = j4;
            this.I = 4;
        } else {
            this.I = 0;
        }
        this.E = new wcc();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    @Override // defpackage.xcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(defpackage.xd7 r28) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us5.d(xd7):long");
    }

    @Override // defpackage.xcc
    public final vef k() {
        if (this.J != 0) {
            return new ts5(this);
        }
        return null;
    }

    @Override // defpackage.xcc
    public final void l(long j) {
        this.L = tpi.h(j, 0L, this.J - 1);
        this.I = 2;
        this.M = this.F;
        this.N = this.G;
        this.O = 0L;
        this.P = this.J;
    }
}
