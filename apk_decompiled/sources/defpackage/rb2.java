package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.configs.flags.ToolSearchConfig;
import com.anthropic.claude.configs.flags.ToolSearchModeConfig;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.types.strings.ToolSearchMode;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rb2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ rb2(e8d e8dVar, boolean z, boolean z2, bz7 bz7Var, String str, isc iscVar) {
        this.E = 2;
        this.H = e8dVar;
        this.F = z;
        this.G = z2;
        this.I = bz7Var;
        this.J = str;
        this.K = iscVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        List<ToolSearchModeConfig> modes;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.K;
        Object obj3 = this.J;
        Object obj4 = this.I;
        boolean z = this.G;
        boolean z2 = this.F;
        Object obj5 = this.H;
        final int i2 = 1;
        switch (i) {
            case 0:
                final qb2 qb2Var = (qb2) obj5;
                pz7 pz7Var = (pz7) obj2;
                haa haaVar = (haa) obj;
                haaVar.getClass();
                boolean z3 = false;
                z3 = false;
                final int i3 = z3 ? 1 : 0;
                haa.a(haaVar, z2, new ta4(-40429007, true, new sz7() { // from class: sb2
                    @Override // defpackage.sz7
                    public final Object i(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i4 = i3;
                        iei ieiVar2 = iei.a;
                        final qb2 qb2Var2 = qb2Var;
                        final int i5 = 1;
                        final int i6 = 0;
                        ld4 ld4Var = (ld4) obj8;
                        int iH = ebh.h((Integer) obj9, (s64) obj6, (mnc) obj7);
                        switch (i4) {
                            case 0:
                                e18 e18Var = (e18) ld4Var;
                                if (!e18Var.Q(iH & 1, (iH & 129) != 128)) {
                                    e18Var.T();
                                } else {
                                    yhk.a(null, fd9.q0(1441544018, new rz7() { // from class: tb2
                                        @Override // defpackage.rz7
                                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                            qb2 qb2Var3;
                                            zb0 zb0VarA;
                                            Object ybVar;
                                            qb2 qb2Var4;
                                            boolean z4;
                                            zb0 zb0VarA2;
                                            Object ybVar2;
                                            qb2 qb2Var5;
                                            boolean z5;
                                            zb0 zb0VarA3;
                                            Object ybVar3;
                                            qb2 qb2Var6;
                                            boolean z6;
                                            zb0 zb0VarA4;
                                            boolean z7;
                                            List<ToolSearchModeConfig> modes2;
                                            int i7 = i6;
                                            iei ieiVar3 = iei.a;
                                            Object obj13 = jd4.a;
                                            switch (i7) {
                                                case 0:
                                                    ld4 ld4Var2 = (ld4) obj11;
                                                    int iIntValue = ((Integer) obj12).intValue();
                                                    wo1 wo1Var = lja.Q;
                                                    ((s64) obj10).getClass();
                                                    e18 e18Var2 = (e18) ld4Var2;
                                                    if (!e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        e18Var2.T();
                                                    } else {
                                                        qb2 qb2Var7 = qb2Var2;
                                                        if (qb2Var7.S().a) {
                                                            e18Var2.a0(-339980724);
                                                            bpc bpcVarA = a.a(ud0.u0, e18Var2);
                                                            String strJ0 = d4c.j0(R.string.web_search_title, e18Var2);
                                                            ta4 ta4Var = qb2Var7.S().b ? lwj.b : null;
                                                            if (qb2Var7.S().b()) {
                                                                zb0VarA4 = qy1.f(e18Var2, -339519444, R.string.web_search_description, e18Var2, false);
                                                            } else {
                                                                e18Var2.a0(-339383044);
                                                                zb0VarA4 = qb2Var7.S().a(e18Var2);
                                                                e18Var2.p(false);
                                                            }
                                                            zb0 zb0Var = zb0VarA4;
                                                            boolean zB = qb2Var7.S().b();
                                                            boolean z8 = qb2Var7.S().c;
                                                            boolean zH = e18Var2.h(qb2Var7);
                                                            Object objN = e18Var2.N();
                                                            if (zH || objN == obj13) {
                                                                z7 = z8;
                                                                Object ybVar4 = new yb(1, qb2Var7, qb2.class, "onWebSearchCheckedChange", "onWebSearchCheckedChange(Z)V", 0, 23);
                                                                e18Var2.k0(ybVar4);
                                                                objN = ybVar4;
                                                            } else {
                                                                z7 = z8;
                                                            }
                                                            qb2Var3 = qb2Var7;
                                                            rkj.d(bpcVarA, strJ0, z7, (bz7) ((jm9) objN), null, ta4Var, zb0Var, zB, qf2.a(e18Var2), qf2.c(e18Var2), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var2, 8, 384, 4188176);
                                                            e18Var2.p(false);
                                                        } else {
                                                            qb2Var3 = qb2Var7;
                                                            e18Var2.a0(-338659504);
                                                            e18Var2.p(false);
                                                        }
                                                        if (qb2Var3.Q().a) {
                                                            e18Var2.a0(-338496041);
                                                            bpc bpcVarA2 = a.a(ud0.q, e18Var2);
                                                            String strJ02 = d4c.j0(R.string.product_name_artifacts, e18Var2);
                                                            if (qb2Var3.Q().b()) {
                                                                zb0VarA3 = qy1.f(e18Var2, -338259635, R.string.artifacts_description, e18Var2, false);
                                                            } else {
                                                                e18Var2.a0(-338124196);
                                                                zb0VarA3 = qb2Var3.Q().a(e18Var2);
                                                                e18Var2.p(false);
                                                            }
                                                            zb0 zb0Var2 = zb0VarA3;
                                                            boolean zB2 = qb2Var3.Q().b();
                                                            boolean z9 = qb2Var3.Q().c;
                                                            boolean zH2 = e18Var2.h(qb2Var3);
                                                            Object objN2 = e18Var2.N();
                                                            if (zH2 || objN2 == obj13) {
                                                                qb2Var6 = qb2Var3;
                                                                z6 = z9;
                                                                ybVar3 = new yb(1, qb2Var6, qb2.class, "onArtifactsCheckedChange", "onArtifactsCheckedChange(Z)V", 0, 24);
                                                                e18Var2.k0(ybVar3);
                                                            } else {
                                                                qb2Var6 = qb2Var3;
                                                                z6 = z9;
                                                                ybVar3 = objN2;
                                                            }
                                                            boolean z10 = z6;
                                                            qb2Var3 = qb2Var6;
                                                            rkj.d(bpcVarA2, strJ02, z10, (bz7) ((jm9) ybVar3), null, null, zb0Var2, zB2, qf2.a(e18Var2), qf2.c(e18Var2), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var2, 8, 384, 4188208);
                                                            e18Var2.p(false);
                                                        } else {
                                                            e18Var2.a0(-337400656);
                                                            e18Var2.p(false);
                                                        }
                                                        if (qb2Var3.P().a) {
                                                            e18Var2.a0(-337216392);
                                                            bpc bpcVarA3 = a.a(ud0.r, e18Var2);
                                                            ta4 ta4Var2 = qb2Var3.P().b ? lwj.c : null;
                                                            String strJ03 = d4c.j0(R.string.ai_artifacts_title, e18Var2);
                                                            if (qb2Var3.P().b()) {
                                                                zb0VarA2 = qy1.f(e18Var2, -336745750, R.string.ai_artifacts_description, e18Var2, false);
                                                            } else {
                                                                e18Var2.a0(-336607366);
                                                                zb0VarA2 = qb2Var3.P().a(e18Var2);
                                                                e18Var2.p(false);
                                                            }
                                                            zb0 zb0Var3 = zb0VarA2;
                                                            boolean zB3 = qb2Var3.P().b();
                                                            boolean z11 = qb2Var3.P().c;
                                                            boolean zH3 = e18Var2.h(qb2Var3);
                                                            Object objN3 = e18Var2.N();
                                                            if (zH3 || objN3 == obj13) {
                                                                qb2Var5 = qb2Var3;
                                                                z5 = z11;
                                                                ybVar2 = new yb(1, qb2Var5, qb2.class, "onAiArtifactsCheckedChange", "onAiArtifactsCheckedChange(Z)V", 0, 25);
                                                                e18Var2.k0(ybVar2);
                                                            } else {
                                                                qb2Var5 = qb2Var3;
                                                                z5 = z11;
                                                                ybVar2 = objN3;
                                                            }
                                                            boolean z12 = z5;
                                                            qb2Var3 = qb2Var5;
                                                            rkj.d(bpcVarA3, strJ03, z12, (bz7) ((jm9) ybVar2), null, ta4Var2, zb0Var3, zB3, qf2.a(e18Var2), qf2.c(e18Var2), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var2, 8, 384, 4188176);
                                                            e18Var2.p(false);
                                                        } else {
                                                            e18Var2.a0(-335875952);
                                                            e18Var2.p(false);
                                                        }
                                                        if (qb2Var3.R() == null || !(!qok.f(r1).isEmpty())) {
                                                            e18Var2.a0(-334813520);
                                                            e18Var2.p(false);
                                                        } else {
                                                            e18Var2.a0(-335694602);
                                                            bpc bpcVarA4 = a.a(ud0.F, e18Var2);
                                                            String strJ04 = d4c.j0(R.string.inline_visualizations_title, e18Var2);
                                                            zb0 zb0VarI = zrk.i(R.string.inline_visualizations_description, e18Var2);
                                                            McpServer mcpServerR = qb2Var3.R();
                                                            boolean z13 = mcpServerR != null && qb2Var3.b.E.f(null, mcpServerR.m346getUuidowoRr7k()) > 0;
                                                            boolean zH4 = e18Var2.h(qb2Var3);
                                                            Object objN4 = e18Var2.N();
                                                            if (zH4 || objN4 == obj13) {
                                                                Object ybVar5 = new yb(1, qb2Var3, qb2.class, "onInlineVisualizationsCheckedChange", "onInlineVisualizationsCheckedChange(Z)V", 0, 26);
                                                                e18Var2.k0(ybVar5);
                                                                objN4 = ybVar5;
                                                            }
                                                            rkj.d(bpcVarA4, strJ04, z13, (bz7) ((jm9) objN4), null, lwj.d, zb0VarI, false, qf2.a(e18Var2), qf2.c(e18Var2), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var2, 196616, 384, 4188304);
                                                            e18Var2.p(false);
                                                        }
                                                        if (qb2Var3.T().a) {
                                                            e18Var2.a0(-334649561);
                                                            bpc bpcVarA5 = a.a(ud0.l0, e18Var2);
                                                            String strJ05 = d4c.j0(R.string.wiggle_title, e18Var2);
                                                            ta4 ta4Var3 = qb2Var3.T().b ? lwj.e : null;
                                                            if (qb2Var3.T().b()) {
                                                                zb0VarA = qy1.f(e18Var2, -334198480, R.string.wiggle_description, e18Var2, false);
                                                            } else {
                                                                e18Var2.a0(-334066017);
                                                                zb0VarA = qb2Var3.T().a(e18Var2);
                                                                e18Var2.p(false);
                                                            }
                                                            boolean zB4 = qb2Var3.T().b();
                                                            boolean z14 = qb2Var3.T().c;
                                                            boolean zH5 = e18Var2.h(qb2Var3);
                                                            Object objN5 = e18Var2.N();
                                                            if (zH5 || objN5 == obj13) {
                                                                qb2Var4 = qb2Var3;
                                                                z4 = z14;
                                                                ybVar = new yb(1, qb2Var4, qb2.class, "onWiggleCheckedChange", "onWiggleCheckedChange(Z)V", 0, 27);
                                                                e18Var2.k0(ybVar);
                                                            } else {
                                                                qb2Var4 = qb2Var3;
                                                                z4 = z14;
                                                                ybVar = objN5;
                                                            }
                                                            boolean z15 = z4;
                                                            qb2Var3 = qb2Var4;
                                                            rkj.d(bpcVarA5, strJ05, z15, (bz7) ((jm9) ybVar), null, ta4Var3, zb0VarA, zB4, qf2.a(e18Var2), qf2.c(e18Var2), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var2, 8, 384, 4188176);
                                                            e18Var2.p(false);
                                                        } else {
                                                            e18Var2.a0(-333354288);
                                                            e18Var2.p(false);
                                                        }
                                                        if (!qb2Var3.j.b()) {
                                                            e18Var2.a0(-332399984);
                                                            e18Var2.p(false);
                                                        } else {
                                                            e18Var2.a0(-333229172);
                                                            bpc bpcVarA6 = a.a(ud0.p, e18Var2);
                                                            String strJ06 = d4c.j0(R.string.model_auto_fallback_setting_title, e18Var2);
                                                            zb0 zb0VarI2 = zrk.i(R.string.model_auto_fallback_setting_description, e18Var2);
                                                            boolean zK = qb2Var3.d.k();
                                                            boolean zH6 = e18Var2.h(qb2Var3);
                                                            Object objN6 = e18Var2.N();
                                                            if (zH6 || objN6 == obj13) {
                                                                Object ybVar6 = new yb(1, qb2Var3, qb2.class, "updateModelAutoFallbackEnabled", "updateModelAutoFallbackEnabled(Z)V", 0, 28);
                                                                e18Var2.k0(ybVar6);
                                                                objN6 = ybVar6;
                                                            }
                                                            rkj.d(bpcVarA6, strJ06, zK, (bz7) ((jm9) objN6), null, null, zb0VarI2, false, qf2.a(e18Var2), qf2.c(e18Var2), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var2, 8, 384, 4188336);
                                                            e18Var2.p(false);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    ld4 ld4Var3 = (ld4) obj11;
                                                    int iIntValue2 = ((Integer) obj12).intValue();
                                                    ((s64) obj10).getClass();
                                                    e18 e18Var3 = (e18) ld4Var3;
                                                    if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        e18Var3.T();
                                                    } else {
                                                        qb2 qb2Var8 = qb2Var2;
                                                        ToolSearchConfig toolSearchConfig = (ToolSearchConfig) qb2Var8.i.D.getValue();
                                                        if (toolSearchConfig == null || (modes2 = toolSearchConfig.getModes()) == null) {
                                                            modes2 = lm6.E;
                                                        }
                                                        ToolSearchMode toolSearchMode = (ToolSearchMode) qb2Var8.d.n.getValue();
                                                        String strM1156unboximpl = toolSearchMode != null ? toolSearchMode.m1156unboximpl() : null;
                                                        boolean zH7 = e18Var3.h(qb2Var8);
                                                        Object objN7 = e18Var3.N();
                                                        if (zH7 || objN7 == obj13) {
                                                            Object ub2Var = new ub2(1, qb2Var8, qb2.class, "updateToolSearchMode", "updateToolSearchMode-UeoRtOs(Ljava/lang/String;)V", 0, 2);
                                                            e18Var3.k0(ub2Var);
                                                            objN7 = ub2Var;
                                                        }
                                                        kwj.b(modes2, strM1156unboximpl, (bz7) ((jm9) objN7), e18Var3, 0);
                                                    }
                                                    break;
                                            }
                                            return ieiVar3;
                                        }
                                    }, e18Var), e18Var, 48);
                                }
                                break;
                            default:
                                e18 e18Var2 = (e18) ld4Var;
                                if (!e18Var2.Q(iH & 1, (iH & 129) != 128)) {
                                    e18Var2.T();
                                } else {
                                    yhk.b(0, 2, e18Var2, null, d4c.j0(R.string.settings_tool_access, e18Var2));
                                    yhk.a(null, fd9.q0(-1737697462, new rz7() { // from class: tb2
                                        @Override // defpackage.rz7
                                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                            qb2 qb2Var3;
                                            zb0 zb0VarA;
                                            Object ybVar;
                                            qb2 qb2Var4;
                                            boolean z4;
                                            zb0 zb0VarA2;
                                            Object ybVar2;
                                            qb2 qb2Var5;
                                            boolean z5;
                                            zb0 zb0VarA3;
                                            Object ybVar3;
                                            qb2 qb2Var6;
                                            boolean z6;
                                            zb0 zb0VarA4;
                                            boolean z7;
                                            List<ToolSearchModeConfig> modes2;
                                            int i7 = i5;
                                            iei ieiVar3 = iei.a;
                                            Object obj13 = jd4.a;
                                            switch (i7) {
                                                case 0:
                                                    ld4 ld4Var2 = (ld4) obj11;
                                                    int iIntValue = ((Integer) obj12).intValue();
                                                    wo1 wo1Var = lja.Q;
                                                    ((s64) obj10).getClass();
                                                    e18 e18Var22 = (e18) ld4Var2;
                                                    if (!e18Var22.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        e18Var22.T();
                                                    } else {
                                                        qb2 qb2Var7 = qb2Var2;
                                                        if (qb2Var7.S().a) {
                                                            e18Var22.a0(-339980724);
                                                            bpc bpcVarA = a.a(ud0.u0, e18Var22);
                                                            String strJ0 = d4c.j0(R.string.web_search_title, e18Var22);
                                                            ta4 ta4Var = qb2Var7.S().b ? lwj.b : null;
                                                            if (qb2Var7.S().b()) {
                                                                zb0VarA4 = qy1.f(e18Var22, -339519444, R.string.web_search_description, e18Var22, false);
                                                            } else {
                                                                e18Var22.a0(-339383044);
                                                                zb0VarA4 = qb2Var7.S().a(e18Var22);
                                                                e18Var22.p(false);
                                                            }
                                                            zb0 zb0Var = zb0VarA4;
                                                            boolean zB = qb2Var7.S().b();
                                                            boolean z8 = qb2Var7.S().c;
                                                            boolean zH = e18Var22.h(qb2Var7);
                                                            Object objN = e18Var22.N();
                                                            if (zH || objN == obj13) {
                                                                z7 = z8;
                                                                Object ybVar4 = new yb(1, qb2Var7, qb2.class, "onWebSearchCheckedChange", "onWebSearchCheckedChange(Z)V", 0, 23);
                                                                e18Var22.k0(ybVar4);
                                                                objN = ybVar4;
                                                            } else {
                                                                z7 = z8;
                                                            }
                                                            qb2Var3 = qb2Var7;
                                                            rkj.d(bpcVarA, strJ0, z7, (bz7) ((jm9) objN), null, ta4Var, zb0Var, zB, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188176);
                                                            e18Var22.p(false);
                                                        } else {
                                                            qb2Var3 = qb2Var7;
                                                            e18Var22.a0(-338659504);
                                                            e18Var22.p(false);
                                                        }
                                                        if (qb2Var3.Q().a) {
                                                            e18Var22.a0(-338496041);
                                                            bpc bpcVarA2 = a.a(ud0.q, e18Var22);
                                                            String strJ02 = d4c.j0(R.string.product_name_artifacts, e18Var22);
                                                            if (qb2Var3.Q().b()) {
                                                                zb0VarA3 = qy1.f(e18Var22, -338259635, R.string.artifacts_description, e18Var22, false);
                                                            } else {
                                                                e18Var22.a0(-338124196);
                                                                zb0VarA3 = qb2Var3.Q().a(e18Var22);
                                                                e18Var22.p(false);
                                                            }
                                                            zb0 zb0Var2 = zb0VarA3;
                                                            boolean zB2 = qb2Var3.Q().b();
                                                            boolean z9 = qb2Var3.Q().c;
                                                            boolean zH2 = e18Var22.h(qb2Var3);
                                                            Object objN2 = e18Var22.N();
                                                            if (zH2 || objN2 == obj13) {
                                                                qb2Var6 = qb2Var3;
                                                                z6 = z9;
                                                                ybVar3 = new yb(1, qb2Var6, qb2.class, "onArtifactsCheckedChange", "onArtifactsCheckedChange(Z)V", 0, 24);
                                                                e18Var22.k0(ybVar3);
                                                            } else {
                                                                qb2Var6 = qb2Var3;
                                                                z6 = z9;
                                                                ybVar3 = objN2;
                                                            }
                                                            boolean z10 = z6;
                                                            qb2Var3 = qb2Var6;
                                                            rkj.d(bpcVarA2, strJ02, z10, (bz7) ((jm9) ybVar3), null, null, zb0Var2, zB2, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188208);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-337400656);
                                                            e18Var22.p(false);
                                                        }
                                                        if (qb2Var3.P().a) {
                                                            e18Var22.a0(-337216392);
                                                            bpc bpcVarA3 = a.a(ud0.r, e18Var22);
                                                            ta4 ta4Var2 = qb2Var3.P().b ? lwj.c : null;
                                                            String strJ03 = d4c.j0(R.string.ai_artifacts_title, e18Var22);
                                                            if (qb2Var3.P().b()) {
                                                                zb0VarA2 = qy1.f(e18Var22, -336745750, R.string.ai_artifacts_description, e18Var22, false);
                                                            } else {
                                                                e18Var22.a0(-336607366);
                                                                zb0VarA2 = qb2Var3.P().a(e18Var22);
                                                                e18Var22.p(false);
                                                            }
                                                            zb0 zb0Var3 = zb0VarA2;
                                                            boolean zB3 = qb2Var3.P().b();
                                                            boolean z11 = qb2Var3.P().c;
                                                            boolean zH3 = e18Var22.h(qb2Var3);
                                                            Object objN3 = e18Var22.N();
                                                            if (zH3 || objN3 == obj13) {
                                                                qb2Var5 = qb2Var3;
                                                                z5 = z11;
                                                                ybVar2 = new yb(1, qb2Var5, qb2.class, "onAiArtifactsCheckedChange", "onAiArtifactsCheckedChange(Z)V", 0, 25);
                                                                e18Var22.k0(ybVar2);
                                                            } else {
                                                                qb2Var5 = qb2Var3;
                                                                z5 = z11;
                                                                ybVar2 = objN3;
                                                            }
                                                            boolean z12 = z5;
                                                            qb2Var3 = qb2Var5;
                                                            rkj.d(bpcVarA3, strJ03, z12, (bz7) ((jm9) ybVar2), null, ta4Var2, zb0Var3, zB3, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188176);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-335875952);
                                                            e18Var22.p(false);
                                                        }
                                                        if (qb2Var3.R() == null || !(!qok.f(r1).isEmpty())) {
                                                            e18Var22.a0(-334813520);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-335694602);
                                                            bpc bpcVarA4 = a.a(ud0.F, e18Var22);
                                                            String strJ04 = d4c.j0(R.string.inline_visualizations_title, e18Var22);
                                                            zb0 zb0VarI = zrk.i(R.string.inline_visualizations_description, e18Var22);
                                                            McpServer mcpServerR = qb2Var3.R();
                                                            boolean z13 = mcpServerR != null && qb2Var3.b.E.f(null, mcpServerR.m346getUuidowoRr7k()) > 0;
                                                            boolean zH4 = e18Var22.h(qb2Var3);
                                                            Object objN4 = e18Var22.N();
                                                            if (zH4 || objN4 == obj13) {
                                                                Object ybVar5 = new yb(1, qb2Var3, qb2.class, "onInlineVisualizationsCheckedChange", "onInlineVisualizationsCheckedChange(Z)V", 0, 26);
                                                                e18Var22.k0(ybVar5);
                                                                objN4 = ybVar5;
                                                            }
                                                            rkj.d(bpcVarA4, strJ04, z13, (bz7) ((jm9) objN4), null, lwj.d, zb0VarI, false, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 196616, 384, 4188304);
                                                            e18Var22.p(false);
                                                        }
                                                        if (qb2Var3.T().a) {
                                                            e18Var22.a0(-334649561);
                                                            bpc bpcVarA5 = a.a(ud0.l0, e18Var22);
                                                            String strJ05 = d4c.j0(R.string.wiggle_title, e18Var22);
                                                            ta4 ta4Var3 = qb2Var3.T().b ? lwj.e : null;
                                                            if (qb2Var3.T().b()) {
                                                                zb0VarA = qy1.f(e18Var22, -334198480, R.string.wiggle_description, e18Var22, false);
                                                            } else {
                                                                e18Var22.a0(-334066017);
                                                                zb0VarA = qb2Var3.T().a(e18Var22);
                                                                e18Var22.p(false);
                                                            }
                                                            boolean zB4 = qb2Var3.T().b();
                                                            boolean z14 = qb2Var3.T().c;
                                                            boolean zH5 = e18Var22.h(qb2Var3);
                                                            Object objN5 = e18Var22.N();
                                                            if (zH5 || objN5 == obj13) {
                                                                qb2Var4 = qb2Var3;
                                                                z4 = z14;
                                                                ybVar = new yb(1, qb2Var4, qb2.class, "onWiggleCheckedChange", "onWiggleCheckedChange(Z)V", 0, 27);
                                                                e18Var22.k0(ybVar);
                                                            } else {
                                                                qb2Var4 = qb2Var3;
                                                                z4 = z14;
                                                                ybVar = objN5;
                                                            }
                                                            boolean z15 = z4;
                                                            qb2Var3 = qb2Var4;
                                                            rkj.d(bpcVarA5, strJ05, z15, (bz7) ((jm9) ybVar), null, ta4Var3, zb0VarA, zB4, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188176);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-333354288);
                                                            e18Var22.p(false);
                                                        }
                                                        if (!qb2Var3.j.b()) {
                                                            e18Var22.a0(-332399984);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-333229172);
                                                            bpc bpcVarA6 = a.a(ud0.p, e18Var22);
                                                            String strJ06 = d4c.j0(R.string.model_auto_fallback_setting_title, e18Var22);
                                                            zb0 zb0VarI2 = zrk.i(R.string.model_auto_fallback_setting_description, e18Var22);
                                                            boolean zK = qb2Var3.d.k();
                                                            boolean zH6 = e18Var22.h(qb2Var3);
                                                            Object objN6 = e18Var22.N();
                                                            if (zH6 || objN6 == obj13) {
                                                                Object ybVar6 = new yb(1, qb2Var3, qb2.class, "updateModelAutoFallbackEnabled", "updateModelAutoFallbackEnabled(Z)V", 0, 28);
                                                                e18Var22.k0(ybVar6);
                                                                objN6 = ybVar6;
                                                            }
                                                            rkj.d(bpcVarA6, strJ06, zK, (bz7) ((jm9) objN6), null, null, zb0VarI2, false, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188336);
                                                            e18Var22.p(false);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    ld4 ld4Var3 = (ld4) obj11;
                                                    int iIntValue2 = ((Integer) obj12).intValue();
                                                    ((s64) obj10).getClass();
                                                    e18 e18Var3 = (e18) ld4Var3;
                                                    if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        e18Var3.T();
                                                    } else {
                                                        qb2 qb2Var8 = qb2Var2;
                                                        ToolSearchConfig toolSearchConfig = (ToolSearchConfig) qb2Var8.i.D.getValue();
                                                        if (toolSearchConfig == null || (modes2 = toolSearchConfig.getModes()) == null) {
                                                            modes2 = lm6.E;
                                                        }
                                                        ToolSearchMode toolSearchMode = (ToolSearchMode) qb2Var8.d.n.getValue();
                                                        String strM1156unboximpl = toolSearchMode != null ? toolSearchMode.m1156unboximpl() : null;
                                                        boolean zH7 = e18Var3.h(qb2Var8);
                                                        Object objN7 = e18Var3.N();
                                                        if (zH7 || objN7 == obj13) {
                                                            Object ub2Var = new ub2(1, qb2Var8, qb2.class, "updateToolSearchMode", "updateToolSearchMode-UeoRtOs(Ljava/lang/String;)V", 0, 2);
                                                            e18Var3.k0(ub2Var);
                                                            objN7 = ub2Var;
                                                        }
                                                        kwj.b(modes2, strM1156unboximpl, (bz7) ((jm9) objN7), e18Var3, 0);
                                                    }
                                                    break;
                                            }
                                            return ieiVar3;
                                        }
                                    }, e18Var2), e18Var2, 48);
                                }
                                break;
                        }
                        return ieiVar2;
                    }
                }), 2);
                haa.a(haaVar, z, new ta4(1026033832, true, new kw(qb2Var, (ze0) obj4, (zy7) obj3, pz7Var, 2)), 2);
                if (((Boolean) qb2Var.i.C.getValue()).booleanValue()) {
                    ToolSearchConfig toolSearchConfig = (ToolSearchConfig) qb2Var.i.D.getValue();
                    if (toolSearchConfig == null || (modes = toolSearchConfig.getModes()) == null) {
                        modes = lm6.E;
                    }
                    if (!modes.isEmpty()) {
                        z3 = true;
                    }
                }
                haa.a(haaVar, z3, new ta4(15367785, true, new sz7() { // from class: sb2
                    @Override // defpackage.sz7
                    public final Object i(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i4 = i2;
                        iei ieiVar2 = iei.a;
                        final qb2 qb2Var2 = qb2Var;
                        final int i5 = 1;
                        final int i6 = 0;
                        ld4 ld4Var = (ld4) obj8;
                        int iH = ebh.h((Integer) obj9, (s64) obj6, (mnc) obj7);
                        switch (i4) {
                            case 0:
                                e18 e18Var = (e18) ld4Var;
                                if (!e18Var.Q(iH & 1, (iH & 129) != 128)) {
                                    e18Var.T();
                                } else {
                                    yhk.a(null, fd9.q0(1441544018, new rz7() { // from class: tb2
                                        @Override // defpackage.rz7
                                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                            qb2 qb2Var3;
                                            zb0 zb0VarA;
                                            Object ybVar;
                                            qb2 qb2Var4;
                                            boolean z4;
                                            zb0 zb0VarA2;
                                            Object ybVar2;
                                            qb2 qb2Var5;
                                            boolean z5;
                                            zb0 zb0VarA3;
                                            Object ybVar3;
                                            qb2 qb2Var6;
                                            boolean z6;
                                            zb0 zb0VarA4;
                                            boolean z7;
                                            List<ToolSearchModeConfig> modes2;
                                            int i7 = i6;
                                            iei ieiVar3 = iei.a;
                                            Object obj13 = jd4.a;
                                            switch (i7) {
                                                case 0:
                                                    ld4 ld4Var2 = (ld4) obj11;
                                                    int iIntValue = ((Integer) obj12).intValue();
                                                    wo1 wo1Var = lja.Q;
                                                    ((s64) obj10).getClass();
                                                    e18 e18Var22 = (e18) ld4Var2;
                                                    if (!e18Var22.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        e18Var22.T();
                                                    } else {
                                                        qb2 qb2Var7 = qb2Var2;
                                                        if (qb2Var7.S().a) {
                                                            e18Var22.a0(-339980724);
                                                            bpc bpcVarA = a.a(ud0.u0, e18Var22);
                                                            String strJ0 = d4c.j0(R.string.web_search_title, e18Var22);
                                                            ta4 ta4Var = qb2Var7.S().b ? lwj.b : null;
                                                            if (qb2Var7.S().b()) {
                                                                zb0VarA4 = qy1.f(e18Var22, -339519444, R.string.web_search_description, e18Var22, false);
                                                            } else {
                                                                e18Var22.a0(-339383044);
                                                                zb0VarA4 = qb2Var7.S().a(e18Var22);
                                                                e18Var22.p(false);
                                                            }
                                                            zb0 zb0Var = zb0VarA4;
                                                            boolean zB = qb2Var7.S().b();
                                                            boolean z8 = qb2Var7.S().c;
                                                            boolean zH = e18Var22.h(qb2Var7);
                                                            Object objN = e18Var22.N();
                                                            if (zH || objN == obj13) {
                                                                z7 = z8;
                                                                Object ybVar4 = new yb(1, qb2Var7, qb2.class, "onWebSearchCheckedChange", "onWebSearchCheckedChange(Z)V", 0, 23);
                                                                e18Var22.k0(ybVar4);
                                                                objN = ybVar4;
                                                            } else {
                                                                z7 = z8;
                                                            }
                                                            qb2Var3 = qb2Var7;
                                                            rkj.d(bpcVarA, strJ0, z7, (bz7) ((jm9) objN), null, ta4Var, zb0Var, zB, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188176);
                                                            e18Var22.p(false);
                                                        } else {
                                                            qb2Var3 = qb2Var7;
                                                            e18Var22.a0(-338659504);
                                                            e18Var22.p(false);
                                                        }
                                                        if (qb2Var3.Q().a) {
                                                            e18Var22.a0(-338496041);
                                                            bpc bpcVarA2 = a.a(ud0.q, e18Var22);
                                                            String strJ02 = d4c.j0(R.string.product_name_artifacts, e18Var22);
                                                            if (qb2Var3.Q().b()) {
                                                                zb0VarA3 = qy1.f(e18Var22, -338259635, R.string.artifacts_description, e18Var22, false);
                                                            } else {
                                                                e18Var22.a0(-338124196);
                                                                zb0VarA3 = qb2Var3.Q().a(e18Var22);
                                                                e18Var22.p(false);
                                                            }
                                                            zb0 zb0Var2 = zb0VarA3;
                                                            boolean zB2 = qb2Var3.Q().b();
                                                            boolean z9 = qb2Var3.Q().c;
                                                            boolean zH2 = e18Var22.h(qb2Var3);
                                                            Object objN2 = e18Var22.N();
                                                            if (zH2 || objN2 == obj13) {
                                                                qb2Var6 = qb2Var3;
                                                                z6 = z9;
                                                                ybVar3 = new yb(1, qb2Var6, qb2.class, "onArtifactsCheckedChange", "onArtifactsCheckedChange(Z)V", 0, 24);
                                                                e18Var22.k0(ybVar3);
                                                            } else {
                                                                qb2Var6 = qb2Var3;
                                                                z6 = z9;
                                                                ybVar3 = objN2;
                                                            }
                                                            boolean z10 = z6;
                                                            qb2Var3 = qb2Var6;
                                                            rkj.d(bpcVarA2, strJ02, z10, (bz7) ((jm9) ybVar3), null, null, zb0Var2, zB2, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188208);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-337400656);
                                                            e18Var22.p(false);
                                                        }
                                                        if (qb2Var3.P().a) {
                                                            e18Var22.a0(-337216392);
                                                            bpc bpcVarA3 = a.a(ud0.r, e18Var22);
                                                            ta4 ta4Var2 = qb2Var3.P().b ? lwj.c : null;
                                                            String strJ03 = d4c.j0(R.string.ai_artifacts_title, e18Var22);
                                                            if (qb2Var3.P().b()) {
                                                                zb0VarA2 = qy1.f(e18Var22, -336745750, R.string.ai_artifacts_description, e18Var22, false);
                                                            } else {
                                                                e18Var22.a0(-336607366);
                                                                zb0VarA2 = qb2Var3.P().a(e18Var22);
                                                                e18Var22.p(false);
                                                            }
                                                            zb0 zb0Var3 = zb0VarA2;
                                                            boolean zB3 = qb2Var3.P().b();
                                                            boolean z11 = qb2Var3.P().c;
                                                            boolean zH3 = e18Var22.h(qb2Var3);
                                                            Object objN3 = e18Var22.N();
                                                            if (zH3 || objN3 == obj13) {
                                                                qb2Var5 = qb2Var3;
                                                                z5 = z11;
                                                                ybVar2 = new yb(1, qb2Var5, qb2.class, "onAiArtifactsCheckedChange", "onAiArtifactsCheckedChange(Z)V", 0, 25);
                                                                e18Var22.k0(ybVar2);
                                                            } else {
                                                                qb2Var5 = qb2Var3;
                                                                z5 = z11;
                                                                ybVar2 = objN3;
                                                            }
                                                            boolean z12 = z5;
                                                            qb2Var3 = qb2Var5;
                                                            rkj.d(bpcVarA3, strJ03, z12, (bz7) ((jm9) ybVar2), null, ta4Var2, zb0Var3, zB3, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188176);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-335875952);
                                                            e18Var22.p(false);
                                                        }
                                                        if (qb2Var3.R() == null || !(!qok.f(r1).isEmpty())) {
                                                            e18Var22.a0(-334813520);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-335694602);
                                                            bpc bpcVarA4 = a.a(ud0.F, e18Var22);
                                                            String strJ04 = d4c.j0(R.string.inline_visualizations_title, e18Var22);
                                                            zb0 zb0VarI = zrk.i(R.string.inline_visualizations_description, e18Var22);
                                                            McpServer mcpServerR = qb2Var3.R();
                                                            boolean z13 = mcpServerR != null && qb2Var3.b.E.f(null, mcpServerR.m346getUuidowoRr7k()) > 0;
                                                            boolean zH4 = e18Var22.h(qb2Var3);
                                                            Object objN4 = e18Var22.N();
                                                            if (zH4 || objN4 == obj13) {
                                                                Object ybVar5 = new yb(1, qb2Var3, qb2.class, "onInlineVisualizationsCheckedChange", "onInlineVisualizationsCheckedChange(Z)V", 0, 26);
                                                                e18Var22.k0(ybVar5);
                                                                objN4 = ybVar5;
                                                            }
                                                            rkj.d(bpcVarA4, strJ04, z13, (bz7) ((jm9) objN4), null, lwj.d, zb0VarI, false, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 196616, 384, 4188304);
                                                            e18Var22.p(false);
                                                        }
                                                        if (qb2Var3.T().a) {
                                                            e18Var22.a0(-334649561);
                                                            bpc bpcVarA5 = a.a(ud0.l0, e18Var22);
                                                            String strJ05 = d4c.j0(R.string.wiggle_title, e18Var22);
                                                            ta4 ta4Var3 = qb2Var3.T().b ? lwj.e : null;
                                                            if (qb2Var3.T().b()) {
                                                                zb0VarA = qy1.f(e18Var22, -334198480, R.string.wiggle_description, e18Var22, false);
                                                            } else {
                                                                e18Var22.a0(-334066017);
                                                                zb0VarA = qb2Var3.T().a(e18Var22);
                                                                e18Var22.p(false);
                                                            }
                                                            boolean zB4 = qb2Var3.T().b();
                                                            boolean z14 = qb2Var3.T().c;
                                                            boolean zH5 = e18Var22.h(qb2Var3);
                                                            Object objN5 = e18Var22.N();
                                                            if (zH5 || objN5 == obj13) {
                                                                qb2Var4 = qb2Var3;
                                                                z4 = z14;
                                                                ybVar = new yb(1, qb2Var4, qb2.class, "onWiggleCheckedChange", "onWiggleCheckedChange(Z)V", 0, 27);
                                                                e18Var22.k0(ybVar);
                                                            } else {
                                                                qb2Var4 = qb2Var3;
                                                                z4 = z14;
                                                                ybVar = objN5;
                                                            }
                                                            boolean z15 = z4;
                                                            qb2Var3 = qb2Var4;
                                                            rkj.d(bpcVarA5, strJ05, z15, (bz7) ((jm9) ybVar), null, ta4Var3, zb0VarA, zB4, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188176);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-333354288);
                                                            e18Var22.p(false);
                                                        }
                                                        if (!qb2Var3.j.b()) {
                                                            e18Var22.a0(-332399984);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-333229172);
                                                            bpc bpcVarA6 = a.a(ud0.p, e18Var22);
                                                            String strJ06 = d4c.j0(R.string.model_auto_fallback_setting_title, e18Var22);
                                                            zb0 zb0VarI2 = zrk.i(R.string.model_auto_fallback_setting_description, e18Var22);
                                                            boolean zK = qb2Var3.d.k();
                                                            boolean zH6 = e18Var22.h(qb2Var3);
                                                            Object objN6 = e18Var22.N();
                                                            if (zH6 || objN6 == obj13) {
                                                                Object ybVar6 = new yb(1, qb2Var3, qb2.class, "updateModelAutoFallbackEnabled", "updateModelAutoFallbackEnabled(Z)V", 0, 28);
                                                                e18Var22.k0(ybVar6);
                                                                objN6 = ybVar6;
                                                            }
                                                            rkj.d(bpcVarA6, strJ06, zK, (bz7) ((jm9) objN6), null, null, zb0VarI2, false, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188336);
                                                            e18Var22.p(false);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    ld4 ld4Var3 = (ld4) obj11;
                                                    int iIntValue2 = ((Integer) obj12).intValue();
                                                    ((s64) obj10).getClass();
                                                    e18 e18Var3 = (e18) ld4Var3;
                                                    if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        e18Var3.T();
                                                    } else {
                                                        qb2 qb2Var8 = qb2Var2;
                                                        ToolSearchConfig toolSearchConfig2 = (ToolSearchConfig) qb2Var8.i.D.getValue();
                                                        if (toolSearchConfig2 == null || (modes2 = toolSearchConfig2.getModes()) == null) {
                                                            modes2 = lm6.E;
                                                        }
                                                        ToolSearchMode toolSearchMode = (ToolSearchMode) qb2Var8.d.n.getValue();
                                                        String strM1156unboximpl = toolSearchMode != null ? toolSearchMode.m1156unboximpl() : null;
                                                        boolean zH7 = e18Var3.h(qb2Var8);
                                                        Object objN7 = e18Var3.N();
                                                        if (zH7 || objN7 == obj13) {
                                                            Object ub2Var = new ub2(1, qb2Var8, qb2.class, "updateToolSearchMode", "updateToolSearchMode-UeoRtOs(Ljava/lang/String;)V", 0, 2);
                                                            e18Var3.k0(ub2Var);
                                                            objN7 = ub2Var;
                                                        }
                                                        kwj.b(modes2, strM1156unboximpl, (bz7) ((jm9) objN7), e18Var3, 0);
                                                    }
                                                    break;
                                            }
                                            return ieiVar3;
                                        }
                                    }, e18Var), e18Var, 48);
                                }
                                break;
                            default:
                                e18 e18Var2 = (e18) ld4Var;
                                if (!e18Var2.Q(iH & 1, (iH & 129) != 128)) {
                                    e18Var2.T();
                                } else {
                                    yhk.b(0, 2, e18Var2, null, d4c.j0(R.string.settings_tool_access, e18Var2));
                                    yhk.a(null, fd9.q0(-1737697462, new rz7() { // from class: tb2
                                        @Override // defpackage.rz7
                                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                            qb2 qb2Var3;
                                            zb0 zb0VarA;
                                            Object ybVar;
                                            qb2 qb2Var4;
                                            boolean z4;
                                            zb0 zb0VarA2;
                                            Object ybVar2;
                                            qb2 qb2Var5;
                                            boolean z5;
                                            zb0 zb0VarA3;
                                            Object ybVar3;
                                            qb2 qb2Var6;
                                            boolean z6;
                                            zb0 zb0VarA4;
                                            boolean z7;
                                            List<ToolSearchModeConfig> modes2;
                                            int i7 = i5;
                                            iei ieiVar3 = iei.a;
                                            Object obj13 = jd4.a;
                                            switch (i7) {
                                                case 0:
                                                    ld4 ld4Var2 = (ld4) obj11;
                                                    int iIntValue = ((Integer) obj12).intValue();
                                                    wo1 wo1Var = lja.Q;
                                                    ((s64) obj10).getClass();
                                                    e18 e18Var22 = (e18) ld4Var2;
                                                    if (!e18Var22.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        e18Var22.T();
                                                    } else {
                                                        qb2 qb2Var7 = qb2Var2;
                                                        if (qb2Var7.S().a) {
                                                            e18Var22.a0(-339980724);
                                                            bpc bpcVarA = a.a(ud0.u0, e18Var22);
                                                            String strJ0 = d4c.j0(R.string.web_search_title, e18Var22);
                                                            ta4 ta4Var = qb2Var7.S().b ? lwj.b : null;
                                                            if (qb2Var7.S().b()) {
                                                                zb0VarA4 = qy1.f(e18Var22, -339519444, R.string.web_search_description, e18Var22, false);
                                                            } else {
                                                                e18Var22.a0(-339383044);
                                                                zb0VarA4 = qb2Var7.S().a(e18Var22);
                                                                e18Var22.p(false);
                                                            }
                                                            zb0 zb0Var = zb0VarA4;
                                                            boolean zB = qb2Var7.S().b();
                                                            boolean z8 = qb2Var7.S().c;
                                                            boolean zH = e18Var22.h(qb2Var7);
                                                            Object objN = e18Var22.N();
                                                            if (zH || objN == obj13) {
                                                                z7 = z8;
                                                                Object ybVar4 = new yb(1, qb2Var7, qb2.class, "onWebSearchCheckedChange", "onWebSearchCheckedChange(Z)V", 0, 23);
                                                                e18Var22.k0(ybVar4);
                                                                objN = ybVar4;
                                                            } else {
                                                                z7 = z8;
                                                            }
                                                            qb2Var3 = qb2Var7;
                                                            rkj.d(bpcVarA, strJ0, z7, (bz7) ((jm9) objN), null, ta4Var, zb0Var, zB, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188176);
                                                            e18Var22.p(false);
                                                        } else {
                                                            qb2Var3 = qb2Var7;
                                                            e18Var22.a0(-338659504);
                                                            e18Var22.p(false);
                                                        }
                                                        if (qb2Var3.Q().a) {
                                                            e18Var22.a0(-338496041);
                                                            bpc bpcVarA2 = a.a(ud0.q, e18Var22);
                                                            String strJ02 = d4c.j0(R.string.product_name_artifacts, e18Var22);
                                                            if (qb2Var3.Q().b()) {
                                                                zb0VarA3 = qy1.f(e18Var22, -338259635, R.string.artifacts_description, e18Var22, false);
                                                            } else {
                                                                e18Var22.a0(-338124196);
                                                                zb0VarA3 = qb2Var3.Q().a(e18Var22);
                                                                e18Var22.p(false);
                                                            }
                                                            zb0 zb0Var2 = zb0VarA3;
                                                            boolean zB2 = qb2Var3.Q().b();
                                                            boolean z9 = qb2Var3.Q().c;
                                                            boolean zH2 = e18Var22.h(qb2Var3);
                                                            Object objN2 = e18Var22.N();
                                                            if (zH2 || objN2 == obj13) {
                                                                qb2Var6 = qb2Var3;
                                                                z6 = z9;
                                                                ybVar3 = new yb(1, qb2Var6, qb2.class, "onArtifactsCheckedChange", "onArtifactsCheckedChange(Z)V", 0, 24);
                                                                e18Var22.k0(ybVar3);
                                                            } else {
                                                                qb2Var6 = qb2Var3;
                                                                z6 = z9;
                                                                ybVar3 = objN2;
                                                            }
                                                            boolean z10 = z6;
                                                            qb2Var3 = qb2Var6;
                                                            rkj.d(bpcVarA2, strJ02, z10, (bz7) ((jm9) ybVar3), null, null, zb0Var2, zB2, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188208);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-337400656);
                                                            e18Var22.p(false);
                                                        }
                                                        if (qb2Var3.P().a) {
                                                            e18Var22.a0(-337216392);
                                                            bpc bpcVarA3 = a.a(ud0.r, e18Var22);
                                                            ta4 ta4Var2 = qb2Var3.P().b ? lwj.c : null;
                                                            String strJ03 = d4c.j0(R.string.ai_artifacts_title, e18Var22);
                                                            if (qb2Var3.P().b()) {
                                                                zb0VarA2 = qy1.f(e18Var22, -336745750, R.string.ai_artifacts_description, e18Var22, false);
                                                            } else {
                                                                e18Var22.a0(-336607366);
                                                                zb0VarA2 = qb2Var3.P().a(e18Var22);
                                                                e18Var22.p(false);
                                                            }
                                                            zb0 zb0Var3 = zb0VarA2;
                                                            boolean zB3 = qb2Var3.P().b();
                                                            boolean z11 = qb2Var3.P().c;
                                                            boolean zH3 = e18Var22.h(qb2Var3);
                                                            Object objN3 = e18Var22.N();
                                                            if (zH3 || objN3 == obj13) {
                                                                qb2Var5 = qb2Var3;
                                                                z5 = z11;
                                                                ybVar2 = new yb(1, qb2Var5, qb2.class, "onAiArtifactsCheckedChange", "onAiArtifactsCheckedChange(Z)V", 0, 25);
                                                                e18Var22.k0(ybVar2);
                                                            } else {
                                                                qb2Var5 = qb2Var3;
                                                                z5 = z11;
                                                                ybVar2 = objN3;
                                                            }
                                                            boolean z12 = z5;
                                                            qb2Var3 = qb2Var5;
                                                            rkj.d(bpcVarA3, strJ03, z12, (bz7) ((jm9) ybVar2), null, ta4Var2, zb0Var3, zB3, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188176);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-335875952);
                                                            e18Var22.p(false);
                                                        }
                                                        if (qb2Var3.R() == null || !(!qok.f(r1).isEmpty())) {
                                                            e18Var22.a0(-334813520);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-335694602);
                                                            bpc bpcVarA4 = a.a(ud0.F, e18Var22);
                                                            String strJ04 = d4c.j0(R.string.inline_visualizations_title, e18Var22);
                                                            zb0 zb0VarI = zrk.i(R.string.inline_visualizations_description, e18Var22);
                                                            McpServer mcpServerR = qb2Var3.R();
                                                            boolean z13 = mcpServerR != null && qb2Var3.b.E.f(null, mcpServerR.m346getUuidowoRr7k()) > 0;
                                                            boolean zH4 = e18Var22.h(qb2Var3);
                                                            Object objN4 = e18Var22.N();
                                                            if (zH4 || objN4 == obj13) {
                                                                Object ybVar5 = new yb(1, qb2Var3, qb2.class, "onInlineVisualizationsCheckedChange", "onInlineVisualizationsCheckedChange(Z)V", 0, 26);
                                                                e18Var22.k0(ybVar5);
                                                                objN4 = ybVar5;
                                                            }
                                                            rkj.d(bpcVarA4, strJ04, z13, (bz7) ((jm9) objN4), null, lwj.d, zb0VarI, false, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 196616, 384, 4188304);
                                                            e18Var22.p(false);
                                                        }
                                                        if (qb2Var3.T().a) {
                                                            e18Var22.a0(-334649561);
                                                            bpc bpcVarA5 = a.a(ud0.l0, e18Var22);
                                                            String strJ05 = d4c.j0(R.string.wiggle_title, e18Var22);
                                                            ta4 ta4Var3 = qb2Var3.T().b ? lwj.e : null;
                                                            if (qb2Var3.T().b()) {
                                                                zb0VarA = qy1.f(e18Var22, -334198480, R.string.wiggle_description, e18Var22, false);
                                                            } else {
                                                                e18Var22.a0(-334066017);
                                                                zb0VarA = qb2Var3.T().a(e18Var22);
                                                                e18Var22.p(false);
                                                            }
                                                            boolean zB4 = qb2Var3.T().b();
                                                            boolean z14 = qb2Var3.T().c;
                                                            boolean zH5 = e18Var22.h(qb2Var3);
                                                            Object objN5 = e18Var22.N();
                                                            if (zH5 || objN5 == obj13) {
                                                                qb2Var4 = qb2Var3;
                                                                z4 = z14;
                                                                ybVar = new yb(1, qb2Var4, qb2.class, "onWiggleCheckedChange", "onWiggleCheckedChange(Z)V", 0, 27);
                                                                e18Var22.k0(ybVar);
                                                            } else {
                                                                qb2Var4 = qb2Var3;
                                                                z4 = z14;
                                                                ybVar = objN5;
                                                            }
                                                            boolean z15 = z4;
                                                            qb2Var3 = qb2Var4;
                                                            rkj.d(bpcVarA5, strJ05, z15, (bz7) ((jm9) ybVar), null, ta4Var3, zb0VarA, zB4, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188176);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-333354288);
                                                            e18Var22.p(false);
                                                        }
                                                        if (!qb2Var3.j.b()) {
                                                            e18Var22.a0(-332399984);
                                                            e18Var22.p(false);
                                                        } else {
                                                            e18Var22.a0(-333229172);
                                                            bpc bpcVarA6 = a.a(ud0.p, e18Var22);
                                                            String strJ06 = d4c.j0(R.string.model_auto_fallback_setting_title, e18Var22);
                                                            zb0 zb0VarI2 = zrk.i(R.string.model_auto_fallback_setting_description, e18Var22);
                                                            boolean zK = qb2Var3.d.k();
                                                            boolean zH6 = e18Var22.h(qb2Var3);
                                                            Object objN6 = e18Var22.N();
                                                            if (zH6 || objN6 == obj13) {
                                                                Object ybVar6 = new yb(1, qb2Var3, qb2.class, "updateModelAutoFallbackEnabled", "updateModelAutoFallbackEnabled(Z)V", 0, 28);
                                                                e18Var22.k0(ybVar6);
                                                                objN6 = ybVar6;
                                                            }
                                                            rkj.d(bpcVarA6, strJ06, zK, (bz7) ((jm9) objN6), null, null, zb0VarI2, false, qf2.a(e18Var22), qf2.c(e18Var22), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, wo1Var, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var22, 8, 384, 4188336);
                                                            e18Var22.p(false);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    ld4 ld4Var3 = (ld4) obj11;
                                                    int iIntValue2 = ((Integer) obj12).intValue();
                                                    ((s64) obj10).getClass();
                                                    e18 e18Var3 = (e18) ld4Var3;
                                                    if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        e18Var3.T();
                                                    } else {
                                                        qb2 qb2Var8 = qb2Var2;
                                                        ToolSearchConfig toolSearchConfig2 = (ToolSearchConfig) qb2Var8.i.D.getValue();
                                                        if (toolSearchConfig2 == null || (modes2 = toolSearchConfig2.getModes()) == null) {
                                                            modes2 = lm6.E;
                                                        }
                                                        ToolSearchMode toolSearchMode = (ToolSearchMode) qb2Var8.d.n.getValue();
                                                        String strM1156unboximpl = toolSearchMode != null ? toolSearchMode.m1156unboximpl() : null;
                                                        boolean zH7 = e18Var3.h(qb2Var8);
                                                        Object objN7 = e18Var3.N();
                                                        if (zH7 || objN7 == obj13) {
                                                            Object ub2Var = new ub2(1, qb2Var8, qb2.class, "updateToolSearchMode", "updateToolSearchMode-UeoRtOs(Ljava/lang/String;)V", 0, 2);
                                                            e18Var3.k0(ub2Var);
                                                            objN7 = ub2Var;
                                                        }
                                                        kwj.b(modes2, strM1156unboximpl, (bz7) ((jm9) objN7), e18Var3, 0);
                                                    }
                                                    break;
                                            }
                                            return ieiVar3;
                                        }
                                    }, e18Var2), e18Var2, 48);
                                }
                                break;
                        }
                        return ieiVar2;
                    }
                }), 2);
                break;
            case 1:
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                j0a.V(j0aVar, null, null, new ta4(357175334, true, new yv(z2, 4)), 3);
                j0a.V(j0aVar, null, null, new ta4(375569693, true, new tw(z, (nwb) obj5, (nwb) obj4, 6)), 3);
                j0a.V(j0aVar, null, null, new ta4(-102393506, true, new t56((List) obj3, (nwb) obj2, i2)), 3);
                break;
            default:
                e8d e8dVar = (e8d) obj5;
                bz7 bz7Var = (bz7) obj4;
                String str = (String) obj3;
                isc iscVar = (isc) obj2;
                fcc fccVar = (fcc) obj;
                int i4 = (int) (((e0h) e8dVar).d0 >> 32);
                e0h e0hVar = (e0h) e8dVar;
                int i5 = (int) (e0hVar.d0 & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fccVar.a >> 32));
                float f = fIntBitsToFloat - (i4 / 2.0f);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fccVar.a & 4294967295L)) - (i5 / 2.0f);
                if (((float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (f * f))) >= e0hVar.getDensity() * 60.0f) {
                    if (fIntBitsToFloat >= i4 / 2) {
                        if (!z) {
                            bz7Var.invoke(str);
                            iscVar.i(iscVar.h() + 1);
                        }
                    } else if (!z2) {
                        iscVar.i(iscVar.h() - 1);
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ rb2(boolean z, boolean z2, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = z;
        this.G = z2;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = obj4;
    }
}
