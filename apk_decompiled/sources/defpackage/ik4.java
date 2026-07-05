package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ik4 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    public /* synthetic */ ik4(int i, zy7 zy7Var) {
        this.E = 2;
        this.F = i;
        this.G = zy7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        Object obj4 = this.G;
        int i2 = this.F;
        switch (i) {
            case 0:
                List list = (List) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    xo1 xo1Var = lja.K;
                    qnc qncVar = qf2.a;
                    iqb iqbVarN = gb9.N(gb9.L(fqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, !list.isEmpty() ? 2.0f : 0.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                    int size = list.size();
                    tf2.E.getClass();
                    iqb iqbVarI = gb9.I(b.g(b.c(ybi.p(iqbVarN, qf2.b(hj6.L(size, i2), e18Var, 48)), 1.0f), 56.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), qf2.a);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarI);
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
                    ez1.a(null, vf2.H, 0L, e18Var, 48, 5);
                    e18Var.p(true);
                }
                break;
            case 1:
                ta4 ta4Var = (ta4) obj4;
                px9 px9Var = (px9) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(px9Var) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    ta4Var.i(px9Var, Integer.valueOf(i2), e18Var2, Integer.valueOf(iIntValue2 & 14));
                }
                break;
            default:
                zy7 zy7Var = (zy7) obj4;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    Integer numValueOf = Integer.valueOf(i2);
                    boolean zF = e18Var3.f(zy7Var);
                    Object objN = e18Var3.N();
                    if (zF || objN == jd4.a) {
                        objN = new es0(zy7Var, null, 22);
                        e18Var3.k0(objN);
                    }
                    fd9.i(e18Var3, (pz7) objN, numValueOf);
                    xo1 xo1Var2 = lja.K;
                    iqb iqbVarL = gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1);
                    o5b o5bVarD2 = dw1.d(xo1Var2, false);
                    int iHashCode2 = Long.hashCode(e18Var3.T);
                    hyc hycVarL2 = e18Var3.l();
                    iqb iqbVarE2 = kxk.E(e18Var3, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, o5bVarD2);
                    d4c.i0(e18Var3, cd4.e, hycVarL2);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE2);
                    ez1.a(null, vf2.H, 0L, e18Var3, 48, 5);
                    e18Var3.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ik4(Object obj, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = i;
    }
}
