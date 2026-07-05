package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class hmk implements Closeable {
    public final ByteArrayInputStream E;
    public fmk F;
    public final byte[] G = new byte[8];
    public final c6k H;

    public hmk(ByteArrayInputStream byteArrayInputStream) {
        c6k c6kVar = new c6k();
        c6kVar.E = new ArrayDeque(16);
        this.H = c6kVar;
        this.E = byteArrayInputStream;
    }

    public final void H(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 != i) {
            int i3 = this.E.read(bArr, i2, i - i2);
            if (i3 == -1) {
                sz6.n();
                return;
            }
            i2 += i3;
        }
        this.F = null;
    }

    public final byte[] K() throws IOException {
        n();
        long j = j();
        if (j < 0 || j > 2147483647L) {
            pmf.n("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.E.available() < j) {
            sz6.n();
            return null;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        H(bArr, i);
        return bArr;
    }

    public final long c() throws IOException {
        x((byte) -128);
        n();
        long j = j();
        if (j < 0) {
            pmf.n("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (j > 0) {
            ((ArrayDeque) this.H.E).push(Long.valueOf(j));
        }
        return j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E.close();
        this.H.b();
    }

    public final long d() throws IOException {
        boolean z;
        f();
        byte b = this.F.a;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                sz6.j(grc.p((b >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long j = j();
        if (j >= 0) {
            return z ? j : ~j;
        }
        pmf.n("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    public final long e() throws IOException {
        x((byte) -96);
        n();
        long j = j();
        if (j < 0 || j > 4611686018427387903L) {
            pmf.n("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (j > 0) {
            ((ArrayDeque) this.H.E).push(Long.valueOf(j + j));
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fmk f() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmk.f():fmk");
    }

    public final boolean i() throws IOException {
        x((byte) -32);
        if (this.F.b > 24) {
            sz6.j("expected simple value");
            return false;
        }
        int iJ = (int) j();
        if (iJ == 20) {
            return false;
        }
        if (iJ == 21) {
            return true;
        }
        sz6.j("expected FALSE or TRUE");
        return false;
    }

    public final long j() throws IOException {
        fmk fmkVar = this.F;
        byte b = fmkVar.b;
        if (b < 24) {
            long j = b;
            this.F = null;
            return j;
        }
        if (b == 24) {
            int i = this.E.read();
            if (i != -1) {
                this.F = null;
                return ((long) i) & 255;
            }
            sz6.n();
            return 0L;
        }
        byte[] bArr = this.G;
        if (b == 25) {
            H(bArr, 2);
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (b == 26) {
            H(bArr, 4);
            return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
        }
        if (b != 27) {
            xh6.c(grc.o(b, (fmkVar.a >> 5) & 7, "invalid additional information ", " for major type "));
            return 0L;
        }
        H(bArr, 8);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3];
        return (((long) bArr[7]) & 255) | ((j3 & 255) << 48) | ((j2 & 255) << 56) | ((j4 & 255) << 40) | ((j5 & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    public final void n() throws IOException {
        f();
        byte b = this.F.b;
        if (b != 31) {
            return;
        }
        sz6.j(grc.p(b, "expected definite length but found "));
    }

    public final void x(byte b) throws IOException {
        f();
        byte b2 = this.F.a;
        if (b2 == b) {
            return;
        }
        sz6.j(grc.o((b >> 5) & 7, (b2 >> 5) & 7, "expected major type ", " but found "));
    }
}
