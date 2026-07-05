package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xtk extends suk {
    public final int I;
    public final int J;

    public xtk(byte[] bArr, int i, int i2) {
        super(bArr);
        suk.b(i, i + i2, bArr.length);
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.suk
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

    @Override // defpackage.suk
    public final byte g(int i) {
        return this.F[this.I + i];
    }

    @Override // defpackage.suk
    public final int h() {
        return this.J;
    }

    @Override // defpackage.suk
    public final int k() {
        return this.I;
    }
}
