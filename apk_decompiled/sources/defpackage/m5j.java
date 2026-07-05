package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class m5j {
    public static final m5j a = new m5j();
    public static final qnc b = new qnc(16.0f, 12.0f, 16.0f, 12.0f);
    public static final float c = 568.0f;

    public final void a(iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i, int i2) {
        iqb iqbVar2;
        int i3;
        rz7 rz7Var;
        iqb iqbVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-756863326);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            iqbVar2 = iqbVar;
        } else if ((i & 6) == 0) {
            iqbVar2 = iqbVar;
            i3 = i | (e18Var.f(iqbVar2) ? 4 : 2);
        } else {
            iqbVar2 = iqbVar;
            i3 = i;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            iqb iqbVar4 = i4 != 0 ? fqb.E : iqbVar2;
            iqb iqbVarP = yfd.p(xn5.V(gb9.L(b.c(iqbVar4, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.b(e18Var).f), gm3.a(e18Var).o, zni.b);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            rz7Var = ta4Var;
            rz7Var.invoke(s64.a, e18Var, 54);
            e18Var.p(true);
            iqbVar3 = iqbVar4;
        } else {
            rz7Var = ta4Var;
            e18Var.T();
            iqbVar3 = iqbVar2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zh(this, iqbVar3, rz7Var, i, i2, 14);
        }
    }

    public final void b(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(692723934);
        int i2 = i & 1;
        if (e18Var.Q(i2, i2 != 0)) {
            dw1.a(yfd.p(b.e(b.c(fqb.E, 1.0f), ((cz5) e18Var.j(ve4.h)).g0(1.0f)), gm3.a(e18Var).v, zni.b), e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jsg(this, i, 12);
        }
    }
}
