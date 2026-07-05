package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b22 extends i22 {
    public final int I;
    public final int J;

    public b22(byte[] bArr, int i, int i2) {
        super(bArr);
        i22.b(i, i + i2, bArr.length);
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.i22
    public final byte a(int i) {
        int i2 = this.J;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.F[this.I + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(grc.p(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(grc.o(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.i22
    public final void g(byte[] bArr, int i) {
        System.arraycopy(this.F, this.I, bArr, 0, i);
    }

    @Override // defpackage.i22
    public final int h() {
        return this.I;
    }

    @Override // defpackage.i22
    public final byte k(int i) {
        return this.F[this.I + i];
    }

    @Override // defpackage.i22
    public final int size() {
        return this.J;
    }
}
