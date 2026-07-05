package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ko7 extends ffd {
    public float[] a;
    public int b;

    public ko7(float[] fArr) {
        fArr.getClass();
        this.a = fArr;
        this.b = fArr.length;
        b(10);
    }

    @Override // defpackage.ffd
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.ffd
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // defpackage.ffd
    public final int d() {
        return this.b;
    }

    public final void e(float f) {
        b(d() + 1);
        float[] fArr = this.a;
        int i = this.b;
        this.b = i + 1;
        fArr[i] = f;
    }
}
