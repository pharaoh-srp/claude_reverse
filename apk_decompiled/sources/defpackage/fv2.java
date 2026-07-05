package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fv2 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ float G;
    public final /* synthetic */ float H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ fv2(nf6 nf6Var, boolean z, float f, to7 to7Var, float f2, wbj wbjVar, ta4 ta4Var) {
        this.I = nf6Var;
        this.F = z;
        this.G = f;
        this.J = to7Var;
        this.H = f2;
        this.K = wbjVar;
        this.L = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.L;
        Object obj4 = this.K;
        float f = this.H;
        Object obj5 = this.J;
        final float f2 = this.G;
        Object obj6 = this.I;
        fqb fqbVar = fqb.E;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                iqb iqbVar = (iqb) obj6;
                zy7 zy7Var = (zy7) obj5;
                bpc bpcVar = (bpc) obj4;
                String str = (String) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    xo1 xo1Var = lja.K;
                    boolean zC = e18Var.c(f2);
                    Object objN = e18Var.N();
                    if (zC || objN == jd4.a) {
                        objN = new bz7() { // from class: hv2
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj7) {
                                xre xreVar = (xre) obj7;
                                xreVar.getClass();
                                xreVar.b(f2);
                                return iei.a;
                            }
                        };
                        e18Var.k0(objN);
                    }
                    iqb iqbVarI0 = xn5.i0(iqbVar, (bz7) objN);
                    long j = gm3.a(e18Var).q;
                    iqbVarI0.getClass();
                    iqb iqbVarC = b.c(zni.t(androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.b.o(iqbVarI0, 32.0f), 48.0f), new ay1(j, i2)), this.F, null, new vue(0), null, zy7Var, 10);
                    o5b o5bVarD = dw1.d(xo1Var, false);
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
                    cv8.b(bpcVar, str, androidx.compose.foundation.layout.b.o(fqbVar, f), 0L, e18Var, 8, 8);
                    e18Var.p(true);
                }
                break;
            default:
                nf6 nf6Var = (nf6) obj6;
                to7 to7Var = (to7) obj5;
                wbj wbjVar = (wbj) obj4;
                ta4 ta4Var = (ta4) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    boolean z = this.F;
                    iqb iqbVarM = knk.M(xn5.i0(androidx.compose.foundation.layout.b.s(fqbVar, 240.0f, MTTypesetterKt.kLineSkipLimitMultiplier, f2, 10), new xyb(to7Var, f, z, i3)).B(nf6Var != null ? xn5.i0(fqbVar, new yyb(nf6Var, z, i3)) : fqbVar), wbjVar);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    iqb iqbVarE2 = kxk.E(e18Var2, iqbVarM);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var2);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, q64VarA);
                    d4c.i0(e18Var2, cd4.e, hycVarL2);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE2);
                    ta4Var.invoke(s64.a, e18Var2, 6);
                    e18Var2.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ fv2(iqb iqbVar, float f, boolean z, zy7 zy7Var, bpc bpcVar, String str, float f2) {
        this.I = iqbVar;
        this.G = f;
        this.F = z;
        this.J = zy7Var;
        this.K = bpcVar;
        this.L = str;
        this.H = f2;
    }
}
