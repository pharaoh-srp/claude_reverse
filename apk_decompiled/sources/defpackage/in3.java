package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class in3 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ float F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ qz7 H;

    public /* synthetic */ in3(String str, zy7 zy7Var, float f) {
        this.E = 1;
        this.G = str;
        this.H = zy7Var;
        this.F = f;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        qz7 qz7Var = this.H;
        float f = this.F;
        Object obj4 = this.G;
        int i2 = 1;
        switch (i) {
            case 0:
                mxd mxdVar = (mxd) obj4;
                ta4 ta4Var = (ta4) qz7Var;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    FillElement fillElement = b.c;
                    boolean zF = e18Var.f(mxdVar) | e18Var.c(f);
                    Object objN = e18Var.N();
                    if (zF || objN == jd4.a) {
                        objN = new cv1(mxdVar, f, i2);
                        e18Var.k0(objN);
                    }
                    iqb iqbVarI0 = xn5.i0(fillElement, (bz7) objN);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarI0);
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
                    ta4Var.invoke(nw1.a, e18Var, 6);
                    e18Var.p(true);
                }
                break;
            case 1:
                String str = (String) obj4;
                zy7 zy7Var = (zy7) qz7Var;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    fqb fqbVar = fqb.E;
                    nik.d(0, e18Var2, zy7Var, gb9.L(b.c(fqbVar, 1.0f), f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), str);
                    kxk.g(e18Var2, b.e(fqbVar, 12.0f));
                }
                break;
            default:
                iqb iqbVar = (iqb) obj4;
                ta4 ta4Var2 = (ta4) qz7Var;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarO = b.o(iqbVar, f);
                    o5b o5bVarD2 = dw1.d(xo1Var, false);
                    int iHashCode2 = Long.hashCode(e18Var3.T);
                    hyc hycVarL2 = e18Var3.l();
                    iqb iqbVarE2 = kxk.E(e18Var3, iqbVarO);
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
                    vb7.y(0, ta4Var2, e18Var3, true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ in3(Object obj, float f, ta4 ta4Var, int i) {
        this.E = i;
        this.G = obj;
        this.F = f;
        this.H = ta4Var;
    }
}
