package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.login.MagicLinkIntentData;
import com.anthropic.claude.project.create.CreateTemplateProjectScreenParams;
import com.anthropic.claude.tool.ui.chat.f;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yu implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ yu(int i, Integer num, t3e t3eVar, nwb nwbVar, l45 l45Var, pz7 pz7Var, String str, nwb nwbVar2) {
        this.E = 7;
        this.F = i;
        this.G = num;
        this.H = t3eVar;
        this.I = nwbVar;
        this.J = l45Var;
        this.K = pz7Var;
        this.L = str;
        this.M = nwbVar2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        Object obj3 = this.K;
        int i2 = this.F;
        iei ieiVar = iei.a;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.J;
        Object obj7 = this.I;
        Object obj8 = this.H;
        Object obj9 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                gv.a((lu) obj9, (mnc) obj8, (x0a) obj7, (f77) obj6, (pz7) obj3, (bz7) obj5, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ouk.a((ux0) obj9, (zy7) obj8, (zy7) obj7, (zy7) obj6, (zy7) obj3, (zy7) obj5, (zy7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                yx3.b((String) obj9, (String) obj8, (r1e) obj7, (iwg) obj6, (String) obj5, (pz7) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                cvk.f((pz7) obj3, (zy7) obj9, (CreateTemplateProjectScreenParams) obj8, (iqb) obj4, (y85) obj7, (qi3) obj6, (pl3) obj5, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                nkk.a((MagicLinkIntentData) obj9, (rz7) obj7, (zy7) obj6, (ybg) obj3, (iqb) obj4, (bpa) obj5, (mnc) obj8, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                f.d((String) obj9, (String) obj8, (String) obj7, (List) obj6, (bz7) obj5, (zy7) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 6:
                String str = (String) obj9;
                final List list = (List) obj8;
                final rz7 rz7Var = (rz7) obj7;
                final rz7 rz7Var2 = (rz7) obj6;
                final bz7 bz7Var = (bz7) obj5;
                final zy7 zy7Var = (zy7) obj4;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    fqb fqbVar = fqb.E;
                    iqb iqbVarE = kxk.E(e18Var, fqbVar);
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
                    kxk.g(e18Var, b.e(fqbVar, 16.0f));
                    tjh.b(str, gb9.L(fqbVar, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).f, e18Var, 48, 24960, 110588);
                    kxk.g(e18Var, b.e(fqbVar, 8.0f));
                    boolean zH = e18Var.h(list) | e18Var.f(null) | e18Var.f(rz7Var) | e18Var.f(rz7Var2);
                    final Object obj10 = this.K;
                    boolean zH2 = zH | e18Var.h(obj10) | e18Var.f(bz7Var) | e18Var.f(zy7Var);
                    Object objN = e18Var.N();
                    if (zH2 || objN == lz1Var) {
                        final int i3 = this.F;
                        objN = new bz7() { // from class: uxf
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj11) {
                                j0a j0aVar = (j0a) obj11;
                                j0aVar.getClass();
                                List list2 = list;
                                j0aVar.W(list2.size(), null, new wxf(list2, 0), new ta4(2039820996, true, new xxf(list2, rz7Var, i3, rz7Var2, obj10, bz7Var, zy7Var, list2)));
                                return iei.a;
                            }
                        };
                        e18Var.k0(objN);
                    }
                    knk.h(null, null, null, false, null, null, null, false, null, (bz7) objN, e18Var, 0, 511);
                    e18Var.p(true);
                }
                break;
            default:
                Integer num = (Integer) obj9;
                t3e t3eVar = (t3e) obj8;
                nwb nwbVar = (nwb) obj7;
                l45 l45Var = (l45) obj6;
                pz7 pz7Var = (pz7) obj3;
                String str2 = (String) obj5;
                nwb nwbVar2 = (nwb) obj4;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    int i4 = i2 < 0 ? 0 : i2;
                    boolean zF = e18Var2.f(nwbVar) | e18Var2.h(l45Var) | e18Var2.h(pz7Var) | e18Var2.f(str2) | e18Var2.f(nwbVar2);
                    Object objN2 = e18Var2.N();
                    if (zF || objN2 == lz1Var) {
                        objN2 = new dn(l45Var, nwbVar, pz7Var, str2, nwbVar2);
                        e18Var2.k0(objN2);
                    }
                    ktk.l(i4, num, t3eVar, (zy7) objN2, e18Var2, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ yu(ux0 ux0Var, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, zy7 zy7Var5, zy7 zy7Var6, int i) {
        this.E = 1;
        this.G = ux0Var;
        this.H = zy7Var;
        this.I = zy7Var2;
        this.J = zy7Var3;
        this.K = zy7Var4;
        this.L = zy7Var5;
        this.M = zy7Var6;
        this.F = i;
    }

    public /* synthetic */ yu(pz7 pz7Var, zy7 zy7Var, CreateTemplateProjectScreenParams createTemplateProjectScreenParams, iqb iqbVar, y85 y85Var, qi3 qi3Var, pl3 pl3Var, int i) {
        this.E = 3;
        this.K = pz7Var;
        this.G = zy7Var;
        this.H = createTemplateProjectScreenParams;
        this.M = iqbVar;
        this.I = y85Var;
        this.J = qi3Var;
        this.L = pl3Var;
        this.F = i;
    }

    public /* synthetic */ yu(MagicLinkIntentData magicLinkIntentData, rz7 rz7Var, zy7 zy7Var, ybg ybgVar, iqb iqbVar, bpa bpaVar, mnc mncVar, int i) {
        this.E = 4;
        this.G = magicLinkIntentData;
        this.I = rz7Var;
        this.J = zy7Var;
        this.K = ybgVar;
        this.M = iqbVar;
        this.L = bpaVar;
        this.H = mncVar;
        this.F = i;
    }

    public /* synthetic */ yu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, bz7 bz7Var, Object obj6, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
        this.K = obj5;
        this.L = bz7Var;
        this.M = obj6;
        this.F = i;
    }

    public /* synthetic */ yu(String str, String str2, Object obj, Object obj2, Object obj3, qz7 qz7Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.G = str;
        this.H = str2;
        this.I = obj;
        this.J = obj2;
        this.L = obj3;
        this.K = qz7Var;
        this.M = iqbVar;
        this.F = i;
    }
}
