package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.memory.MelangeParsedContent;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.d;
import com.anthropic.claude.chat.parse.MemoryToolSummary;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.code.remote.stores.b;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.h;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ne implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ ne(ze0 ze0Var, zy7 zy7Var, iqb iqbVar, nn6 nn6Var, fk0 fk0Var, qi3 qi3Var, int i) {
        this.E = 12;
        this.G = ze0Var;
        this.H = zy7Var;
        this.F = iqbVar;
        this.I = nn6Var;
        this.J = fk0Var;
        this.K = qi3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = 16;
        int i3 = 10;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        int i4 = 2;
        int i5 = 3;
        iei ieiVar = iei.a;
        Object obj3 = this.K;
        Object obj4 = this.J;
        Object obj5 = this.F;
        int i6 = 6;
        Object obj6 = this.I;
        Object obj7 = this.H;
        Object obj8 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zmk.a((oe) obj8, (mnc) obj7, (pl3) obj6, (iqb) obj5, (oxf) obj4, (nxf) obj3, (ld4) obj, x44.p0(3073));
                break;
            case 1:
                ((Integer) obj2).getClass();
                il.d((pgc) obj8, (String) obj7, (zy7) obj6, (zy7) obj4, (zy7) obj3, (iqb) obj5, (ld4) obj, x44.p0(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                cok.c((ArrayList) obj8, (SessionResource) obj7, (String) obj6, (bz7) obj4, (zy7) obj3, (iqb) obj5, (ld4) obj, x44.p0(1));
                break;
            case 3:
                List list = (List) obj8;
                j0a j0aVar = (j0a) obj;
                mnc mncVar = (mnc) obj2;
                j0aVar.getClass();
                mncVar.getClass();
                mw mwVar = new mw((r4g) obj7, (bz7) obj6);
                l6 l6Var = new l6((l45) obj5, (jw) obj4, (ybg) obj3, i5);
                if (!list.isEmpty()) {
                    j0aVar.W(list.size(), new kp(new zv(1), i3, list), new kp(new zv(i4), 11, list), new ta4(802480018, true, new nw(list, mncVar, mwVar, l6Var, 0)));
                } else {
                    j0a.V(j0aVar, null, ik7.E, tuj.a, 1);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ar0.a((ArtifactFullScreenParams) obj8, (zy7) obj7, (pz7) obj6, (iqb) obj5, (qi3) obj4, (u4f) obj3, (ld4) obj, x44.p0(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                stj.a((String) obj8, (String) obj7, (zy7) obj6, (hdc) obj5, (h86) obj4, (n3f) obj3, (ld4) obj, x44.p0(1));
                break;
            case 6:
                r1e r1eVar = (r1e) obj8;
                iwg iwgVar = (iwg) obj7;
                String str = (String) obj6;
                pz7 pz7Var = (pz7) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iqb iqbVarK = gb9.K(fqbVar, 12.0f, 12.0f);
                    cxe cxeVarA = axe.a(ko0.g, lja.Q, e18Var, 54);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarK);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var, z80Var, cxeVarA);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var, z80Var2, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var, bxVar);
                    z80 z80Var4 = cd4.d;
                    hw9 hw9VarN = kgh.n(e18Var, iqbVarE, z80Var4, 1.0f, true);
                    q64 q64VarA = p64.a(new ho0(2.0f, true, new sz6(1)), lja.S, e18Var, 6);
                    int iHashCode2 = Long.hashCode(e18Var.T);
                    hyc hycVarL2 = e18Var.l();
                    iqb iqbVarE2 = kxk.E(e18Var, hw9VarN);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, q64VarA);
                    d4c.i0(e18Var, z80Var2, hycVarL2);
                    ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
                    d4c.i0(e18Var, z80Var4, iqbVarE2);
                    tjh.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131070);
                    tjh.b(str3, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, 0, 0, 131066);
                    e18Var.p(true);
                    yx3.a(r1eVar, iwgVar, str, pz7Var, e18Var, 0);
                    e18Var.p(true);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                e.b((ml3) obj8, (q2i) obj7, (String) obj6, (iqb) obj5, (m2i) obj4, (ta4) obj3, (ld4) obj, x44.p0(199681));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ah4.b((List) obj8, (bz7) obj7, (pz7) obj6, (pz7) obj4, (bz7) obj3, (iqb) obj5, (ld4) obj, x44.p0(24577));
                break;
            case 9:
                ((Integer) obj2).getClass();
                h.c((iqb) obj5, (us4) obj8, (f) obj7, (dx4) obj6, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                yuk.b((bz7) obj8, (zy7) obj7, (iqb) obj5, (k75) obj4, (qi3) obj3, (pl3) obj6, (ld4) obj, x44.p0(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                hvj.a((Set) obj8, (String) obj7, (qi3) obj6, (iqb) obj5, (ApiHelpline) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                svj.a((ze0) obj8, (zy7) obj7, (iqb) obj5, (nn6) obj6, (fk0) obj4, (qi3) obj3, (ld4) obj, x44.p0(1));
                break;
            case 13:
                l45 l45Var = (l45) obj8;
                b bVar = (b) obj7;
                a aVar = (a) obj6;
                ybg ybgVar = (ybg) obj5;
                nwb nwbVar = (nwb) obj4;
                nwb nwbVar2 = (nwb) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
                    boolean zH = e18Var2.h(l45Var) | e18Var2.f(bVar) | e18Var2.h(aVar) | e18Var2.f(ybgVar);
                    Object objN = e18Var2.N();
                    if (zH || objN == lz1Var) {
                        ck4 ck4Var = new ck4(l45Var, bVar, aVar, ybgVar, nwbVar, nwbVar2);
                        e18Var2.k0(ck4Var);
                        objN = ck4Var;
                    }
                    oe5.a(48, 0, e18Var2, (zy7) objN, "Reset", zBooleanValue);
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                com.anthropic.claude.settings.internal.e.g((ybg) obj8, (fk0) obj7, (um1) obj6, (a) obj5, (b) obj4, (ca9) obj3, (ld4) obj, x44.p0(4679));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ctc ctcVar = (ctc) obj8;
                jxa jxaVar = (jxa) obj7;
                g93 g93Var = (g93) obj6;
                m83 m83Var = (m83) obj5;
                nwb nwbVar3 = (nwb) obj4;
                nwb nwbVar4 = (nwb) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    String str4 = ((ixa) jxaVar).a;
                    Object objN2 = e18Var3.N();
                    if (objN2 == lz1Var) {
                        objN2 = new ol5(18, nwbVar3);
                        e18Var3.k0(objN2);
                    }
                    bz7 bz7Var = (bz7) objN2;
                    Object objN3 = e18Var3.N();
                    if (objN3 == lz1Var) {
                        objN3 = new ol5(19, nwbVar4);
                        e18Var3.k0(objN3);
                    }
                    mok.d(ctcVar, str4, g93Var, m83Var, bz7Var, (bz7) objN3, null, e18Var3, 221184, 64);
                }
                break;
            case 16:
                lbb lbbVar = (lbb) obj8;
                qi3 qi3Var = (qi3) obj6;
                eli eliVar = (eli) obj5;
                ze0 ze0Var = (ze0) obj4;
                mnc mncVar2 = (mnc) obj7;
                nwb nwbVar5 = (nwb) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    MelangeParsedContent melangeParsedContent = (MelangeParsedContent) lbbVar.l.getValue();
                    String description = melangeParsedContent != null ? melangeParsedContent.getDescription() : null;
                    jz0 jz0Var = (jz0) lbbVar.m.getValue();
                    boolean z = ((nf0) lbbVar.n.getValue()) != null;
                    boolean zBooleanValue2 = ((Boolean) lbbVar.o.getValue()).booleanValue();
                    Object objN4 = e18Var4.N();
                    if (objN4 == lz1Var) {
                        objN4 = new d29(16, nwbVar5);
                        e18Var4.k0(objN4);
                    }
                    zy7 zy7Var = (zy7) objN4;
                    boolean zH2 = e18Var4.h(qi3Var) | e18Var4.h(eliVar) | e18Var4.h(ze0Var);
                    Object objN5 = e18Var4.N();
                    if (zH2 || objN5 == lz1Var) {
                        objN5 = new hya(qi3Var, eliVar, ze0Var, i6);
                        e18Var4.k0(objN5);
                    }
                    zy7 zy7Var2 = (zy7) objN5;
                    boolean zF = e18Var4.f(lbbVar);
                    Object objN6 = e18Var4.N();
                    if (zF || objN6 == lz1Var) {
                        objN6 = new mx5(0, lbbVar, lbb.class, "refresh", "refresh()V", 0, 13);
                        e18Var4.k0(objN6);
                    }
                    mqk.b(description, jz0Var, z, zBooleanValue2, zy7Var, zy7Var2, (zy7) ((jm9) objN6), gb9.I(androidx.compose.foundation.layout.b.c, mncVar2), e18Var4, 24576);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                d.a((MobileAppToolPreviewInfo) obj8, (mc) obj7, (zy7) obj6, (zy7) obj5, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                MemoryToolSummary memoryToolSummary = (MemoryToolSummary) obj8;
                ToolDisplayContent toolDisplayContent = (ToolDisplayContent) obj7;
                ToolDisplayContent toolDisplayContent2 = (ToolDisplayContent) obj6;
                String str5 = (String) obj5;
                bz7 bz7Var2 = (bz7) obj4;
                bz7 bz7Var3 = (bz7) obj3;
                j0a j0aVar2 = (j0a) obj;
                mnc mncVar3 = (mnc) obj2;
                j0aVar2.getClass();
                mncVar3.getClass();
                if (memoryToolSummary == null) {
                    vtk.d(j0aVar2, toolDisplayContent, toolDisplayContent2, str5, bz7Var2, bz7Var3, mncVar3);
                } else {
                    j0a.V(j0aVar2, null, null, new ta4(-269192232, true, new u3e(memoryToolSummary, i2, mncVar3)), 3);
                }
                break;
            default:
                nwb nwbVar6 = (nwb) obj8;
                wlg wlgVar = (wlg) obj7;
                wlg wlgVar2 = (wlg) obj6;
                wlg wlgVar3 = (wlg) obj5;
                ta4 ta4Var = (ta4) obj4;
                k2i k2iVar = (k2i) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    Object objN7 = e18Var5.N();
                    if (objN7 == lz1Var) {
                        objN7 = new shf(10, nwbVar6);
                        e18Var5.k0(objN7);
                    }
                    iqb iqbVarP0 = xn5.p0(fqbVar, (bz7) objN7);
                    xo1 xo1Var = lja.G;
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode3 = Long.hashCode(e18Var5.T);
                    hyc hycVarL3 = e18Var5.l();
                    iqb iqbVarE3 = kxk.E(e18Var5, iqbVarP0);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var2);
                    } else {
                        e18Var5.n0();
                    }
                    z80 z80Var5 = cd4.f;
                    d4c.i0(e18Var5, z80Var5, o5bVarD);
                    z80 z80Var6 = cd4.e;
                    d4c.i0(e18Var5, z80Var6, hycVarL3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    z80 z80Var7 = cd4.g;
                    d4c.i0(e18Var5, z80Var7, numValueOf2);
                    bx bxVar2 = cd4.h;
                    d4c.h0(e18Var5, bxVar2);
                    z80 z80Var8 = cd4.d;
                    d4c.i0(e18Var5, z80Var8, iqbVarE3);
                    e18Var5.X(-1350495383, Integer.valueOf(((Number) wlgVar3.getValue()).intValue()));
                    boolean zF2 = e18Var5.f(wlgVar) | e18Var5.f(wlgVar2);
                    Object objN8 = e18Var5.N();
                    if (zF2 || objN8 == lz1Var) {
                        objN8 = new y0e(wlgVar, wlgVar2, 1);
                        e18Var5.k0(objN8);
                    }
                    iqb iqbVarI0 = xn5.i0(fqbVar, (bz7) objN8);
                    o5b o5bVarD2 = dw1.d(xo1Var, false);
                    int iHashCode4 = Long.hashCode(e18Var5.T);
                    hyc hycVarL4 = e18Var5.l();
                    iqb iqbVarE4 = kxk.E(e18Var5, iqbVarI0);
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var2);
                    } else {
                        e18Var5.n0();
                    }
                    d4c.i0(e18Var5, z80Var5, o5bVarD2);
                    d4c.i0(e18Var5, z80Var6, hycVarL4);
                    ij0.t(iHashCode4, e18Var5, z80Var7, e18Var5, bxVar2);
                    d4c.i0(e18Var5, z80Var8, iqbVarE4);
                    ta4Var.invoke(k2iVar, e18Var5, 6);
                    e18Var5.p(true);
                    e18Var5.p(false);
                    e18Var5.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ne(bz7 bz7Var, zy7 zy7Var, iqb iqbVar, k75 k75Var, qi3 qi3Var, pl3 pl3Var, int i) {
        this.E = 10;
        this.G = bz7Var;
        this.H = zy7Var;
        this.F = iqbVar;
        this.J = k75Var;
        this.K = qi3Var;
        this.I = pl3Var;
    }

    public /* synthetic */ ne(lbb lbbVar, qi3 qi3Var, eli eliVar, ze0 ze0Var, mnc mncVar, nwb nwbVar) {
        this.E = 16;
        this.G = lbbVar;
        this.I = qi3Var;
        this.F = eliVar;
        this.J = ze0Var;
        this.H = mncVar;
        this.K = nwbVar;
    }

    public /* synthetic */ ne(iqb iqbVar, us4 us4Var, f fVar, dx4 dx4Var, zy7 zy7Var, zy7 zy7Var2, int i) {
        this.E = 9;
        this.F = iqbVar;
        this.G = us4Var;
        this.H = fVar;
        this.I = dx4Var;
        this.J = zy7Var;
        this.K = zy7Var2;
    }

    public /* synthetic */ ne(Object obj, Object obj2, Object obj3, qz7 qz7Var, qz7 qz7Var2, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = qz7Var;
        this.K = qz7Var2;
        this.F = iqbVar;
    }

    public /* synthetic */ ne(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.F = obj4;
        this.J = obj5;
        this.K = obj6;
    }

    public /* synthetic */ ne(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.F = obj4;
        this.J = obj5;
        this.K = obj6;
    }
}
