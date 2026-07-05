package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.tooling.PreviewActivity;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.MessageFileEvents$PdfPreviewResult;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.models.organization.configtypes.GroveConfigStrings;
import com.anthropic.claude.project.knowledge.l;
import com.anthropic.claude.settings.internal.growthbook.GateKind;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ra7 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ ra7(eli eliVar, String str, zy7 zy7Var) {
        this.E = 1;
        this.G = eliVar;
        this.H = str;
        this.F = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Exception {
        iei ieiVar;
        int i;
        final int i2;
        int i3 = this.E;
        int i4 = 14;
        fqb fqbVar = fqb.E;
        Object obj3 = jd4.a;
        iei ieiVar2 = iei.a;
        Object obj4 = this.H;
        Object obj5 = this.F;
        Object obj6 = this.G;
        switch (i3) {
            case 0:
                zy7 zy7Var = (zy7) obj5;
                r4g r4gVar = (r4g) obj4;
                Object obj7 = (List) obj;
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                obj7.getClass();
                ((pz7) obj6).invoke(obj7, bool);
                if (!zBooleanValue) {
                    zy7Var.a();
                }
                r4gVar.a();
                return ieiVar2;
            case 1:
                eli eliVar = (eli) obj6;
                String str = (String) obj4;
                zy7 zy7Var2 = (zy7) obj5;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zH = e18Var.h(eliVar) | e18Var.f(str) | e18Var.f(zy7Var2);
                    Object objN = e18Var.N();
                    if (zH || objN == obj3) {
                        objN = new pd7(eliVar, str, zy7Var2, 0);
                        e18Var.k0(objN);
                    }
                    csg.j((zy7) objN, null, false, null, null, null, null, tlk.b, e18Var, 805306368, 510);
                } else {
                    e18Var.T();
                }
                return ieiVar2;
            case 2:
                ((Integer) obj2).getClass();
                elk.c((Uri) obj6, (zy7) obj5, (iqb) obj4, (ld4) obj, x44.p0(1));
                return ieiVar2;
            case 3:
                tp4 tp4Var = null;
                id8 id8Var = (id8) obj6;
                bz7 bz7Var = (bz7) obj5;
                String str2 = (String) obj;
                GateKind gateKind = (GateKind) obj2;
                str2.getClass();
                gateKind.getClass();
                ((nwb) obj4).setValue(Boolean.FALSE);
                lsc lscVar = id8Var.j;
                if (!bsg.I0(str2)) {
                    Map mapM0 = sta.m0((Map) lscVar.getValue(), new cpc(str2, gateKind));
                    if (!mapM0.equals(lscVar.getValue())) {
                        lscVar.setValue(mapM0);
                        gb9.D(id8Var.d, null, null, new ix5(id8Var, mapM0, tp4Var, i4), 3);
                        mdg mdgVar = id8Var.i;
                        rc8 rc8Var = id8Var.e;
                        boolean zContains = rc8Var.q().contains(str2);
                        pg7 pg7VarN = rc8Var.n(str2);
                        JsonElement defaultValue = pg7VarN != null ? pg7VarN.b.getDefaultValue() : null;
                        GateKind gateKind2 = (GateKind) id8Var.g.get(str2);
                        if (gateKind2 == null) {
                            gateKind2 = (GateKind) ((Map) id8Var.j.getValue()).get(str2);
                        }
                        mdgVar.put(str2, new n18(str2, defaultValue, zContains, gateKind2, (String) id8Var.h.get(str2)));
                    }
                }
                if (gateKind != GateKind.BOOLEAN) {
                    bz7Var.invoke(str2);
                }
                return ieiVar2;
            case 4:
                pz7 pz7Var = (pz7) obj6;
                yih yihVar = (yih) obj5;
                nwb nwbVar = (nwb) obj4;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zF = e18Var2.f(pz7Var);
                    Object objN2 = e18Var2.N();
                    if (zF || objN2 == obj3) {
                        objN2 = new yg4(yihVar, pz7Var, nwbVar, 21);
                        e18Var2.k0(objN2);
                    }
                    lnk.d((zy7) objN2, null, bsg.k1(yihVar.d().G.toString()).toString().length() > 0, null, null, null, null, dmk.c, e18Var2, 805306368, 506);
                } else {
                    e18Var2.T();
                }
                return ieiVar2;
            case 5:
                ((Integer) obj2).getClass();
                lsk.a((vxc) obj6, (gh2) obj4, (zy7) obj5, (ld4) obj, x44.p0(1));
                return ieiVar2;
            case 6:
                ((Integer) obj2).getClass();
                rvk.e((ylg) obj6, (pl3) obj4, (zy7) obj5, (ld4) obj, x44.p0(1));
                return ieiVar2;
            case 7:
                ((Integer) obj2).getClass();
                rvk.d((fn1) obj6, (zy7) obj5, (iqb) obj4, (ld4) obj, x44.p0(1));
                return ieiVar2;
            case 8:
                ((Integer) obj2).getClass();
                rwk.e((Map) obj6, (Set) obj4, (zy7) obj5, (ld4) obj, x44.p0(7));
                return ieiVar2;
            case 9:
                ((Integer) obj2).getClass();
                mwa.c((y3a) obj6, (m4a) obj4, (zy7) obj5, (ld4) obj, x44.p0(7));
                return ieiVar2;
            case 10:
                bpc bpcVar = (bpc) obj6;
                String str3 = (String) obj5;
                x0a x0aVar = (x0a) obj4;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    wo1 wo1Var = lja.Q;
                    iqb iqbVarL = gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var3, 48);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, cxeVarA);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    cv8.b(bpcVar, str3, b.o(fqbVar, 20.0f), 0L, e18Var3, 392, 8);
                    wd6.K(fxe.a, !x0aVar.b() || x0aVar.j.f(), null, null, null, null, fd9.q0(608478538, new pp(str3, i4), e18Var3), e18Var3, 1572870, 30);
                    e18Var3.p(true);
                } else {
                    e18Var3.T();
                }
                return ieiVar2;
            case 11:
                ((Integer) obj2).getClass();
                fik.b((rja) obj6, (zy7) obj5, (zy7) obj4, (ld4) obj, x44.p0(1));
                return ieiVar2;
            case 12:
                s64 s64Var = (s64) obj6;
                vsa vsaVar = (vsa) obj5;
                String str4 = (String) obj4;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ho0 ho0Var = new ho0(2.0f, true, new sz6(1));
                    iqb iqbVarB = s64Var.b(fqbVar, 1.0f, true);
                    q64 q64VarA = p64.a(ho0Var, lja.S, e18Var4, 6);
                    int iHashCode2 = Long.hashCode(e18Var4.T);
                    hyc hycVarL2 = e18Var4.l();
                    iqb iqbVarE2 = kxk.E(e18Var4, iqbVarB);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var2);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, q64VarA);
                    d4c.i0(e18Var4, cd4.e, hycVarL2);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE2);
                    String str5 = vsaVar.e;
                    if (str5 == null) {
                        e18Var4.a0(1415291910);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(1415291911);
                        tjh.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).i, e18Var4, 0, 0, 131070);
                        e18Var4.p(false);
                    }
                    tjh.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).f, e18Var4, 0, 0, 131070);
                    e18Var4.a0(1431135477);
                    xb0 xb0Var = new xb0();
                    Double d = vsaVar.f;
                    if (d != null) {
                        xb0Var.h(d.doubleValue() + " ★");
                    }
                    Integer num = vsaVar.g;
                    StringBuilder sb = xb0Var.E;
                    if (num == null) {
                        e18Var4.a0(-292498100);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(-292498099);
                        int iIntValue5 = num.intValue();
                        if (sb.length() > 0) {
                            xb0Var.h(" ");
                        }
                        int iM = xb0Var.m(new egg(gm3.a(e18Var4).O, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        try {
                            xb0Var.h("(" + iIntValue5 + ")");
                            xb0Var.j(iM);
                            e18Var4.p(false);
                        } catch (Throwable th) {
                            xb0Var.j(iM);
                            throw th;
                        }
                    }
                    String str6 = vsaVar.h;
                    if (str6 != null) {
                        if (sb.length() > 0) {
                            xb0Var.h(" · ");
                        }
                        xb0Var.h(str6);
                    }
                    zb0 zb0VarN = xb0Var.n();
                    e18Var4.p(false);
                    if (zb0VarN.F.length() > 0) {
                        e18Var4.a0(1416165677);
                        tjh.c(zb0VarN, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var4).e.E).i, e18Var4, 0, 0, 262142);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(1416310137);
                        String str7 = vsaVar.d;
                        if (str7 == null) {
                            e18Var4.a0(1416310136);
                            e18Var4.p(false);
                        } else {
                            e18Var4.a0(1416310137);
                            tjh.b(str7, null, gm3.a(e18Var4).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).i, e18Var4, 0, 0, 131066);
                            e18Var4.p(false);
                        }
                        e18Var4.p(false);
                    }
                    e18Var4.p(true);
                } else {
                    e18Var4.T();
                }
                return ieiVar2;
            case 13:
                mra mraVar = (mra) obj6;
                final koc kocVar = (koc) obj5;
                final l45 l45Var = (l45) obj4;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var5.T();
                    return ieiVar2;
                }
                final int i5 = 0;
                for (Object obj8 : mraVar.P()) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        x44.n0();
                        throw null;
                    }
                    vsa vsaVar2 = (vsa) obj8;
                    if (mraVar.e == n86.F) {
                        e18Var5.a0(-1258864055);
                        ieiVar = ieiVar2;
                        pua puaVarK = rlk.k(new LatLng(vsaVar2.b, vsaVar2.c), e18Var5);
                        sq1 sq1Var = i5 == ((isc) kocVar.d.G).h() ? (sq1) mraVar.i.getValue() : null;
                        boolean zH2 = e18Var5.h(l45Var) | e18Var5.f(kocVar) | e18Var5.d(i5);
                        Object objN3 = e18Var5.N();
                        if (zH2 || objN3 == obj3) {
                            final int i7 = false ? 1 : 0;
                            objN3 = new bz7() { // from class: pra
                                @Override // defpackage.bz7
                                public final Object invoke(Object obj9) {
                                    int i8 = i7;
                                    int i9 = i5;
                                    koc kocVar2 = kocVar;
                                    l45 l45Var2 = l45Var;
                                    fua fuaVar = (fua) obj9;
                                    switch (i8) {
                                        case 0:
                                            fuaVar.getClass();
                                            gb9.D(l45Var2, null, null, new rra(kocVar2, i9, null, 0), 3);
                                            break;
                                        default:
                                            fuaVar.getClass();
                                            gb9.D(l45Var2, null, null, new rra(kocVar2, i9, null, 1), 3);
                                            break;
                                    }
                                    return Boolean.FALSE;
                                }
                            };
                            e18Var5.k0(objN3);
                        }
                        rlk.b(puaVarK, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, sq1Var, 0L, false, (bz7) objN3, null, null, null, e18Var5, 0, 245694);
                        e18Var5.p(false);
                        i = i6;
                    } else {
                        ieiVar = ieiVar2;
                        e18Var5.a0(-1258136175);
                        boolean z = i5 == ((isc) kocVar.d.G).h();
                        Object[] objArr = {Boolean.valueOf(z)};
                        i = i6;
                        pua puaVarK2 = rlk.k(new LatLng(vsaVar2.b, vsaVar2.c), e18Var5);
                        boolean zH3 = e18Var5.h(l45Var) | e18Var5.f(kocVar) | e18Var5.d(i5);
                        Object objN4 = e18Var5.N();
                        if (zH3 || objN4 == obj3) {
                            i2 = 1;
                            objN4 = new bz7() { // from class: pra
                                @Override // defpackage.bz7
                                public final Object invoke(Object obj9) {
                                    int i8 = i2;
                                    int i9 = i5;
                                    koc kocVar2 = kocVar;
                                    l45 l45Var2 = l45Var;
                                    fua fuaVar = (fua) obj9;
                                    switch (i8) {
                                        case 0:
                                            fuaVar.getClass();
                                            gb9.D(l45Var2, null, null, new rra(kocVar2, i9, null, 0), 3);
                                            break;
                                        default:
                                            fuaVar.getClass();
                                            gb9.D(l45Var2, null, null, new rra(kocVar2, i9, null, 1), 3);
                                            break;
                                    }
                                    return Boolean.FALSE;
                                }
                            };
                            e18Var5.k0(objN4);
                        } else {
                            i2 = 1;
                        }
                        rlk.c(objArr, puaVarK2, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0L, false, (bz7) objN4, null, null, null, fd9.q0(-610251817, new hv(z, i5, i2), e18Var5), e18Var5, 0);
                        e18Var5.p(false);
                    }
                    i5 = i;
                    ieiVar2 = ieiVar;
                }
                return ieiVar2;
            case 14:
                ((Integer) obj2).getClass();
                zok.b((y2b) obj6, (bz7) obj5, (iqb) obj4, (ld4) obj, x44.p0(385));
                return ieiVar2;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                String str8 = (String) obj6;
                String str9 = (String) obj5;
                McpTool mcpTool = (McpTool) obj4;
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    kpk.e(str8, str9, qok.e(mcpTool), null, e18Var6, 0);
                } else {
                    e18Var6.T();
                }
                return ieiVar2;
            case 16:
                pz7 pz7Var2 = (pz7) obj6;
                pz7 pz7Var3 = (pz7) obj5;
                pz7 pz7Var4 = (pz7) obj4;
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    iqb iqbVarN = gb9.N(new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), pz7Var2 != null ? 12.0f : 0.0f, MTTypesetterKt.kLineSkipLimitMultiplier, pz7Var3 != null ? 12.0f : 0.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 10);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode3 = Long.hashCode(e18Var7.T);
                    hyc hycVarL3 = e18Var7.l();
                    iqb iqbVarE3 = kxk.E(e18Var7, iqbVarN);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var7.e0();
                    if (e18Var7.S) {
                        e18Var7.k(re4Var3);
                    } else {
                        e18Var7.n0();
                    }
                    d4c.i0(e18Var7, cd4.f, o5bVarD);
                    d4c.i0(e18Var7, cd4.e, hycVarL3);
                    d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var7, cd4.h);
                    d4c.i0(e18Var7, cd4.d, iqbVarE3);
                    sq6.B(0, pz7Var4, e18Var7, true);
                } else {
                    e18Var7.T();
                }
                return ieiVar2;
            case g.MAX_FIELD_NUMBER /* 17 */:
                iqb iqbVar = (iqb) obj6;
                j9f j9fVar = (j9f) obj5;
                ta4 ta4Var = (ta4) obj4;
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    iqb iqbVarB0 = mpk.b0(rkj.k(gb9.L(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, ldb.c, 1), za9.F), j9fVar, true);
                    q64 q64VarA2 = p64.a(ko0.c, lja.S, e18Var8, 0);
                    int iHashCode4 = Long.hashCode(e18Var8.T);
                    hyc hycVarL4 = e18Var8.l();
                    iqb iqbVarE4 = kxk.E(e18Var8, iqbVarB0);
                    dd4.e.getClass();
                    re4 re4Var4 = cd4.b;
                    e18Var8.e0();
                    if (e18Var8.S) {
                        e18Var8.k(re4Var4);
                    } else {
                        e18Var8.n0();
                    }
                    d4c.i0(e18Var8, cd4.f, q64VarA2);
                    d4c.i0(e18Var8, cd4.e, hycVarL4);
                    d4c.i0(e18Var8, cd4.g, Integer.valueOf(iHashCode4));
                    d4c.h0(e18Var8, cd4.h);
                    d4c.i0(e18Var8, cd4.d, iqbVarE4);
                    ta4Var.invoke(s64.a, e18Var8, 6);
                    e18Var8.p(true);
                } else {
                    e18Var8.T();
                }
                return ieiVar2;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ta4 ta4Var2 = (ta4) obj6;
                Object obj9 = (s64) obj5;
                nwb nwbVar2 = (nwb) obj4;
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (e18Var9.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zF2 = e18Var9.f(nwbVar2);
                    Object objN5 = e18Var9.N();
                    if (zF2 || objN5 == obj3) {
                        objN5 = new d29(20, nwbVar2);
                        e18Var9.k0(objN5);
                    }
                    ta4Var2.i(obj9, (zy7) objN5, e18Var9, 0);
                } else {
                    e18Var9.T();
                }
                return ieiVar2;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Integer) obj2).getClass();
                p1c.a((zy7) obj5, (iqb) obj6, (fk0) obj4, (ld4) obj, x44.p0(1));
                return ieiVar2;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                wxc wxcVar = (wxc) obj6;
                Context context = (Context) obj5;
                nwb nwbVar3 = (nwb) obj4;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                zy7 zy7Var3 = (zy7) obj2;
                zy7Var3.getClass();
                if (!zBooleanValue2 || x44.r(wxcVar.e(), yxc.a)) {
                    zy7Var3.a();
                } else {
                    nwbVar3.setValue(new kl1(18, zy7Var3));
                    oq5.K(context, wxcVar);
                }
                return ieiVar2;
            case 21:
                String str10 = (String) obj6;
                String str11 = (String) obj5;
                Object[] objArr2 = (Object[]) obj4;
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i8 = PreviewActivity.Z;
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    gpk.i(str10, str11, e18Var10, Arrays.copyOf(objArr2, 0));
                } else {
                    e18Var10.T();
                }
                return ieiVar2;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                Boolean bool2 = (Boolean) obj2;
                bool2.getClass();
                uvc uvcVar = (uvc) ((nwb) obj6).getValue();
                uvcVar.getClass();
                uvcVar.a(MessageFileEvents$PdfPreviewResult.RENDER_PROCESS_GONE);
                ((nwb) obj5).setValue(bool2);
                ((nwb) obj4).setValue(Boolean.TRUE);
                return ieiVar2;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                iqb iqbVar2 = (iqb) obj6;
                List list = (List) obj5;
                om8 om8Var = (om8) obj4;
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (e18Var11.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    qnc qncVarB = gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1);
                    boolean zH4 = e18Var11.h(list) | e18Var11.h(om8Var);
                    Object objN6 = e18Var11.N();
                    if (zH4 || objN6 == obj3) {
                        objN6 = new b4b(list, 19, om8Var);
                        e18Var11.k0(objN6);
                    }
                    knk.h(iqbVar2, null, qncVarB, false, null, null, null, false, null, (bz7) objN6, e18Var11, 384, 506);
                } else {
                    e18Var11.T();
                }
                return ieiVar2;
            case 24:
                ((Integer) obj2).getClass();
                kgd.a((zy7) obj5, (GroveConfigStrings) obj6, (iqb) obj4, (ld4) obj, x44.p0(385));
                return ieiVar2;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).getClass();
                fik.d((fnd) obj6, (iqb) obj4, (zy7) obj5, (ld4) obj, x44.p0(1));
                return ieiVar2;
            case 26:
                ((Integer) obj2).getClass();
                l.b((wmd) obj6, (mnc) obj5, (iqb) obj4, (ld4) obj, x44.p0(393));
                return ieiVar2;
            case 27:
                ((Integer) obj2).getClass();
                qik.k((zy7) obj5, (iqb) obj6, (lod) obj4, (ld4) obj, x44.p0(1));
                return ieiVar2;
            case 28:
                ((Integer) obj2).getClass();
                cjk.e((zy7) obj5, (iqb) obj6, (kzd) obj4, (ld4) obj, x44.p0(1));
                return ieiVar2;
            default:
                ((Integer) obj2).getClass();
                tlk.b((iqb) obj6, (e0g) obj5, (ta4) obj4, (ld4) obj, x44.p0(385));
                return ieiVar2;
        }
    }

    public /* synthetic */ ra7(zy7 zy7Var, Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.F = zy7Var;
        this.G = obj;
        this.H = obj2;
    }

    public /* synthetic */ ra7(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = obj2;
        this.H = obj3;
    }

    public /* synthetic */ ra7(Object obj, Object obj2, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.F = zy7Var;
    }

    public /* synthetic */ ra7(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
        this.H = obj3;
    }
}
