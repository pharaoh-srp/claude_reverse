package androidx.datastore.preferences.protobuf;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.efe;
import defpackage.i22;
import defpackage.sz6;
import defpackage.udi;
import defpackage.w89;
import defpackage.xgi;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final Logger f = Logger.getLogger(e.class.getName());
    public static final boolean g = xgi.e;
    public efe a;
    public final byte[] b;
    public final int c;
    public int d;
    public final udi e;

    public e(udi udiVar, int i) {
        if (i < 0) {
            sz6.p("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.b = new byte[iMax];
        this.c = iMax;
        this.e = udiVar;
    }

    public static int f(int i, i22 i22Var) {
        int iH = h(i);
        int size = i22Var.size();
        return i(size) + size + iH;
    }

    public static int g(String str) {
        int length;
        try {
            length = o.a(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(w89.a).length;
        }
        return i(length) + length;
    }

    public static int h(int i) {
        return i(i << 3);
    }

    public static int i(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int j(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A(int i, int i2) {
        C((i << 3) | i2);
    }

    public final void B(int i, int i2) {
        l(20);
        c(i, 0);
        d(i2);
    }

    public final void C(int i) {
        l(5);
        d(i);
    }

    public final void D(int i, long j) {
        l(20);
        c(i, 0);
        e(j);
    }

    public final void E(long j) {
        l(10);
        e(j);
    }

    public final void a(int i) {
        int i2 = this.d;
        byte[] bArr = this.b;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.d = i2 + 4;
    }

    public final void b(long j) {
        int i = this.d;
        byte[] bArr = this.b;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.d = i + 8;
    }

    public final void c(int i, int i2) {
        d((i << 3) | i2);
    }

    public final void d(int i) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.d;
                if (i2 == 0) {
                    this.d = i3 + 1;
                    xgi.j(bArr, i3, (byte) i);
                    return;
                } else {
                    this.d = i3 + 1;
                    xgi.j(bArr, i3, (byte) (i | FreeTypeConstants.FT_LOAD_PEDANTIC));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.d;
                if (i4 == 0) {
                    this.d = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.d = i5 + 1;
                    bArr[i5] = (byte) (i | FreeTypeConstants.FT_LOAD_PEDANTIC);
                    i >>>= 7;
                }
            }
        }
    }

    public final void e(long j) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.d;
                if (j2 == 0) {
                    this.d = i + 1;
                    xgi.j(bArr, i, (byte) j);
                    return;
                } else {
                    this.d = i + 1;
                    xgi.j(bArr, i, (byte) (((int) j) | FreeTypeConstants.FT_LOAD_PEDANTIC));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.d;
                if (j3 == 0) {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) (((int) j) | FreeTypeConstants.FT_LOAD_PEDANTIC);
                    j >>>= 7;
                }
            }
        }
    }

    public final void k() {
        this.e.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void l(int i) {
        if (this.c - this.d < i) {
            k();
        }
    }

    public final void m(byte b) {
        if (this.d == this.c) {
            k();
        }
        int i = this.d;
        this.b[i] = b;
        this.d = i + 1;
    }

    public final void n(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.d;
        int i4 = this.c;
        int i5 = i4 - i3;
        byte[] bArr2 = this.b;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.d = i4;
        k();
        if (i7 > i4) {
            this.e.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.d = i7;
        }
    }

    public final void o(int i, boolean z) {
        l(11);
        c(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.d;
        this.b[i2] = b;
        this.d = i2 + 1;
    }

    public final void p(int i, i22 i22Var) {
        A(i, 2);
        q(i22Var);
    }

    public final void q(i22 i22Var) throws IOException {
        C(i22Var.size());
        x(i22Var.F, i22Var.h(), i22Var.size());
    }

    public final void r(int i, int i2) {
        l(14);
        c(i, 5);
        a(i2);
    }

    public final void s(int i) {
        l(4);
        a(i);
    }

    public final void t(int i, long j) {
        l(18);
        c(i, 1);
        b(j);
    }

    public final void u(long j) {
        l(8);
        b(j);
    }

    public final void v(int i, int i2) {
        l(20);
        c(i, 0);
        if (i2 >= 0) {
            d(i2);
        } else {
            e(i2);
        }
    }

    public final void w(int i) {
        if (i >= 0) {
            C(i);
        } else {
            E(i);
        }
    }

    public final void x(byte[] bArr, int i, int i2) throws IOException {
        n(bArr, i, i2);
    }

    public final void y(int i, String str) throws IOException {
        A(i, 2);
        z(str);
    }

    public final void z(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int i = i(length);
            int i2 = i + length;
            int i3 = this.c;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iS = o.a.s(str, bArr, 0, length);
                C(iS);
                n(bArr, 0, iS);
                return;
            }
            if (i2 > i3 - this.d) {
                k();
            }
            int i4 = i(str.length());
            int i5 = this.d;
            byte[] bArr2 = this.b;
            try {
                try {
                    if (i4 == i) {
                        int i6 = i5 + i4;
                        this.d = i6;
                        int iS2 = o.a.s(str, bArr2, i6, i3 - i6);
                        this.d = i5;
                        d((iS2 - i5) - i4);
                        this.d = iS2;
                    } else {
                        int iA = o.a(str);
                        d(iA);
                        this.d = o.a.s(str, bArr2, this.d, iA);
                    }
                } catch (Utf8$UnpairedSurrogateException e) {
                    this.d = i5;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new IOException(e2) { // from class: androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                };
            }
        } catch (Utf8$UnpairedSurrogateException e3) {
            f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(w89.a);
            try {
                C(bytes.length);
                x(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new IOException(e4) { // from class: androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                };
            }
        }
    }
}
