package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g46 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ float F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ g46(nwb nwbVar, nwb nwbVar2, mdg mdgVar, md9 md9Var, float f, nwb nwbVar3) {
        this.G = nwbVar;
        this.H = nwbVar2;
        this.I = mdgVar;
        this.J = md9Var;
        this.F = f;
        this.K = nwbVar3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.K;
        Object obj4 = this.J;
        Object obj5 = this.I;
        Object obj6 = this.H;
        Object obj7 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xsc.f((List) obj7, (bz7) obj6, (bz7) obj5, (bz7) obj4, this.F, (iqb) obj3, (ld4) obj, x44.p0(196609));
                break;
            default:
                nwb nwbVar = (nwb) obj7;
                nwb nwbVar2 = (nwb) obj6;
                mdg mdgVar = (mdg) obj5;
                md9 md9Var = (md9) obj4;
                nwb nwbVar3 = (nwb) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 1;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iqb iqbVarK0 = mpk.k0(fqb.E, mpk.o);
                    Object objN = e18Var.N();
                    lz1 lz1Var = jd4.a;
                    if (objN == lz1Var) {
                        objN = new nj2(nwbVar, nwbVar2, i2);
                        e18Var.k0(objN);
                    }
                    iqb iqbVarA = a0h.a(iqbVarK0, ieiVar, (PointerInputEventHandler) objN);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarA);
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
                    Boolean bool = (Boolean) nwbVar2.getValue();
                    bool.getClass();
                    Object objN2 = e18Var.N();
                    if (objN2 == lz1Var) {
                        objN2 = new e69(2);
                        e18Var.k0(objN2);
                    }
                    xn5.G(bool, null, (bz7) objN2, null, "jank-overlay", null, fd9.q0(382632489, new vq3(mdgVar, md9Var, this.F, nwbVar3), e18Var), e18Var, 1597824, 42);
                    e18Var.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ g46(List list, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, float f, iqb iqbVar, int i) {
        this.G = list;
        this.H = bz7Var;
        this.I = bz7Var2;
        this.J = bz7Var3;
        this.F = f;
        this.K = iqbVar;
    }
}
