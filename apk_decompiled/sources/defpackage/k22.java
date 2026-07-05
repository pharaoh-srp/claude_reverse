package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k22 implements Iterable, Serializable {
    public static final g22 F = new g22(t89.b);
    public static final c0l G;
    public int E;

    static {
        G = yy.a() ? new c0l(26) : new c0l(25);
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

    public static g22 e(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange;
        b(i, i + i2, bArr.length);
        switch (G.E) {
            case BuildConfig.VERSION_CODE /* 25 */:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new g22(bArrCopyOfRange);
    }

    public abstract byte a(int i);

    public abstract void g(byte[] bArr, int i);

    public final byte[] h() {
        int size = size();
        if (size == 0) {
            return t89.b;
        }
        byte[] bArr = new byte[size];
        g(bArr, size);
        return bArr;
    }

    public final int hashCode() {
        int i = this.E;
        if (i != 0) {
            return i;
        }
        int size = size();
        g22 g22Var = (g22) this;
        int iK = g22Var.k();
        int i2 = size;
        for (int i3 = iK; i3 < iK + size; i3++) {
            i2 = (i2 * 31) + g22Var.H[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.E = i2;
        return i2;
    }

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = jpk.g(this);
        } else {
            g22 g22Var = (g22) this;
            int iB = b(0, 47, g22Var.size());
            strConcat = jpk.g(iB == 0 ? F : new z12(g22Var.H, g22Var.k(), iB)).concat("...");
        }
        return ij0.m(ij0.p("<ByteString@", hexString, size, " size=", " contents=\""), strConcat, "\">");
    }
}
