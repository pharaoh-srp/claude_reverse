package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wvg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ wvg(i4d i4dVar, boolean z, zy7 zy7Var) {
        this.E = 0;
        this.H = i4dVar;
        this.F = z;
        this.G = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.E;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        Object obj3 = this.H;
        Object obj4 = this.G;
        boolean z2 = this.F;
        switch (i) {
            case 0:
                i4d i4dVar = (i4d) obj3;
                zy7 zy7Var = (zy7) obj4;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean z3 = (i4dVar == i4d.E || z2) ? false : true;
                    wlg wlgVarB = n80.b(z3 ? 1.0f : 0.0f, null, "ContinueFreeAlpha", e18Var, 3072, 22);
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    boolean zF = e18Var.f(wlgVarB);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new ek1(wlgVarB, 5);
                        e18Var.k0(objN);
                    }
                    iqb iqbVarI0 = xn5.i0(iqbVarC, (bz7) objN);
                    boolean zG = e18Var.g(z3);
                    Object objN2 = e18Var.N();
                    if (zG || objN2 == lz1Var) {
                        z = false;
                        objN2 = new xvg(z3, 0);
                        e18Var.k0(objN2);
                    } else {
                        z = false;
                    }
                    lnk.d(zy7Var, tjf.b(iqbVarI0, z, (bz7) objN2), z3, null, null, null, null, nuk.a, e18Var, 805306368, 504);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                p5h.a((u7h) obj3, z2, (zy7) obj4, (ld4) obj, x44.p0(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                p5h.c((List) obj3, z2, (zy7) obj4, (ld4) obj, x44.p0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                wjk.f((htc) obj3, z2, (iqb) obj4, (ld4) obj, x44.p0(1));
                break;
            default:
                zy7 zy7Var2 = (zy7) obj4;
                dhg dhgVar = (dhg) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    xo1 xo1Var = lja.K;
                    FillElement fillElement = b.c;
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, fillElement);
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
                    iqb iqbVarN = sf5.N(fillElement, MTTypesetterKt.kLineSkipLimitMultiplier, 44.0f, 1);
                    boolean zF2 = e18Var2.f(zy7Var2);
                    Object objN3 = e18Var2.N();
                    if (zF2 || objN3 == lz1Var) {
                        objN3 = new kw0(19, zy7Var2);
                        e18Var2.k0(objN3);
                    }
                    vjk.c(0, e18Var2, xn5.i0(iqbVarN, (bz7) objN3), z2);
                    tjh.b(dhgVar.b, gb9.L(fqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).e, e18Var2, 48, 24960, 110584);
                    e18Var2.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ wvg(Object obj, boolean z, Object obj2, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = z;
        this.G = obj2;
    }

    public /* synthetic */ wvg(boolean z, zy7 zy7Var, dhg dhgVar) {
        this.E = 4;
        this.F = z;
        this.G = zy7Var;
        this.H = dhgVar;
    }
}
