package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class po8 implements yzb {
    public final /* synthetic */ qo8 E;

    public po8(qo8 qo8Var) {
        this.E = qo8Var;
    }

    @Override // defpackage.yzb
    public final long X(int i, long j) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 0L;
        }
        qo8 qo8Var = this.E;
        int iH = qo8Var.a.a.h();
        int iA = qo8Var.a();
        boolean z = Float.intBitsToFloat(i2) > MTTypesetterKt.kLineSkipLimitMultiplier;
        boolean z2 = Float.intBitsToFloat(i2) < MTTypesetterKt.kLineSkipLimitMultiplier;
        boolean z3 = iH < 0;
        boolean z4 = iH > iA;
        float f = iH;
        float fIntBitsToFloat = f - Float.intBitsToFloat(i2);
        if (z4 && z) {
            return 0L;
        }
        if (z3 && z2) {
            return 0L;
        }
        if (iH <= 0 && z) {
            return fcc.a(j, MTTypesetterKt.kLineSkipLimitMultiplier, 1);
        }
        if (iH >= iA && z2) {
            return fcc.a(j, MTTypesetterKt.kLineSkipLimitMultiplier, 1);
        }
        if (fIntBitsToFloat < MTTypesetterKt.kLineSkipLimitMultiplier) {
            jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat(i2) - f);
            iFloatToRawIntBits = Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier);
        } else {
            float f2 = iA;
            if (fIntBitsToFloat <= f2) {
                return 0L;
            }
            jFloatToRawIntBits = Float.floatToRawIntBits((Float.intBitsToFloat(i2) + f2) - f);
            iFloatToRawIntBits = Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        return (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
    }
}
