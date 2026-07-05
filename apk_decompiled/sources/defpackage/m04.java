package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.kyc.KycStatusResponse;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.project.knowledge.ProjectKnowledgeBottomSheetDestination;
import com.anthropic.claude.sessions.types.SessionResource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m04 implements rz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ m04(l45 l45Var, o0h o0hVar, zy7 zy7Var, boolean z, boolean z2, c cVar, SessionResource sessionResource, bz7 bz7Var) {
        this.I = l45Var;
        this.J = o0hVar;
        this.H = zy7Var;
        this.F = z;
        this.G = z2;
        this.K = cVar;
        this.L = sessionResource;
        this.M = bz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        boolean z;
        int i = this.E;
        lz1 lz1Var = jd4.a;
        kwe kweVar = null;
        iei ieiVar = iei.a;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.I;
        Object obj7 = this.K;
        Object obj8 = this.J;
        switch (i) {
            case 0:
                final l45 l45Var = (l45) obj6;
                final o0h o0hVar = (o0h) obj8;
                final c cVar = (c) obj7;
                final SessionResource sessionResource = (SessionResource) obj5;
                final bz7 bz7Var = (bz7) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(1 & iIntValue, (iIntValue & 17) != 16)) {
                    bpc bpcVarA = a.a(ud0.e0, e18Var);
                    String strJ0 = d4c.j0(R.string.session_menu_rename, e18Var);
                    boolean zH = e18Var.h(l45Var) | e18Var.f(o0hVar);
                    zy7 zy7Var = this.H;
                    boolean zF = zH | e18Var.f(zy7Var);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new ei(l45Var, zy7Var, o0hVar, 24);
                        e18Var.k0(objN);
                    }
                    cjk.f(bpcVarA, strJ0, (zy7) objN, null, 0L, e18Var, 8, 24);
                    if (this.F) {
                        e18Var.a0(-389071055);
                        if (this.G) {
                            e18Var.a0(-389050843);
                            bpc bpcVarA2 = a.a(ud0.h, e18Var);
                            String strJ02 = d4c.j0(R.string.session_menu_unarchive, e18Var);
                            boolean zH2 = e18Var.h(l45Var) | e18Var.f(o0hVar) | e18Var.f(cVar) | e18Var.h(sessionResource) | e18Var.f(bz7Var);
                            Object objN2 = e18Var.N();
                            if (zH2 || objN2 == lz1Var) {
                                final int i2 = 0;
                                zy7 zy7Var2 = new zy7() { // from class: q04
                                    @Override // defpackage.zy7
                                    public final Object a() {
                                        int i3 = i2;
                                        iei ieiVar2 = iei.a;
                                        bz7 bz7Var2 = bz7Var;
                                        SessionResource sessionResource2 = sessionResource;
                                        c cVar2 = cVar;
                                        o0h o0hVar2 = o0hVar;
                                        l45 l45Var2 = l45Var;
                                        switch (i3) {
                                            case 0:
                                                gb9.D(l45Var2, null, null, new b14(o0hVar2, null, 1), 3);
                                                e.k(cVar2, sessionResource2, bz7Var2);
                                                break;
                                            default:
                                                gb9.D(l45Var2, null, null, new b14(o0hVar2, null, 2), 3);
                                                e.j(cVar2, sessionResource2, bz7Var2);
                                                break;
                                        }
                                        return ieiVar2;
                                    }
                                };
                                e18Var.k0(zy7Var2);
                                objN2 = zy7Var2;
                            }
                            cjk.f(bpcVarA2, strJ02, (zy7) objN2, null, 0L, e18Var, 8, 24);
                            e18Var.p(false);
                            z = false;
                        } else {
                            e18Var.a0(-388581224);
                            bpc bpcVarA3 = a.a(ud0.h, e18Var);
                            String strJ03 = d4c.j0(R.string.session_menu_archive, e18Var);
                            long j2 = gm3.a(e18Var).y;
                            boolean zH3 = e18Var.h(l45Var) | e18Var.f(o0hVar) | e18Var.f(cVar) | e18Var.h(sessionResource) | e18Var.f(bz7Var);
                            Object objN3 = e18Var.N();
                            if (zH3 || objN3 == lz1Var) {
                                j = j2;
                                final int i3 = 1;
                                zy7 zy7Var3 = new zy7() { // from class: q04
                                    @Override // defpackage.zy7
                                    public final Object a() {
                                        int i32 = i3;
                                        iei ieiVar2 = iei.a;
                                        bz7 bz7Var2 = bz7Var;
                                        SessionResource sessionResource2 = sessionResource;
                                        c cVar2 = cVar;
                                        o0h o0hVar2 = o0hVar;
                                        l45 l45Var2 = l45Var;
                                        switch (i32) {
                                            case 0:
                                                gb9.D(l45Var2, null, null, new b14(o0hVar2, null, 1), 3);
                                                e.k(cVar2, sessionResource2, bz7Var2);
                                                break;
                                            default:
                                                gb9.D(l45Var2, null, null, new b14(o0hVar2, null, 2), 3);
                                                e.j(cVar2, sessionResource2, bz7Var2);
                                                break;
                                        }
                                        return ieiVar2;
                                    }
                                };
                                e18Var.k0(zy7Var3);
                                objN3 = zy7Var3;
                            } else {
                                j = j2;
                            }
                            cjk.f(bpcVarA3, strJ03, (zy7) objN3, null, j, e18Var, 8, 8);
                            z = false;
                            e18Var.p(false);
                        }
                        e18Var.p(z);
                    } else {
                        e18Var.a0(-388105250);
                        e18Var.p(false);
                    }
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                final zy7 zy7Var4 = (zy7) obj6;
                final zy7 zy7Var5 = (zy7) obj8;
                final zy7 zy7Var6 = (zy7) obj7;
                pmd pmdVar = (pmd) obj5;
                t4g t4gVar = (t4g) obj4;
                ProjectKnowledgeBottomSheetDestination projectKnowledgeBottomSheetDestination = (ProjectKnowledgeBottomSheetDestination) obj;
                ((Integer) obj3).getClass();
                projectKnowledgeBottomSheetDestination.getClass();
                e18 e18Var2 = (e18) ((ld4) obj2);
                e18Var2.a0(-1614022088);
                if (projectKnowledgeBottomSheetDestination instanceof ProjectKnowledgeBottomSheetDestination.Closed) {
                    e18Var2.a0(-1173035643);
                    e18Var2.p(false);
                } else if (projectKnowledgeBottomSheetDestination instanceof ProjectKnowledgeBottomSheetDestination.AddContent) {
                    e18Var2.a0(-592026038);
                    String strJ04 = d4c.j0(R.string.project_knowledge_add_content_sheet_title, e18Var2);
                    final boolean z2 = this.F;
                    final boolean z3 = this.G;
                    final zy7 zy7Var7 = this.H;
                    kwe kweVar2 = new kwe(strJ04, null, esk.a, null, null, false, fd9.q0(-1673353005, new rz7() { // from class: qmd
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj9, Object obj10, Object obj11) {
                            i4g i4gVar = (i4g) obj9;
                            ld4 ld4Var2 = (ld4) obj10;
                            int iIntValue2 = ((Integer) obj11).intValue();
                            i4gVar.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                            }
                            e18 e18Var3 = (e18) ld4Var2;
                            if (e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                uhk.c(z2, z3, zy7Var7, zy7Var4, zy7Var5, zy7Var6, i4gVar, e18Var3, (iIntValue2 << 18) & 3670016);
                            } else {
                                e18Var3.T();
                            }
                            return iei.a;
                        }
                    }, e18Var2), 238);
                    e18Var2.p(false);
                    kweVar = kweVar2;
                } else {
                    if (!(projectKnowledgeBottomSheetDestination instanceof ProjectKnowledgeBottomSheetDestination.CreateDoc)) {
                        throw ebh.u(e18Var2, -592029866, false);
                    }
                    e18Var2.a0(-591998442);
                    int i4 = 9;
                    kwe kweVar3 = new kwe(d4c.j0(R.string.create_project_doc_sheet_title, e18Var2), null, null, null, fd9.q0(2110314274, new xu(pmdVar, i4, t4gVar), e18Var2), false, fd9.q0(428475540, new lca(i4, pmdVar), e18Var2), 190);
                    e18Var2.p(false);
                    kweVar = kweVar3;
                }
                e18Var2.p(false);
                return kweVar;
            default:
                final cji cjiVar = (cji) obj8;
                xs5 xs5Var = (xs5) obj7;
                l45 l45Var2 = (l45) obj6;
                final zy7 zy7Var8 = (zy7) obj5;
                final Context context = (Context) obj4;
                s64 s64Var = (s64) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                s64Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(s64Var) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var2;
                if (e18Var3.Q(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    KycStatusResponse kycStatusResponse = cjiVar != null ? (KycStatusResponse) cjiVar.o.getValue() : null;
                    fqb fqbVar = fqb.E;
                    final zy7 zy7Var9 = this.H;
                    if (kycStatusResponse != null) {
                        e18Var3.a0(-84979066);
                        String vendor_inquiry_url = kycStatusResponse.getVendor_inquiry_url();
                        if (vendor_inquiry_url == null) {
                            vendor_inquiry_url = cjiVar.h;
                        }
                        ztj.b(384, 0, e18Var3, zy7Var9, gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), vendor_inquiry_url);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-84433218);
                        e18Var3.p(false);
                        boolean zH4 = e18Var3.h(l45Var2) | e18Var3.f(xs5Var);
                        Object objN4 = e18Var3.N();
                        if (zH4 || objN4 == lz1Var) {
                            objN4 = new nif(l45Var2, 11, xs5Var);
                            e18Var3.k0(objN4);
                        }
                        tik.c(xs5Var, (bz7) objN4, gb9.L(s64Var.a(fqbVar, lja.T), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var3, 0);
                        qnc qncVarB = gb9.b(24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                        int size = i4d.G.size();
                        wo1 wo1Var = lja.P;
                        iqb iqbVarN = gb9.N(s64Var.b(fqbVar, 1.0f, true), MTTypesetterKt.kLineSkipLimitMultiplier, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                        final boolean z4 = this.F;
                        final boolean z5 = this.G;
                        wwk.c(12.0f, size, 1769472, 16264, null, wo1Var, fd9.q0(1949998053, new sz7() { // from class: yvg
                            /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
                            @Override // defpackage.sz7
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object i(java.lang.Object r22, java.lang.Object r23, java.lang.Object r24, java.lang.Object r25) {
                                /*
                                    Method dump skipped, instruction units count: 627
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.yvg.i(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, e18Var3), e18Var3, iqbVarN, null, qncVarB, null, xs5Var, null, null, false);
                    }
                } else {
                    e18Var3.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ m04(cji cjiVar, zy7 zy7Var, xs5 xs5Var, l45 l45Var, boolean z, zy7 zy7Var2, Context context, boolean z2) {
        this.J = cjiVar;
        this.H = zy7Var;
        this.K = xs5Var;
        this.I = l45Var;
        this.F = z;
        this.L = zy7Var2;
        this.M = context;
        this.G = z2;
    }

    public /* synthetic */ m04(boolean z, boolean z2, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, pmd pmdVar, t4g t4gVar) {
        this.F = z;
        this.G = z2;
        this.H = zy7Var;
        this.I = zy7Var2;
        this.J = zy7Var3;
        this.K = zy7Var4;
        this.L = pmdVar;
        this.M = t4gVar;
    }
}
