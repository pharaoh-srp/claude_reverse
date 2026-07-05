package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ef implements wd7 {
    public final ssc c;
    public final dg2 d;
    public yd7 e;
    public long f;
    public boolean h;
    public boolean i;
    public final ff a = new ff(null, "audio/mp4a-latm", 0, true);
    public final ssc b = new ssc(FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM);
    public long g = -1;

    public ef() {
        ssc sscVar = new ssc(10);
        this.c = sscVar;
        byte[] bArr = sscVar.a;
        this.d = new dg2(bArr, bArr.length);
    }

    @Override // defpackage.wd7
    public final void a() {
    }

    @Override // defpackage.wd7
    public final int b(xd7 xd7Var, xm7 xm7Var) {
        this.e.getClass();
        xd7Var.getLength();
        ssc sscVar = this.b;
        int i = xd7Var.read(sscVar.a, 0, FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM);
        boolean z = i == -1;
        if (!this.i) {
            this.e.q(new z91(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        sscVar.M(0);
        sscVar.L(i);
        boolean z2 = this.h;
        ff ffVar = this.a;
        if (!z2) {
            ffVar.u = this.f;
            this.h = true;
        }
        ffVar.c(sscVar);
        return 0;
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) throws EOFException, InterruptedIOException {
        ssc sscVar;
        int i = 0;
        while (true) {
            sscVar = this.c;
            xd7Var.p(sscVar.a, 0, 10);
            sscVar.M(0);
            if (sscVar.C() != 4801587) {
                break;
            }
            sscVar.N(3);
            int iY = sscVar.y();
            i += iY + 10;
            xd7Var.f(iY);
        }
        xd7Var.k();
        xd7Var.f(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            fr5 fr5Var = (fr5) xd7Var;
            fr5Var.d(sscVar.a, 0, 2, false);
            sscVar.M(0);
            if ((sscVar.G() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                fr5Var.d(sscVar.a, 0, 4, false);
                dg2 dg2Var = this.d;
                dg2Var.m(14);
                int iG = dg2Var.g(13);
                if (iG <= 6) {
                    i4++;
                    fr5Var.J = 0;
                    fr5Var.j(i4, false);
                } else {
                    fr5Var.j(iG - 6, false);
                    i3 += iG;
                }
            } else {
                i4++;
                fr5Var.J = 0;
                fr5Var.j(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        this.h = false;
        this.a.d();
        this.f = j2;
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.e = yd7Var;
        this.a.f(yd7Var, new t6f(0, 1));
        yd7Var.j();
    }
}
