package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z9k extends w9k {
    public final byte[] G;

    public z9k(byte[] bArr) {
        bArr.getClass();
        this.G = bArr;
    }

    @Override // defpackage.w9k
    public final byte a(int i) {
        return this.G[i];
    }

    @Override // defpackage.w9k
    public final byte b(int i) {
        return this.G[i];
    }

    @Override // defpackage.w9k
    public final int e(int i, int i2) {
        return kfk.a(i, 0, i2, this.G);
    }

    @Override // defpackage.w9k
    public final int g() {
        return this.G.length;
    }

    @Override // defpackage.w9k
    public final w9k h(int i, int i2) {
        byte[] bArr = this.G;
        int iM = w9k.m(0, i2, bArr.length);
        return iM == 0 ? w9k.F : new m9k(bArr, 0, iM);
    }

    @Override // defpackage.w9k
    public final void k(xak xakVar) {
        byte[] bArr = this.G;
        xakVar.b(bArr, 0, bArr.length);
    }

    @Override // defpackage.w9k
    public final boolean l(w9k w9kVar) {
        boolean z = w9kVar instanceof z9k;
        byte[] bArr = this.G;
        if (z) {
            return Arrays.equals(bArr, ((z9k) w9kVar).G);
        }
        boolean z2 = w9kVar instanceof m9k;
        if (!z2) {
            return w9kVar.l(this);
        }
        int iG = w9kVar.g();
        int length = bArr.length;
        if (length > iG) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > w9kVar.g()) {
            sz6.p(grc.o(length, w9kVar.g(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        if (z) {
            return w9k.p(0, 0, length, bArr, ((z9k) w9kVar).G);
        }
        if (!z2) {
            return w9kVar.h(0, length).equals(h(0, length));
        }
        m9k m9kVar = (m9k) w9kVar;
        return w9k.p(0, m9kVar.H, length, bArr, m9kVar.G);
    }
}
