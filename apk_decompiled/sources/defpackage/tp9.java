package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tp9 {
    public static jgg b;
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final epk c = epk.v("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final epk d = epk.v("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = vkb.b(pointF.x, -1.0f, 1.0f);
        pointF.y = vkb.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = vkb.b(pointF2.x, -1.0f, 1.0f);
        float fB = vkb.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        Matrix matrix = zpi.a;
        int i = f != MTTypesetterKt.kLineSkipLimitMultiplier ? (int) (527.0f * f) : 17;
        if (f2 != MTTypesetterKt.kLineSkipLimitMultiplier) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != MTTypesetterKt.kLineSkipLimitMultiplier) {
            i = (int) (i * 31 * f3);
        }
        if (fB != MTTypesetterKt.kLineSkipLimitMultiplier) {
            i = (int) (i * 31 * fB);
        }
        synchronized (tp9.class) {
            if (b == null) {
                b = new jgg(0);
            }
            jgg jggVar = b;
            jggVar.getClass();
            weakReference = (WeakReference) jwj.f(jggVar, i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, MTTypesetterKt.kLineSkipLimitMultiplier), pointF2.y) : new LinearInterpolator();
        }
        try {
            WeakReference weakReference2 = new WeakReference(pathInterpolator);
            synchronized (tp9.class) {
                b.c(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.rp9 b(com.airbnb.lottie.parser.moshi.a r25, defpackage.bna r26, float r27, defpackage.fri r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp9.b(com.airbnb.lottie.parser.moshi.a, bna, float, fri, boolean, boolean):rp9");
    }
}
