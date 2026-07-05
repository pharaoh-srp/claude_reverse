package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tu2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ta4 F;

    public /* synthetic */ tu2(ta4 ta4Var, int i) {
        this.E = i;
        this.F = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        ta4 ta4Var = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ta4Var.invoke(e18Var, 0);
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    ta4Var.invoke(e18Var2, 0);
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                e18 e18Var3 = (e18) ld4Var;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    ta4Var.invoke(e18Var3, 0);
                }
                break;
            case 3:
                int iIntValue4 = num.intValue();
                e18 e18Var4 = (e18) ld4Var;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    iqb iqbVarP = b.p(vz8.K(), fqb.E);
                    o5b o5bVarD = dw1.d(lja.K, false);
                    int iHashCode = Long.hashCode(e18Var4.T);
                    hyc hycVarL = e18Var4.l();
                    iqb iqbVarE = kxk.E(e18Var4, iqbVarP);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, o5bVarD);
                    d4c.i0(e18Var4, cd4.e, hycVarL);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE);
                    vb7.y(0, ta4Var, e18Var4, true);
                }
                break;
            case 4:
                num.getClass();
                oq5.f(ta4Var, ld4Var, x44.p0(7));
                break;
            case 5:
                int iIntValue5 = num.intValue();
                e18 e18Var5 = (e18) ld4Var;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    ta4Var.invoke(e18Var5, 0);
                }
                break;
            case 6:
                int iIntValue6 = num.intValue();
                e18 e18Var6 = (e18) ld4Var;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    ta4Var.invoke(e18Var6, 6);
                }
                break;
            case 7:
                num.getClass();
                wad.a(ta4Var, ld4Var, x44.p0(7));
                break;
            default:
                int iIntValue7 = num.intValue();
                e18 e18Var7 = (e18) ld4Var;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    ta4Var.invoke(e18Var7, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ tu2(ta4 ta4Var, int i, int i2) {
        this.E = i2;
        this.F = ta4Var;
    }
}
