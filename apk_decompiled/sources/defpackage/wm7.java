package defpackage;

import androidx.media3.common.ParserException;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wm7 implements wd7 {
    public yd7 e;
    public y3i f;
    public gjb h;
    public zm7 i;
    public int j;
    public int k;
    public vm7 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final ssc b = new ssc(new byte[FreeTypeConstants.FT_LOAD_NO_AUTOHINT], 0);
    public final boolean c = false;
    public final xm7 d = new xm7();
    public int g = 0;

    @Override // defpackage.wd7
    public final void a() {
    }

    @Override // defpackage.wd7
    public final int b(xd7 xd7Var, xm7 xm7Var) throws ParserException {
        zm7 zm7Var;
        int i;
        vef z91Var;
        long j;
        long j2;
        boolean zE;
        long jH;
        long j3;
        int i2 = this.g;
        gjb gjbVar = null;
        if (i2 == 0) {
            xd7Var.k();
            long jE = xd7Var.e();
            gjb gjbVarC = new kv8(0).c(xd7Var, !this.c ? null : iv8.i, 0);
            if (gjbVarC != null && gjbVarC.a.length != 0) {
                gjbVar = gjbVarC;
            }
            xd7Var.l((int) (xd7Var.e() - jE));
            this.h = gjbVar;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i2 == 1) {
            xd7Var.p(bArr, 0, bArr.length);
            xd7Var.k();
            this.g = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i2 == 2) {
            ssc sscVar = new ssc(4);
            xd7Var.readFully(sscVar.a, 0, 4);
            if (sscVar.B() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i5 = 6;
        if (i2 == 3) {
            int i6 = 0;
            zm7 zm7Var2 = this.i;
            boolean z = false;
            while (!z) {
                xd7Var.k();
                byte[] bArr2 = new byte[i3];
                dg2 dg2Var = new dg2(bArr2, i3);
                int i7 = i6;
                xd7Var.p(bArr2, i7, i3);
                boolean zF = dg2Var.f();
                int iG = dg2Var.g(i);
                int iG2 = dg2Var.g(24) + i3;
                if (iG == 0) {
                    byte[] bArr3 = new byte[38];
                    xd7Var.readFully(bArr3, i7, 38);
                    zm7Var2 = new zm7(bArr3, i3);
                } else {
                    if (zm7Var2 == null) {
                        mr9.y();
                        return 0;
                    }
                    gjb gjbVar2 = zm7Var2.l;
                    if (iG == i4) {
                        ssc sscVar2 = new ssc(iG2);
                        xd7Var.readFully(sscVar2.a, i7, iG2);
                        zm7Var2 = new zm7(zm7Var2.a, zm7Var2.b, zm7Var2.c, zm7Var2.d, zm7Var2.e, zm7Var2.g, zm7Var2.h, zm7Var2.j, pmk.j(sscVar2), zm7Var2.l);
                    } else {
                        if (iG == i3) {
                            ssc sscVar3 = new ssc(iG2);
                            xd7Var.readFully(sscVar3.a, 0, iG2);
                            sscVar3.N(i3);
                            gjb gjbVarF = nkk.f(Arrays.asList((String[]) nkk.g(sscVar3, false, false).F));
                            if (gjbVar2 != null) {
                                gjbVarF = gjbVar2.b(gjbVarF);
                            }
                            zm7Var = new zm7(zm7Var2.a, zm7Var2.b, zm7Var2.c, zm7Var2.d, zm7Var2.e, zm7Var2.g, zm7Var2.h, zm7Var2.j, zm7Var2.k, gjbVarF);
                        } else if (iG == i5) {
                            ssc sscVar4 = new ssc(iG2);
                            xd7Var.readFully(sscVar4.a, 0, iG2);
                            sscVar4.N(4);
                            gjb gjbVar3 = new gjb(nz8.u(r2d.d(sscVar4)));
                            if (gjbVar2 != null) {
                                gjbVar3 = gjbVar2.b(gjbVar3);
                            }
                            zm7Var = new zm7(zm7Var2.a, zm7Var2.b, zm7Var2.c, zm7Var2.d, zm7Var2.e, zm7Var2.g, zm7Var2.h, zm7Var2.j, zm7Var2.k, gjbVar3);
                        } else {
                            xd7Var.l(iG2);
                        }
                        zm7Var2 = zm7Var;
                    }
                }
                String str = tpi.a;
                this.i = zm7Var2;
                z = zF;
                i3 = 4;
                i4 = 3;
                i = 7;
                i5 = 6;
                i6 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            jw7 jw7VarC = this.i.c(bArr, this.h);
            y3i y3iVar = this.f;
            iw7 iw7VarA = jw7VarC.a();
            iw7VarA.m = gkb.k("audio/flac");
            qy1.n(iw7VarA, y3iVar);
            this.f.d(this.i.b());
            this.g = 4;
            return 0;
        }
        long j4 = 0;
        if (i2 == 4) {
            xd7Var.k();
            ssc sscVar5 = new ssc(2);
            xd7Var.p(sscVar5.a, 0, 2);
            int iG3 = sscVar5.G();
            if ((iG3 >> 2) != 16382) {
                xd7Var.k();
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            xd7Var.k();
            this.k = iG3;
            yd7 yd7Var = this.e;
            String str2 = tpi.a;
            long position = xd7Var.getPosition();
            long length = xd7Var.getLength();
            this.i.getClass();
            zm7 zm7Var3 = this.i;
            i49 i49Var = zm7Var3.k;
            if (i49Var != null && ((long[]) i49Var.F).length > 0) {
                z91Var = new z91(zm7Var3, position, 1);
                i = 0;
            } else if (length == -1 || zm7Var3.j <= 0) {
                i = 0;
                z91Var = new z91(zm7Var3.b());
            } else {
                int i8 = this.k;
                int i9 = zm7Var3.c;
                do0 do0Var = new do0(25, zm7Var3);
                um7 um7Var = new um7(zm7Var3, i8);
                long jB = zm7Var3.b();
                long j5 = zm7Var3.j;
                int i10 = zm7Var3.d;
                if (i10 > 0) {
                    i = 0;
                    j = ((((long) i10) + ((long) i9)) / 2) + 1;
                } else {
                    i = 0;
                    int i11 = zm7Var3.a;
                    j = 64 + (((((i11 != zm7Var3.b || i11 <= 0) ? 4096L : i11) * ((long) zm7Var3.g)) * ((long) zm7Var3.h)) / 8);
                }
                vm7 vm7Var = new vm7(do0Var, um7Var, jB, j5, position, length, j, Math.max(6, i9));
                this.l = vm7Var;
                z91Var = vm7Var.a;
            }
            yd7Var.q(z91Var);
            this.g = 5;
            return i;
        }
        if (i2 != 5) {
            e0.b();
            return 0;
        }
        this.f.getClass();
        this.i.getClass();
        vm7 vm7Var2 = this.l;
        if (vm7Var2 != null && vm7Var2.c != null) {
            return vm7Var2.b(xd7Var, xm7Var);
        }
        if (this.n == -1) {
            zm7 zm7Var4 = this.i;
            xd7Var.k();
            xd7Var.f(1);
            byte[] bArr4 = new byte[1];
            xd7Var.p(bArr4, 0, 1);
            boolean z2 = (bArr4[0] & 1) == 1;
            xd7Var.f(2);
            i = z2 ? 7 : 6;
            ssc sscVar6 = new ssc(i);
            byte[] bArr5 = sscVar6.a;
            int i12 = 0;
            while (i12 < i) {
                int iH = xd7Var.h(bArr5, i12, i - i12);
                if (iH == -1) {
                    break;
                }
                i12 += iH;
            }
            sscVar6.L(i12);
            xd7Var.k();
            try {
                jH = sscVar6.H();
                if (!z2) {
                    jH *= (long) zm7Var4.b;
                }
                j3 = zm7Var4.j;
            } catch (NumberFormatException unused) {
            }
            if (j3 == 0 || jH <= j3) {
                j4 = jH;
            } else {
                z = false;
            }
            if (!z) {
                throw ParserException.a(null, null);
            }
            this.n = j4;
        } else {
            ssc sscVar7 = this.b;
            int i13 = sscVar7.c;
            if (i13 < 32768) {
                int i14 = xd7Var.read(sscVar7.a, i13, FreeTypeConstants.FT_LOAD_NO_AUTOHINT - i13);
                z = i14 == -1;
                if (!z) {
                    sscVar7.L(i13 + i14);
                } else if (sscVar7.a() == 0) {
                    long j6 = this.n * 1000000;
                    zm7 zm7Var5 = this.i;
                    String str3 = tpi.a;
                    this.f.a(j6 / ((long) zm7Var5.e), 1, this.m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i15 = sscVar7.b;
            int i16 = this.m;
            int i17 = this.j;
            if (i16 < i17) {
                sscVar7.N(Math.min(i17 - i16, sscVar7.a()));
            }
            this.i.getClass();
            int i18 = sscVar7.b;
            while (true) {
                int i19 = sscVar7.c - 16;
                xm7 xm7Var2 = this.d;
                if (i18 <= i19) {
                    sscVar7.M(i18);
                    if (gmk.e(sscVar7, this.i, this.k, xm7Var2)) {
                        sscVar7.M(i18);
                        j2 = xm7Var2.a;
                        break;
                    }
                    i18++;
                } else {
                    if (z) {
                        while (true) {
                            int i20 = sscVar7.c;
                            if (i18 > i20 - this.j) {
                                sscVar7.M(i20);
                                break;
                            }
                            sscVar7.M(i18);
                            try {
                                zE = gmk.e(sscVar7, this.i, this.k, xm7Var2);
                            } catch (IndexOutOfBoundsException unused2) {
                                zE = false;
                            }
                            if (sscVar7.b > sscVar7.c) {
                                zE = false;
                            }
                            if (zE) {
                                sscVar7.M(i18);
                                j2 = xm7Var2.a;
                                break;
                            }
                            i18++;
                        }
                    } else {
                        sscVar7.M(i18);
                    }
                    j2 = -1;
                }
            }
            int i21 = sscVar7.b - i15;
            sscVar7.M(i15);
            this.f.e(i21, sscVar7);
            int i22 = this.m + i21;
            this.m = i22;
            if (j2 != -1) {
                long j7 = this.n * 1000000;
                zm7 zm7Var6 = this.i;
                String str4 = tpi.a;
                this.f.a(j7 / ((long) zm7Var6.e), 1, i22, 0, null);
                this.m = 0;
                this.n = j2;
            }
            int length2 = sscVar7.a.length - sscVar7.c;
            if (sscVar7.a() < 16 && length2 < 16) {
                int iA = sscVar7.a();
                byte[] bArr6 = sscVar7.a;
                System.arraycopy(bArr6, sscVar7.b, bArr6, 0, iA);
                sscVar7.M(0);
                sscVar7.L(iA);
            }
        }
        return 0;
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) {
        gjb gjbVarC = new kv8(0).c(xd7Var, iv8.i, 0);
        if (gjbVarC != null) {
            int length = gjbVarC.a.length;
        }
        ssc sscVar = new ssc(4);
        ((fr5) xd7Var).d(sscVar.a, 0, 4, false);
        return sscVar.B() == 1716281667;
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            vm7 vm7Var = this.l;
            if (vm7Var != null) {
                vm7Var.d(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.J(0);
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.e = yd7Var;
        this.f = yd7Var.n(0, 1);
        yd7Var.j();
    }
}
