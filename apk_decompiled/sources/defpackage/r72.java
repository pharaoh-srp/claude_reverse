package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class r72 implements rz7 {
    public final /* synthetic */ float E;
    public final /* synthetic */ ta4 F;
    public final /* synthetic */ Object G;

    public r72(float f, ta4 ta4Var, Object obj) {
        this.E = f;
        this.F = ta4Var;
        this.G = obj;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ia0) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(idi.i(yfd.p(gb9.L(b.c(fqbVar, 1.0f), this.E, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var).p, zni.b), gm3.a(e18Var).u, false, false), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            vo1 vo1Var = lja.S;
            eo0 eo0Var = ko0.c;
            q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            kxk.g(e18Var, b.e(fqbVar, 8.0f));
            iqb iqbVarJ = gb9.J(ez1.t(yfd.p(fqbVar, gm3.a(e18Var).n, gm3.b(e18Var).c), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u, gm3.b(e18Var).c), 16.0f);
            q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarJ);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            this.F.i(s64.a, this.G, e18Var, 6);
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
