package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class x4 implements wd7 {
    public final w4 a = new w4(0, 1, null, "audio/ac4");
    public final ssc b = new ssc(16384);
    public boolean c;

    @Override // defpackage.wd7
    public final void a() {
    }

    @Override // defpackage.wd7
    public final int b(xd7 xd7Var, xm7 xm7Var) {
        ssc sscVar = this.b;
        int i = xd7Var.read(sscVar.a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        sscVar.M(0);
        sscVar.L(i);
        boolean z = this.c;
        w4 w4Var = this.a;
        if (!z) {
            w4Var.o = 0L;
            this.c = true;
        }
        w4Var.c(sscVar);
        return 0;
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) throws EOFException, InterruptedIOException {
        fr5 fr5Var;
        int i;
        ssc sscVar = new ssc(10);
        int i2 = 0;
        while (true) {
            fr5Var = (fr5) xd7Var;
            fr5Var.d(sscVar.a, 0, 10, false);
            sscVar.M(0);
            if (sscVar.C() != 4801587) {
                break;
            }
            sscVar.N(3);
            int iY = sscVar.y();
            i2 += iY + 10;
            fr5Var.j(iY, false);
        }
        fr5Var.J = 0;
        fr5Var.j(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            fr5Var.d(sscVar.a, 0, 7, false);
            sscVar.M(0);
            int iG = sscVar.G();
            if (iG == 44096 || iG == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = sscVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iG == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                fr5Var.j(i - 7, false);
            } else {
                fr5Var.J = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                fr5Var.j(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        this.c = false;
        this.a.d();
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.a.f(yd7Var, new t6f(0, 1));
        yd7Var.j();
        yd7Var.q(new z91(-9223372036854775807L));
    }
}
