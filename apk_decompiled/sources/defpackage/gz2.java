package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.api.chat.tool.TopSourceDomain;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gz2 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ float F;
    public final /* synthetic */ Object G;

    public /* synthetic */ gz2(float f, pz7 pz7Var) {
        this.E = 1;
        this.F = f;
        this.G = pz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        fo0 fo0Var = ko0.a;
        fqb fqbVar = fqb.E;
        float f = this.F;
        iei ieiVar = iei.a;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                pz7 pz7Var = (pz7) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    cxe cxeVarA = axe.a(fo0Var, lja.P, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, cxeVarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    if (pz7Var == null) {
                        e18Var.a0(989076388);
                    } else {
                        e18Var.a0(-937925635);
                        pz7Var.invoke(e18Var, 0);
                    }
                    e18Var.p(false);
                    vb7.A(fqbVar, f, e18Var, true);
                }
                break;
            case 1:
                pz7 pz7Var2 = (pz7) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    cxe cxeVarA2 = axe.a(fo0Var, lja.P, e18Var2, 0);
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    iqb iqbVarE2 = kxk.E(e18Var2, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var2);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, cxeVarA2);
                    d4c.i0(e18Var2, cd4.e, hycVarL2);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE2);
                    kxk.g(e18Var2, b.t(fqbVar, f));
                    if (pz7Var2 == null) {
                        e18Var2.a0(135373421);
                    } else {
                        e18Var2.a0(-549822444);
                        pz7Var2.invoke(e18Var2, 0);
                    }
                    e18Var2.p(false);
                    e18Var2.p(true);
                }
                break;
            default:
                TopSourceDomain topSourceDomain = (TopSourceDomain) obj4;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    xke.e(topSourceDomain.getName(), topSourceDomain.getIcon_url(), topSourceDomain.getCount(), this.F, e18Var3, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ gz2(Object obj, float f, int i) {
        this.E = i;
        this.G = obj;
        this.F = f;
    }
}
