package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ca6 extends ffd {
    public double[] a;
    public int b;

    public ca6(double[] dArr) {
        dArr.getClass();
        this.a = dArr;
        this.b = dArr.length;
        b(10);
    }

    @Override // defpackage.ffd
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.ffd
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // defpackage.ffd
    public final int d() {
        return this.b;
    }

    public final void e(double d) {
        b(d() + 1);
        double[] dArr = this.a;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }
}
