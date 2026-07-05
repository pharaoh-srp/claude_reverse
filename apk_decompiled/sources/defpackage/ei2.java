package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ei2 extends ffd {
    public char[] a;
    public int b;

    public ei2(char[] cArr) {
        cArr.getClass();
        this.a = cArr;
        this.b = cArr.length;
        b(10);
    }

    @Override // defpackage.ffd
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.ffd
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // defpackage.ffd
    public final int d() {
        return this.b;
    }

    public final void e(char c) {
        b(d() + 1);
        char[] cArr = this.a;
        int i = this.b;
        this.b = i + 1;
        cArr[i] = c;
    }
}
