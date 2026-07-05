package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m9k extends w9k {
    public final byte[] G;
    public final int H;
    public final int I;

    public m9k(byte[] bArr, int i, int i2) {
        w9k.m(i, i + i2, bArr.length);
        this.G = bArr;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.w9k
    public final byte a(int i) {
        int i2 = this.I;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.G[this.H + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(grc.p(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(grc.o(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.w9k
    public final byte b(int i) {
        return this.G[this.H + i];
    }

    @Override // defpackage.w9k
    public final int e(int i, int i2) {
        return kfk.a(i, this.H, i2, this.G);
    }

    @Override // defpackage.w9k
    public final int g() {
        return this.I;
    }

    @Override // defpackage.w9k
    public final w9k h(int i, int i2) {
        int iM = w9k.m(i, i2, this.I);
        if (iM == 0) {
            return w9k.F;
        }
        return new m9k(this.G, this.H + i, iM);
    }

    @Override // defpackage.w9k
    public final void k(xak xakVar) {
        xakVar.b(this.G, this.H, this.I);
    }

    @Override // defpackage.w9k
    public final boolean l(w9k w9kVar) {
        boolean z = w9kVar instanceof z9k;
        if (!z && !(w9kVar instanceof m9k)) {
            return w9kVar.l(this);
        }
        int iG = w9kVar.g();
        int i = this.I;
        if (i > iG) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > w9kVar.g()) {
            sz6.p(grc.o(i, w9kVar.g(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = this.G;
        int i2 = this.H;
        if (z) {
            return w9k.p(i2, 0, i, bArr, ((z9k) w9kVar).G);
        }
        if (!(w9kVar instanceof m9k)) {
            return w9kVar.h(0, i).equals(h(i2, i + i2));
        }
        m9k m9kVar = (m9k) w9kVar;
        return w9k.p(i2, m9kVar.H, i, bArr, m9kVar.G);
    }
}
