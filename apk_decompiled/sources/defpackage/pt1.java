package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class pt1 extends ffd {
    public boolean[] a;
    public int b;

    public pt1(boolean[] zArr) {
        zArr.getClass();
        this.a = zArr;
        this.b = zArr.length;
        b(10);
    }

    @Override // defpackage.ffd
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.ffd
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // defpackage.ffd
    public final int d() {
        return this.b;
    }

    public final void e(boolean z) {
        b(d() + 1);
        boolean[] zArr = this.a;
        int i = this.b;
        this.b = i + 1;
        zArr[i] = z;
    }
}
