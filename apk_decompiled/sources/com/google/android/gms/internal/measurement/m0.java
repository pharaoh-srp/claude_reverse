package com.google.android.gms.internal.measurement;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.b0l;
import defpackage.bnh;
import defpackage.gkk;
import defpackage.suk;
import defpackage.sxk;
import defpackage.t0l;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public static final Logger e = Logger.getLogger(m0.class.getName());
    public static final boolean f = t0l.e;
    public bnh a;
    public final byte[] b;
    public final int c;
    public int d;

    public m0(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            io.sentry.e0.g("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int g(int i, l0 l0Var, b0l b0lVar) {
        return l0Var.a(b0lVar) + (t(i << 3) << 1);
    }

    public static int h(String str) {
        int length;
        try {
            length = s0.a(str);
        } catch (zzog unused) {
            length = str.getBytes(sxk.a).length;
        }
        return t(length) + length;
    }

    public static int m(int i, suk sukVar) {
        int iT = t(i << 3);
        int iH = sukVar.h();
        return gkk.e(iH, iH, iT);
    }

    public static int r(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int s(int i) {
        return t(i << 3);
    }

    public static int t(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void a(byte b) throws zzkl$zzb {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void b(int i) throws zzkl$zzb {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) i;
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) (i >> 8);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) (i >> 16);
            this.d = i2 + 4;
            bArr[i5] = (byte) (i >>> 24);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void c(int i, int i2) throws zzkl$zzb {
        o(i, 5);
        b(i2);
    }

    public final void d(int i, long j) throws zzkl$zzb {
        o(i, 1);
        e(j);
    }

    public final void e(long j) throws zzkl$zzb {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) j;
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (j >> 8);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (j >> 16);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (j >> 24);
            int i6 = i + 5;
            this.d = i6;
            bArr[i5] = (byte) (j >> 32);
            int i7 = i + 6;
            this.d = i7;
            bArr[i6] = (byte) (j >> 40);
            int i8 = i + 7;
            this.d = i8;
            bArr[i7] = (byte) (j >> 48);
            this.d = i + 8;
            bArr[i8] = (byte) (j >> 56);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final int f() {
        return this.c - this.d;
    }

    public final void i(int i) throws zzkl$zzb {
        if (i >= 0) {
            n(i);
        } else {
            l(i);
        }
    }

    public final void j(int i, int i2) throws zzkl$zzb {
        o(i, 0);
        i(i2);
    }

    public final void k(int i, long j) throws zzkl$zzb {
        o(i, 0);
        l(j);
    }

    public final void l(long j) throws zzkl$zzb {
        boolean z = f;
        byte[] bArr = this.b;
        if (!z || f() < 10) {
            while (true) {
                long j2 = j & (-128);
                int i = this.d;
                if (j2 == 0) {
                    this.d = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        this.d = i + 1;
                        bArr[i] = (byte) (((int) j) | FreeTypeConstants.FT_LOAD_PEDANTIC);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
                    }
                }
                throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i2 = this.d;
            if (j3 == 0) {
                this.d = i2 + 1;
                t0l.c.c(bArr, t0l.f + ((long) i2), (byte) j);
                return;
            }
            this.d = i2 + 1;
            t0l.c.c(bArr, t0l.f + ((long) i2), (byte) (((int) j) | FreeTypeConstants.FT_LOAD_PEDANTIC));
            j >>>= 7;
        }
    }

    public final void n(int i) throws zzkl$zzb {
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
                    bArr[i3] = (byte) (i | FreeTypeConstants.FT_LOAD_PEDANTIC);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
                }
            }
            throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void o(int i, int i2) throws zzkl$zzb {
        n((i << 3) | i2);
    }

    public final void p(byte[] bArr, int i, int i2) throws zzkl$zzb {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)), e2);
        }
    }

    public final void q(int i, int i2) throws zzkl$zzb {
        o(i, 0);
        n(i2);
    }
}
