package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ru implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ta4 F;

    public /* synthetic */ ru(ta4 ta4Var, int i) {
        this.E = i;
        this.F = ta4Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        eo0 eo0Var = ko0.c;
        iei ieiVar = iei.a;
        ta4 ta4Var = this.F;
        switch (i) {
            case 0:
                px9 px9Var = (px9) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                px9Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(px9Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    vo1 vo1Var = lja.T;
                    iqb iqbVarB = px9.b(px9Var);
                    q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var, 48);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarB);
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
                    if (1.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    kxk.g(e18Var, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    ta4Var.invoke(e18Var, 0);
                    if (2.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    kxk.g(e18Var, new hw9(2.0f <= Float.MAX_VALUE ? 2.0f : Float.MAX_VALUE, true));
                    e18Var.p(true);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    ta4Var.invoke(e18Var2, 0);
                }
                break;
            case 2:
                mnc mncVar = (mnc) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(mncVar) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    e18Var3.T();
                } else {
                    j9f j9fVarY = mpk.Y(e18Var3);
                    fqb fqbVar = fqb.E;
                    iqb iqbVarI = gb9.I(mpk.b0(fqbVar, j9fVarY, true), mncVar);
                    q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var3, 0);
                    int iHashCode2 = Long.hashCode(e18Var3.T);
                    hyc hycVarL2 = e18Var3.l();
                    iqb iqbVarE2 = kxk.E(e18Var3, iqbVarI);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, q64VarA2);
                    d4c.i0(e18Var3, cd4.e, hycVarL2);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE2);
                    kxk.g(e18Var3, b.e(fqbVar, 4.0f));
                    ta4Var.invoke(s64.a, e18Var3, 6);
                    grc.z(fqbVar, 16.0f, e18Var3, true);
                }
                break;
            case 3:
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    e18Var4.T();
                } else {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarN = gb9.N(gb9.K(b.c, 16.0f, 12.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode3 = Long.hashCode(e18Var4.T);
                    hyc hycVarL3 = e18Var4.l();
                    iqb iqbVarE3 = kxk.E(e18Var4, iqbVarN);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var3);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, o5bVarD);
                    d4c.i0(e18Var4, cd4.e, hycVarL3);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE3);
                    vb7.y(0, ta4Var, e18Var4, true);
                }
                break;
            case 4:
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e18Var5.T();
                } else {
                    ta4Var.invoke(e18Var5, 0);
                }
                break;
            case 5:
                mnc mncVar2 = (mnc) obj;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                mncVar2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((e18) ld4Var6).f(mncVar2) ? 4 : 2;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    e18Var6.T();
                } else {
                    ta4Var.invoke(mncVar2, e18Var6, Integer.valueOf(iIntValue6 & 14));
                }
                break;
            default:
                mnc mncVar3 = (mnc) obj;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                mncVar3.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var7).f(mncVar3) ? 4 : 2;
                }
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    e18Var7.T();
                } else {
                    ta4Var.invoke(mncVar3, e18Var7, Integer.valueOf(iIntValue7 & 14));
                }
                break;
        }
        return ieiVar;
    }
}
