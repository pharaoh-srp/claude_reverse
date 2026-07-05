package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vkb {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static int d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static float e(float f, float f2, float f3) {
        return sq6.k(f2, f, f3, f);
    }
}
