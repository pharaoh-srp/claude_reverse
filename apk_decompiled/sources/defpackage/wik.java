package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class wik implements Iterable, Serializable {
    public static final wik G = new wik(bkk.a);
    public int E = 0;
    public final byte[] F;

    static {
        int i = xhk.a;
    }

    public wik(byte[] bArr) {
        bArr.getClass();
        this.F = bArr;
    }

    public static int l(int i, int i2, int i3) {
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

    public static wik m(byte[] bArr, int i) {
        l(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new wik(bArr2);
    }

    public byte a(int i) {
        return this.F[i];
    }

    public byte b(int i) {
        return this.F[i];
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof wik) && g() == ((wik) obj).g()) {
            if (g() == 0) {
                return true;
            }
            if (!(obj instanceof wik)) {
                return obj.equals(this);
            }
            wik wikVar = (wik) obj;
            int i = this.E;
            int i2 = wikVar.E;
            if (i == 0 || i2 == 0 || i == i2) {
                int iG = g();
                if (iG > wikVar.g()) {
                    poc.r(iG, g());
                    return false;
                }
                if (iG > wikVar.g()) {
                    sz6.p(grc.o(iG, wikVar.g(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = wikVar.F;
                int iE = e() + iG;
                int iE2 = e();
                int iE3 = wikVar.e();
                while (iE2 < iE) {
                    if (this.F[iE2] == bArr[iE3]) {
                        iE2++;
                        iE3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int g() {
        return this.F.length;
    }

    public void h(byte[] bArr, int i) {
        System.arraycopy(this.F, 0, bArr, 0, i);
    }

    public final int hashCode() {
        int i = this.E;
        if (i != 0) {
            return i;
        }
        int iG = g();
        int iE = e();
        byte[] bArr = bkk.a;
        int i2 = iG;
        for (int i3 = iE; i3 < iE + iG; i3++) {
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

    public final ByteArrayInputStream k() {
        return new ByteArrayInputStream(this.F, e(), g());
    }

    public final byte[] o() {
        int iG = g();
        if (iG == 0) {
            return bkk.a;
        }
        byte[] bArr = new byte[iG];
        h(bArr, iG);
        return bArr;
    }

    public final String toString() {
        wik mikVar;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iG = g();
        if (g() <= 50) {
            strConcat = nrk.i(this);
        } else {
            int iL = l(0, 47, g());
            if (iL == 0) {
                mikVar = G;
            } else {
                mikVar = new mik(this.F, e(), iL);
            }
            strConcat = nrk.i(mikVar).concat("...");
        }
        return ij0.m(ij0.p("<ByteString@", hexString, iG, " size=", " contents=\""), strConcat, "\">");
    }
}
