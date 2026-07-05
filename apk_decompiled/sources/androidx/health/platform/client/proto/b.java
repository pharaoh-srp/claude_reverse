package androidx.health.platform.client.proto;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.f22;
import defpackage.poj;
import defpackage.s89;
import defpackage.ugi;
import io.sentry.e0;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final Logger e = Logger.getLogger(b.class.getName());
    public static final boolean f = ugi.e;
    public poj a;
    public final byte[] b;
    public final int c;
    public int d;

    public b(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            e0.g("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int a(int i, f22 f22Var) {
        int iE = e(i);
        int size = f22Var.size();
        return f(size) + size + iE;
    }

    public static int b(int i) {
        return f((i >> 31) ^ (i << 1));
    }

    public static int c(long j) {
        return g((j >> 63) ^ (j << 1));
    }

    public static int d(String str) {
        int length;
        try {
            length = d0.b(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(s89.a).length;
        }
        return f(length) + length;
    }

    public static int e(int i) {
        return f(i << 3);
    }

    public static int f(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int g(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void h(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void i(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)), e2);
        }
    }

    public final void j(f22 f22Var) throws CodedOutputStream$OutOfSpaceException {
        t(f22Var.size());
        i(f22Var.F, f22Var.g(), f22Var.size());
    }

    public final void k(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        r(i, 5);
        l(i2);
    }

    public final void l(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void m(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        r(i, 1);
        n(j);
    }

    public final void n(long j) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void o(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        r(i, 0);
        p(i2);
    }

    public final void p(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            t(i);
        } else {
            v(i);
        }
    }

    public final void q(String str) throws CodedOutputStream$OutOfSpaceException {
        int i = this.d;
        try {
            int iF = f(str.length() * 3);
            int iF2 = f(str.length());
            int i2 = this.c;
            byte[] bArr = this.b;
            if (iF2 != iF) {
                t(d0.b(str));
                int i3 = this.d;
                this.d = d0.a.g(str, bArr, i3, i2 - i3);
                return;
            }
            int i4 = i + iF2;
            this.d = i4;
            int iG = d0.a.g(str, bArr, i4, i2 - i4);
            this.d = i;
            t((iG - i) - iF2);
            this.d = iG;
        } catch (Utf8$UnpairedSurrogateException e2) {
            this.d = i;
            e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(s89.a);
            try {
                t(bytes.length);
                i(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e3) {
                throw new CodedOutputStream$OutOfSpaceException(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new CodedOutputStream$OutOfSpaceException(e4);
        }
    }

    public final void r(int i, int i2) {
        t((i << 3) | i2);
    }

    public final void s(int i, int i2) {
        r(i, 0);
        t(i2);
    }

    public final void t(int i) {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.d;
            byte[] bArr = this.b;
            if (i2 == 0) {
                this.d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.d = i3 + 1;
                    bArr[i3] = (byte) ((i | FreeTypeConstants.FT_LOAD_PEDANTIC) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void u(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        r(i, 0);
        v(j);
    }

    public final void v(long j) throws CodedOutputStream$OutOfSpaceException {
        boolean z = f;
        int i = this.c;
        byte[] bArr = this.b;
        if (!z || i - this.d < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.d;
                if (j2 == 0) {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.d = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) | FreeTypeConstants.FT_LOAD_PEDANTIC) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
                    }
                }
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = this.d;
            if (j3 == 0) {
                this.d = i3 + 1;
                ugi.k(bArr, i3, (byte) j);
                return;
            } else {
                this.d = i3 + 1;
                ugi.k(bArr, i3, (byte) ((((int) j) | FreeTypeConstants.FT_LOAD_PEDANTIC) & 255));
                j >>>= 7;
            }
        }
    }
}
