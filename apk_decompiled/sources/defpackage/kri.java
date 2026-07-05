package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public final class kri {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a;
    public int b;
    public int c;

    public kri(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.b = 0;
        this.c = length;
    }

    public static long a(int i, boolean z, byte[] bArr) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static void b(int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        StringBuilder sbU = vb7.u("Field ", i, ": expected ");
        sbU.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 5 ? "unknown" : "fixed32" : "length-delimited" : "fixed64" : "varint");
        sbU.append(" (wire type ");
        sbU.append(i2);
        sbU.append(") but got ");
        sbU.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 5 ? "unknown" : "fixed32" : "length-delimited" : "fixed64" : "varint");
        sbU.append(" (wire type ");
        sbU.append(i3);
        sbU.append(")");
        throw new IOException(sbU.toString());
    }

    public boolean c() {
        return i() != 0;
    }

    public byte[] d() {
        int i = (int) i();
        if (i < 0) {
            xh6.c(grc.p(i, "Negative length: "));
            return null;
        }
        int i2 = this.c;
        int i3 = this.b;
        if (i2 - i3 < i) {
            throw new EOFException("Not enough bytes for length-delimited field");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.a, i3, bArr, 0, i);
        this.b += i;
        return bArr;
    }

    public kri e() {
        return new kri(d());
    }

    public String f() {
        return new String(d(), StandardCharsets.UTF_8);
    }

    public int g() {
        if (this.b < this.c) {
            return (int) i();
        }
        return 0;
    }

    public long h(xd7 xd7Var, boolean z, boolean z2, int i) {
        int i2;
        int i3 = this.b;
        byte[] bArr = this.a;
        if (i3 == 0) {
            if (!xd7Var.a(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & 255;
            int i5 = 0;
            while (true) {
                if (i5 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((d[i5] & ((long) i4)) != 0) {
                    i2 = i5 + 1;
                    break;
                }
                i5++;
            }
            this.c = i2;
            if (i2 == -1) {
                sz6.j("No valid varint length mask found");
                return 0L;
            }
            this.b = 1;
        }
        int i6 = this.c;
        if (i6 > i) {
            this.b = 0;
            return -2L;
        }
        if (i6 != 1) {
            xd7Var.readFully(bArr, 1, i6 - 1);
        }
        this.b = 0;
        return a(this.c, z2, bArr);
    }

    public long i() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.b;
            if (i2 >= this.c) {
                throw new EOFException("Truncated varint");
            }
            this.b = i2 + 1;
            byte b = this.a[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        xh6.c("Malformed varint");
        return 0L;
    }

    public void j(int i) {
        int i2 = this.c;
        if (i == 0) {
            i();
            return;
        }
        if (i == 1) {
            int i3 = this.b;
            if (i2 - i3 < 8) {
                throw new EOFException("Not enough bytes to skip fixed64");
            }
            this.b = i3 + 8;
            return;
        }
        if (i == 2) {
            int i4 = (int) i();
            int i5 = this.b;
            if (i2 - i5 < i4) {
                throw new EOFException("Not enough bytes to skip length-delimited");
            }
            this.b = i5 + i4;
            return;
        }
        if (i != 5) {
            xh6.c(grc.p(i, "Unknown wire type: "));
            return;
        }
        int i6 = this.b;
        if (i2 - i6 < 4) {
            throw new EOFException("Not enough bytes to skip fixed32");
        }
        this.b = i6 + 4;
    }

    public kri() {
        this.a = new byte[8];
    }
}
