package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class qd {
    public volatile rd a;
    public float b;

    public qd(rd rdVar) {
        rdVar.getClass();
        this.a = rdVar;
        this.b = 1.0f;
    }

    public final void a(short[] sArr, int i) {
        sArr.getClass();
        rd rdVar = this.a;
        if (rdVar.a <= 1.0f) {
            this.b = 1.0f;
            return;
        }
        double d = 0.0d;
        for (int i2 = 0; i2 < i; i2++) {
            double d2 = sArr[i2];
            d += d2 * d2;
        }
        double dSqrt = Math.sqrt(d / ((double) i));
        if (dSqrt > rdVar.c) {
            float fD0 = wd6.d0((float) (((double) rdVar.b) / dSqrt), 1.0f, rdVar.a);
            float fD02 = wd6.d0(fD0 > this.b ? rdVar.d : rdVar.e, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
            float f = this.b;
            this.b = sq6.k(fD0, f, fD02, f);
        }
        float f2 = this.b;
        float f3 = rdVar.a;
        if (f2 > f3) {
            f2 = f3;
        }
        this.b = f2;
        if (f2 > 1.0f) {
            for (int i3 = 0; i3 < i; i3++) {
                sArr[i3] = (short) wd6.e0((int) (sArr[i3] * this.b), -32768, 32767);
            }
        }
    }
}
