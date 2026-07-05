package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class bqi {
    public static final long a = so7.a(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    public static final float b = 3.1415927f;

    public static final long a(float f, float f2) {
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (fSqrt > MTTypesetterKt.kLineSkipLimitMultiplier) {
            return so7.a(f / fSqrt, f2 / fSqrt);
        }
        sz6.p("Required distance greater than zero");
        return 0L;
    }

    public static final float b(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static long c(float f, float f2) {
        double d = f2;
        return yfd.O(yfd.i0(f, so7.a((float) Math.cos(d), (float) Math.sin(d))), a);
    }
}
