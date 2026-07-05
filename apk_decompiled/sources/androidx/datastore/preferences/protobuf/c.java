package androidx.datastore.preferences.protobuf;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.grc;
import defpackage.i22;
import defpackage.sz6;
import defpackage.u34;
import defpackage.w89;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c extends u34 {
    public final FileInputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public c(FileInputStream fileInputStream) {
        Charset charset = w89.a;
        this.d = fileInputStream;
        this.e = new byte[FreeTypeConstants.FT_LOAD_MONOCHROME];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    public final byte[] A(int i) throws IOException {
        if (i == 0) {
            return w89.b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.k;
        if (i4 > i5) {
            J((i5 - i2) - i3);
            throw InvalidProtocolBufferException.e();
        }
        int i6 = this.f - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.d;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.E = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.h, bArr, 0, i6);
        this.j += this.f;
        this.h = 0;
        this.f = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.e();
                }
                this.j += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.E = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, FreeTypeConstants.FT_LOAD_MONOCHROME);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.d.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.e();
                }
                this.j += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() throws InvalidProtocolBufferException {
        int i = this.h;
        if (this.f - i < 4) {
            I(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long D() throws InvalidProtocolBufferException {
        int i = this.h;
        if (this.f - i < 8) {
            I(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int E() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
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
                this.h = i5;
                return i;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
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
                this.h = i4;
                return j;
            }
        }
        return G();
    }

    public final long G() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                I(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            byte b = this.e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void H() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j + i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    public final void I(int i) throws InvalidProtocolBufferException {
        if (K(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.j) - this.h) {
            throw InvalidProtocolBufferException.e();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void J(int i) throws InvalidProtocolBufferException {
        int i2 = this.f;
        int i3 = this.h;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.d;
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i5 = this.j;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.k;
        if (i7 > i8) {
            J((i8 - i5) - i3);
            throw InvalidProtocolBufferException.e();
        }
        this.j = i6;
        this.f = 0;
        this.h = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
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
                this.j += i4;
                H();
                throw th;
            }
        }
        this.j += i4;
        H();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f;
        int i10 = i9 - this.h;
        this.h = i9;
        I(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f;
            if (i11 <= i12) {
                this.h = i11;
                return;
            } else {
                i10 += i12;
                this.h = i12;
                I(1);
            }
        }
    }

    public final boolean K(int i) throws IOException {
        FileInputStream fileInputStream = this.d;
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 <= i4) {
            sz6.j(grc.u("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.j;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.k) {
            byte[] bArr = this.e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.j += i2;
                this.f -= i2;
                this.h = 0;
            }
            int i6 = this.f;
            try {
                int i7 = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.j) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    sz6.f(i7, fileInputStream.getClass());
                    return false;
                }
                if (i7 > 0) {
                    this.f += i7;
                    H();
                    if (this.f >= i || K(i)) {
                        return true;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                e.E = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.u34
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.i != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.u34
    public final int b() {
        return this.j + this.h;
    }

    @Override // defpackage.u34
    public final boolean c() {
        return this.h == this.f && !K(1);
    }

    @Override // defpackage.u34
    public final void d(int i) {
        this.k = i;
        H();
    }

    @Override // defpackage.u34
    public final int e(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i2 = this.j + this.h + i;
        if (i2 < 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.k;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.e();
        }
        this.k = i2;
        H();
        return i3;
    }

    @Override // defpackage.u34
    public final boolean f() {
        return F() != 0;
    }

    @Override // defpackage.u34
    public final i22 g() throws IOException {
        int iE = E();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (iE <= i3 && iE > 0) {
            i22 i22VarE = i22.e(bArr, i2, iE);
            this.h += iE;
            return i22VarE;
        }
        if (iE == 0) {
            return i22.G;
        }
        if (iE < 0) {
            throw InvalidProtocolBufferException.d();
        }
        byte[] bArrA = A(iE);
        if (bArrA != null) {
            return i22.e(bArrA, 0, bArrA.length);
        }
        int i4 = this.h;
        int i5 = this.f;
        int length = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListB = B(iE - length);
        byte[] bArr2 = new byte[iE];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListB) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        i22 i22Var = i22.G;
        return new i22(bArr2);
    }

    @Override // defpackage.u34
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // defpackage.u34
    public final int i() {
        return E();
    }

    @Override // defpackage.u34
    public final int j() {
        return C();
    }

    @Override // defpackage.u34
    public final long k() {
        return D();
    }

    @Override // defpackage.u34
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // defpackage.u34
    public final int m() {
        return E();
    }

    @Override // defpackage.u34
    public final long n() {
        return F();
    }

    @Override // defpackage.u34
    public final int o() {
        return C();
    }

    @Override // defpackage.u34
    public final long p() {
        return D();
    }

    @Override // defpackage.u34
    public final int q() {
        int iE = E();
        return (-(iE & 1)) ^ (iE >>> 1);
    }

    @Override // defpackage.u34
    public final long r() {
        long jF = F();
        return (-(jF & 1)) ^ (jF >>> 1);
    }

    @Override // defpackage.u34
    public final String s() throws InvalidProtocolBufferException {
        int iE = E();
        byte[] bArr = this.e;
        if (iE > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iE <= i - i2) {
                String str = new String(bArr, i2, iE, w89.a);
                this.h += iE;
                return str;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE < 0) {
            throw InvalidProtocolBufferException.d();
        }
        if (iE > this.f) {
            return new String(z(iE), w89.a);
        }
        I(iE);
        String str2 = new String(bArr, this.h, iE, w89.a);
        this.h += iE;
        return str2;
    }

    @Override // defpackage.u34
    public final String t() throws IOException {
        int iE = E();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArrZ = this.e;
        if (iE <= i3 && iE > 0) {
            this.h = i + iE;
        } else {
            if (iE == 0) {
                return "";
            }
            if (iE < 0) {
                throw InvalidProtocolBufferException.d();
            }
            i = 0;
            if (iE <= i2) {
                I(iE);
                this.h = iE;
            } else {
                bArrZ = z(iE);
            }
        }
        return o.a.q(bArrZ, i, iE);
    }

    @Override // defpackage.u34
    public final int u() throws InvalidProtocolBufferException {
        if (c()) {
            this.i = 0;
            return 0;
        }
        int iE = E();
        this.i = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.u34
    public final int v() {
        return E();
    }

    @Override // defpackage.u34
    public final long w() {
        return F();
    }

    @Override // defpackage.u34
    public final boolean x(int i) throws InvalidProtocolBufferException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                J(8);
                return true;
            }
            if (i2 == 2) {
                J(E());
                return true;
            }
            if (i2 == 3) {
                y();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    a(0);
                }
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            J(4);
            return true;
        }
        int i4 = this.f - this.h;
        byte[] bArr = this.e;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.c();
        }
        while (i3 < 10) {
            if (this.h == this.f) {
                I(1);
            }
            int i6 = this.h;
            this.h = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw InvalidProtocolBufferException.c();
        return true;
    }

    public final byte[] z(int i) throws IOException {
        byte[] bArrA = A(i);
        if (bArrA != null) {
            return bArrA;
        }
        int i2 = this.h;
        int i3 = this.f;
        int length = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListB = B(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListB) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }
}
