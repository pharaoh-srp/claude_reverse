package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class suk implements Serializable, Iterable {
    public static final suk G = new suk(sxk.b);
    public static final v4i H = new v4i(15);
    public int E = 0;
    public final byte[] F;

    public suk(byte[] bArr) {
        bArr.getClass();
        this.F = bArr;
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            xh6.j(grc.u("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            xh6.j(grc.o(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        xh6.j(grc.o(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static suk e(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        H.getClass();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new suk(bArr2);
    }

    public byte a(int i) {
        return this.F[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof suk) && h() == ((suk) obj).h()) {
            if (h() == 0) {
                return true;
            }
            if (!(obj instanceof suk)) {
                return obj.equals(this);
            }
            suk sukVar = (suk) obj;
            int i = this.E;
            int i2 = sukVar.E;
            if (i == 0 || i2 == 0 || i == i2) {
                int iH = h();
                if (iH > sukVar.h()) {
                    poc.r(iH, h());
                    return false;
                }
                if (iH > sukVar.h()) {
                    sz6.p(grc.o(iH, sukVar.h(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = sukVar.F;
                int iK = k() + iH;
                int iK2 = k();
                int iK3 = sukVar.k();
                while (iK2 < iK) {
                    if (this.F[iK2] == bArr[iK3]) {
                        iK2++;
                        iK3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public byte g(int i) {
        return this.F[i];
    }

    public int h() {
        return this.F.length;
    }

    public final int hashCode() {
        int i = this.E;
        if (i != 0) {
            return i;
        }
        int iH = h();
        int iK = k();
        int i2 = iH;
        for (int i3 = iK; i3 < iK + iH; i3++) {
            i2 = (i2 * 31) + this.F[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.E = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new m31(this);
    }

    public int k() {
        return 0;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iH = h();
        if (h() <= 50) {
            strConcat = gsk.j(this);
        } else {
            int iB = b(0, 47, h());
            strConcat = gsk.j(iB == 0 ? G : new xtk(this.F, k(), iB)).concat("...");
        }
        return ij0.m(ij0.p("<ByteString@", hexString, iH, " size=", " contents=\""), strConcat, "\">");
    }
}
