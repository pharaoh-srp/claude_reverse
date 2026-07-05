package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class i22 implements Iterable, Serializable {
    public static final i22 G = new i22(w89.b);
    public static final d22 H;
    public int E = 0;
    public final byte[] F;

    static {
        H = az.a() ? new zp3(14) : new tqh(26);
    }

    public i22(byte[] bArr) {
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

    public static i22 e(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new i22(H.b(bArr, i, i2));
    }

    public byte a(int i) {
        return this.F[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof i22) && size() == ((i22) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i22)) {
                return obj.equals(this);
            }
            i22 i22Var = (i22) obj;
            int i = this.E;
            int i2 = i22Var.E;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > i22Var.size()) {
                    poc.r(size, size());
                    return false;
                }
                if (size > i22Var.size()) {
                    poc.j(i22Var.size(), vb7.u("Ran off end of other: 0, ", size, ", "));
                    return false;
                }
                byte[] bArr = i22Var.F;
                int iH = h() + size;
                int iH2 = h();
                int iH3 = i22Var.h();
                while (iH2 < iH) {
                    if (this.F[iH2] == bArr[iH3]) {
                        iH2++;
                        iH3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void g(byte[] bArr, int i) {
        System.arraycopy(this.F, 0, bArr, 0, i);
    }

    public int h() {
        return 0;
    }

    public final int hashCode() {
        int i = this.E;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iH = h();
        int i2 = size;
        for (int i3 = iH; i3 < iH + size; i3++) {
            i2 = (i2 * 31) + this.F[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.E = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new m31(this);
    }

    public byte k(int i) {
        return this.F[i];
    }

    public int size() {
        return this.F.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = npk.c(this);
        } else {
            int iB = b(0, 47, size());
            strConcat = npk.c(iB == 0 ? G : new b22(this.F, h(), iB)).concat("...");
        }
        return ij0.m(ij0.p("<ByteString@", hexString, size, " size=", " contents=\""), strConcat, "\">");
    }
}
