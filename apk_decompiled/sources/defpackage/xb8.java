package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xb8 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ float F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ xb8(zy7 zy7Var, float f, iqb iqbVar, int i) {
        this.E = 0;
        this.G = zy7Var;
        this.F = f;
        this.H = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        Object obj3 = this.H;
        Object obj4 = this.G;
        float f = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rqk.e((zy7) obj4, f, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 1:
                ta4 ta4Var = (ta4) obj4;
                pz7 pz7Var = (pz7) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    q64 q64VarA = p64.a(new ho0(f, true, new sz6(1)), lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, fqbVar);
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
                    ta4Var.invoke(e18Var, 0);
                    if (pz7Var == null) {
                        e18Var.a0(-353205328);
                    } else {
                        e18Var.a0(1374079601);
                        pz7Var.invoke(e18Var, 0);
                    }
                    e18Var.p(false);
                    e18Var.p(true);
                }
                break;
            default:
                e0g e0gVar = (e0g) obj4;
                jx8 jx8Var = (jx8) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    nuk.d(jx8Var, null, xn5.V(b.o(fqbVar, f), e0gVar), null, null, a.a(ud0.u0, e18Var2), null, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var2, 262192, 0, 65496);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ xb8(float f, Object obj, Object obj2, int i) {
        this.E = i;
        this.F = f;
        this.G = obj;
        this.H = obj2;
    }
}
