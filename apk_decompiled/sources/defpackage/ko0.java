package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class ko0 {
    public static final fo0 a = new fo0(1);
    public static final fo0 b = new fo0(0);
    public static final eo0 c = new eo0(1);
    public static final eo0 d = new eo0(0);
    public static final dd8 e = new dd8(13);
    public static final vz8 f;
    public static final ql8 g;

    static {
        int i = 13;
        f = new vz8(i);
        g = new ql8(i);
    }

    public static void a(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f2 = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i7;
        }
    }

    public static void b(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float fMax = (i - i3) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? fMax : MTTypesetterKt.kLineSkipLimitMultiplier;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i5 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f2);
            f2 += i7 + fMax;
            i2++;
            i6++;
        }
    }

    public static void c(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f3);
            f3 += i7 + length;
            i2++;
            i6++;
        }
    }

    public static ho0 d(float f2) {
        return new ho0(f2, true, new sz6(1));
    }
}
