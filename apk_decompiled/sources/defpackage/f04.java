package defpackage;

import android.content.Context;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.code.remote.stores.b;
import java.time.Instant;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f04 implements bz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ f04(q62 q62Var, o72 o72Var, u72 u72Var, wl5 wl5Var, xl5 xl5Var, am5 am5Var, ps7 ps7Var, zy7 zy7Var, bz7 bz7Var, b79 b79Var, x0a x0aVar, Long l) {
        this.G = b79Var;
        this.H = o72Var;
        this.I = u72Var;
        this.F = bz7Var;
        this.J = q62Var;
        this.K = l;
        this.L = am5Var;
        this.M = xl5Var;
        this.N = wl5Var;
        this.O = x0aVar;
        this.P = ps7Var;
        this.Q = zy7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.P;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.K;
        Object obj7 = this.F;
        Object obj8 = this.J;
        Object obj9 = this.L;
        Object obj10 = this.I;
        Object obj11 = this.Q;
        Object obj12 = this.H;
        Object obj13 = this.G;
        final int i2 = 1;
        switch (i) {
            case 0:
                pz7 pz7Var = (pz7) obj13;
                final c cVar = (c) obj12;
                vsf vsfVar = (vsf) obj10;
                oz3 oz3Var = (oz3) obj8;
                bz7 bz7Var = (bz7) obj7;
                Context context = (Context) obj6;
                l45 l45Var = (l45) obj9;
                op3 op3Var = (op3) obj5;
                String str = (String) obj4;
                nwb nwbVar = (nwb) obj3;
                nwb nwbVar2 = (nwb) obj2;
                ybg ybgVar = (ybg) obj11;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                if (pz7Var != null) {
                    j0aVar.U("scope-header", "scope-header", new ta4(-1491743548, true, new ck1(3, pz7Var)));
                }
                if (!x44.r(cVar.q, CodeSessionListScope.Scheduled.INSTANCE)) {
                    final int i3 = 0;
                    j0aVar.U("filter-bar", "filter-bar", new ta4(-820078407, true, new rz7() { // from class: h04
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj14, Object obj15, Object obj16) {
                            int i4 = i3;
                            iei ieiVar2 = iei.a;
                            lz1 lz1Var = jd4.a;
                            switch (i4) {
                                case 0:
                                    ld4 ld4Var = (ld4) obj15;
                                    int iIntValue = ((Integer) obj16).intValue();
                                    ((px9) obj14).getClass();
                                    e18 e18Var = (e18) ld4Var;
                                    if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        e18Var.T();
                                    } else {
                                        c cVar2 = cVar;
                                        srf srfVar = (srf) cVar2.B.getValue();
                                        Map map = (Map) cVar2.H.getValue();
                                        boolean zF = e18Var.f(cVar2);
                                        Object objN = e18Var.N();
                                        if (zF || objN == lz1Var) {
                                            objN = new a04(cVar2, 1);
                                            e18Var.k0(objN);
                                        }
                                        e.f(srfVar, map, (bz7) objN, null, e18Var, 0);
                                    }
                                    break;
                                default:
                                    ld4 ld4Var2 = (ld4) obj15;
                                    int iIntValue2 = ((Integer) obj16).intValue();
                                    ((px9) obj14).getClass();
                                    e18 e18Var2 = (e18) ld4Var2;
                                    if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        e18Var2.T();
                                    } else {
                                        c cVar3 = cVar;
                                        boolean zF2 = e18Var2.f(cVar3);
                                        Object objN2 = e18Var2.N();
                                        if (zF2 || objN2 == lz1Var) {
                                            ls0 ls0Var = new ls0(0, cVar3, c.class, "loadMoreSessions", "loadMoreSessions(Z)V", 0, 3);
                                            e18Var2.k0(ls0Var);
                                            objN2 = ls0Var;
                                        }
                                        e.d(6, 4, e18Var2, (zy7) objN2, null, true);
                                    }
                                    break;
                            }
                            return ieiVar2;
                        }
                    }));
                }
                if (vsfVar != null || ((Boolean) oz3Var.g.getValue()).booleanValue()) {
                    j0aVar.U("session-list-banner", "session-list-banner", new ta4(-511970640, true, new ii(vsfVar, 16, oz3Var)));
                }
                for (cpc cpcVar : (List) cVar.I.getValue()) {
                    n6e n6eVar = (n6e) cpcVar.E;
                    List list = (List) cpcVar.F;
                    j0aVar.U(ij0.i("header-", n6eVar.name()), "header", new ta4(-75948907, true, new hp(n6eVar, 1)));
                    j0aVar.W(list.size(), new z04(new i04(0), 0, list), new z04(new i04(1), 1, list), new ta4(802480018, true, new a14(list, cVar, bz7Var, context, l45Var, op3Var, str, nwbVar, nwbVar2, ybgVar)));
                }
                if (cVar.a0().c) {
                    j0aVar.U("pagination-retry", "pagination-retry", new ta4(376993073, true, new rz7() { // from class: h04
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj14, Object obj15, Object obj16) {
                            int i4 = i2;
                            iei ieiVar2 = iei.a;
                            lz1 lz1Var = jd4.a;
                            switch (i4) {
                                case 0:
                                    ld4 ld4Var = (ld4) obj15;
                                    int iIntValue = ((Integer) obj16).intValue();
                                    ((px9) obj14).getClass();
                                    e18 e18Var = (e18) ld4Var;
                                    if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        e18Var.T();
                                    } else {
                                        c cVar2 = cVar;
                                        srf srfVar = (srf) cVar2.B.getValue();
                                        Map map = (Map) cVar2.H.getValue();
                                        boolean zF = e18Var.f(cVar2);
                                        Object objN = e18Var.N();
                                        if (zF || objN == lz1Var) {
                                            objN = new a04(cVar2, 1);
                                            e18Var.k0(objN);
                                        }
                                        e.f(srfVar, map, (bz7) objN, null, e18Var, 0);
                                    }
                                    break;
                                default:
                                    ld4 ld4Var2 = (ld4) obj15;
                                    int iIntValue2 = ((Integer) obj16).intValue();
                                    ((px9) obj14).getClass();
                                    e18 e18Var2 = (e18) ld4Var2;
                                    if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        e18Var2.T();
                                    } else {
                                        c cVar3 = cVar;
                                        boolean zF2 = e18Var2.f(cVar3);
                                        Object objN2 = e18Var2.N();
                                        if (zF2 || objN2 == lz1Var) {
                                            ls0 ls0Var = new ls0(0, cVar3, c.class, "loadMoreSessions", "loadMoreSessions(Z)V", 0, 3);
                                            e18Var2.k0(ls0Var);
                                            objN2 = ls0Var;
                                        }
                                        e.d(6, 4, e18Var2, (zy7) objN2, null, true);
                                    }
                                    break;
                            }
                            return ieiVar2;
                        }
                    }));
                } else if (cVar.a0().b) {
                    j0aVar.U("pagination-loading", "pagination-loading", yhk.b);
                }
                break;
            case 1:
                b79 b79Var = (b79) obj13;
                final o72 o72Var = (o72) obj12;
                final u72 u72Var = (u72) obj10;
                final bz7 bz7Var2 = (bz7) obj7;
                final q62 q62Var = (q62) obj8;
                final Long l = (Long) obj6;
                final am5 am5Var = (am5) obj9;
                final xl5 xl5Var = (xl5) obj5;
                final wl5 wl5Var = (wl5) obj4;
                final x0a x0aVar = (x0a) obj3;
                final ps7 ps7Var = (ps7) obj2;
                final zy7 zy7Var = (zy7) obj11;
                j0a.X((j0a) obj, ((b79Var.F - b79Var.E) + 1) * 12, null, new ta4(-600599685, true, new sz7() { // from class: fm5
                    @Override // defpackage.sz7
                    public final Object i(Object obj14, Object obj15, Object obj16, Object obj17) {
                        int i4;
                        px9 px9Var = (px9) obj14;
                        int iIntValue = ((Integer) obj15).intValue();
                        ld4 ld4Var = (ld4) obj16;
                        int iIntValue2 = ((Integer) obj17).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i4 = (((e18) ld4Var).f(px9Var) ? 4 : 2) | iIntValue2;
                        } else {
                            i4 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i4 |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
                        }
                        e18 e18Var = (e18) ld4Var;
                        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
                            o72 o72Var2 = o72Var;
                            o72Var2.getClass();
                            u72 u72VarC = u72Var;
                            if (iIntValue > 0) {
                                u72VarC = o72Var2.c(Instant.ofEpochMilli(u72VarC.e).atZone(o72.e).toLocalDate().plusMonths(iIntValue));
                            }
                            u72 u72Var2 = u72VarC;
                            iqb iqbVarC = px9.c(px9Var);
                            o5b o5bVarD = dw1.d(lja.G, false);
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
                            cn5.i(u72Var2, bz7Var2, q62Var.H, l, am5Var, xl5Var, wl5Var, o72Var2.a, x0aVar, ps7Var, zy7Var, e18Var, 221184);
                            e18Var.p(true);
                        } else {
                            e18Var.T();
                        }
                        return iei.a;
                    }
                }), 6);
                break;
            default:
                koi koiVar = (koi) obj13;
                q7 q7Var = (q7) obj12;
                ybg ybgVar2 = (ybg) obj11;
                fk0 fk0Var = (fk0) obj10;
                l45 l45Var2 = (l45) obj9;
                rwe rweVar = (rwe) obj8;
                ze0 ze0Var = (ze0) obj7;
                um1 um1Var = (um1) obj6;
                a aVar = (a) obj5;
                b bVar = (b) obj4;
                zy7 zy7Var2 = (zy7) obj3;
                b4e b4eVar = (b4e) obj2;
                haa haaVar = (haa) obj;
                haaVar.getClass();
                com.anthropic.claude.settings.internal.e.h(haaVar, "Account & Organization", (koiVar == null || q7Var == null) ? false : true, new ta4(427627121, true, new nw7(koiVar, 6, ybgVar2)));
                com.anthropic.claude.settings.internal.e.i(haaVar, "Network", new ta4(2082209192, true, new bn(fk0Var, l45Var2, rweVar, ybgVar2, 28)), 2);
                com.anthropic.claude.settings.internal.e.i(haaVar, null, new ta4(1604245993, true, new nw7(rweVar, 7, ze0Var)), 3);
                com.anthropic.claude.settings.internal.e.i(haaVar, "Feature Flags", new ta4(1126282794, true, new x99(rweVar, fk0Var)), 2);
                com.anthropic.claude.settings.internal.e.h(haaVar, "Notices & Experiences", (koiVar == null || q7Var == null) ? false : true, new ta4(648319595, true, new xe(ybgVar2, fk0Var, um1Var, aVar, bVar, 19)));
                com.anthropic.claude.settings.internal.e.i(haaVar, "Other", new ta4(170356396, true, new x99(fk0Var, rweVar, zy7Var2)), 2);
                com.anthropic.claude.settings.internal.e.i(haaVar, "Performance", new ta4(-307606803, true, new s99(fk0Var, 0)), 2);
                com.anthropic.claude.settings.internal.e.i(haaVar, "App Updates", new ta4(-785570002, true, new bn(fk0Var, b4eVar, l45Var2, ybgVar2, 26)), 2);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ f04(pz7 pz7Var, c cVar, vsf vsfVar, oz3 oz3Var, bz7 bz7Var, Context context, l45 l45Var, op3 op3Var, String str, nwb nwbVar, nwb nwbVar2, ybg ybgVar) {
        this.G = pz7Var;
        this.H = cVar;
        this.I = vsfVar;
        this.J = oz3Var;
        this.F = bz7Var;
        this.K = context;
        this.L = l45Var;
        this.M = op3Var;
        this.N = str;
        this.O = nwbVar;
        this.P = nwbVar2;
        this.Q = ybgVar;
    }

    public /* synthetic */ f04(koi koiVar, q7 q7Var, ybg ybgVar, fk0 fk0Var, l45 l45Var, rwe rweVar, ze0 ze0Var, um1 um1Var, a aVar, b bVar, zy7 zy7Var, b4e b4eVar) {
        this.G = koiVar;
        this.H = q7Var;
        this.Q = ybgVar;
        this.I = fk0Var;
        this.L = l45Var;
        this.J = rweVar;
        this.F = ze0Var;
        this.K = um1Var;
        this.M = aVar;
        this.N = bVar;
        this.O = zy7Var;
        this.P = b4eVar;
    }
}
