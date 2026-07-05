package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class q4g {
    public static final float a;

    static {
        kxk.N(300, 0, wi6.a, 2);
        a = 22.0f;
    }

    public static final void a(iqb iqbVar, pz7 pz7Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        pz7 pz7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1361920385);
        int i2 = (e18Var.f(iqbVar) ? 4 : 2) | i | (e18Var.h(pz7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            String strE = dch.E(R.string.m3c_bottom_sheet_drag_handle_description, e18Var);
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            o5b o5bVarD = dw1.d(lja.K, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            iqbVar2 = iqbVar;
            pz7Var2 = pz7Var;
            e2i.b(c2i.a(e18Var), fd9.q0(1497042086, new pp(strE, 15), e18Var), e2i.c(e18Var), iqbVar2, false, pz7Var2, e18Var, ((i2 << 9) & 7168) | 48 | ((i2 << 21) & 234881024), 240);
            e18Var.p(true);
        } else {
            iqbVar2 = iqbVar;
            pz7Var2 = pz7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gu2(iqbVar2, pz7Var2, i);
        }
    }
}
