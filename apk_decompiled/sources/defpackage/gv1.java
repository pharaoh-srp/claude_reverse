package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gv1 {
    public static final long a = yb5.e(0.5f, MTTypesetterKt.kLineSkipLimitMultiplier);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.iqb r21, final defpackage.v4g r22, final defpackage.zy7 r23, final float r24, final boolean r25, final boolean r26, final defpackage.pz7 r27, final defpackage.pz7 r28, final defpackage.e0g r29, final long r30, final long r32, final float r34, final defpackage.ta4 r35, defpackage.ld4 r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv1.a(iqb, v4g, zy7, float, boolean, boolean, pz7, pz7, e0g, long, long, float, ta4, ld4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final float r27, final defpackage.iqb r28, final defpackage.v4g r29, final defpackage.zy7 r30, final float r31, final boolean r32, final defpackage.e0g r33, final long r34, final long r36, final float r38, final defpackage.pz7 r39, final defpackage.pz7 r40, final defpackage.ta4 r41, defpackage.ld4 r42, final int r43, final int r44) {
        /*
            Method dump skipped, instruction units count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv1.b(float, iqb, v4g, zy7, float, boolean, e0g, long, long, float, pz7, pz7, ta4, ld4, int, int):void");
    }

    public static final float c(xre xreVar, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xreVar.V >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 1.0f;
        }
        return 1.0f - (d4c.W(MTTypesetterKt.kLineSkipLimitMultiplier, Math.min(xreVar.W.getDensity() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float d(xre xreVar, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xreVar.V & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 1.0f;
        }
        return 1.0f - (d4c.W(MTTypesetterKt.kLineSkipLimitMultiplier, Math.min(xreVar.W.getDensity() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }
}
