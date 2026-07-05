package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class o3g {
    public static final yig a = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, nzi.a, 1);
    public static final l3g b = new l3g();

    static {
        new ewb();
    }

    public static final void a(iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(646379026);
        int i2 = i | 6;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            b(fd9.q0(1948801580, new m3g(ta4Var), e18Var), e18Var, 6);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new z00(iqbVar, ta4Var, i, 4);
        }
    }

    public static final void b(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1908320054);
        int i2 = 0;
        int i3 = 1;
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            wd6.Q(fd9.q0(2062852661, new n3g(i2, ta4Var), e18Var), e18Var, 6);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new oma(ta4Var, i, i3);
        }
    }
}
