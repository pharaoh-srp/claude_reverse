package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class bjj extends h1e implements Serializable {
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;

    @Override // defpackage.h1e
    public final int a(int i) {
        return wjk.u(f(), i);
    }

    @Override // defpackage.h1e
    public final int f() {
        int i = this.G;
        int i2 = i ^ (i >>> 2);
        this.G = this.H;
        this.H = this.I;
        this.I = this.J;
        int i3 = this.K;
        this.J = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.K = i4;
        int i5 = this.L + 362437;
        this.L = i5;
        return i4 + i5;
    }
}
