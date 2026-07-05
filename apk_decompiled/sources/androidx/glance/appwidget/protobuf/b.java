package androidx.glance.appwidget.protobuf;

import defpackage.r34;
import defpackage.r89;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends r34 {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = Integer.MAX_VALUE;

    public b(byte[] bArr, int i, int i2, boolean z) {
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }

    @Override // defpackage.r34
    public final String A() throws InvalidProtocolBufferException {
        int iH = H();
        if (iH > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iH <= i - i2) {
                String str = new String(this.c, i2, iH, r89.a);
                this.f += iH;
                return str;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH < 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // defpackage.r34
    public final String B() throws InvalidProtocolBufferException {
        int iH = H();
        if (iH > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iH <= i - i2) {
                String strD = o.a.d(this.c, i2, iH);
                this.f += iH;
                return strD;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH <= 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // defpackage.r34
    public final int C() throws InvalidProtocolBufferException {
        if (g()) {
            this.h = 0;
            return 0;
        }
        int iH = H();
        this.h = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.r34
    public final int D() {
        return H();
    }

    @Override // defpackage.r34
    public final long E() {
        return I();
    }

    public final int F() throws InvalidProtocolBufferException {
        int i = this.f;
        if (this.d - i < 4) {
            throw InvalidProtocolBufferException.e();
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long G() throws InvalidProtocolBufferException {
        int i = this.f;
        if (this.d - i < 8) {
            throw InvalidProtocolBufferException.e();
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int H() {
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
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
                this.f = i5;
                return i;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f;
        int i2 = this.d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f = i3;
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
                this.f = i4;
                return j;
            }
        }
        return J();
    }

    public final long J() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw InvalidProtocolBufferException.e();
            }
            this.f = i2 + 1;
            byte b = this.c[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void K() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = i - this.g;
        int i3 = this.i;
        if (i2 <= i3) {
            this.e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.e = i4;
        this.d = i - i4;
    }

    @Override // defpackage.r34
    public final void b(int i) throws InvalidProtocolBufferException {
        if (this.h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.r34
    public final int f() {
        return this.f - this.g;
    }

    @Override // defpackage.r34
    public final boolean g() {
        return this.f == this.d;
    }

    @Override // defpackage.r34
    public final void j(int i) {
        this.i = i;
        K();
    }

    @Override // defpackage.r34
    public final int l(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int iF = f() + i;
        if (iF < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i2 = this.i;
        if (iF > i2) {
            throw InvalidProtocolBufferException.e();
        }
        this.i = iF;
        K();
        return i2;
    }

    @Override // defpackage.r34
    public final boolean m() {
        return I() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // defpackage.r34
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.e22 n() throws androidx.glance.appwidget.protobuf.InvalidProtocolBufferException {
        /*
            r4 = this;
            int r0 = r4.H()
            byte[] r1 = r4.c
            if (r0 <= 0) goto L19
            int r2 = r4.d
            int r3 = r4.f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            e22 r1 = defpackage.e22.e(r1, r3, r0)
            int r2 = r4.f
            int r2 = r2 + r0
            r4.f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            e22 r4 = defpackage.e22.G
            return r4
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.d
            int r3 = r4.f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f = r0
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r4 = defpackage.r89.b
        L35:
            e22 r0 = defpackage.e22.G
            e22 r0 = new e22
            r0.<init>(r4)
            return r0
        L3d:
            androidx.glance.appwidget.protobuf.InvalidProtocolBufferException r4 = androidx.glance.appwidget.protobuf.InvalidProtocolBufferException.d()
            throw r4
        L42:
            androidx.glance.appwidget.protobuf.InvalidProtocolBufferException r4 = androidx.glance.appwidget.protobuf.InvalidProtocolBufferException.e()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.protobuf.b.n():e22");
    }

    @Override // defpackage.r34
    public final double p() {
        return Double.longBitsToDouble(G());
    }

    @Override // defpackage.r34
    public final int q() {
        return H();
    }

    @Override // defpackage.r34
    public final int r() {
        return F();
    }

    @Override // defpackage.r34
    public final long s() {
        return G();
    }

    @Override // defpackage.r34
    public final float t() {
        return Float.intBitsToFloat(F());
    }

    @Override // defpackage.r34
    public final int u() {
        return H();
    }

    @Override // defpackage.r34
    public final long v() {
        return I();
    }

    @Override // defpackage.r34
    public final int w() {
        return F();
    }

    @Override // defpackage.r34
    public final long x() {
        return G();
    }

    @Override // defpackage.r34
    public final int y() {
        int iH = H();
        return (-(iH & 1)) ^ (iH >>> 1);
    }

    @Override // defpackage.r34
    public final long z() {
        long jI = I();
        return (-(jI & 1)) ^ (jI >>> 1);
    }
}
