package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class v4 implements wd7 {
    public final w4 a = new w4("audio/ac3");
    public final ssc b = new ssc(2786);
    public boolean c;

    @Override // defpackage.wd7
    public final void a() {
    }

    @Override // defpackage.wd7
    public final int b(xd7 xd7Var, xm7 xm7Var) {
        ssc sscVar = this.b;
        int i = xd7Var.read(sscVar.a, 0, 2786);
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
        int iF;
        ssc sscVar = new ssc(10);
        int i = 0;
        while (true) {
            fr5Var = (fr5) xd7Var;
            fr5Var.d(sscVar.a, 0, 10, false);
            sscVar.M(0);
            if (sscVar.C() != 4801587) {
                break;
            }
            sscVar.N(3);
            int iY = sscVar.y();
            i += iY + 10;
            fr5Var.j(iY, false);
        }
        fr5Var.J = 0;
        fr5Var.j(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            fr5Var.d(sscVar.a, 0, 6, false);
            sscVar.M(0);
            if (sscVar.G() != 2935) {
                fr5Var.J = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                fr5Var.j(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = sscVar.a;
                if (bArr.length < 6) {
                    iF = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iF = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iF = nv1.f((b & 192) >> 6, b & 63);
                }
                if (iF == -1) {
                    break;
                }
                fr5Var.j(iF - 6, false);
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
