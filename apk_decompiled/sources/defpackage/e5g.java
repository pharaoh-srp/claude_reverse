package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class e5g extends ffd {
    public short[] a;
    public int b;

    public e5g(short[] sArr) {
        sArr.getClass();
        this.a = sArr;
        this.b = sArr.length;
        b(10);
    }

    @Override // defpackage.ffd
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.ffd
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.ffd
    public final int d() {
        return this.b;
    }

    public final void e(short s) {
        b(d() + 1);
        short[] sArr = this.a;
        int i = this.b;
        this.b = i + 1;
        sArr[i] = s;
    }
}
