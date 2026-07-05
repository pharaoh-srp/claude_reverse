package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z12 extends g22 {
    public final int I;
    public final int J;

    public z12(byte[] bArr, int i, int i2) {
        super(bArr);
        k22.b(i, i + i2, bArr.length);
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.g22, defpackage.k22
    public final byte a(int i) {
        int i2 = this.J;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.H[this.I + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(grc.p(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(grc.o(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.g22, defpackage.k22
    public final void g(byte[] bArr, int i) {
        System.arraycopy(this.H, this.I, bArr, 0, i);
    }

    @Override // defpackage.g22
    public final int k() {
        return this.I;
    }

    @Override // defpackage.g22
    public final byte l(int i) {
        return this.H[this.I + i];
    }

    @Override // defpackage.g22, defpackage.k22
    public final int size() {
        return this.J;
    }
}
