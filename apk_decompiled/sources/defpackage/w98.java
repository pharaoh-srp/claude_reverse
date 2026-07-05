package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w98 {
    public final float[] a;
    public final int[] b;

    public w98(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(w98 w98Var) {
        int i = 0;
        while (true) {
            int[] iArr = w98Var.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = w98Var.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final w98 b(float[] fArr) {
        int iF;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iF = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iF = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iF = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iF = fpk.f((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iF;
        }
        return new w98(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w98.class != obj.getClass()) {
            return false;
        }
        w98 w98Var = (w98) obj;
        return Arrays.equals(this.a, w98Var.a) && Arrays.equals(this.b, w98Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
