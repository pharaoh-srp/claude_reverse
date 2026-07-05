package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ssc {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final qz8 f = qz8.o(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean g = new AtomicBoolean();
    public byte[] a;
    public int b;
    public int c;

    public ssc(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public static int b(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return nwk.e((byte) 0, nv1.c(((i & 7) << 2) | ((i2 & 48) >> 4)), nv1.c(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), nv1.c(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    public static int d(Charset charset) {
        fd9.F(f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean e(byte b) {
        return (b & 192) == 128;
    }

    public final int A() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.b = i + 4;
        return i4;
    }

    public final long B() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    public final int C() {
        f(3);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public final int D() {
        int iM = m();
        if (iM >= 0) {
            return iM;
        }
        sz6.j(grc.p(iM, "Top bit not zero: "));
        return 0;
    }

    public final int E() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.b == this.c) {
                sz6.j("Attempting to read a byte over the limit.");
                return 0;
            }
            long jZ = z();
            j |= (127 & jZ) << (i * 7);
            if ((jZ & 128) == 0) {
                break;
            }
        }
        return nwk.c(j);
    }

    public final long F() {
        long jT = t();
        if (jT >= 0) {
            return jT;
        }
        sz6.j(vb7.m(jT, "Top bit not zero: "));
        return 0L;
    }

    public final int G() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final long H() {
        int i;
        f(1);
        long j = this.a[this.b];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            int i3 = 1 << i2;
            if ((((long) i3) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= (long) (i3 - 1);
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        i = 0;
        if (i == 0) {
            throw new NumberFormatException(vb7.m(j, "Invalid UTF-8 sequence first byte: "));
        }
        f(i);
        for (int i4 = 1; i4 < i; i4++) {
            byte b = this.a[this.b + i4];
            if ((b & 192) != 128) {
                throw new NumberFormatException(vb7.m(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.b += i;
        return j;
    }

    public final Charset I() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void J(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        K(bArr, i);
    }

    public final void K(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void L(int i) {
        fd9.E(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public final void M(int i) {
        fd9.E(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void N(int i) {
        M(this.b + i);
    }

    public final int a() {
        return Math.max(this.c - this.b, 0);
    }

    public final void c(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final void f(int i) {
        if (!g.get() || a() >= i) {
            return;
        }
        mr9.e(a(), vb7.u("bytesNeeded= ", i, ", bytesLeft="));
    }

    public final char g(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        f(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.a;
        int i2 = this.b;
        if (byteOrder == byteOrder2) {
            int i3 = i2 + i;
            b = bArr[i3];
            b2 = bArr[i3 + 1];
        } else {
            int i4 = i2 + i;
            b = bArr[i4 + 1];
            b2 = bArr[i4];
        }
        return (char) ((b2 & 255) | (b << 8));
    }

    public final int h(Charset charset) {
        int codePoint;
        fd9.F(f.contains(charset), "Unsupported charset: %s", charset);
        if (a() < d(charset)) {
            rl7.i(this.b, this.c);
            return 0;
        }
        int i = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.a[this.b];
            if ((b & 128) == 0) {
                codePoint = b & 255;
                return (codePoint << 8) | i;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.a[this.b];
            int i2 = (b2 & 128) == 0 ? 1 : ((b2 & 224) == 192 && a() >= 2 && e(this.a[this.b + 1])) ? 2 : ((this.a[this.b] & 240) == 224 && a() >= 3 && e(this.a[this.b + 1]) && e(this.a[this.b + 2])) ? 3 : ((this.a[this.b] & 248) == 240 && a() >= 4 && e(this.a[this.b + 1]) && e(this.a[this.b + 2]) && e(this.a[this.b + 3])) ? 4 : 0;
            if (i2 == 1) {
                codePoint = this.a[this.b] & 255;
            } else if (i2 == 2) {
                byte[] bArr = this.a;
                int i3 = this.b;
                codePoint = b(0, 0, bArr[i3], bArr[i3 + 1]);
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        byte[] bArr2 = this.a;
                        int i4 = this.b;
                        codePoint = b(bArr2[i4], bArr2[i4 + 1], bArr2[i4 + 2], bArr2[i4 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.a;
                int i5 = this.b;
                codePoint = b(0, bArr3[i5] & 15, bArr3[i5 + 1], bArr3[i5 + 2]);
            }
            i = i2;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cG = g(0, byteOrder);
            if (!Character.isHighSurrogate(cG) || a() < 4) {
                codePoint = cG;
                i = 2;
            } else {
                codePoint = Character.toCodePoint(cG, g(2, byteOrder));
                i = 4;
            }
        }
        return (codePoint << 8) | i;
    }

    public final int i() {
        if (a() < 4) {
            rl7.i(this.b, this.c);
            return 0;
        }
        int iM = m();
        this.b -= 4;
        return iM;
    }

    public final int j() {
        f(1);
        return this.a[this.b] & 255;
    }

    public final void k(byte[] bArr, int i, int i2) {
        f(i2);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char l(Charset charset, char[] cArr) {
        int iH;
        if (a() >= d(charset) && (iH = h(charset)) != 0) {
            long j = iH >>> 8;
            fd9.D("out of range: %s", (j >> 32) == 0, j);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                fd9.D("Out of range: %s", ((long) c) == j2, j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.b = nwk.c(iH & 255) + this.b;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int m() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String n(java.nio.charset.Charset r7) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssc.n(java.nio.charset.Charset):java.lang.String");
    }

    public final int o() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final long p() {
        f(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    public final long q() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    public final int r() {
        int iO = o();
        if (iO >= 0) {
            return iO;
        }
        sz6.j(grc.p(iO, "Top bit not zero: "));
        return 0;
    }

    public final int s() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long t() {
        f(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    public final String u() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = tpi.a;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str2;
    }

    public final String v(int i) {
        f(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        String str = tpi.a;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.b += i;
        return str2;
    }

    public final short w() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final String x(int i, Charset charset) {
        f(i);
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int y() {
        return z() | (z() << 21) | (z() << 14) | (z() << 7);
    }

    public final int z() {
        f(1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public ssc() {
        this.a = tpi.b;
    }

    public ssc(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public ssc(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}
