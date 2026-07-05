package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j96 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ float F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Object H;

    public /* synthetic */ j96(float f, int i, long j, iqb iqbVar) {
        this.H = iqbVar;
        this.F = f;
        this.G = j;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(7);
                iuj.h(this.F, iP0, this.G, (ld4) obj, (iqb) obj3);
                break;
            default:
                ta4 ta4Var = (ta4) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iqb iqbVarI = gb9.I(b.s(fqb.E, 40.0f, 24.0f, this.F, 8), e2i.a);
                    o5b o5bVarD = dw1.d(lja.G, false);
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
                    j8.d(new hvd[]{sq6.m(this.G, on4.a), tjh.a.a(bci.a(yuj.g, e18Var))}, ta4Var, e18Var, 8);
                    e18Var.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ j96(float f, long j, ta4 ta4Var) {
        this.F = f;
        this.G = j;
        this.H = ta4Var;
    }
}
