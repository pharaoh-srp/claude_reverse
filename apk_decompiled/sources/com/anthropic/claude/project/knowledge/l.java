package com.anthropic.claude.project.knowledge;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.project.ProjectKnowledgeStats;
import com.anthropic.claude.project.knowledge.ProjectKnowledgeBottomSheetDestination;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bi7;
import defpackage.blc;
import defpackage.bz7;
import defpackage.cd4;
import defpackage.csg;
import defpackage.d4c;
import defpackage.dd4;
import defpackage.dmd;
import defpackage.e18;
import defpackage.eve;
import defpackage.fd9;
import defpackage.fik;
import defpackage.fqb;
import defpackage.fxd;
import defpackage.gb9;
import defpackage.gr9;
import defpackage.gsk;
import defpackage.gw;
import defpackage.h86;
import defpackage.hyc;
import defpackage.iqb;
import defpackage.iv1;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jm9;
import defpackage.k21;
import defpackage.kce;
import defpackage.ko0;
import defpackage.kxk;
import defpackage.ld4;
import defpackage.lja;
import defpackage.lm6;
import defpackage.lsc;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.mnc;
import defpackage.mxd;
import defpackage.nw7;
import defpackage.oda;
import defpackage.olh;
import defpackage.oq5;
import defpackage.p64;
import defpackage.pac;
import defpackage.pk;
import defpackage.q64;
import defpackage.qi3;
import defpackage.r4g;
import defpackage.r7e;
import defpackage.ra7;
import defpackage.rwe;
import defpackage.s64;
import defpackage.sq6;
import defpackage.sxa;
import defpackage.t4g;
import defpackage.ta4;
import defpackage.tp4;
import defpackage.u4g;
import defpackage.vn5;
import defpackage.wd6;
import defpackage.wmd;
import defpackage.wqd;
import defpackage.wz5;
import defpackage.x44;
import defpackage.xh;
import defpackage.xmd;
import defpackage.ybg;
import defpackage.yl1;
import defpackage.ymd;
import defpackage.zl1;
import defpackage.zni;
import defpackage.zy7;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final void a(ProjectKnowledgeScreenParams projectKnowledgeScreenParams, zy7 zy7Var, iqb iqbVar, wmd wmdVar, qi3 qi3Var, ld4 ld4Var, int i) {
        int i2;
        wmd wmdVar2;
        qi3 qi3Var2;
        wmd wmdVar3;
        qi3 qi3Var3;
        projectKnowledgeScreenParams.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1956589101);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(projectKnowledgeScreenParams) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var.V();
            int i3 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                Object objN = e18Var.N();
                if (objN == lz1Var) {
                    kce kceVar = jce.a;
                    wmd wmdVar4 = new wmd(projectKnowledgeScreenParams, (wqd) m7fVar.a(kceVar.b(wqd.class), null, null), (vn5) m7fVar.a(kceVar.b(vn5.class), null, null), (oda) m7fVar.a(kceVar.b(oda.class), null, null), (bi7) m7fVar.a(kceVar.b(bi7.class), null, null), (k21) m7fVar.a(kceVar.b(k21.class), null, null), (dmd) m7fVar.a(kceVar.b(dmd.class), null, null), (h86) m7fVar.a(kceVar.b(h86.class), null, null));
                    e18Var.k0(wmdVar4);
                    objN = wmdVar4;
                }
                wmd wmdVar5 = (wmd) objN;
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                wmdVar3 = wmdVar5;
                qi3Var3 = (qi3) objN2;
            } else {
                e18Var.T();
                wmdVar3 = wmdVar;
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            boolean zH = e18Var.h(qi3Var3);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new gw(qi3Var3, tp4Var, 25);
                e18Var.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var, 0, 1);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN4;
            mxd mxdVarD = fxd.d(e18Var);
            zni.g(wmdVar3.i, ybgVar, e18Var, 48);
            ProjectKnowledgeBottomSheetDestination.Closed closed = ProjectKnowledgeBottomSheetDestination.Closed.INSTANCE;
            kce kceVar2 = jce.a;
            String strB = oq5.B(kceVar2.b(ProjectKnowledgeBottomSheetDestination.class));
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new yl1(closed, 3);
                e18Var.k0(objN5);
            }
            rwe rweVarP = eve.P(kceVar2.b(ProjectKnowledgeBottomSheetDestination.class), strB, true, iv1.M(kceVar2.b(ProjectKnowledgeBottomSheetDestination.class)), (zy7) objN5, e18Var);
            x44.q0(rweVarP, e18Var);
            r4g r4gVarS = gb9.S(u4g.F, null, null, new zl1(rweVarP, closed, 1), e18Var, 6, 6);
            boolean zF2 = e18Var.f(rweVarP) | e18Var.f(r4gVarS);
            Object objN6 = e18Var.N();
            if (zF2 || objN6 == lz1Var) {
                objN6 = new t4g(rweVarP, r4gVarS);
                e18Var.k0(objN6);
            }
            wmd wmdVar6 = wmdVar3;
            olh.a(false, null, null, fd9.q0(1214586448, new xmd(wmdVar6, iqbVar, projectKnowledgeScreenParams, (t4g) objN6, zy7Var, ybgVar, mxdVarD), e18Var), e18Var, 3072, 7);
            wmdVar2 = wmdVar6;
            qi3Var2 = qi3Var3;
        } else {
            e18Var.T();
            wmdVar2 = wmdVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk((Object) projectKnowledgeScreenParams, (Object) zy7Var, iqbVar, (Object) wmdVar2, (Object) qi3Var2, i, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void b(wmd wmdVar, mnc mncVar, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        wz5 wz5Var;
        lsc lscVar;
        rwe rweVar;
        Object obj;
        ?? r2;
        e18 e18Var2;
        rwe rweVar2;
        wz5 wz5Var2 = wmdVar.h;
        lsc lscVar2 = wmdVar.k;
        ProjectKnowledgeScreenParams projectKnowledgeScreenParams = wmdVar.b;
        wqd wqdVar = wmdVar.c;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(-1833576954);
        int i2 = i | (e18Var3.h(wmdVar) ? 4 : 2) | (e18Var3.f(mncVar) ? 32 : 16);
        if (e18Var3.Q(i2 & 1, (i2 & 147) != 146)) {
            kce kceVar = jce.a;
            String strB = oq5.B(kceVar.b(ProjectKnowledgePreviewDestination.class));
            Object objN = e18Var3.N();
            Object obj2 = jd4.a;
            if (objN == obj2) {
                objN = new blc(29);
                e18Var3.k0(objN);
            }
            rwe rweVarP = eve.P(kceVar.b(ProjectKnowledgePreviewDestination.class), strB, false, iv1.M(kceVar.b(ProjectKnowledgePreviewDestination.class)), (zy7) objN, e18Var3);
            x44.q0(rweVarP, e18Var3);
            iqb iqbVarI = gb9.I(iqbVar, mncVar);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var3, 0);
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVarI);
            dd4.e.getClass();
            zy7 zy7Var = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(zy7Var);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, cd4.f, q64VarA);
            d4c.i0(e18Var3, cd4.e, hycVarL);
            d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var3, cd4.h);
            d4c.i0(e18Var3, cd4.d, iqbVarE);
            ProjectKnowledgeStats projectKnowledgeStats = (ProjectKnowledgeStats) wmdVar.p.getValue();
            if (projectKnowledgeStats != null) {
                e18Var3.a0(449128178);
                wz5Var = wz5Var2;
                lscVar = lscVar2;
                rweVar = rweVarP;
                obj = obj2;
                r2 = 0;
                wd6.H(s64.a, true, null, null, null, null, fd9.q0(1060352125, new nw7(projectKnowledgeStats, 26, wmdVar), e18Var3), e18Var3, 1572918, 30);
                e18 e18Var4 = e18Var3;
                e18Var4.p(false);
                e18Var2 = e18Var4;
            } else {
                wz5Var = wz5Var2;
                lscVar = lscVar2;
                rweVar = rweVarP;
                obj = obj2;
                r2 = 0;
                e18Var3.a0(449650962);
                e18Var3.p(false);
                e18Var2 = e18Var3;
            }
            boolean zBooleanValue = ((Boolean) lscVar.getValue()).booleanValue();
            String strM809getProjectId5pmjbU = projectKnowledgeScreenParams.m809getProjectId5pmjbU();
            wqdVar.getClass();
            strM809getProjectId5pmjbU.getClass();
            List list = (List) ((Map) wqdVar.o.getValue()).get(ProjectId.m1079boximpl(strM809getProjectId5pmjbU));
            List list2 = lm6.E;
            if (list == null) {
                list = list2;
            }
            String strM809getProjectId5pmjbU2 = projectKnowledgeScreenParams.m809getProjectId5pmjbU();
            wqdVar.getClass();
            strM809getProjectId5pmjbU2.getClass();
            List list3 = (List) ((Map) wqdVar.m.getValue()).get(ProjectId.m1079boximpl(strM809getProjectId5pmjbU2));
            if (list3 != null) {
                list2 = list3;
            }
            boolean zH = e18Var2.h(rweVar);
            Object objN2 = e18Var2.N();
            if (zH || objN2 == obj) {
                rweVar2 = rweVar;
                objN2 = new pac(1, rweVar2, a.class, "preview", "preview(Lcom/anthropic/router/stack/Router;Lcom/anthropic/claude/project/knowledge/ProjectKnowledgeUpload;)V", 1, 19);
                e18Var2.k0(objN2);
            } else {
                rweVar2 = rweVar;
            }
            jm9 jm9Var = (jm9) objN2;
            if (!((Boolean) wz5Var.getValue()).booleanValue()) {
                jm9Var = null;
            }
            e18 e18Var5 = e18Var2;
            fik.c(zBooleanValue, list, list2, fd9.q0(-1512136579, new ymd(wmdVar, r2), e18Var2), null, (bz7) jm9Var, false, gb9.b(16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var5, 12585984, 80);
            e18 e18Var6 = e18Var5;
            e18Var6.p(true);
            if (((Boolean) wz5Var.getValue()).booleanValue()) {
                e18Var6.a0(-695491445);
                String strM809getProjectId5pmjbU3 = projectKnowledgeScreenParams.m809getProjectId5pmjbU();
                wqdVar.getClass();
                strM809getProjectId5pmjbU3.getClass();
                List list4 = (List) ((Map) wqdVar.m.getValue()).get(ProjectId.m1079boximpl(strM809getProjectId5pmjbU3));
                String strM809getProjectId5pmjbU4 = projectKnowledgeScreenParams.m809getProjectId5pmjbU();
                wqdVar.getClass();
                strM809getProjectId5pmjbU4.getClass();
                a.b(rweVar2, list4, (List) ((Map) wqdVar.o.getValue()).get(ProjectId.m1079boximpl(strM809getProjectId5pmjbU4)), ((Boolean) lscVar.getValue()).booleanValue(), ((Boolean) wmdVar.m.getValue()).booleanValue(), e18Var6, 0);
                e18Var6.p(r2);
                e18Var = e18Var6;
            } else {
                e18Var6.a0(-695229092);
                e18Var6.p(r2);
                e18Var = e18Var6;
            }
        } else {
            e18Var3.T();
            e18Var = e18Var3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ra7(wmdVar, i, mncVar, iqbVar, 26);
        }
    }

    public static final void c(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(74625978);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | 48;
        byte b = 0;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            ta4 ta4VarQ0 = fd9.q0(-1407571334, new sxa(zy7Var, 17, b), e18Var);
            fqb fqbVar = fqb.E;
            zni.e(fqbVar, gsk.a, ta4VarQ0, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var, 438, 248);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar, i, 13);
        }
    }
}
