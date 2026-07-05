package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w20 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ w20(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        final String content;
        int i = this.E;
        int i2 = 27;
        int i3 = 4;
        int i4 = 2;
        Object[] objArr = 0;
        iei ieiVar = iei.a;
        final int i5 = 1;
        Object obj2 = this.J;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        Object obj6 = this.F;
        switch (i) {
            case 0:
                n2a n2aVar = (n2a) obj;
                e2a e2aVar = ((y20) obj5).a;
                n2aVar.L = (cjh) obj6;
                n2aVar.M = (xy8) obj4;
                n2aVar.G = (f2d) obj3;
                n2aVar.H = (bz7) obj2;
                n2aVar.I = e2aVar != null ? e2aVar.T : null;
                n2aVar.J = e2aVar != null ? e2aVar.U : null;
                n2aVar.K = e2aVar != null ? (ovi) yb5.o(e2aVar, ve4.u) : null;
                break;
            case 1:
                ((t4f) obj).getClass();
                gb9.D((l45) obj6, null, null, new cm((xq0) obj5, (t4f) obj4, (zy7) obj3, (nwb) obj2, null, 7), 3);
                break;
            case 2:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.l(ekfVar, (String) obj6);
                ckf.n(ekfVar, x44.X(new qd5(new kl1(4, (zy7) obj3), (String) obj5), new qd5(new kl1(5, (zy7) obj2), (String) obj4)));
                break;
            case 3:
                hi4 hi4Var = (hi4) obj5;
                Context context = (Context) obj4;
                pz7 pz7Var = (pz7) obj3;
                nwb nwbVar = (nwb) obj2;
                ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem = (ConwaySuggestConnectorsOutputConnectorsItem) obj;
                conwaySuggestConnectorsOutputConnectorsItem.getClass();
                nwbVar.setValue(conwaySuggestConnectorsOutputConnectorsItem);
                McpServer mcpServerB = e05.b(((koi) obj6).q, conwaySuggestConnectorsOutputConnectorsItem);
                String url = conwaySuggestConnectorsOutputConnectorsItem.getUrl();
                boolean zR = x44.r(conwaySuggestConnectorsOutputConnectorsItem.isAuthless(), Boolean.TRUE);
                vi4 vi4Var = new vi4(27, nwbVar);
                si4 si4Var = si4.Conway;
                if (mcpServerB != null) {
                    hi4.c(hi4Var, new bi4(mcpServerB.m346getUuidowoRr7k()), context, si4Var, zR, pz7Var, null, vi4Var, 32);
                } else if (url == null) {
                    vi4Var.a();
                } else {
                    hi4.a(hi4Var, conwaySuggestConnectorsOutputConnectorsItem.getName(), url, context, si4Var, zR, pz7Var, vi4Var, 64);
                }
                break;
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                ((nwb) obj5).setValue(Boolean.valueOf(!((Boolean) r13.getValue()).booleanValue()));
                gb9.D((l45) obj6, null, null, new x43((x0a) obj4, iIntValue, (b79) obj3, (u72) obj2, (tp4) null), 3);
                break;
            case 5:
                m4a m4aVar = (m4a) obj6;
                vza vzaVar = (vza) obj5;
                ((w86) obj).getClass();
                pm3 pm3Var = new pm3(vzaVar, (nwb) obj4, i4);
                m4aVar.a().a(pm3Var);
                break;
            case 6:
                haa haaVar = (haa) obj;
                haaVar.getClass();
                haa.a(haaVar, !r0.isEmpty(), new ta4(-81644001, true, new mn((List) obj6, (String) obj5, (bz7) obj2, (zy7) obj4, (qnc) obj3)), 2);
                break;
            case 7:
                isb isbVar = (isb) obj6;
                dae daeVar = (dae) obj5;
                aae aaeVar = (aae) obj4;
                raf rafVar = (raf) obj3;
                z9e z9eVar = (z9e) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                esb esbVarJ = isb.j(isbVar.g);
                if (esbVarJ != null) {
                    i49 i49Var = isbVar.e;
                    long j = esbVarJ.b;
                    long j2 = esbVarJ.a;
                    ((ssi) i49Var.F).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((ssi) i49Var.G).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    esb esbVarA = ((esb) daeVar.E).a(esbVarJ);
                    daeVar.E = esbVarA;
                    aaeVar.E = rafVar.i(rafVar.e(esbVarA.a));
                    z9eVar.E = !zsk.f(r0 - fFloatValue);
                }
                break;
            case 8:
                haa haaVar2 = (haa) obj;
                haaVar2.getClass();
                haa.a(haaVar2, false, new ta4(920448675, true, new mn((b1i) obj6, (ole) obj5, (c9c) obj4, (pz7) obj3, (i8c) obj2, 4)), 3);
                break;
            case 9:
                List list = (List) obj6;
                bz7 bz7Var = (bz7) obj2;
                bz7 bz7Var2 = (bz7) obj4;
                bz7 bz7Var3 = (bz7) obj3;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                j0a.V(j0aVar, "add", null, new ta4(628058880, true, new tu(20, (zy7) obj5)), 2);
                if (list.isEmpty()) {
                    j0a.V(j0aVar, "select_repo_hint", null, new ta4(-1490561211, true, new ic4(27)), 2);
                }
                j0aVar.W(list.size(), new zkd(new oua(i2), i3, list), new tq(list, 28), new ta4(2039820996, true, new cw(list, bz7Var, bz7Var2, bz7Var3, list, 3)));
                break;
            case 10:
                izf izfVar = (izf) obj6;
                rwe rweVar = (rwe) obj5;
                zy7 zy7Var = (zy7) obj4;
                zy7 zy7Var2 = (zy7) obj3;
                nwb nwbVar2 = (nwb) obj2;
                haa haaVar3 = (haa) obj;
                haaVar3.getClass();
                haa.a(haaVar3, false, new ta4(-289546878, true, new jzf(rweVar, izfVar)), 3);
                if (((Boolean) izfVar.y.getValue()).booleanValue() || ((Boolean) izfVar.z.getValue()).booleanValue() || ((((Boolean) izfVar.m.j.getValue()).booleanValue() && izfVar.A.getValue() != null) || izfVar.d.j())) {
                    haa.a(haaVar3, false, new ta4(1226568093, true, new jzf(izfVar, rweVar, i5)), 3);
                }
                haa.a(haaVar3, false, new ta4(-1692432775, true, new xu(izfVar, 10, zy7Var)), 3);
                haa.a(haaVar3, false, new ta4(-1164192326, true, new jzf(izfVar, rweVar, i4)), 3);
                haa.a(haaVar3, false, new ta4(-635951877, true, new kw(izfVar, rweVar, zy7Var2, nwbVar2, 12)), 3);
                break;
            default:
                rvh rvhVar = (rvh) obj6;
                ArrayList arrayList = (ArrayList) obj5;
                final z74 z74Var = (z74) obj4;
                i iVar = (i) obj3;
                bz7 bz7Var4 = (bz7) obj2;
                j0a j0aVar2 = (j0a) obj;
                j0aVar2.getClass();
                Object obj7 = rvhVar.d.get("prompt");
                JsonPrimitive jsonPrimitive = obj7 instanceof JsonPrimitive ? (JsonPrimitive) obj7 : null;
                if (jsonPrimitive != null && (content = jsonPrimitive.getContent()) != null) {
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    j0a.V(j0aVar2, null, null, new ta4(-1989511249, true, new rz7() { // from class: uvh
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj8, Object obj9, Object obj10) {
                            Object hreVar;
                            Object hreVar2;
                            int i6 = objArr2;
                            iei ieiVar2 = iei.a;
                            lz1 lz1Var = jd4.a;
                            fqb fqbVar = fqb.E;
                            z74 z74Var2 = z74Var;
                            switch (i6) {
                                case 0:
                                    px9 px9Var = (px9) obj8;
                                    ld4 ld4Var = (ld4) obj9;
                                    int iIntValue2 = ((Integer) obj10).intValue();
                                    px9Var.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= ((e18) ld4Var).f(px9Var) ? 4 : 2;
                                    }
                                    e18 e18Var = (e18) ld4Var;
                                    if (!e18Var.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        e18Var.T();
                                    } else {
                                        tjh.b(d4c.j0(R.string.ccr_tool_prompt, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131066);
                                        kxk.g(e18Var, b.e(fqbVar, 4.0f));
                                        String str = content;
                                        boolean zF = e18Var.f(str);
                                        Object objN = e18Var.N();
                                        if (zF || objN == lz1Var) {
                                            try {
                                                hreVar = z74Var2.a(str);
                                            } catch (Throwable th) {
                                                hreVar = new hre(th);
                                            }
                                            if (hreVar instanceof hre) {
                                                hreVar = null;
                                            }
                                            objN = (jz0) hreVar;
                                            e18Var.k0(objN);
                                        }
                                        jz0 jz0Var = (jz0) objN;
                                        if (jz0Var != null) {
                                            e18Var.a0(1019545258);
                                            xvk.c(null, fd9.q0(-1809705807, new l4d(jz0Var, 3), e18Var), e18Var, 48, 1);
                                            e18Var.p(false);
                                        } else {
                                            e18Var.a0(1019710798);
                                            tjh.b(str, null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var).e.F).f, e18Var, 0, 0, 131066);
                                            e18Var.p(false);
                                        }
                                        kxk.g(e18Var, b.e(fqbVar, 16.0f));
                                    }
                                    break;
                                default:
                                    px9 px9Var2 = (px9) obj8;
                                    ld4 ld4Var2 = (ld4) obj9;
                                    int iIntValue3 = ((Integer) obj10).intValue();
                                    px9Var2.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= ((e18) ld4Var2).f(px9Var2) ? 4 : 2;
                                    }
                                    e18 e18Var2 = (e18) ld4Var2;
                                    if (!e18Var2.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        e18Var2.T();
                                    } else {
                                        tjh.b(gid.p(16.0f, R.string.ccr_tool_result, e18Var2, e18Var2, fqbVar), null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, 0, 0, 131066);
                                        kxk.g(e18Var2, b.e(fqbVar, 4.0f));
                                        String str2 = content;
                                        boolean zF2 = e18Var2.f(str2);
                                        Object objN2 = e18Var2.N();
                                        if (zF2 || objN2 == lz1Var) {
                                            try {
                                                hreVar2 = z74Var2.a(str2);
                                            } catch (Throwable th2) {
                                                hreVar2 = new hre(th2);
                                            }
                                            if (hreVar2 instanceof hre) {
                                                hreVar2 = null;
                                            }
                                            objN2 = (jz0) hreVar2;
                                            e18Var2.k0(objN2);
                                        }
                                        jz0 jz0Var2 = (jz0) objN2;
                                        if (jz0Var2 == null) {
                                            e18Var2.a0(-1225789577);
                                            tjh.b(str2, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).f, e18Var2, 0, 0, 131066);
                                            e18Var2.p(false);
                                        } else {
                                            e18Var2.a0(-1225955117);
                                            xvk.c(null, fd9.q0(-1273496728, new l4d(jz0Var2, 2), e18Var2), e18Var2, 48, 1);
                                            e18Var2.p(false);
                                        }
                                    }
                                    break;
                            }
                            return ieiVar2;
                        }
                    }), 3);
                }
                if (!arrayList.isEmpty()) {
                    j0a.V(j0aVar2, null, null, new ta4(-554154454, true, new wke(i5, arrayList)), 3);
                    j0a.X(j0aVar2, arrayList.size(), new bc0(3, arrayList), new ta4(-1596111053, true, new wd((Object) arrayList, (Object) iVar, bz7Var4, 14)), 4);
                }
                final String strE = bwh.e(rvhVar.g);
                if (strE != null) {
                    j0a.V(j0aVar2, null, null, new ta4(2027132646, true, new rz7() { // from class: uvh
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj8, Object obj9, Object obj10) {
                            Object hreVar;
                            Object hreVar2;
                            int i6 = i5;
                            iei ieiVar2 = iei.a;
                            lz1 lz1Var = jd4.a;
                            fqb fqbVar = fqb.E;
                            z74 z74Var2 = z74Var;
                            switch (i6) {
                                case 0:
                                    px9 px9Var = (px9) obj8;
                                    ld4 ld4Var = (ld4) obj9;
                                    int iIntValue2 = ((Integer) obj10).intValue();
                                    px9Var.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= ((e18) ld4Var).f(px9Var) ? 4 : 2;
                                    }
                                    e18 e18Var = (e18) ld4Var;
                                    if (!e18Var.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        e18Var.T();
                                    } else {
                                        tjh.b(d4c.j0(R.string.ccr_tool_prompt, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131066);
                                        kxk.g(e18Var, b.e(fqbVar, 4.0f));
                                        String str = strE;
                                        boolean zF = e18Var.f(str);
                                        Object objN = e18Var.N();
                                        if (zF || objN == lz1Var) {
                                            try {
                                                hreVar = z74Var2.a(str);
                                            } catch (Throwable th) {
                                                hreVar = new hre(th);
                                            }
                                            if (hreVar instanceof hre) {
                                                hreVar = null;
                                            }
                                            objN = (jz0) hreVar;
                                            e18Var.k0(objN);
                                        }
                                        jz0 jz0Var = (jz0) objN;
                                        if (jz0Var != null) {
                                            e18Var.a0(1019545258);
                                            xvk.c(null, fd9.q0(-1809705807, new l4d(jz0Var, 3), e18Var), e18Var, 48, 1);
                                            e18Var.p(false);
                                        } else {
                                            e18Var.a0(1019710798);
                                            tjh.b(str, null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var).e.F).f, e18Var, 0, 0, 131066);
                                            e18Var.p(false);
                                        }
                                        kxk.g(e18Var, b.e(fqbVar, 16.0f));
                                    }
                                    break;
                                default:
                                    px9 px9Var2 = (px9) obj8;
                                    ld4 ld4Var2 = (ld4) obj9;
                                    int iIntValue3 = ((Integer) obj10).intValue();
                                    px9Var2.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= ((e18) ld4Var2).f(px9Var2) ? 4 : 2;
                                    }
                                    e18 e18Var2 = (e18) ld4Var2;
                                    if (!e18Var2.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        e18Var2.T();
                                    } else {
                                        tjh.b(gid.p(16.0f, R.string.ccr_tool_result, e18Var2, e18Var2, fqbVar), null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, 0, 0, 131066);
                                        kxk.g(e18Var2, b.e(fqbVar, 4.0f));
                                        String str2 = strE;
                                        boolean zF2 = e18Var2.f(str2);
                                        Object objN2 = e18Var2.N();
                                        if (zF2 || objN2 == lz1Var) {
                                            try {
                                                hreVar2 = z74Var2.a(str2);
                                            } catch (Throwable th2) {
                                                hreVar2 = new hre(th2);
                                            }
                                            if (hreVar2 instanceof hre) {
                                                hreVar2 = null;
                                            }
                                            objN2 = (jz0) hreVar2;
                                            e18Var2.k0(objN2);
                                        }
                                        jz0 jz0Var2 = (jz0) objN2;
                                        if (jz0Var2 == null) {
                                            e18Var2.a0(-1225789577);
                                            tjh.b(str2, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).f, e18Var2, 0, 0, 131066);
                                            e18Var2.p(false);
                                        } else {
                                            e18Var2.a0(-1225955117);
                                            xvk.c(null, fd9.q0(-1273496728, new l4d(jz0Var2, 2), e18Var2), e18Var2, 48, 1);
                                            e18Var2.p(false);
                                        }
                                    }
                                    break;
                            }
                            return ieiVar2;
                        }
                    }), 3);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ w20(List list, Object obj, bz7 bz7Var, qz7 qz7Var, Object obj2, int i) {
        this.E = i;
        this.F = list;
        this.G = obj;
        this.J = bz7Var;
        this.H = qz7Var;
        this.I = obj2;
    }
}
