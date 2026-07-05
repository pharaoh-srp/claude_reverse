package defpackage;

import android.util.SparseArray;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.w6;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class pvd implements wd7 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public vm7 i;
    public yd7 j;
    public boolean k;
    public final frh a = new frh(0);
    public final ssc c = new ssc(FreeTypeConstants.FT_LOAD_MONOCHROME);
    public final SparseArray b = new SparseArray();
    public final nvd d = new nvd(0);

    @Override // defpackage.wd7
    public final void a() {
    }

    @Override // defpackage.wd7
    public final int b(xd7 xd7Var, xm7 xm7Var) {
        char c;
        int i;
        int i2;
        bk6 ge8Var;
        long j;
        this.j.getClass();
        long length = xd7Var.getLength();
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = -9223372036854775807L;
        nvd nvdVar = this.d;
        if (i3 != 0) {
            c = 3;
            if (!nvdVar.d) {
                frh frhVar = nvdVar.b;
                ssc sscVar = nvdVar.c;
                if (!nvdVar.f) {
                    long length2 = xd7Var.getLength();
                    int iMin = (int) Math.min(20000L, length2);
                    long j3 = length2 - ((long) iMin);
                    if (xd7Var.getPosition() != j3) {
                        xm7Var.a = j3;
                        return 1;
                    }
                    sscVar.J(iMin);
                    xd7Var.k();
                    xd7Var.p(sscVar.a, 0, iMin);
                    int i4 = sscVar.b;
                    int i5 = sscVar.c - 4;
                    while (true) {
                        if (i5 < i4) {
                            break;
                        }
                        if (nvd.b(sscVar.a, i5) == 442) {
                            sscVar.M(i5 + 4);
                            long jC = nvd.c(sscVar);
                            if (jC != -9223372036854775807L) {
                                j2 = jC;
                                break;
                            }
                        }
                        i5--;
                    }
                    nvdVar.h = j2;
                    nvdVar.f = true;
                    return 0;
                }
                if (nvdVar.h == -9223372036854775807L) {
                    nvdVar.a(xd7Var);
                    return 0;
                }
                if (nvdVar.e) {
                    long j4 = nvdVar.g;
                    if (j4 == -9223372036854775807L) {
                        nvdVar.a(xd7Var);
                        return 0;
                    }
                    nvdVar.i = frhVar.c(nvdVar.h) - frhVar.b(j4);
                    nvdVar.a(xd7Var);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, xd7Var.getLength());
                if (xd7Var.getPosition() != 0) {
                    xm7Var.a = 0L;
                    return 1;
                }
                sscVar.J(iMin2);
                xd7Var.k();
                xd7Var.p(sscVar.a, 0, iMin2);
                int i6 = sscVar.b;
                int i7 = sscVar.c;
                while (true) {
                    if (i6 >= i7 - 3) {
                        j = -9223372036854775807L;
                        break;
                    }
                    if (nvd.b(sscVar.a, i6) == 442) {
                        sscVar.M(i6 + 4);
                        long jC2 = nvd.c(sscVar);
                        if (jC2 != -9223372036854775807L) {
                            j = jC2;
                            break;
                        }
                    }
                    i6++;
                }
                nvdVar.g = j;
                nvdVar.e = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            i = i3;
            i2 = 4;
        } else {
            this.k = true;
            long j5 = nvdVar.i;
            if (j5 != -9223372036854775807L) {
                i = i3;
                i2 = 4;
                vm7 vm7Var = new vm7(new c0l(24), new mvd(nvdVar.b), j5, j5 + 1, 0L, length, 188L, 1000);
                this.i = vm7Var;
                this.j.q(vm7Var.a);
            } else {
                i = i3;
                i2 = 4;
                this.j.q(new z91(j5));
            }
        }
        vm7 vm7Var2 = this.i;
        if (vm7Var2 != null && vm7Var2.c != null) {
            return vm7Var2.b(xd7Var, xm7Var);
        }
        xd7Var.k();
        long jE = i != 0 ? length - xd7Var.e() : -1L;
        if (jE != -1 && jE < 4) {
            return -1;
        }
        ssc sscVar2 = this.c;
        if (!xd7Var.d(sscVar2.a, 0, i2, true)) {
            return -1;
        }
        sscVar2.M(0);
        int iM = sscVar2.m();
        if (iM == 441) {
            return -1;
        }
        if (iM == 442) {
            xd7Var.p(sscVar2.a, 0, 10);
            sscVar2.M(9);
            xd7Var.l((sscVar2.z() & 7) + 14);
            return 0;
        }
        if (iM == 443) {
            xd7Var.p(sscVar2.a, 0, 2);
            sscVar2.M(0);
            xd7Var.l(sscVar2.G() + 6);
            return 0;
        }
        if (((iM & (-256)) >> 8) != 1) {
            xd7Var.l(1);
            return 0;
        }
        int i8 = iM & 255;
        SparseArray sparseArray = this.b;
        ovd ovdVar = (ovd) sparseArray.get(i8);
        if (!this.e) {
            if (ovdVar == null) {
                if (i8 == 189) {
                    ge8Var = new w4("video/mp2p");
                    this.f = true;
                    this.h = xd7Var.getPosition();
                } else if ((iM & 224) == 192) {
                    ge8Var = new ctb(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = xd7Var.getPosition();
                } else if ((iM & 240) == 224) {
                    ge8Var = new ge8(null, "video/mp2p");
                    this.g = true;
                    this.h = xd7Var.getPosition();
                } else {
                    ge8Var = null;
                }
                if (ge8Var != null) {
                    ge8Var.f(this.j, new t6f(i8, FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING));
                    ovdVar = new ovd(ge8Var, this.a);
                    sparseArray.put(i8, ovdVar);
                }
            }
            if (xd7Var.getPosition() > ((this.f && this.g) ? this.h + 8192 : w6.MAX_EVENT_SIZE_BYTES)) {
                this.e = true;
                this.j.j();
            }
        }
        xd7Var.p(sscVar2.a, 0, 2);
        sscVar2.M(0);
        int iG = sscVar2.G() + 6;
        if (ovdVar == null) {
            xd7Var.l(iG);
            return 0;
        }
        sscVar2.J(iG);
        xd7Var.readFully(sscVar2.a, 0, iG);
        sscVar2.M(6);
        bk6 bk6Var = ovdVar.a;
        dg2 dg2Var = ovdVar.c;
        sscVar2.k(dg2Var.b, 0, 3);
        dg2Var.m(0);
        dg2Var.o(8);
        ovdVar.d = dg2Var.f();
        ovdVar.e = dg2Var.f();
        dg2Var.o(6);
        sscVar2.k(dg2Var.b, 0, dg2Var.g(8));
        dg2Var.m(0);
        frh frhVar2 = ovdVar.b;
        ovdVar.g = 0L;
        if (ovdVar.d) {
            dg2Var.o(4);
            long jG = ((long) dg2Var.g(3)) << 30;
            dg2Var.o(1);
            long jG2 = jG | ((long) (dg2Var.g(15) << 15));
            dg2Var.o(1);
            long jG3 = jG2 | ((long) dg2Var.g(15));
            dg2Var.o(1);
            if (!ovdVar.f && ovdVar.e) {
                dg2Var.o(4);
                long jG4 = ((long) dg2Var.g(3)) << 30;
                dg2Var.o(1);
                long jG5 = jG4 | ((long) (dg2Var.g(15) << 15));
                dg2Var.o(1);
                long jG6 = jG5 | ((long) dg2Var.g(15));
                dg2Var.o(1);
                frhVar2.b(jG6);
                ovdVar.f = true;
            }
            ovdVar.g = frhVar2.b(jG3);
        }
        bk6Var.g(4, ovdVar.g);
        bk6Var.c(sscVar2);
        bk6Var.e(false);
        sscVar2.L(sscVar2.a.length);
        return 0;
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        fr5 fr5Var = (fr5) xd7Var;
        fr5Var.d(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            fr5Var.j(bArr[13] & 7, false);
            fr5Var.d(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        frh frhVar = this.a;
        synchronized (frhVar) {
            j3 = frhVar.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = frhVar.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            frhVar.e(j2);
        }
        vm7 vm7Var = this.i;
        if (vm7Var != null) {
            vm7Var.d(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            ovd ovdVar = (ovd) sparseArray.valueAt(i);
            ovdVar.f = false;
            ovdVar.a.d();
        }
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.j = yd7Var;
    }
}
