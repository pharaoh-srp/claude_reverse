package com.google.crypto.tink.shaded.protobuf;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.g22;
import defpackage.grc;
import defpackage.k22;
import defpackage.r34;
import defpackage.sz6;
import defpackage.t89;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends r34 {
    public final ByteArrayInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public c(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = t89.a;
        this.c = byteArrayInputStream;
        this.d = new byte[FreeTypeConstants.FT_LOAD_MONOCHROME];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    @Override // defpackage.r34
    public final String A() throws InvalidProtocolBufferException {
        int iK = K();
        byte[] bArr = this.d;
        if (iK > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iK <= i - i2) {
                String str = new String(bArr, i2, iK, t89.a);
                this.g += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK > this.e) {
            return new String(F(iK), t89.a);
        }
        O(iK);
        String str2 = new String(bArr, this.g, iK, t89.a);
        this.g += iK;
        return str2;
    }

    @Override // defpackage.r34
    public final String B() throws IOException {
        int iK = K();
        int i = this.g;
        int i2 = this.e;
        int i3 = i2 - i;
        byte[] bArrF = this.d;
        if (iK <= i3 && iK > 0) {
            this.g = i + iK;
        } else {
            if (iK == 0) {
                return "";
            }
            i = 0;
            if (iK <= i2) {
                O(iK);
                this.g = iK;
            } else {
                bArrF = F(iK);
            }
        }
        return o.a.l(bArrF, i, iK);
    }

    @Override // defpackage.r34
    public final int C() throws InvalidProtocolBufferException {
        if (g()) {
            this.h = 0;
            return 0;
        }
        int iK = K();
        this.h = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw InvalidProtocolBufferException.a();
    }

    @Override // defpackage.r34
    public final int D() {
        return K();
    }

    @Override // defpackage.r34
    public final long E() {
        return L();
    }

    public final byte[] F(int i) throws IOException {
        byte[] bArrG = G(i);
        if (bArrG != null) {
            return bArrG;
        }
        int i2 = this.g;
        int i3 = this.e;
        int length = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListH = H(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListH) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] G(int i) throws IOException {
        if (i == 0) {
            return t89.b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.j;
        if (i4 > i5) {
            P((i5 - i2) - i3);
            throw InvalidProtocolBufferException.g();
        }
        int i6 = this.e - i3;
        int i7 = i - i6;
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (i7 >= 4096) {
            try {
                if (i7 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.E = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.g, bArr, 0, i6);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i6 < i) {
            try {
                int i8 = byteArrayInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.g();
                }
                this.i += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.E = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList H(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, FreeTypeConstants.FT_LOAD_MONOCHROME);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.g();
                }
                this.i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int I() throws InvalidProtocolBufferException {
        int i = this.g;
        if (this.e - i < 4) {
            O(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long J() throws InvalidProtocolBufferException {
        int i = this.g;
        if (this.e - i < 8) {
            O(8);
            i = this.g;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int K() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.g = i5;
                return i;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.g = i4;
                return j;
            }
        }
        return M();
    }

    public final long M() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                O(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void N() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void O(int i) throws InvalidProtocolBufferException {
        if (Q(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.g) {
            throw InvalidProtocolBufferException.g();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void P(int i) throws InvalidProtocolBufferException {
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (i < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i5 = this.i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.j;
        if (i7 > i8) {
            P((i8 - i5) - i3);
            throw InvalidProtocolBufferException.g();
        }
        this.i = i6;
        this.e = 0;
        this.g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.E = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.i += i4;
                N();
                throw th;
            }
        }
        this.i += i4;
        N();
        if (i4 >= i) {
            return;
        }
        int i9 = this.e;
        int i10 = i9 - this.g;
        this.g = i9;
        O(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.e;
            if (i11 <= i12) {
                this.g = i11;
                return;
            } else {
                i10 += i12;
                this.g = i12;
                O(1);
            }
        }
    }

    public final boolean Q(int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.c;
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 <= i4) {
            sz6.j(grc.u("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.i;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.j) {
            byte[] bArr = this.d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.i += i2;
                this.e -= i2;
                this.g = 0;
            }
            int i6 = this.e;
            try {
                int i7 = byteArrayInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.i) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    sz6.f(i7, byteArrayInputStream.getClass());
                    return false;
                }
                if (i7 > 0) {
                    this.e += i7;
                    N();
                    if (this.e >= i) {
                        return true;
                    }
                    return Q(i);
                }
            } catch (InvalidProtocolBufferException e) {
                e.E = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.r34
    public final void b(int i) throws InvalidProtocolBufferException {
        if (this.h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.r34
    public final int f() {
        return this.i + this.g;
    }

    @Override // defpackage.r34
    public final boolean g() {
        return this.g == this.e && !Q(1);
    }

    @Override // defpackage.r34
    public final void j(int i) {
        this.j = i;
        N();
    }

    @Override // defpackage.r34
    public final int l(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i2 = this.i + this.g + i;
        int i3 = this.j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.g();
        }
        this.j = i2;
        N();
        return i3;
    }

    @Override // defpackage.r34
    public final boolean m() {
        return L() != 0;
    }

    @Override // defpackage.r34
    public final g22 o() throws IOException {
        int iK = K();
        int i = this.e;
        int i2 = this.g;
        int i3 = i - i2;
        byte[] bArr = this.d;
        if (iK <= i3 && iK > 0) {
            g22 g22VarE = k22.e(bArr, i2, iK);
            this.g += iK;
            return g22VarE;
        }
        if (iK == 0) {
            return k22.F;
        }
        byte[] bArrG = G(iK);
        if (bArrG != null) {
            return k22.e(bArrG, 0, bArrG.length);
        }
        int i4 = this.g;
        int i5 = this.e;
        int length = i5 - i4;
        this.i += i5;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListH = H(iK - length);
        byte[] bArr2 = new byte[iK];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListH) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        g22 g22Var = k22.F;
        return new g22(bArr2);
    }

    @Override // defpackage.r34
    public final double p() {
        return Double.longBitsToDouble(J());
    }

    @Override // defpackage.r34
    public final int q() {
        return K();
    }

    @Override // defpackage.r34
    public final int r() {
        return I();
    }

    @Override // defpackage.r34
    public final long s() {
        return J();
    }

    @Override // defpackage.r34
    public final float t() {
        return Float.intBitsToFloat(I());
    }

    @Override // defpackage.r34
    public final int u() {
        return K();
    }

    @Override // defpackage.r34
    public final long v() {
        return L();
    }

    @Override // defpackage.r34
    public final int w() {
        return I();
    }

    @Override // defpackage.r34
    public final long x() {
        return J();
    }

    @Override // defpackage.r34
    public final int y() {
        return r34.d(K());
    }

    @Override // defpackage.r34
    public final long z() {
        return r34.e(L());
    }
}
