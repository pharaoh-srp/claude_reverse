package androidx.compose.foundation.layout;

import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.a21;
import defpackage.e56;
import defpackage.iqb;
import defpackage.lja;
import defpackage.vo1;
import defpackage.wo1;
import defpackage.x44;
import defpackage.xo1;
import defpackage.za6;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final FillElement a;
    public static final FillElement b;
    public static final FillElement c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;

    static {
        e56 e56Var = e56.F;
        a = new FillElement(e56Var, 1.0f);
        e56 e56Var2 = e56.E;
        b = new FillElement(e56Var2, 1.0f);
        e56 e56Var3 = e56.G;
        c = new FillElement(e56Var3, 1.0f);
        vo1 vo1Var = lja.T;
        int i2 = 27;
        d = new d(e56Var, false, new a21(i2, vo1Var), vo1Var);
        vo1 vo1Var2 = lja.S;
        e = new d(e56Var, false, new a21(i2, vo1Var2), vo1Var2);
        wo1 wo1Var = lja.Q;
        int i3 = 28;
        f = new d(e56Var2, false, new a21(i3, wo1Var), wo1Var);
        wo1 wo1Var2 = lja.P;
        g = new d(e56Var2, false, new a21(i3, wo1Var2), wo1Var2);
        xo1 xo1Var = lja.K;
        int i4 = 29;
        h = new d(e56Var3, false, new a21(i4, xo1Var), xo1Var);
        xo1 xo1Var2 = lja.G;
        i = new d(e56Var3, false, new a21(i4, xo1Var2), xo1Var2);
    }

    public static final iqb a(iqb iqbVar, float f2, float f3) {
        return iqbVar.B(new c(f2, f3));
    }

    public static /* synthetic */ iqb b(iqb iqbVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(iqbVar, f2, f3);
    }

    public static final iqb c(iqb iqbVar, float f2) {
        return iqbVar.B(f2 == 1.0f ? a : new FillElement(e56.F, f2));
    }

    public static final iqb e(iqb iqbVar, float f2) {
        return iqbVar.B(new a(MTTypesetterKt.kLineSkipLimitMultiplier, f2, MTTypesetterKt.kLineSkipLimitMultiplier, f2, true, 5));
    }

    public static final iqb f(iqb iqbVar, float f2, float f3) {
        return iqbVar.B(new a(MTTypesetterKt.kLineSkipLimitMultiplier, f2, MTTypesetterKt.kLineSkipLimitMultiplier, f3, true, 5));
    }

    public static /* synthetic */ iqb g(iqb iqbVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return f(iqbVar, f2, f3);
    }

    public static final iqb h(iqb iqbVar, float f2) {
        return iqbVar.B(new a(MTTypesetterKt.kLineSkipLimitMultiplier, f2, MTTypesetterKt.kLineSkipLimitMultiplier, f2, false, 5));
    }

    public static iqb i(iqb iqbVar) {
        return iqbVar.B(new a(MTTypesetterKt.kLineSkipLimitMultiplier, Float.NaN, MTTypesetterKt.kLineSkipLimitMultiplier, 480.0f, false, 5));
    }

    public static final iqb j(iqb iqbVar, float f2) {
        return iqbVar.B(new a(f2, f2, f2, f2, false));
    }

    public static final iqb k(iqb iqbVar, float f2, float f3) {
        return iqbVar.B(new a(f2, f3, f2, f3, false));
    }

    public static iqb l(iqb iqbVar, float f2, float f3, float f4, float f5, int i2) {
        return iqbVar.B(new a(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final iqb m(iqb iqbVar, float f2) {
        return iqbVar.B(new a(f2, MTTypesetterKt.kLineSkipLimitMultiplier, f2, MTTypesetterKt.kLineSkipLimitMultiplier, false, 10));
    }

    public static iqb n(iqb iqbVar, float f2) {
        return iqbVar.B(new a(f2, MTTypesetterKt.kLineSkipLimitMultiplier, Float.NaN, MTTypesetterKt.kLineSkipLimitMultiplier, false, 10));
    }

    public static final iqb o(iqb iqbVar, float f2) {
        return iqbVar.B(new a(f2, f2, f2, f2, true));
    }

    public static final iqb p(long j, iqb iqbVar) {
        return q(iqbVar, za6.d(j), za6.c(j));
    }

    public static final iqb q(iqb iqbVar, float f2, float f3) {
        return iqbVar.B(new a(f2, f3, f2, f3, true));
    }

    public static final iqb r(iqb iqbVar, float f2, float f3, float f4, float f5) {
        return iqbVar.B(new a(f2, f3, f4, f5, true));
    }

    public static /* synthetic */ iqb s(iqb iqbVar, float f2, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        return r(iqbVar, f2, f3, f4, (i2 & 8) == 0 ? 400.0f : Float.NaN);
    }

    public static final iqb t(iqb iqbVar, float f2) {
        return iqbVar.B(new a(f2, MTTypesetterKt.kLineSkipLimitMultiplier, f2, MTTypesetterKt.kLineSkipLimitMultiplier, true, 10));
    }

    public static final iqb u(iqb iqbVar, float f2, float f3) {
        return iqbVar.B(new a(f2, MTTypesetterKt.kLineSkipLimitMultiplier, f3, MTTypesetterKt.kLineSkipLimitMultiplier, true, 10));
    }

    public static /* synthetic */ iqb v(iqb iqbVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return u(iqbVar, f2, f3);
    }

    public static final iqb w(iqb iqbVar, wo1 wo1Var, boolean z) {
        d dVar;
        if (wo1Var.equals(lja.Q) && !z) {
            dVar = f;
        } else if (!wo1Var.equals(lja.P) || z) {
            dVar = new d(e56.E, z, new a21(28, wo1Var), wo1Var);
        } else {
            dVar = g;
        }
        return iqbVar.B(dVar);
    }

    public static iqb y(iqb iqbVar, xo1 xo1Var, int i2) {
        xo1 xo1Var2 = lja.K;
        if ((i2 & 1) != 0) {
            xo1Var = xo1Var2;
        }
        boolean z = (i2 & 2) == 0;
        return iqbVar.B((!xo1Var.equals(xo1Var2) || z) ? (!xo1Var.equals(lja.G) || z) ? new d(e56.G, z, new a21(29, xo1Var), xo1Var) : i : h);
    }

    public static iqb z(iqb iqbVar) {
        d dVar;
        vo1 vo1Var = lja.T;
        if (x44.r(vo1Var, vo1Var)) {
            dVar = d;
        } else if (x44.r(vo1Var, lja.S)) {
            dVar = e;
        } else {
            dVar = new d(e56.F, false, new a21(27, vo1Var), vo1Var);
        }
        return iqbVar.B(dVar);
    }
}
