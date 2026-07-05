package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class b8g implements wd7 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public yd7 f;
    public y3i g;

    public b8g(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.wd7
    public final void a() {
    }

    @Override // defpackage.wd7
    public final int b(xd7 xd7Var, xm7 xm7Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            e0.b();
            return 0;
        }
        y3i y3iVar = this.g;
        y3iVar.getClass();
        int iC = y3iVar.c(xd7Var, FreeTypeConstants.FT_LOAD_NO_RECURSE, true);
        if (iC != -1) {
            this.d += iC;
            return 0;
        }
        this.e = 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) {
        int i = this.b;
        int i2 = this.a;
        fd9.M((i2 == -1 || i == -1) ? false : true);
        ssc sscVar = new ssc(i);
        ((fr5) xd7Var).d(sscVar.a, 0, i, false);
        return sscVar.G() == i2;
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.f = yd7Var;
        y3i y3iVarN = yd7Var.n(FreeTypeConstants.FT_LOAD_NO_RECURSE, 4);
        this.g = y3iVarN;
        iw7 iw7Var = new iw7();
        String str = this.c;
        iw7Var.m = gkb.k(str);
        iw7Var.n = gkb.k(str);
        qy1.n(iw7Var, y3iVarN);
        this.f.j();
        this.f.q(new c8g());
        this.e = 1;
    }
}
