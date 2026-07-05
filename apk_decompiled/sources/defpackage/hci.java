package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class hci extends ffd {
    public byte[] a;
    public int b;

    public hci(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
        b(10);
    }

    @Override // defpackage.ffd
    public final Object a() {
        return new gci(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.ffd
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.ffd
    public final int d() {
        return this.b;
    }

    public final void e(byte b) {
        b(d() + 1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
    }
}
