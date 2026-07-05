package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class ad5 implements vi6 {
    public final float E;
    public final float F;
    public final float G;
    public final float H;
    public final float I;
    public final float J;

    public ad5(float f, float f2, float f3, float f4) {
        int iO;
        this.E = f;
        this.F = f2;
        this.G = f3;
        this.H = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            bbd.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.');
        }
        float[] fArr = new float[5];
        float f5 = (f2 - MTTypesetterKt.kLineSkipLimitMultiplier) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            iO = d2 == d3 ? 0 : kxk.O((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int iO2 = kxk.O((float) ((-(d6 + d7)) / d5), fArr, 0);
            int iO3 = kxk.O((float) ((d6 - d7) / d5), fArr, iO2) + iO2;
            if (iO3 > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iO = iO3 - 1;
                }
                iO = iO3;
            } else {
                iO = iO3;
            }
        }
        float f10 = (f6 - f5) * 2.0f;
        int iO4 = kxk.O((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, iO) + iO;
        float fMin = Math.min(MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
        float fMax = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
        for (int i = 0; i < iO4; i++) {
            float f11 = fArr[i];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - MTTypesetterKt.kLineSkipLimitMultiplier) * f11) + (((f4 - (f2 * 2.0f)) + MTTypesetterKt.kLineSkipLimitMultiplier) * 3.0f)) * f11) + f5) * f11) + MTTypesetterKt.kLineSkipLimitMultiplier;
            fMin = Math.min(fMin, f12);
            fMax = Math.max(fMax, f12);
        }
        long jA = so7.a(fMin, fMax);
        this.I = Float.intBitsToFloat((int) (jA >> 32));
        this.J = Float.intBitsToFloat((int) (jA & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r3
      0x0092: PHI (r3v27 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v31 float), (r3v36 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[PHI: r12
      0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.vi6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r27) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad5.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ad5)) {
            return false;
        }
        ad5 ad5Var = (ad5) obj;
        return this.E == ad5Var.E && this.F == ad5Var.F && this.G == ad5Var.G && this.H == ad5Var.H;
    }

    public final int hashCode() {
        return Float.hashCode(this.H) + vb7.b(this.G, vb7.b(this.F, Float.hashCode(this.E) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.E);
        sb.append(", b=");
        sb.append(this.F);
        sb.append(", c=");
        sb.append(this.G);
        sb.append(", d=");
        return ebh.o(sb, this.H, ')');
    }
}
