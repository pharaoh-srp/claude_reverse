package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public interface xx1 {
    public static final wx1 a = wx1.a;

    default float a(float f, float f2, float f3) {
        a.getClass();
        float f4 = f2 + f;
        if ((f >= MTTypesetterKt.kLineSkipLimitMultiplier && f4 <= f3) || (f < MTTypesetterKt.kLineSkipLimitMultiplier && f4 > f3)) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
