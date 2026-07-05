package com.google.protobuf;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a3;
import defpackage.grc;
import defpackage.s34;
import defpackage.sz6;
import defpackage.u89;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends s34 {
    public final a3 G;
    public final byte[] H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N = Integer.MAX_VALUE;

    public b(a3 a3Var) {
        Charset charset = u89.a;
        this.G = a3Var;
        this.H = new byte[FreeTypeConstants.FT_LOAD_MONOCHROME];
        this.I = 0;
        this.K = 0;
        this.M = 0;
    }

    public final void A(int i) {
        if (D(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.M) - this.K) {
            throw InvalidProtocolBufferException.e();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean B(int i) throws InvalidProtocolBufferException {
        int iY;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.I - this.K;
            byte[] bArr = this.H;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.K;
                    this.K = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.c();
            }
            while (i3 < 10) {
                if (this.K == this.I) {
                    A(1);
                }
                int i6 = this.K;
                this.K = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.c();
            return true;
        }
        if (i2 == 1) {
            C(8);
            return true;
        }
        if (i2 == 2) {
            C(t());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            C(4);
            return true;
        }
        do {
            iY = y();
            if (iY == 0) {
                break;
            }
        } while (B(iY));
        f(((i >>> 3) << 3) | 4);
        return true;
    }

    public final void C(int i) throws InvalidProtocolBufferException {
        int i2 = this.I;
        int i3 = this.K;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.K = i3 + i;
            return;
        }
        a3 a3Var = this.G;
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i5 = this.M;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.N;
        if (i7 > i8) {
            C((i8 - i5) - i3);
            throw InvalidProtocolBufferException.e();
        }
        this.M = i6;
        this.I = 0;
        this.K = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = a3Var.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(a3.class + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
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
                this.M += i4;
                z();
                throw th;
            }
        }
        this.M += i4;
        z();
        if (i4 >= i) {
            return;
        }
        int i9 = this.I;
        int i10 = i9 - this.K;
        this.K = i9;
        A(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.I;
            if (i11 <= i12) {
                this.K = i11;
                return;
            } else {
                i10 += i12;
                this.K = i12;
                A(1);
            }
        }
    }

    public final boolean D(int i) throws IOException {
        a3 a3Var = this.G;
        int i2 = this.K;
        int i3 = i2 + i;
        int i4 = this.I;
        if (i3 <= i4) {
            sz6.j(grc.u("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.M;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.N) {
            byte[] bArr = this.H;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.M += i2;
                this.I -= i2;
                this.K = 0;
            }
            int i6 = this.I;
            try {
                int i7 = a3Var.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.M) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    sz6.f(i7, a3Var.getClass());
                    return false;
                }
                if (i7 > 0) {
                    this.I += i7;
                    z();
                    if (this.I >= i) {
                        return true;
                    }
                    return D(i);
                }
            } catch (InvalidProtocolBufferException e) {
                e.E = true;
                throw e;
            }
        }
        return false;
    }

    public final void f(int i) {
        if (this.L != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int g() {
        return this.M + this.K;
    }

    public final boolean h() {
        return this.K == this.I && !D(1);
    }

    public final void i(int i) {
        this.N = i;
        z();
    }

    public final int k(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i2 = this.M + this.K + i;
        int i3 = this.N;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.e();
        }
        this.N = i2;
        z();
        return i3;
    }

    public final boolean l() {
        return u() != 0;
    }

    public final double m() {
        return Double.longBitsToDouble(s());
    }

    public final float n() {
        return Float.intBitsToFloat(r());
    }

    public final byte[] o(int i) {
        byte[] bArrP = p(i);
        if (bArrP != null) {
            return bArrP;
        }
        int i2 = this.K;
        int i3 = this.I;
        int length = i3 - i2;
        this.M += i3;
        this.K = 0;
        this.I = 0;
        ArrayList<byte[]> arrayListQ = q(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.H, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListQ) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] p(int i) {
        if (i == 0) {
            return u89.b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i2 = this.M;
        int i3 = this.K;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.N;
        if (i4 > i5) {
            C((i5 - i2) - i3);
            throw InvalidProtocolBufferException.e();
        }
        int i6 = this.I - i3;
        int i7 = i - i6;
        a3 a3Var = this.G;
        if (i7 >= 4096) {
            try {
                if (i7 > a3Var.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.E = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.H, this.K, bArr, 0, i6);
        this.M += this.I;
        this.K = 0;
        this.I = 0;
        while (i6 < i) {
            try {
                int i8 = a3Var.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.e();
                }
                this.M += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.E = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList q(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, FreeTypeConstants.FT_LOAD_MONOCHROME);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.G.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.e();
                }
                this.M += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int r() {
        int i = this.K;
        if (this.I - i < 4) {
            A(4);
            i = this.K;
        }
        this.K = i + 4;
        byte[] bArr = this.H;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long s() {
        int i = this.K;
        if (this.I - i < 8) {
            A(8);
            i = this.K;
        }
        this.K = i + 8;
        byte[] bArr = this.H;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int t() {
        int i;
        int i2 = this.K;
        int i3 = this.I;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.H;
            byte b = bArr[i2];
            if (b >= 0) {
                this.K = i4;
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
                this.K = i5;
                return i;
            }
        }
        return (int) v();
    }

    public final long u() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.K;
        int i2 = this.I;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.H;
            byte b = bArr[i];
            if (b >= 0) {
                this.K = i3;
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
                this.K = i4;
                return j;
            }
        }
        return v();
    }

    public final long v() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.K == this.I) {
                A(1);
            }
            int i2 = this.K;
            this.K = i2 + 1;
            byte b = this.H[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final int w() {
        int iT = t();
        return (-(iT & 1)) ^ (iT >>> 1);
    }

    public final long x() {
        long jU = u();
        return (-(jU & 1)) ^ (jU >>> 1);
    }

    public final int y() {
        if (h()) {
            this.L = 0;
            return 0;
        }
        int iT = t();
        this.L = iT;
        if ((iT >>> 3) != 0) {
            return iT;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public final void z() {
        int i = this.I + this.J;
        this.I = i;
        int i2 = this.M + i;
        int i3 = this.N;
        if (i2 <= i3) {
            this.J = 0;
            return;
        }
        int i4 = i2 - i3;
        this.J = i4;
        this.I = i - i4;
    }
}
