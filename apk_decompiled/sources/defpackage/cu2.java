package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cu2 implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ float F;
    public final /* synthetic */ Object G;

    public /* synthetic */ cu2(float f, ta4 ta4Var) {
        this.F = f;
        this.G = ta4Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        Object obj4 = this.G;
        float f = this.F;
        switch (i) {
            case 0:
                final on8 on8Var = (on8) obj4;
                iqb iqbVar = (iqb) obj;
                ((Integer) obj3).getClass();
                iqbVar.getClass();
                e18 e18Var = (e18) ((ld4) obj2);
                e18Var.a0(1868697402);
                final Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (objN == lz1Var) {
                    objN = new Object();
                    e18Var.k0(objN);
                }
                final float fQ0 = ((cz5) e18Var.j(ve4.h)).q0(f);
                boolean zH = e18Var.h(on8Var) | e18Var.h(objN);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new o5(on8Var, 8, objN);
                    e18Var.k0(objN2);
                }
                fd9.e(on8Var, objN, (bz7) objN2, e18Var);
                boolean zH2 = e18Var.h(on8Var) | e18Var.h(objN) | e18Var.c(fQ0);
                Object objN3 = e18Var.N();
                if (zH2 || objN3 == lz1Var) {
                    objN3 = new bz7() { // from class: ju2
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj5) {
                            cu9 cu9Var = (cu9) obj5;
                            cu9Var.getClass();
                            on8 on8Var2 = on8Var;
                            on8Var2.getClass();
                            Object obj6 = objN;
                            obj6.getClass();
                            on8Var2.a.put(obj6, new nn8(cu9Var, fQ0));
                            return iei.a;
                        }
                    };
                    e18Var.k0(objN3);
                }
                iqb iqbVarP0 = xn5.p0(iqbVar, (bz7) objN3);
                e18Var.p(false);
                return iqbVarP0;
            default:
                ta4 ta4Var = (ta4) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var2 = (e18) ld4Var;
                if (e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarG = b.g(fqb.E, f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarG);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, o5bVarD);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    vb7.y(0, ta4Var, e18Var2, true);
                } else {
                    e18Var2.T();
                }
                return iei.a;
        }
    }

    public /* synthetic */ cu2(on8 on8Var, float f) {
        this.G = on8Var;
        this.F = f;
    }
}
