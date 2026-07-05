package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.project.knowledge.ProjectKnowledgeScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xmd implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ wmd G;
    public final /* synthetic */ ProjectKnowledgeScreenParams H;
    public final /* synthetic */ t4g I;
    public final /* synthetic */ zy7 J;
    public final /* synthetic */ ybg K;
    public final /* synthetic */ mxd L;

    public /* synthetic */ xmd(iqb iqbVar, wmd wmdVar, ProjectKnowledgeScreenParams projectKnowledgeScreenParams, t4g t4gVar, zy7 zy7Var, ybg ybgVar, mxd mxdVar) {
        this.F = iqbVar;
        this.G = wmdVar;
        this.H = projectKnowledgeScreenParams;
        this.I = t4gVar;
        this.J = zy7Var;
        this.K = ybgVar;
        this.L = mxdVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    wmd wmdVar = this.G;
                    boolean zH = e18Var.h(wmdVar);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new umd(wmdVar, 2);
                        e18Var.k0(objN);
                    }
                    bz7 bz7Var = (bz7) objN;
                    boolean zH2 = e18Var.h(wmdVar);
                    Object objN2 = e18Var.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new ymd(wmdVar, 1);
                        e18Var.k0(objN2);
                    }
                    pz7 pz7Var = (pz7) objN2;
                    boolean zH3 = e18Var.h(wmdVar);
                    Object objN3 = e18Var.N();
                    if (zH3 || objN3 == lz1Var) {
                        objN3 = new ymd(wmdVar, 2);
                        e18Var.k0(objN3);
                    }
                    eve.c(true, bz7Var, pz7Var, null, (pz7) objN3, null, fd9.q0(-1589269882, new xmd(this.F, wmdVar, this.H, this.I, this.J, this.K, this.L), e18Var), e18Var, 1575942);
                }
                break;
            default:
                wmd wmdVar2 = this.G;
                wz5 wz5Var = wmdVar2.f;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    ta4 ta4VarQ0 = fd9.q0(86180745, new sxa(this.J, 18, (byte) 0), e18Var2);
                    t4g t4gVar = this.I;
                    v40.b(this.F, null, ta4VarQ0, fd9.q0(188657738, new lpa(t4gVar, 24, wmdVar2), e18Var2), fd9.q0(291134731, new rn(this.K, 20), e18Var2), null, 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(2046579132, new nw7(wmdVar2, 27, this.L), e18Var2), e18Var2, 28032, 2018);
                    boolean zH4 = e18Var2.h(wmdVar2);
                    Object objN4 = e18Var2.N();
                    if (zH4 || objN4 == lz1Var) {
                        bo boVar = new bo(2, wmdVar2, wmd.class, "uploadProjectKnowledge", "uploadProjectKnowledge(Ljava/util/List;Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileSource;)V", 0, 21);
                        e18Var2.k0(boVar);
                        objN4 = boVar;
                    }
                    r7i r7iVarF = itj.f((pz7) ((jm9) objN4), wmdVar2.j.k, e18Var2);
                    ti7 ti7Var = (ti7) r7iVarF.E;
                    l4h l4hVar = (l4h) r7iVarF.F;
                    q2d q2dVar = (q2d) r7iVarF.G;
                    String strM809getProjectId5pmjbU = this.H.m809getProjectId5pmjbU();
                    strM809getProjectId5pmjbU.getClass();
                    gf8 gf8Var = (gf8) e18Var2.j(ve4.l);
                    m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                    boolean zF = e18Var2.f(strM809getProjectId5pmjbU) | e18Var2.h(gf8Var) | e18Var2.h(m7fVar);
                    Object objN5 = e18Var2.N();
                    if (zF || objN5 == lz1Var) {
                        objN5 = new f2d(strM809getProjectId5pmjbU, gf8Var, m7fVar, 4);
                        e18Var2.k0(objN5);
                    }
                    kce kceVar = jce.a;
                    pmd pmdVar = (pmd) fd9.r0(kceVar.b(pmd.class), oq5.B(kceVar.b(pmd.class)), (bz7) objN5, e18Var2);
                    boolean zBooleanValue = ((Boolean) wz5Var.getValue()).booleanValue();
                    boolean z = ((Boolean) wz5Var.getValue()).booleanValue() && l4hVar != null;
                    boolean zF2 = e18Var2.f(ti7Var) | e18Var2.h(t4gVar);
                    Object objN6 = e18Var2.N();
                    if (zF2 || objN6 == lz1Var) {
                        objN6 = new aac(ti7Var, 9, t4gVar);
                        e18Var2.k0(objN6);
                    }
                    zy7 zy7Var = (zy7) objN6;
                    boolean zH5 = e18Var2.h(t4gVar);
                    Object objN7 = e18Var2.N();
                    if (zH5 || objN7 == lz1Var) {
                        objN7 = new ue(t4gVar, 22);
                        e18Var2.k0(objN7);
                    }
                    zy7 zy7Var2 = (zy7) objN7;
                    boolean zH6 = e18Var2.h(l4hVar) | e18Var2.h(t4gVar);
                    Object objN8 = e18Var2.N();
                    if (zH6 || objN8 == lz1Var) {
                        objN8 = new aac(l4hVar, 10, t4gVar);
                        e18Var2.k0(objN8);
                    }
                    zy7 zy7Var3 = (zy7) objN8;
                    boolean zH7 = e18Var2.h(q2dVar) | e18Var2.h(t4gVar);
                    Object objN9 = e18Var2.N();
                    if (zH7 || objN9 == lz1Var) {
                        objN9 = new aac(q2dVar, 11, t4gVar);
                        e18Var2.k0(objN9);
                    }
                    yhk.e(pmdVar, t4gVar, zBooleanValue, z, zy7Var, zy7Var2, zy7Var3, (zy7) objN9, e18Var2, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ xmd(wmd wmdVar, iqb iqbVar, ProjectKnowledgeScreenParams projectKnowledgeScreenParams, t4g t4gVar, zy7 zy7Var, ybg ybgVar, mxd mxdVar) {
        this.G = wmdVar;
        this.F = iqbVar;
        this.H = projectKnowledgeScreenParams;
        this.I = t4gVar;
        this.J = zy7Var;
        this.K = ybgVar;
        this.L = mxdVar;
    }
}
