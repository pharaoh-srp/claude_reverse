package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y12 extends f22 {
    public final int I;
    public final int J;

    public y12(byte[] bArr, int i, int i2) {
        super(bArr);
        f22.b(i, i + i2, bArr.length);
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.f22
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

    @Override // defpackage.f22
    public final int g() {
        return this.I;
    }

    @Override // defpackage.f22
    public final byte h(int i) {
        return this.F[this.I + i];
    }

    @Override // defpackage.f22
    public final int size() {
        return this.J;
    }
}
