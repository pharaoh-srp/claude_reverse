package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class f22 implements Iterable, Serializable {
    public static final f22 G = new f22(s89.b);
    public static final pyk H;
    public int E = 0;
    public final byte[] F;

    static {
        H = xy.a() ? new pyk(26) : new pyk(25);
    }

    public f22(byte[] bArr) {
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

    public static f22 e(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange;
        b(i, i + i2, bArr.length);
        switch (H.E) {
            case BuildConfig.VERSION_CODE /* 25 */:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new f22(bArrCopyOfRange);
    }

    public byte a(int i) {
        return this.F[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof f22) && size() == ((f22) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof f22)) {
                return obj.equals(this);
            }
            f22 f22Var = (f22) obj;
            int i = this.E;
            int i2 = f22Var.E;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > f22Var.size()) {
                    poc.r(size, size());
                    return false;
                }
                if (size > f22Var.size()) {
                    poc.j(f22Var.size(), vb7.u("Ran off end of other: 0, ", size, ", "));
                    return false;
                }
                byte[] bArr = f22Var.F;
                int iG = g() + size;
                int iG2 = g();
                int iG3 = f22Var.g();
                while (iG2 < iG) {
                    if (this.F[iG2] == bArr[iG3]) {
                        iG2++;
                        iG3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int g() {
        return 0;
    }

    public byte h(int i) {
        return this.F[i];
    }

    public final int hashCode() {
        int i = this.E;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iG = g();
        int i2 = size;
        for (int i3 = iG; i3 < iG + size; i3++) {
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

    public int size() {
        return this.F.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = gpk.e(this);
        } else {
            int iB = b(0, 47, size());
            strConcat = gpk.e(iB == 0 ? G : new y12(this.F, g(), iB)).concat("...");
        }
        return ij0.m(ij0.p("<ByteString@", hexString, size, " size=", " contents=\""), strConcat, "\">");
    }
}
