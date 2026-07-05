package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class yx1 implements xx1 {
    @Override // defpackage.xx1
    public final float a(float f, float f2, float f3) {
        float fAbs = Math.abs((f2 + f) - f);
        boolean z = fAbs <= f3;
        float f4 = (0.3f * f3) - (MTTypesetterKt.kLineSkipLimitMultiplier * fAbs);
        float f5 = f3 - f4;
        if (z && f5 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }
}
