package defpackage;

import com.anthropic.claude.api.tasks.TaskStepResponse;
import com.anthropic.claude.chat.share.k;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w4d implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ w4d(bz7 bz7Var, iqb iqbVar, cji cjiVar, fji fjiVar, qi3 qi3Var, int i) {
        this.E = 8;
        this.H = bz7Var;
        this.G = iqbVar;
        this.I = cjiVar;
        this.J = fjiVar;
        this.F = qi3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.G;
        Object obj4 = this.J;
        Object obj5 = this.F;
        Object obj6 = this.I;
        Object obj7 = this.H;
        switch (i) {
            case 0:
                iqb iqbVar = (iqb) obj3;
                nwb nwbVar = (nwb) obj7;
                ta4 ta4Var = (ta4) obj6;
                hf1 hf1Var = (hf1) obj4;
                zy7 zy7Var = (zy7) obj5;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    Object objN = e18Var.N();
                    if (objN == jd4.a) {
                        objN = new ol5(24, nwbVar);
                        e18Var.k0(objN);
                    }
                    iqb iqbVarP0 = xn5.p0(iqbVar, (bz7) objN);
                    o5b o5bVarD = dw1.d(lja.G, true);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarP0);
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
                    ta4Var.invoke(e18Var, 0);
                    hf1Var.b(zy7Var, e18Var, 6);
                    e18Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                owj.c((String) obj7, (String) obj6, (cj7) obj4, (zy7) obj5, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                kgd.c((zy7) obj5, (zy7) obj7, (iqb) obj3, (qi3) obj6, (jgd) obj4, (ld4) obj, x44.p0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ulk.c((String) obj7, (String) obj6, (iqb) obj3, (e0g) obj4, (xee) obj5, (ld4) obj, x44.p0(385));
                break;
            case 4:
                ((Integer) obj2).getClass();
                msk.c((pz7) obj3, (sz7) obj7, (pz7) obj4, (sz7) obj5, (ta4) obj6, (ld4) obj, x44.p0(27697));
                break;
            case 5:
                ((Integer) obj2).getClass();
                k.a((String) obj7, (pz7) obj6, (iqb) obj3, (w1g) obj4, (zy7) obj5, (ld4) obj, x44.p0(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                puj.c((y4g) obj7, (iqb) obj3, (z3g) obj4, (pz7) obj5, (ta4) obj6, (ld4) obj, x44.p0(27649));
                break;
            case 7:
                ((Integer) obj2).getClass();
                w8h.c((String) obj7, (TaskStepResponse) obj6, (iqb) obj3, (qnc) obj4, (e9h) obj5, (ld4) obj, x44.p0(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                oe5.f((bz7) obj7, (iqb) obj3, (cji) obj6, (fji) obj4, (qi3) obj5, (ld4) obj, x44.p0(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                wvj.a((List) obj7, (List) obj6, (pz7) obj4, (zy7) obj5, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                qik.m((String) obj7, (List) obj6, (bz7) obj4, (zy7) obj5, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                akk.c((String) obj7, (String) obj6, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ w4d(zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, qi3 qi3Var, jgd jgdVar, int i) {
        this.E = 2;
        this.F = zy7Var;
        this.H = zy7Var2;
        this.G = iqbVar;
        this.I = qi3Var;
        this.J = jgdVar;
    }

    public /* synthetic */ w4d(pz7 pz7Var, sz7 sz7Var, pz7 pz7Var2, sz7 sz7Var2, ta4 ta4Var, int i) {
        this.E = 4;
        this.G = pz7Var;
        this.H = sz7Var;
        this.J = pz7Var2;
        this.F = sz7Var2;
        this.I = ta4Var;
    }

    public /* synthetic */ w4d(iqb iqbVar, nwb nwbVar, ta4 ta4Var, hf1 hf1Var, zy7 zy7Var) {
        this.E = 0;
        this.G = iqbVar;
        this.H = nwbVar;
        this.I = ta4Var;
        this.J = hf1Var;
        this.F = zy7Var;
    }

    public /* synthetic */ w4d(y4g y4gVar, iqb iqbVar, z3g z3gVar, pz7 pz7Var, ta4 ta4Var, int i) {
        this.E = 6;
        this.H = y4gVar;
        this.G = iqbVar;
        this.J = z3gVar;
        this.F = pz7Var;
        this.I = ta4Var;
    }

    public /* synthetic */ w4d(Object obj, Object obj2, Object obj3, zy7 zy7Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.F = zy7Var;
        this.G = iqbVar;
    }

    public /* synthetic */ w4d(String str, Object obj, iqb iqbVar, Object obj2, Object obj3, int i, int i2) {
        this.E = i2;
        this.H = str;
        this.I = obj;
        this.G = iqbVar;
        this.J = obj2;
        this.F = obj3;
    }

    public /* synthetic */ w4d(String str, String str2, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, int i) {
        this.E = 11;
        this.H = str;
        this.I = str2;
        this.F = zy7Var;
        this.J = zy7Var2;
        this.G = iqbVar;
    }
}
