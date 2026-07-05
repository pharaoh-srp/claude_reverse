package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vq5 {
    public final List a;
    public final float[] b;
    public final int c;

    public vq5(List list, float[] fArr) {
        this.a = list;
        this.b = fArr;
        if (list.size() != fArr.length) {
            e39.a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + mp0.X0(fArr));
        }
        this.c = fArr.length;
    }

    public final Object a(float f) {
        float[] fArr = this.b;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs <= f2) {
                i2 = i3;
                f2 = fAbs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    public final Object b(float f, boolean z) {
        float[] fArr = this.b;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i2 = i3;
                f2 = f4;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    public final boolean c(Object obj) {
        return this.a.indexOf(obj) != -1;
    }

    public final float d() {
        float[] fArr = this.b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMax = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMax = Math.max(fMax, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fMax;
    }

    public final float e() {
        float[] fArr = this.b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMin = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMin = Math.min(fMin, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fMin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq5)) {
            return false;
        }
        vq5 vq5Var = (vq5) obj;
        return x44.r(this.a, vq5Var.a) && Arrays.equals(this.b, vq5Var.b) && this.c == vq5Var.c;
    }

    public final float f(Object obj) {
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.b;
        if (iIndexOf < fArr.length) {
            return fArr[iIndexOf];
        }
        return Float.NaN;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DraggableAnchors(anchors={"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r6.c
            if (r1 >= r2) goto L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.List r4 = r6.a
            java.lang.Object r4 = defpackage.w44.O0(r1, r4)
            r3.append(r4)
            r4 = 61
            r3.append(r4)
            if (r1 < 0) goto L29
            float[] r4 = r6.b
            int r5 = r4.length
            if (r1 >= r5) goto L29
            r4 = r4[r1]
            goto L2b
        L29:
            r4 = 2143289344(0x7fc00000, float:NaN)
        L2b:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L3e
            java.lang.String r2 = ", "
            r0.append(r2)
        L3e:
            int r1 = r1 + 1
            goto L8
        L41:
            java.lang.String r6 = "})"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq5.toString():java.lang.String");
    }
}
