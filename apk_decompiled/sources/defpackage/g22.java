package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class g22 extends k22 {
    public final byte[] H;

    public g22(byte[] bArr) {
        this.E = 0;
        bArr.getClass();
        this.H = bArr;
    }

    @Override // defpackage.k22
    public byte a(int i) {
        return this.H[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof k22) && size() == ((k22) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof g22)) {
                return obj.equals(this);
            }
            g22 g22Var = (g22) obj;
            int i = this.E;
            int i2 = g22Var.E;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > g22Var.size()) {
                    poc.r(size, size());
                    return false;
                }
                if (size > g22Var.size()) {
                    poc.j(g22Var.size(), vb7.u("Ran off end of other: 0, ", size, ", "));
                    return false;
                }
                byte[] bArr = g22Var.H;
                int iK = k() + size;
                int iK2 = k();
                int iK3 = g22Var.k();
                while (iK2 < iK) {
                    if (this.H[iK2] == bArr[iK3]) {
                        iK2++;
                        iK3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.k22
    public void g(byte[] bArr, int i) {
        System.arraycopy(this.H, 0, bArr, 0, i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new m31(this);
    }

    public int k() {
        return 0;
    }

    public byte l(int i) {
        return this.H[i];
    }

    @Override // defpackage.k22
    public int size() {
        return this.H.length;
    }
}
