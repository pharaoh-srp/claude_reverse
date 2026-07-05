package defpackage;

import androidx.media3.common.ParserException;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class em8 implements wd7 {
    public yd7 b;
    public xd7 c;
    public xg8 d;
    public zsb e;
    public int g;
    public long h;
    public int i;
    public final ssc a = new ssc(16);
    public long j = -1;
    public int f = 0;

    @Override // defpackage.wd7
    public final void a() {
        zsb zsbVar = this.e;
        if (zsbVar != null) {
            zsbVar.getClass();
            this.e = null;
        }
    }

    @Override // defpackage.wd7
    public final int b(xd7 xd7Var, xm7 xm7Var) throws ParserException {
        while (true) {
            int i = this.f;
            if (i == 0) {
                int i2 = this.i;
                ssc sscVar = this.a;
                if (i2 == 0) {
                    if (!xd7Var.a(sscVar.a, 0, 8, true)) {
                        yd7 yd7Var = this.b;
                        yd7Var.getClass();
                        yd7Var.j();
                        this.b.q(new z91(-9223372036854775807L));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    sscVar.M(0);
                    this.h = sscVar.B();
                    this.g = sscVar.m();
                }
                if (this.h == 1) {
                    xd7Var.readFully(sscVar.a, 8, 8);
                    this.i += 8;
                    this.h = sscVar.F();
                }
                if (this.g == 1836086884) {
                    long position = xd7Var.getPosition();
                    this.j = position;
                    long j = this.i;
                    xrb xrbVar = new xrb(0L, position - j, -9223372036854775807L, position, this.h - j);
                    yd7 yd7Var2 = this.b;
                    yd7Var2.getClass();
                    y3i y3iVarN = yd7Var2.n(FreeTypeConstants.FT_LOAD_NO_RECURSE, 4);
                    iw7 iw7Var = new iw7();
                    iw7Var.m = gkb.k("image/heic");
                    iw7Var.k = new gjb(xrbVar);
                    qy1.n(iw7Var, y3iVarN);
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i == 1) {
                xd7Var.l((int) (this.h - ((long) this.i)));
                this.i = 0;
                this.f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        e0.b();
                        return 0;
                    }
                    if (this.d == null || xd7Var != this.c) {
                        this.c = xd7Var;
                        this.d = new xg8(xd7Var, this.j);
                    }
                    zsb zsbVar = this.e;
                    zsbVar.getClass();
                    int iB = zsbVar.b(this.d, xm7Var);
                    if (iB == 1) {
                        xm7Var.a += this.j;
                    }
                    return iB;
                }
                if (this.e == null) {
                    this.e = new zsb(bxg.q, 8);
                }
                xg8 xg8Var = new xg8(xd7Var, this.j);
                this.d = xg8Var;
                if (this.e.c(xg8Var)) {
                    zsb zsbVar2 = this.e;
                    long j2 = this.j;
                    yd7 yd7Var3 = this.b;
                    yd7Var3.getClass();
                    zsbVar2.f(new xg8(j2, yd7Var3));
                    this.f = 3;
                } else {
                    yd7 yd7Var4 = this.b;
                    yd7Var4.getClass();
                    yd7Var4.j();
                    this.b.q(new z91(-9223372036854775807L));
                    this.f = 4;
                }
            }
        }
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) {
        return osk.t((fr5) xd7Var, true);
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                zsb zsbVar = this.e;
                zsbVar.getClass();
                zsbVar.d(j, j2);
                return;
            }
            return;
        }
        this.f = 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.b = yd7Var;
    }
}
