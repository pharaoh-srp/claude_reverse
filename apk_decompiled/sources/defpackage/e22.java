package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class e22 implements Iterable, Serializable {
    public static final e22 G = new e22(r89.b);
    public static final lyk H;
    public int E = 0;
    public final byte[] F;

    static {
        H = wy.a() ? new lyk(26) : new lyk(25);
    }

    public e22(byte[] bArr) {
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

    public static e22 e(byte[] bArr, int i, int i2) {
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
        return new e22(bArrCopyOfRange);
    }

    public byte a(int i) {
        return this.F[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof e22) && size() == ((e22) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof e22)) {
                return obj.equals(this);
            }
            e22 e22Var = (e22) obj;
            int i = this.E;
            int i2 = e22Var.E;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > e22Var.size()) {
                    poc.r(size, size());
                    return false;
                }
                if (size > e22Var.size()) {
                    poc.j(e22Var.size(), vb7.u("Ran off end of other: 0, ", size, ", "));
                    return false;
                }
                byte[] bArr = e22Var.F;
                int iG = g() + size;
                int iG2 = g();
                int iG3 = e22Var.g();
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
            strConcat = fpk.e(this);
        } else {
            int iB = b(0, 47, size());
            strConcat = fpk.e(iB == 0 ? G : new x12(this.F, g(), iB)).concat("...");
        }
        return ij0.m(ij0.p("<ByteString@", hexString, size, " size=", " contents=\""), strConcat, "\">");
    }
}
