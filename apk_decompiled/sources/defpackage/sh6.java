package defpackage;

import androidx.media3.common.ParserException;
import io.sentry.e0;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class sh6 implements bk6 {
    public final ssc a;
    public final String c;
    public final int d;
    public String f;
    public y3i g;
    public int i;
    public int j;
    public long k;
    public jw7 l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public sh6(String str, int i, int i2) {
        this.a = new ssc(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    public final boolean a(ssc sscVar, byte[] bArr, int i) {
        int iMin = Math.min(sscVar.a(), i - this.i);
        sscVar.k(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    public final void b(p pVar) {
        int i = pVar.b;
        String str = pVar.a;
        int i2 = pVar.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        jw7 jw7Var = this.l;
        if (jw7Var != null && i2 == jw7Var.G && i == jw7Var.H && str.equals(jw7Var.o)) {
            return;
        }
        jw7 jw7Var2 = this.l;
        iw7 iw7Var = jw7Var2 == null ? new iw7() : jw7Var2.a();
        iw7Var.a = this.f;
        iw7Var.m = gkb.k(this.e);
        iw7Var.n = gkb.k(str);
        iw7Var.F = i2;
        iw7Var.G = i;
        iw7Var.d = this.c;
        iw7Var.f = this.d;
        jw7 jw7Var3 = new jw7(iw7Var);
        this.l = jw7Var3;
        this.g.g(jw7Var3);
    }

    @Override // defpackage.bk6
    public final void c(ssc sscVar) throws ParserException {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int iG;
        int iG2;
        int iG3;
        int i5;
        long jI;
        int i6;
        long jI2;
        int i7;
        int i8;
        int i9;
        int i10;
        this.g.getClass();
        while (sscVar.a() > 0) {
            int i11 = this.h;
            ssc sscVar2 = this.a;
            switch (i11) {
                case 0:
                    while (true) {
                        if (sscVar.a() > 0) {
                            int i12 = this.j << 8;
                            this.j = i12;
                            int iZ = i12 | sscVar.z();
                            this.j = iZ;
                            int iJ = wwk.j(iZ);
                            this.n = iJ;
                            if (iJ != 0) {
                                byte[] bArr = sscVar2.a;
                                int i13 = this.j;
                                bArr[0] = (byte) ((i13 >> 24) & 255);
                                bArr[1] = (byte) ((i13 >> 16) & 255);
                                bArr[2] = (byte) ((i13 >> 8) & 255);
                                bArr[3] = (byte) (i13 & 255);
                                this.i = 4;
                                this.j = 0;
                                if (iJ == 3 || iJ == 4) {
                                    this.h = 4;
                                } else if (iJ == 1) {
                                    this.h = 1;
                                } else {
                                    this.h = 2;
                                }
                                break;
                            }
                        }
                    }
                    break;
                case 1:
                    if (a(sscVar, sscVar2.a, 18)) {
                        byte[] bArr2 = sscVar2.a;
                        if (this.l == null) {
                            String str = this.f;
                            dg2 dg2VarL = wwk.l(bArr2);
                            dg2VarL.o(60);
                            int i14 = wwk.a[dg2VarL.g(6)];
                            int i15 = wwk.b[dg2VarL.g(4)];
                            int iG4 = dg2VarL.g(5);
                            int i16 = iG4 >= 29 ? -1 : (wwk.c[iG4] * 1000) / 2;
                            dg2VarL.o(10);
                            int i17 = i14 + (dg2VarL.g(2) > 0 ? 1 : 0);
                            iw7 iw7Var = new iw7();
                            iw7Var.a = str;
                            iw7Var.m = gkb.k(this.e);
                            iw7Var.n = gkb.k("audio/vnd.dts");
                            iw7Var.h = i16;
                            iw7Var.F = i17;
                            iw7Var.G = i15;
                            iw7Var.r = null;
                            iw7Var.d = this.c;
                            iw7Var.f = this.d;
                            jw7 jw7Var = new jw7(iw7Var);
                            this.l = jw7Var;
                            this.g.g(jw7Var);
                        }
                        this.m = wwk.h(bArr2);
                        byte b3 = bArr2[0];
                        if (b3 != -2) {
                            if (b3 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            } else if (b3 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b = bArr2[5];
                            } else {
                                i = (bArr2[5] & 7) << 4;
                                b2 = bArr2[6];
                            }
                            i2 = b2 & 60;
                            this.k = nwk.c(tpi.G(this.l.H, (((i2 >> 2) | i) + 1) * 32));
                            sscVar2.M(0);
                            this.g.e(18, sscVar2);
                            this.h = 6;
                        } else {
                            i = (bArr2[5] & 1) << 6;
                            b = bArr2[4];
                        }
                        i2 = b & 252;
                        this.k = nwk.c(tpi.G(this.l.H, (((i2 >> 2) | i) + 1) * 32));
                        sscVar2.M(0);
                        this.g.e(18, sscVar2);
                        this.h = 6;
                        break;
                    }
                    break;
                case 2:
                    if (a(sscVar, sscVar2.a, 7)) {
                        dg2 dg2VarL2 = wwk.l(sscVar2.a);
                        dg2VarL2.o(42);
                        this.o = dg2VarL2.g(dg2VarL2.f() ? 12 : 8) + 1;
                        this.h = 3;
                    }
                    break;
                case 3:
                    int i18 = 8;
                    if (a(sscVar, sscVar2.a, this.o)) {
                        dg2 dg2VarL3 = wwk.l(sscVar2.a);
                        dg2VarL3.o(40);
                        int iG5 = dg2VarL3.g(2);
                        if (dg2VarL3.f()) {
                            i3 = 20;
                            i4 = 12;
                        } else {
                            i3 = 16;
                            i4 = 8;
                        }
                        dg2VarL3.o(i4);
                        int iG6 = dg2VarL3.g(i3) + 1;
                        boolean zF = dg2VarL3.f();
                        if (zF) {
                            iG = dg2VarL3.g(2);
                            iG2 = (dg2VarL3.g(3) + 1) * 512;
                            if (dg2VarL3.f()) {
                                dg2VarL3.o(36);
                            }
                            int iG7 = dg2VarL3.g(3) + 1;
                            int iG8 = dg2VarL3.g(3) + 1;
                            if (iG7 != 1 || iG8 != 1) {
                                throw ParserException.b("Multiple audio presentations or assets not supported");
                            }
                            int i19 = iG5 + 1;
                            int iG9 = dg2VarL3.g(i19);
                            int i20 = 0;
                            while (i20 < i19) {
                                if (((iG9 >> i20) & 1) == 1) {
                                    dg2VarL3.o(i18);
                                }
                                i20++;
                                i18 = 8;
                            }
                            if (dg2VarL3.f()) {
                                dg2VarL3.o(2);
                                int iG10 = (dg2VarL3.g(2) + 1) << 2;
                                int iG11 = dg2VarL3.g(2) + 1;
                                for (int i21 = 0; i21 < iG11; i21++) {
                                    dg2VarL3.o(iG10);
                                }
                            }
                        } else {
                            iG = -1;
                            iG2 = 0;
                        }
                        dg2VarL3.o(i3);
                        dg2VarL3.o(12);
                        if (zF) {
                            if (dg2VarL3.f()) {
                                dg2VarL3.o(4);
                            }
                            if (dg2VarL3.f()) {
                                dg2VarL3.o(24);
                            }
                            if (dg2VarL3.f()) {
                                dg2VarL3.p(dg2VarL3.g(10) + 1);
                            }
                            dg2VarL3.o(5);
                            i5 = wwk.d[dg2VarL3.g(4)];
                            iG3 = dg2VarL3.g(8) + 1;
                        } else {
                            iG3 = -1;
                            i5 = -2147483647;
                        }
                        if (zF) {
                            if (iG == 0) {
                                i6 = 32000;
                            } else if (iG == 1) {
                                i6 = 44100;
                            } else {
                                if (iG != 2) {
                                    throw ParserException.a(null, "Unsupported reference clock code in DTS HD header: " + iG);
                                }
                                i6 = 48000;
                            }
                            String str2 = tpi.a;
                            jI = tpi.I(iG2, 1000000L, i6, RoundingMode.DOWN);
                        } else {
                            jI = -9223372036854775807L;
                        }
                        b(new p("audio/vnd.dts.hd;profile=lbr", iG3, i5, iG6, jI));
                        this.m = iG6;
                        this.k = jI == -9223372036854775807L ? 0L : jI;
                        sscVar2.M(0);
                        this.g.e(this.o, sscVar2);
                        this.h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (a(sscVar, sscVar2.a, 6)) {
                        dg2 dg2VarL4 = wwk.l(sscVar2.a);
                        dg2VarL4.o(32);
                        int iP = wwk.p(dg2VarL4, wwk.i) + 1;
                        this.p = iP;
                        int i22 = this.i;
                        if (i22 > iP) {
                            int i23 = i22 - iP;
                            this.i = i22 - i23;
                            sscVar.M(sscVar.b - i23);
                        }
                        this.h = 5;
                    }
                    break;
                case 5:
                    if (a(sscVar, sscVar2.a, this.p)) {
                        byte[] bArr3 = sscVar2.a;
                        dg2 dg2VarL5 = wwk.l(bArr3);
                        int i24 = dg2VarL5.g(32) == 1078008818 ? 1 : 0;
                        int iP2 = wwk.p(dg2VarL5, wwk.e);
                        int i25 = iP2 + 1;
                        if (i24 == 0) {
                            jI2 = -9223372036854775807L;
                            i7 = -2147483647;
                        } else {
                            if (!dg2VarL5.f()) {
                                throw ParserException.b("Only supports full channel mask-based audio presentation");
                            }
                            int i26 = iP2 - 1;
                            int i27 = ((bArr3[i26] << 8) & 65535) | (bArr3[iP2] & 255);
                            String str3 = tpi.a;
                            int i28 = 65535;
                            for (int i29 = 0; i29 < i26; i29++) {
                                byte b4 = bArr3[i29];
                                int[] iArr = tpi.h;
                                int i30 = (iArr[(((b4 & 255) >> 4) ^ ((i28 >> 12) & 255)) & 255] ^ ((i28 << 4) & 65535)) & 65535;
                                i28 = (iArr[((b4 & 15) ^ ((i30 >> 12) & 255)) & 255] ^ ((i30 << 4) & 65535)) & 65535;
                            }
                            if (i27 != i28) {
                                throw ParserException.a(null, "CRC check failed");
                            }
                            int iG12 = dg2VarL5.g(2);
                            if (iG12 != 0) {
                                if (iG12 == 1) {
                                    i9 = 480;
                                } else {
                                    if (iG12 != 2) {
                                        throw ParserException.a(null, "Unsupported base duration index in DTS UHD header: " + iG12);
                                    }
                                    i9 = 384;
                                }
                                i8 = 3;
                            } else {
                                i8 = 3;
                                i9 = 512;
                            }
                            int iG13 = (dg2VarL5.g(i8) + 1) * i9;
                            int iG14 = dg2VarL5.g(2);
                            if (iG14 == 0) {
                                i10 = 32000;
                            } else if (iG14 == 1) {
                                i10 = 44100;
                            } else {
                                if (iG14 != 2) {
                                    throw ParserException.a(null, "Unsupported clock rate index in DTS UHD header: " + iG14);
                                }
                                i10 = 48000;
                            }
                            if (dg2VarL5.f()) {
                                dg2VarL5.o(36);
                            }
                            int iG15 = i10 * (1 << dg2VarL5.g(2));
                            jI2 = tpi.I(iG13, 1000000L, i10, RoundingMode.DOWN);
                            i7 = iG15;
                        }
                        int iP3 = 0;
                        for (int i31 = 0; i31 < i24; i31++) {
                            iP3 += wwk.p(dg2VarL5, wwk.f);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i24 != 0) {
                            atomicInteger.set(wwk.p(dg2VarL5, wwk.g));
                        }
                        int iP4 = iP3 + (atomicInteger.get() != 0 ? wwk.p(dg2VarL5, wwk.h) : 0) + i25;
                        p pVar = new p("audio/vnd.dts.uhd;profile=p2", 2, i7, iP4, jI2);
                        if (this.n == 3) {
                            b(pVar);
                        }
                        this.m = iP4;
                        this.k = jI2 == -9223372036854775807L ? 0L : jI2;
                        sscVar2.M(0);
                        this.g.e(this.p, sscVar2);
                        this.h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(sscVar.a(), this.m - this.i);
                    this.g.e(iMin, sscVar);
                    int i32 = this.i + iMin;
                    this.i = i32;
                    if (i32 == this.m) {
                        fd9.M(this.q != -9223372036854775807L);
                        this.g.a(this.q, this.n == 4 ? 0 : 1, this.m, 0, null);
                        this.q += this.k;
                        this.h = 0;
                    }
                    break;
                default:
                    e0.b();
                    return;
            }
        }
    }

    @Override // defpackage.bk6
    public final void d() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.bk6
    public final void e(boolean z) {
    }

    @Override // defpackage.bk6
    public final void f(yd7 yd7Var, t6f t6fVar) {
        t6fVar.d();
        t6fVar.i();
        this.f = (String) t6fVar.e;
        t6fVar.i();
        this.g = yd7Var.n(t6fVar.c, 1);
    }

    @Override // defpackage.bk6
    public final void g(int i, long j) {
        this.q = j;
    }
}
