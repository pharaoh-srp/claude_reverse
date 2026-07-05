package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.ConwayForkMeta;
import com.anthropic.claude.sessions.types.CoworkSafetyFlag;
import com.anthropic.claude.types.strings.ForkId;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lw implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ lw(zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, iqb iqbVar, dyc dycVar, qi3 qi3Var, int i) {
        this.E = 16;
        this.F = zy7Var;
        this.G = zy7Var2;
        this.H = zy7Var3;
        this.I = zy7Var4;
        this.J = iqbVar;
        this.L = dycVar;
        this.K = qi3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        Object ub2Var;
        f fVar;
        lz1 lz1Var;
        Object next;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.L;
        Object obj4 = this.F;
        Object obj5 = this.J;
        Object obj6 = this.I;
        Object obj7 = this.K;
        Object obj8 = this.H;
        Object obj9 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                jpk.a((List) obj9, (String) obj8, (bz7) obj6, (zy7) obj4, (jw) obj5, (qi3) obj7, (ybg) obj3, (ld4) obj, x44.p0(1));
                break;
            case 1:
                iqb iqbVar = (iqb) obj9;
                zy7 zy7Var = (zy7) obj4;
                ArtifactFullScreenParams artifactFullScreenParams = (ArtifactFullScreenParams) obj8;
                l45 l45Var = (l45) obj6;
                xq0 xq0Var = (xq0) obj5;
                t4f t4fVar = (t4f) obj7;
                wlg wlgVar = (wlg) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    zni.e(gb9.L(iqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), cvj.a, fd9.q0(-1983636090, new wh(4, zy7Var), e18Var), fd9.q0(-221846659, new xe(artifactFullScreenParams, l45Var, xq0Var, t4fVar, wlgVar, 4), e18Var), 54.0f, null, null, e18Var, 28080, 224);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                xzk.d((zy7) obj4, (zy7) obj9, (pvg) obj8, (RavenType) obj6, (iqb) obj5, (qi3) obj7, (jp1) obj3, (ld4) obj, x44.p0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                kwj.a((zy7) obj4, (pz7) obj9, (zy7) obj8, (iqb) obj6, (qb2) obj5, (qi3) obj7, (ze0) obj3, (ld4) obj, x44.p0(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                dd2.a((vc2) obj9, (od2) obj8, (iqb) obj6, (dui) obj4, (eui) obj5, (mb0) obj7, (rz7) obj3, (ld4) obj, x44.p0(1577345));
                break;
            case 5:
                ((Integer) obj2).getClass();
                dd2.c((vc2) obj9, (ed2) obj8, (dui) obj6, (eui) obj4, (xd2) obj5, (ed2) obj7, (uub) obj3, (ld4) obj, x44.p0(1));
                break;
            case 6:
                z9e z9eVar = (z9e) obj8;
                dae daeVar = (dae) obj6;
                l45 l45Var2 = (l45) obj4;
                dae daeVar2 = (dae) obj5;
                rz7 rz7Var = (rz7) obj7;
                gri griVar = (gri) obj3;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                if (((z9e) obj9).E) {
                    if (!z9eVar.E) {
                        z9eVar.E = true;
                        daeVar.E = gb9.D(l45Var2, null, null, new md2(rz7Var, griVar, fFloatValue, z9eVar, null), 3);
                    } else if (fFloatValue == 1.0f) {
                        daeVar2.E = gb9.D(l45Var2, g86.a, null, new cd2(daeVar, rz7Var, griVar, fFloatValue, z9eVar, (tp4) null), 2);
                    }
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                dqk.a((zy7) obj4, (bz7) obj6, (zy7) obj9, (iqb) obj8, (kk4) obj5, (qi3) obj7, (pl3) obj3, (ld4) obj, x44.p0(1));
                break;
            case 8:
                f fVar2 = (f) obj9;
                dx4 dx4Var = (dx4) obj8;
                nwb nwbVar = (nwb) obj6;
                nwb nwbVar2 = (nwb) obj4;
                wlg wlgVar2 = (wlg) obj5;
                wlg wlgVar3 = (wlg) obj7;
                wlg wlgVar4 = (wlg) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    iqb iqbVarP = yfd.p(b.c(fqb.E, 1.0f), gm3.a(e18Var2).o, zni.b);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarP);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, q64VarA);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    wd6.H(s64.a, (((dw4) nwbVar.getValue()).a.isEmpty() && ForkId.m1026isMainimpl(((dw4) nwbVar.getValue()).b)) ? false : true, null, gp6.e(null, 3).a(gp6.d(null, null, 15)), gp6.f(null, 3).a(gp6.l(null, null, 15)), null, fd9.q0(-2125224650, new xg4(nwbVar2, nwbVar, wlgVar2), e18Var2), e18Var2, 1600518, 18);
                    String strN0 = fVar2.n0();
                    boolean zF = e18Var2.f(fVar2);
                    Object objN = e18Var2.N();
                    lz1 lz1Var2 = jd4.a;
                    if (zF || objN == lz1Var2) {
                        objN = new lx4(fVar2, 5);
                        e18Var2.k0(objN);
                    }
                    bz7 bz7Var = (bz7) objN;
                    List list = (List) wlgVar3.getValue();
                    boolean zF2 = e18Var2.f(fVar2);
                    Object objN2 = e18Var2.N();
                    if (zF2 || objN2 == lz1Var2) {
                        fVar = fVar2;
                        lz1Var = lz1Var2;
                        ub2Var = new ub2(1, fVar, f.class, "stageFiles", "stageFiles(Ljava/util/List;)V", 0, 28);
                        e18Var2.k0(ub2Var);
                    } else {
                        fVar = fVar2;
                        lz1Var = lz1Var2;
                        ub2Var = objN2;
                    }
                    bz7 bz7Var2 = (bz7) ((jm9) ub2Var);
                    boolean zF3 = e18Var2.f(fVar);
                    Object objN3 = e18Var2.N();
                    if (zF3 || objN3 == lz1Var) {
                        ub2 ub2Var2 = new ub2(1, fVar, f.class, "unstage", "unstage(Ljava/lang/String;)V", 0, 29);
                        e18Var2.k0(ub2Var2);
                        objN3 = ub2Var2;
                    }
                    bz7 bz7Var3 = (bz7) ((jm9) objN3);
                    boolean zF4 = e18Var2.f(fVar);
                    Object objN4 = e18Var2.N();
                    if (zF4 || objN4 == lz1Var) {
                        objN4 = new lx4(fVar, 6);
                        e18Var2.k0(objN4);
                    }
                    bz7 bz7Var4 = (bz7) objN4;
                    dw4 dw4Var = (dw4) nwbVar.getValue();
                    Iterator it = dw4Var.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (ForkId.m1024equalsimpl0(((ConwayForkMeta) next).m737getAgentIdjXBynNE(), dw4Var.b)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    ConwayForkMeta conwayForkMeta = (ConwayForkMeta) next;
                    String strB = cw4.b(conwayForkMeta != null ? conwayForkMeta.getLabel() : null);
                    boolean zM1026isMainimpl = ForkId.m1026isMainimpl(((dw4) nwbVar.getValue()).b);
                    boolean z = ((ls4) wlgVar4.getValue()) instanceof ks4;
                    boolean z2 = ((dw4) nwbVar.getValue()).d;
                    boolean zF5 = e18Var2.f(fVar);
                    Object objN5 = e18Var2.N();
                    if (zF5 || objN5 == lz1Var) {
                        bo boVar = new bo(2, fVar, f.class, "createFork", "createFork(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0, 14);
                        e18Var2.k0(boVar);
                        objN5 = boVar;
                    }
                    fs4.d(strN0, bz7Var, dx4Var, list, bz7Var2, bz7Var3, bz7Var4, null, strB, zM1026isMainimpl, z, z2, (pz7) ((jm9) objN5), e18Var2, 54);
                    e18Var2.p(true);
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                euk.c((String) obj8, (CoworkSafetyFlag) obj9, (CoworkSafetyFlag) obj6, (pz7) obj4, (pz7) obj5, (iqb) obj3, (qi3) obj7, (ld4) obj, x44.p0(196609));
                break;
            case 10:
                ((Integer) obj2).getClass();
                awj.b((bz7) obj6, (zy7) obj4, (ybg) obj3, (iqb) obj9, (rp6) obj8, (mnc) obj5, (qi3) obj7, (ld4) obj, x44.p0(385));
                break;
            case 11:
                ((Integer) obj2).getClass();
                yjk.b((List) obj9, (k87) obj8, (pz7) obj4, (iqb) obj5, (l45) obj7, (Boolean) obj3, (bz7) obj6, (ld4) obj, x44.p0(1572865));
                break;
            case 12:
                ((Integer) obj2).getClass();
                c4b.a((McpServer) obj9, (zy7) obj4, (bz7) obj6, (pz7) obj8, (bz7) obj5, (bz7) obj7, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                jpk.c((McpTool) obj9, (String) obj8, (String) obj6, (z4b) obj5, (zy7) obj4, (iqb) obj7, (mnc) obj3, (ld4) obj, x44.p0(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                kpk.d((McpTool) obj9, (String) obj8, (String) obj5, (z4b) obj7, (bz7) obj6, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                sqk.c((String) obj8, (Date) obj9, (String) obj6, (zy7) obj4, (zbb) obj5, (ze0) obj3, (qi3) obj7, (ld4) obj, x44.p0(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                stj.e((zy7) obj4, (zy7) obj9, (zy7) obj8, (zy7) obj6, (iqb) obj5, (dyc) obj3, (qi3) obj7, (ld4) obj, x44.p0(1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                com.anthropic.claude.project.details.g.d((tkd) obj9, (zy7) obj4, (bz7) obj6, (zy7) obj8, (ml3) obj5, (q2i) obj7, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                jwk.c((Set) obj9, (String) obj8, (qi3) obj7, (iqb) obj6, (ApiHelpline) obj5, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ lw(zy7 zy7Var, bz7 bz7Var, zy7 zy7Var2, iqb iqbVar, kk4 kk4Var, qi3 qi3Var, pl3 pl3Var, int i) {
        this.E = 7;
        this.F = zy7Var;
        this.I = bz7Var;
        this.G = zy7Var2;
        this.H = iqbVar;
        this.J = kk4Var;
        this.K = qi3Var;
        this.L = pl3Var;
    }

    public /* synthetic */ lw(zy7 zy7Var, qz7 qz7Var, Object obj, Object obj2, Object obj3, qi3 qi3Var, Object obj4, int i, int i2) {
        this.E = i2;
        this.F = zy7Var;
        this.G = qz7Var;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = qi3Var;
        this.L = obj4;
    }

    public /* synthetic */ lw(bz7 bz7Var, zy7 zy7Var, ybg ybgVar, iqb iqbVar, rp6 rp6Var, mnc mncVar, qi3 qi3Var, int i) {
        this.E = 10;
        this.I = bz7Var;
        this.F = zy7Var;
        this.L = ybgVar;
        this.G = iqbVar;
        this.H = rp6Var;
        this.J = mncVar;
        this.K = qi3Var;
    }

    public /* synthetic */ lw(iqb iqbVar, zy7 zy7Var, ArtifactFullScreenParams artifactFullScreenParams, l45 l45Var, xq0 xq0Var, t4f t4fVar, wlg wlgVar) {
        this.E = 1;
        this.G = iqbVar;
        this.F = zy7Var;
        this.H = artifactFullScreenParams;
        this.I = l45Var;
        this.J = xq0Var;
        this.K = t4fVar;
        this.L = wlgVar;
    }

    public /* synthetic */ lw(McpTool mcpTool, String str, String str2, z4b z4bVar, zy7 zy7Var, iqb iqbVar, mnc mncVar, int i) {
        this.E = 13;
        this.G = mcpTool;
        this.H = str;
        this.I = str2;
        this.J = z4bVar;
        this.F = zy7Var;
        this.K = iqbVar;
        this.L = mncVar;
    }

    public /* synthetic */ lw(McpTool mcpTool, String str, String str2, z4b z4bVar, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, int i) {
        this.E = 14;
        this.G = mcpTool;
        this.H = str;
        this.J = str2;
        this.K = z4bVar;
        this.I = bz7Var;
        this.F = zy7Var;
        this.L = iqbVar;
    }

    public /* synthetic */ lw(Object obj, zy7 zy7Var, bz7 bz7Var, qz7 qz7Var, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = zy7Var;
        this.I = bz7Var;
        this.H = qz7Var;
        this.J = obj2;
        this.K = obj3;
        this.L = obj4;
    }

    public /* synthetic */ lw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.F = obj4;
        this.J = obj5;
        this.K = obj6;
        this.L = obj7;
    }

    public /* synthetic */ lw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.F = obj4;
        this.J = obj5;
        this.K = obj6;
        this.L = obj7;
    }

    public /* synthetic */ lw(String str, Object obj, Object obj2, qz7 qz7Var, Object obj3, Object obj4, qi3 qi3Var, int i, int i2) {
        this.E = i2;
        this.H = str;
        this.G = obj;
        this.I = obj2;
        this.F = qz7Var;
        this.J = obj3;
        this.L = obj4;
        this.K = qi3Var;
    }

    public /* synthetic */ lw(List list, k87 k87Var, pz7 pz7Var, iqb iqbVar, l45 l45Var, Boolean bool, bz7 bz7Var, int i) {
        this.E = 11;
        this.G = list;
        this.H = k87Var;
        this.F = pz7Var;
        this.J = iqbVar;
        this.K = l45Var;
        this.L = bool;
        this.I = bz7Var;
    }

    public /* synthetic */ lw(Set set, String str, qi3 qi3Var, iqb iqbVar, ApiHelpline apiHelpline, zy7 zy7Var, zy7 zy7Var2, int i) {
        this.E = 18;
        this.G = set;
        this.H = str;
        this.K = qi3Var;
        this.I = iqbVar;
        this.J = apiHelpline;
        this.F = zy7Var;
        this.L = zy7Var2;
    }
}
