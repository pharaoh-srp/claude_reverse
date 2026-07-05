package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mik extends wik {
    public final int H;
    public final int I;

    public mik(byte[] bArr, int i, int i2) {
        super(bArr);
        wik.l(i, i + i2, bArr.length);
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.wik
    public final byte a(int i) {
        int i2 = this.I;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.F[this.H + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(grc.p(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(grc.o(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.wik
    public final byte b(int i) {
        return this.F[this.H + i];
    }

    @Override // defpackage.wik
    public final int e() {
        return this.H;
    }

    @Override // defpackage.wik
    public final int g() {
        return this.I;
    }

    @Override // defpackage.wik
    public final void h(byte[] bArr, int i) {
        System.arraycopy(this.F, this.H, bArr, 0, i);
    }
}
