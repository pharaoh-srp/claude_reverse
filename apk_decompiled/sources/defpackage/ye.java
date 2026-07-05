package defpackage;

import android.text.format.DateUtils;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.artifacts.UserArtifact;
import com.anthropic.claude.api.mcp.McpPrompt;
import com.anthropic.claude.api.model.ThinkingOption;
import com.anthropic.claude.artifact.model.ArtifactType;
import com.anthropic.claude.artifact.model.c;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination;
import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.models.organization.configtypes.OctopusConfig;
import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ye implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ ye(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
        this.H = obj3;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        int i;
        ud0 ud0Var;
        ycb ycbVarB;
        by2 by2Var = (by2) this.G;
        bz7 bz7Var = (bz7) this.F;
        nwb nwbVar = (nwb) this.H;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (by2 by2Var2 : by2.H) {
                boolean z = by2Var2 == by2Var;
                by2Var2.getClass();
                int iOrdinal = by2Var2.ordinal();
                bpc bpcVarA = null;
                if (iOrdinal == 0) {
                    i = R.string.chats_filter_all;
                } else {
                    if (iOrdinal != 1) {
                        wg6.i();
                        return null;
                    }
                    i = R.string.chats_filter_starred;
                }
                String strJ0 = d4c.j0(i, e18Var);
                int iOrdinal2 = by2Var2.ordinal();
                if (iOrdinal2 == 0) {
                    ud0Var = ud0.K;
                } else {
                    if (iOrdinal2 != 1) {
                        wg6.i();
                        return null;
                    }
                    ud0Var = ud0.s1;
                }
                bpc bpcVarA2 = a.a(ud0Var, e18Var);
                if (z) {
                    e18Var.a0(1231264775);
                    bpcVarA = a.a(ud0.L, e18Var);
                } else {
                    e18Var.a0(-485484835);
                }
                e18Var.p(false);
                bpc bpcVar = bpcVarA;
                if (z) {
                    e18Var.a0(-485242972);
                    float f = wcb.a;
                    ycbVarB = wcb.c(gm3.a(e18Var).k, gm3.a(e18Var).k, gm3.a(e18Var).k, e18Var, 56);
                    e18Var.p(false);
                } else {
                    e18Var.a0(-484898407);
                    float f2 = wcb.a;
                    ycbVarB = wcb.b(e18Var);
                    e18Var.p(false);
                }
                ycb ycbVar = ycbVarB;
                boolean zF = e18Var.f(bz7Var) | e18Var.d(by2Var2.ordinal()) | e18Var.f(nwbVar);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new ei(bz7Var, by2Var2, nwbVar, 17);
                    e18Var.k0(objN);
                }
                e18 e18Var2 = e18Var;
                uuj.a(strJ0, bpcVar, (zy7) objN, null, bpcVarA2, false, Boolean.valueOf(z), ycbVar, null, null, 0, 0, e18Var2, 32832, 3880);
                e18Var = e18Var2;
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        ChatOptionsBottomSheetDestination chatOptionsBottomSheetDestination = (ChatOptionsBottomSheetDestination) this.G;
        uj4 uj4Var = (uj4) this.F;
        hi4 hi4Var = (hi4) this.H;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            wi4.b(((ChatOptionsBottomSheetDestination.ConnectorDirectoryDetail) chatOptionsBottomSheetDestination).getServer(), uj4Var, hi4Var, gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7), e18Var, 576);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        f03 f03Var = (f03) this.G;
        t4g t4gVar = (t4g) this.F;
        McpPrompt mcpPrompt = (McpPrompt) this.H;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            zok.c(f03Var, t4gVar, mcpPrompt, i4gVar, e18Var, 8 | ((iIntValue << 9) & 7168));
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        uj4 uj4Var = (uj4) this.G;
        t4g t4gVar = (t4g) this.F;
        hi4 hi4Var = (hi4) this.H;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        int i = 0;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            float f = i4gVar.b;
            boolean zH = e18Var.h(t4gVar);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new k03(t4gVar, i);
                e18Var.k0(objN);
            }
            ypk.c(uj4Var, (bz7) objN, null, f, hi4Var, e18Var, 32776, 4);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        lc3 lc3Var = (lc3) this.G;
        u56 u56Var = (u56) this.F;
        g93 g93Var = (g93) this.H;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ia0) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            us2.a(lc3Var, u56Var, g93Var.j, gb9.L(e93.a, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1), e18Var, 512, 0);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        ukg ukgVar = (ukg) this.G;
        vm3 vm3Var = (vm3) this.F;
        ukg ukgVar2 = (ukg) this.H;
        exe exeVar = (exe) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        exeVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? ((e18) ld4Var).f(exeVar) : ((e18) ld4Var).h(exeVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            p46 p46Var = p46.a;
            km8 km8Var = new km8(p46Var);
            o46 o46Var = o46.a;
            int i = iIntValue & 14;
            dlk.a(exeVar, ukgVar, vm3Var, km8Var.d(new gaj(o46Var)), e18Var, i);
            gwj.c(new gaj(new n46(vm3Var.c)), e18Var, 0);
            dlk.i(exeVar, ukgVar2, vm3Var, new km8(p46Var).d(new gaj(o46Var)), e18Var, i);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination = (CodeRemoteBottomSheetDestination) this.G;
        i iVar = (i) this.F;
        t4g t4gVar = (t4g) this.H;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        int i = 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            rvh rvhVar = ((CodeRemoteBottomSheetDestination.ToolCallDetail) codeRemoteBottomSheetDestination).a;
            boolean zH = e18Var.h(t4gVar);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new k03(t4gVar, i);
                e18Var.k0(objN);
            }
            ktk.o(rvhVar, iVar, i4gVar, (bz7) objN, e18Var, (iIntValue << 6) & 896);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        g44 g44Var = (g44) this.G;
        i iVar = (i) this.F;
        t4g t4gVar = (t4g) this.H;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        int i = 18;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            List list = g44Var.d;
            qnc qncVarB = i4gVar.b();
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            boolean zH = e18Var.h(list) | e18Var.f(iVar) | e18Var.h(t4gVar);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new l6(list, iVar, t4gVar, i);
                e18Var.k0(objN);
            }
            knk.h(iqbVarC, null, qncVarB, false, null, null, null, false, null, (bz7) objN, e18Var, 6, 506);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        b55 b55Var = (b55) this.G;
        hi4 hi4Var = (hi4) this.F;
        i iVar = (i) this.H;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            Set set = (Set) iVar.a1.getValue();
            boolean zF = e18Var.f(iVar);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new bo(2, iVar, i.class, "toggleMcpServer", "toggleMcpServer(Lcom/anthropic/claude/api/mcp/McpServer;Z)V", 0, 6);
                e18Var.k0(objN);
            }
            jm9 jm9Var = (jm9) objN;
            if (!iVar.M0() || !((Boolean) iVar.w.m.getValue()).booleanValue() || iVar.E0() == null) {
                jm9Var = null;
            }
            a55.a(b55Var, hi4Var, set, (pz7) jm9Var, i4gVar, null, e18Var, 64 | ((iIntValue << 12) & 57344));
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        String str = (String) this.G;
        i iVar = (i) this.F;
        iqb iqbVar = (iqb) this.H;
        px9 px9Var = (px9) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        px9Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(px9Var) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zF = e18Var.f(iVar);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                y14 y14Var = new y14(0, iVar, i.class, "dequeueToInput", "dequeueToInput()V", 0, 10);
                e18Var.k0(y14Var);
                objN = y14Var;
            }
            djk.a(0, e18Var, (zy7) ((jm9) objN), px9.a(px9Var, iqbVar, null, null, 7), str);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        i iVar = (i) this.G;
        yih yihVar = (yih) this.F;
        gh2 gh2Var = (gh2) this.H;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ia0) obj).getClass();
        int i = 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strE0 = iVar.E0();
            boolean zF = e18Var.f(yihVar) | e18Var.f(iVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new lj2(yihVar, 15, iVar);
                e18Var.k0(objN);
            }
            bz7 bz7Var = (bz7) objN;
            boolean zH = e18Var.h(gh2Var);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new ao(gh2Var, null, i);
                e18Var.k0(objN2);
            }
            quj.a(strE0, bz7Var, (pz7) objN2, gb9.L(fqb.E, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), null, e18Var, 3072);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        CollapsedToolsSheetDestination collapsedToolsSheetDestination = (CollapsedToolsSheetDestination) this.G;
        bz7 bz7Var = (bz7) this.F;
        bz7 bz7Var2 = (bz7) this.H;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            qnc qncVarD = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7);
            boolean zH = e18Var.h(collapsedToolsSheetDestination) | e18Var.f(bz7Var) | e18Var.f(bz7Var2) | ((iIntValue & 14) == 4);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new fe(collapsedToolsSheetDestination, i4gVar, bz7Var, bz7Var2, 13);
                e18Var.k0(objN);
            }
            knk.h(null, null, qncVarD, false, null, null, null, false, null, (bz7) objN, e18Var, 0, 507);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation = (ParsedContentBlock$McpToolInvocation) this.G;
        bz7 bz7Var = (bz7) this.F;
        bz7 bz7Var2 = (bz7) this.H;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            qnc qncVarD = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 5);
            boolean zF = e18Var.f(parsedContentBlock$McpToolInvocation) | ((iIntValue & 14) == 4) | e18Var.f(bz7Var) | e18Var.f(bz7Var2);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new fe(parsedContentBlock$McpToolInvocation, bz7Var, bz7Var2, i4gVar, 14);
                e18Var.k0(objN);
            }
            knk.h(null, null, qncVarD, false, null, null, null, false, null, (bz7) objN, e18Var, 0, 507);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        eyh eyhVar = (eyh) this.G;
        bz7 bz7Var = (bz7) this.F;
        pl3 pl3Var = (pl3) this.H;
        r7g r7gVar = (r7g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        r7gVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(r7gVar) ? 4 : 2;
        }
        int i = iIntValue;
        int i2 = 0;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 19) != 18)) {
            for (eyh eyhVar2 : eyh.I) {
                boolean z = eyhVar2 == eyhVar;
                boolean zF = e18Var.f(bz7Var) | e18Var.d(eyhVar2.ordinal());
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new d44(bz7Var, 3, eyhVar2);
                    e18Var.k0(objN);
                }
                kvj.a(r7gVar, z, (zy7) objN, null, null, null, pl3Var, fd9.q0(-503257802, new pg4(eyhVar2, i2), e18Var), e18Var, (i & 14) | 12582912);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ArtifactType artifactTypeA;
        String strN;
        boolean z;
        boolean z2;
        _ServerLocalizedString name;
        byte b;
        iqb iqbVar;
        _ServerLocalizedString empty_state;
        _ServerLocalizedString disclaimer_text;
        _ServerLocalizedString description;
        int i = this.E;
        eo0 eo0Var = ko0.c;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        int i2 = 14;
        Object obj4 = this.H;
        Object obj5 = this.F;
        Object obj6 = this.G;
        switch (i) {
            case 0:
                List list = (List) obj6;
                mnc mncVar = (mnc) obj5;
                oxf oxfVar = (oxf) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(1 & iIntValue, (iIntValue & 17) != 16)) {
                    ArrayList<q21> arrayList = new ArrayList();
                    for (Object obj7 : list) {
                        ((q21) obj7).getClass();
                        arrayList.add(obj7);
                    }
                    for (q21 q21Var : arrayList) {
                        e18Var.X(-1036288350, q21Var.b);
                        gvk.a(q21Var, mncVar, b.c(fqbVar, 1.0f), oxfVar, e18Var, 384);
                        e18Var.p(false);
                    }
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                ep epVar = (ep) obj6;
                mnc mncVar2 = (mnc) obj5;
                mxd mxdVar = (mxd) obj4;
                mw1 mw1Var = (mw1) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                mw1Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(mw1Var) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    bxd.a.a(mxdVar, ((Boolean) epVar.f.getValue()).booleanValue() && ((Boolean) epVar.g.getValue()).booleanValue(), gb9.I(mw1Var.a(fqbVar, lja.H), mncVar2), 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 1572864);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                ep epVar2 = (ep) obj6;
                mnc mncVar3 = (mnc) obj5;
                bz7 bz7Var = (bz7) obj4;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    lsc lscVar = epVar2.g;
                    wz5 wz5Var = epVar2.k;
                    if (!((Boolean) lscVar.getValue()).booleanValue()) {
                        e18Var3.a0(-138352861);
                        kzj.a(0, e18Var3);
                        e18Var3.p(false);
                    } else if (((Boolean) epVar2.h.getValue()).booleanValue() && ((List) wz5Var.getValue()).isEmpty()) {
                        e18Var3.a0(-138349777);
                        gok.c(gik.l((nrg) drg.l0.getValue(), e18Var3), gm3.a(e18Var3).y, mncVar3, null, e18Var3, 0);
                        e18Var3.p(false);
                    } else if (((List) wz5Var.getValue()).isEmpty()) {
                        e18Var3.a0(-138340863);
                        gok.c(gik.l(epVar2.Q().isEmpty() ? (nrg) drg.j0.getValue() : (nrg) drg.k0.getValue(), e18Var3), gm3.a(e18Var3).N, mncVar3, null, e18Var3, 0);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(6914897);
                        qnc qncVar = new qnc(16.0f, mncVar3.d() + 12.0f, 16.0f, mncVar3.a() + 12.0f);
                        ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
                        FillElement fillElement = b.c;
                        boolean zF = e18Var3.f(epVar2) | e18Var3.f(bz7Var);
                        Object objN = e18Var3.N();
                        if (zF || objN == lz1Var) {
                            objN = new l0(epVar2, 8, bz7Var);
                            e18Var3.k0(objN);
                        }
                        knk.h(fillElement, null, qncVar, false, ho0Var, null, null, false, null, (bz7) objN, e18Var3, 24582, 490);
                        e18Var3.p(false);
                    }
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 3:
                lu luVar = (lu) obj6;
                mnc mncVar4 = (mnc) obj5;
                mxd mxdVar2 = (mxd) obj4;
                mw1 mw1Var2 = (mw1) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                mw1Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(mw1Var2) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    bxd.a.a(mxdVar2, ((Boolean) luVar.d.i.getValue()).booleanValue(), gb9.I(mw1Var2.a(fqbVar, lja.H), mncVar4), 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var4, 1572864);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 4:
                gnd gndVar = (gnd) obj5;
                List list2 = (List) obj6;
                bz7 bz7Var2 = (bz7) obj4;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    kik.a(gndVar, list2, bz7Var2, null, e18Var5, 0);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 5:
                uv uvVar = (uv) obj6;
                mnc mncVar5 = (mnc) obj5;
                mxd mxdVar3 = (mxd) obj4;
                mw1 mw1Var3 = (mw1) obj;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                mw1Var3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((e18) ld4Var6).f(mw1Var3) ? 4 : 2;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    bxd.a.a(mxdVar3, uvVar.c.m(uvVar.R()), gb9.I(mw1Var3.a(fqbVar, lja.H), mncVar5), 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var6, 1572864);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 6:
                gr0 gr0Var = (gr0) obj6;
                q2i q2iVar = (q2i) obj5;
                bz7 bz7Var3 = (bz7) obj4;
                mnc mncVar6 = (mnc) obj;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                mncVar6.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var7).f(mncVar6) ? 4 : 2;
                }
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(1 & iIntValue7, (iIntValue7 & 19) != 18)) {
                    e18Var7.a0(312642993);
                    List<UserArtifact> list3 = (List) gr0Var.g.getValue();
                    ArrayList arrayList2 = new ArrayList(x44.y(list3, 10));
                    for (UserArtifact userArtifact : list3) {
                        ArtifactId artifactIdM957boximpl = ArtifactId.m957boximpl(userArtifact.m154getUuidQssJVS4());
                        String title = userArtifact.getTitle();
                        String str = title == null ? "" : title;
                        String string = DateUtils.getRelativeTimeSpanString(userArtifact.getUpdated_at().getTime(), System.currentTimeMillis(), 60000L).toString();
                        String preview = userArtifact.getPreview();
                        String artifact_type = userArtifact.getArtifact_type();
                        if (artifact_type != null) {
                            ArtifactType.Companion.getClass();
                            artifactTypeA = c.a(artifact_type);
                        } else {
                            artifactTypeA = null;
                        }
                        cr0 cr0Var = new cr0(preview, ur0.e(artifactTypeA));
                        if (userArtifact.m153getLatest_published_artifact_uuidvF4hnP0() != null) {
                            strN = vb7.n(e18Var7, 348001101, R.string.artifact_gallery_published, e18Var7, false);
                        } else {
                            e18Var7.a0(-2096812669);
                            e18Var7.p(false);
                            strN = null;
                        }
                        arrayList2.add(new dr0(artifactIdM957boximpl, str, string, cr0Var, strN));
                    }
                    e18Var7.p(false);
                    boolean zBooleanValue = ((Boolean) gr0Var.e.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) gr0Var.h.getValue()).booleanValue();
                    f77 f77Var = ((g77) q2iVar).e;
                    iqb iqbVarI = gb9.I(b.c, mncVar6);
                    Object objN2 = e18Var7.N();
                    if (objN2 == lz1Var) {
                        objN2 = hr0.F;
                        e18Var7.k0(objN2);
                    }
                    bz7 bz7Var4 = (bz7) objN2;
                    boolean zF2 = e18Var7.f(bz7Var3) | e18Var7.f(gr0Var);
                    Object objN3 = e18Var7.N();
                    if (zF2 || objN3 == lz1Var) {
                        objN3 = new kp(bz7Var3, i2, gr0Var);
                        e18Var7.k0(objN3);
                    }
                    bz7 bz7Var5 = (bz7) objN3;
                    boolean zF3 = e18Var7.f(gr0Var);
                    Object objN4 = e18Var7.N();
                    if (zF3 || objN4 == lz1Var) {
                        objN4 = new d7(7, gr0Var);
                        e18Var7.k0(objN4);
                    }
                    gtk.a(arrayList2, bz7Var4, bz7Var5, zBooleanValue, zBooleanValue2, iqbVarI, f77Var, (zy7) objN4, e18Var7, 390);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case 7:
                String str2 = (String) obj6;
                jm3 jm3Var = (jm3) obj5;
                jl3 jl3Var = (jl3) obj4;
                pz7 pz7Var = (pz7) obj;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                pz7Var.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((e18) ld4Var8).h(pz7Var) ? 4 : 2;
                }
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var8.T);
                    hyc hycVarL = e18Var8.l();
                    iqb iqbVarE = kxk.E(e18Var8, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var8.e0();
                    if (e18Var8.S) {
                        e18Var8.k(re4Var);
                    } else {
                        e18Var8.n0();
                    }
                    d4c.i0(e18Var8, cd4.f, o5bVarD);
                    d4c.i0(e18Var8, cd4.e, hycVarL);
                    d4c.i0(e18Var8, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var8, cd4.h);
                    d4c.i0(e18Var8, cd4.d, iqbVarE);
                    if (str2.length() == 0) {
                        e18Var8.a0(734629845);
                        tjh.b(d4c.j0(R.string.ccr_ask_question_other, e18Var8), null, jl3Var.N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.g, e18Var8, 0, 0, 131066);
                        e18Var8.p(false);
                    } else {
                        e18Var8.a0(734863089);
                        e18Var8.p(false);
                    }
                    sq6.B(iIntValue8 & 14, pz7Var, e18Var8, true);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case 8:
                r4g r4gVar = (r4g) obj6;
                ybg ybgVar = (ybg) obj5;
                ta4 ta4Var = (ta4) obj4;
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((e18) ld4Var9).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    e18Var9.T();
                    return ieiVar;
                }
                if (r4gVar.b == u4g.H) {
                    e18Var9.a0(250787260);
                    boolean z3 = !x44.V(e18Var9);
                    z = false;
                    e18Var9.p(false);
                    z2 = z3;
                } else {
                    z = false;
                    e18Var9.a0(-815528295);
                    e18Var9.p(false);
                    z2 = false;
                }
                iqb iqbVarC = z2 ? b.c(fqbVar, 1.0f) : b.c;
                o5b o5bVarD2 = dw1.d(lja.G, z);
                int iHashCode2 = Long.hashCode(e18Var9.T);
                hyc hycVarL2 = e18Var9.l();
                iqb iqbVarE2 = kxk.E(e18Var9, fqbVar);
                dd4.e.getClass();
                re4 re4Var2 = cd4.b;
                e18Var9.e0();
                if (e18Var9.S) {
                    e18Var9.k(re4Var2);
                } else {
                    e18Var9.n0();
                }
                z80 z80Var = cd4.f;
                d4c.i0(e18Var9, z80Var, o5bVarD2);
                z80 z80Var2 = cd4.e;
                d4c.i0(e18Var9, z80Var2, hycVarL2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                z80 z80Var3 = cd4.g;
                d4c.i0(e18Var9, z80Var3, numValueOf);
                bx bxVar = cd4.h;
                d4c.h0(e18Var9, bxVar);
                z80 z80Var4 = cd4.d;
                d4c.i0(e18Var9, z80Var4, iqbVarE2);
                iqb iqbVarB0 = mpk.b0(iqbVarC, mpk.Y(e18Var9), true);
                q64 q64VarA = p64.a(eo0Var, lja.S, e18Var9, 0);
                int iHashCode3 = Long.hashCode(e18Var9.T);
                hyc hycVarL3 = e18Var9.l();
                iqb iqbVarE3 = kxk.E(e18Var9, iqbVarB0);
                e18Var9.e0();
                if (e18Var9.S) {
                    e18Var9.k(re4Var2);
                } else {
                    e18Var9.n0();
                }
                d4c.i0(e18Var9, z80Var, q64VarA);
                d4c.i0(e18Var9, z80Var2, hycVarL3);
                ij0.t(iHashCode3, e18Var9, z80Var3, e18Var9, bxVar);
                d4c.i0(e18Var9, z80Var4, iqbVarE3);
                ta4Var.i(s64.a, i4gVar.a, e18Var9, 6);
                grc.z(fqbVar, i4gVar.b, e18Var9, true);
                if (ybgVar != null) {
                    e18Var9.a0(-617653867);
                    iv1.c(ybgVar, nw1.a.a(fqbVar, lja.M), e18Var9, 0, 0);
                    e18Var9.p(false);
                } else {
                    e18Var9.a0(-617472238);
                    e18Var9.p(false);
                }
                e18Var9.p(true);
                return ieiVar;
            case 9:
                s51 s51Var = (s51) obj5;
                List list4 = (List) obj6;
                bz7 bz7Var6 = (bz7) obj4;
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    kvk.a(s51Var, list4, bz7Var6, null, e18Var10, 8);
                } else {
                    e18Var10.T();
                }
                return ieiVar;
            case 10:
                k5j k5jVar = (k5j) obj6;
                pl3 pl3Var = (pl3) obj5;
                View view = (View) obj4;
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var11 = (e18) ld4Var11;
                if (e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    String strJ0 = d4c.j0(R.string.settings_title_choose_pace, e18Var11);
                    PlaybackPace playbackPaceV = k5jVar.v();
                    fq6 entries = PlaybackPace.getEntries();
                    p6 p6Var = new p6(6);
                    boolean zH = e18Var11.h(pl3Var) | e18Var11.h(view) | e18Var11.f(k5jVar);
                    Object objN5 = e18Var11.N();
                    if (zH || objN5 == lz1Var) {
                        objN5 = new zk1(pl3Var, view, k5jVar, 1);
                        e18Var11.k0(objN5);
                    }
                    ikk.i(strJ0, playbackPaceV, entries, p6Var, (bz7) objN5, null, null, e18Var11, 0, 96);
                } else {
                    e18Var11.T();
                }
                return ieiVar;
            case 11:
                mj1 mj1Var = (mj1) obj6;
                t4g t4gVar = (t4g) obj5;
                pl3 pl3Var2 = (pl3) obj4;
                i4g i4gVar2 = (i4g) obj;
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                i4gVar2.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((e18) ld4Var12).f(i4gVar2) ? 4 : 2;
                }
                int i3 = iIntValue12;
                e18 e18Var12 = (e18) ld4Var12;
                if (e18Var12.Q(i3 & 1, (i3 & 19) != 18)) {
                    List list5 = (List) mj1Var.s.getValue();
                    boolean z4 = !((List) mj1Var.t.getValue()).isEmpty();
                    String strS = mj1Var.S();
                    boolean z5 = !((List) mj1Var.A.getValue()).isEmpty();
                    ThinkingOption thinkingOption = (ThinkingOption) mj1Var.B.getValue();
                    String localizedText = (thinkingOption == null || (name = thinkingOption.getName()) == null) ? null : name.getLocalizedText();
                    ThinkingOption thinkingOption2 = (ThinkingOption) w44.N0((List) mj1Var.D.getValue());
                    boolean zBooleanValue3 = ((Boolean) mj1Var.F.getValue()).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) mj1Var.E.getValue()).booleanValue();
                    boolean zBooleanValue5 = ((Boolean) mj1Var.G.getValue()).booleanValue();
                    boolean zF4 = e18Var12.f(mj1Var) | e18Var12.h(t4gVar);
                    Object objN6 = e18Var12.N();
                    if (zF4 || objN6 == lz1Var) {
                        objN6 = new kp(mj1Var, 15, t4gVar);
                        e18Var12.k0(objN6);
                    }
                    bz7 bz7Var7 = (bz7) objN6;
                    boolean zF5 = e18Var12.f(mj1Var);
                    Object objN7 = e18Var12.N();
                    if (zF5 || objN7 == lz1Var) {
                        yb ybVar = new yb(1, mj1Var, mj1.class, "onSetThinkingEnabled", "onSetThinkingEnabled(Z)V", 0, 15);
                        e18Var12.k0(ybVar);
                        objN7 = ybVar;
                    }
                    bz7 bz7Var8 = (bz7) ((jm9) objN7);
                    boolean zH2 = e18Var12.h(t4gVar);
                    Object objN8 = e18Var12.N();
                    if (zH2 || objN8 == lz1Var) {
                        objN8 = new ue(t4gVar, 4);
                        e18Var12.k0(objN8);
                    }
                    zy7 zy7Var = (zy7) objN8;
                    boolean zH3 = e18Var12.h(t4gVar);
                    Object objN9 = e18Var12.N();
                    if (zH3 || objN9 == lz1Var) {
                        objN9 = new ue(t4gVar, 5);
                        e18Var12.k0(objN9);
                    }
                    kpb.g(list5, z4, strS, z5, localizedText, thinkingOption2, zBooleanValue3, zBooleanValue4, zBooleanValue5, bz7Var7, bz7Var8, zy7Var, (zy7) objN9, i4gVar2, pl3Var2, e18Var12, 805306368, (i3 << 12) & 57344);
                } else {
                    e18Var12.T();
                }
                return ieiVar;
            case 12:
                mj1 mj1Var2 = (mj1) obj6;
                zy7 zy7Var2 = (zy7) obj5;
                pl3 pl3Var3 = (pl3) obj4;
                i4g i4gVar3 = (i4g) obj;
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                i4gVar3.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((e18) ld4Var13).f(i4gVar3) ? 4 : 2;
                }
                int i4 = iIntValue13;
                e18 e18Var13 = (e18) ld4Var13;
                if (e18Var13.Q(i4 & 1, (i4 & 19) != 18)) {
                    List list6 = (List) mj1Var2.A.getValue();
                    String strR = mj1Var2.R();
                    ThinkingOption thinkingOption3 = (ThinkingOption) w44.N0((List) mj1Var2.D.getValue());
                    boolean zBooleanValue6 = ((Boolean) mj1Var2.E.getValue()).booleanValue();
                    boolean zBooleanValue7 = ((Boolean) mj1Var2.G.getValue()).booleanValue();
                    boolean zF6 = e18Var13.f(mj1Var2) | e18Var13.f(zy7Var2);
                    Object objN10 = e18Var13.N();
                    if (zF6 || objN10 == lz1Var) {
                        objN10 = new km1(mj1Var2, zy7Var2, 0);
                        e18Var13.k0(objN10);
                    }
                    bz7 bz7Var9 = (bz7) objN10;
                    boolean zF7 = e18Var13.f(mj1Var2);
                    Object objN11 = e18Var13.N();
                    if (zF7 || objN11 == lz1Var) {
                        yb ybVar2 = new yb(1, mj1Var2, mj1.class, "onSetThinkingEnabled", "onSetThinkingEnabled(Z)V", 0, 16);
                        e18Var13.k0(ybVar2);
                        objN11 = ybVar2;
                    }
                    kpb.f(list6, strR, thinkingOption3, zBooleanValue6, zBooleanValue7, bz7Var9, (bz7) ((jm9) objN11), i4gVar3, pl3Var3, e18Var13, (i4 << 21) & 29360128);
                } else {
                    e18Var13.T();
                }
                return ieiVar;
            case 13:
                m8j m8jVar = (m8j) obj6;
                lfa lfaVar = (lfa) obj5;
                zy7 zy7Var3 = (zy7) obj4;
                mnc mncVar7 = (mnc) obj;
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                mncVar7.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= ((e18) ld4Var14).f(mncVar7) ? 4 : 2;
                }
                e18 e18Var14 = (e18) ld4Var14;
                if (e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    iqb iqbVarI2 = gb9.I(b.c, mncVar7);
                    int i5 = lfa.c;
                    pqi.b(m8jVar, lfaVar, zy7Var3, iqbVarI2, e18Var14, 64);
                } else {
                    e18Var14.T();
                }
                return ieiVar;
            case 14:
                pz7 pz7Var2 = (pz7) obj6;
                String str3 = (String) obj5;
                z02 z02Var = (z02) obj4;
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var15 = (e18) ld4Var15;
                if (e18Var15.Q(1 & iIntValue15, (iIntValue15 & 17) != 16)) {
                    if (pz7Var2 == null) {
                        e18Var15.a0(486383496);
                        b = 0;
                        e18Var15.p(false);
                        iqbVar = null;
                    } else {
                        b = 0;
                        e18Var15.a0(486383497);
                        iqbVar = null;
                        zsj.a(z02Var, null, fd9.q0(-6013359, new dt(pz7Var2, 2, b), e18Var15), e18Var15, 384);
                        e18Var15.p(false);
                    }
                    etj.c(str3, z02Var, iqbVar, e18Var15, b);
                } else {
                    e18Var15.T();
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return d(obj, obj2, obj3);
            case 16:
                return e(obj, obj2, obj3);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return f(obj, obj2, obj3);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return g(obj, obj2, obj3);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return h(obj, obj2, obj3);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return n(obj, obj2, obj3);
            case 21:
                return o(obj, obj2, obj3);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return p(obj, obj2, obj3);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return q(obj, obj2, obj3);
            case 24:
                return r(obj, obj2, obj3);
            case BuildConfig.VERSION_CODE /* 25 */:
                return s(obj, obj2, obj3);
            case 26:
                return t(obj, obj2, obj3);
            case 27:
                return u(obj, obj2, obj3);
            case 28:
                return v(obj, obj2, obj3);
            default:
                OctopusConfig octopusConfig = (OctopusConfig) obj6;
                wg4 wg4Var = (wg4) obj5;
                dnh dnhVar = wg4Var.b;
                nwb nwbVar = (nwb) obj4;
                mnc mncVar8 = (mnc) obj;
                ld4 ld4Var16 = (ld4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                mncVar8.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= ((e18) ld4Var16).f(mncVar8) ? 4 : 2;
                }
                e18 e18Var16 = (e18) ld4Var16;
                if (e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    iqb iqbVarI3 = gb9.I(mpk.b0(fqbVar, mpk.Y(e18Var16), true), mncVar8);
                    q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var16, 0);
                    int iHashCode4 = Long.hashCode(e18Var16.T);
                    hyc hycVarL4 = e18Var16.l();
                    iqb iqbVarE4 = kxk.E(e18Var16, iqbVarI3);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var16.e0();
                    if (e18Var16.S) {
                        e18Var16.k(re4Var3);
                    } else {
                        e18Var16.n0();
                    }
                    d4c.i0(e18Var16, cd4.f, q64VarA2);
                    d4c.i0(e18Var16, cd4.e, hycVarL4);
                    d4c.i0(e18Var16, cd4.g, Integer.valueOf(iHashCode4));
                    d4c.h0(e18Var16, cd4.h);
                    d4c.i0(e18Var16, cd4.d, iqbVarE4);
                    String localizedText2 = (octopusConfig == null || (description = octopusConfig.getDescription()) == null) ? null : description.getLocalizedText();
                    String str4 = localizedText2 == null ? "" : localizedText2;
                    tkh tkhVar = ((jm3) gm3.c(e18Var16).e.E).g;
                    long j = gm3.a(e18Var16).N;
                    iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                    qnc qncVar2 = j9a.a;
                    tjh.b(str4, gb9.K(iqbVarC2, 16.0f, 12.0f), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var16, 0, 0, 131064);
                    String localizedText3 = (octopusConfig == null || (disclaimer_text = octopusConfig.getDisclaimer_text()) == null) ? null : disclaimer_text.getLocalizedText();
                    if (localizedText3 == null) {
                        localizedText3 = "";
                    }
                    ah4.a(localizedText3, gb9.N(gb9.L(b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 7), e18Var16, 0);
                    me7.b(MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0L, e18Var16, gb9.L(b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2));
                    kxk.g(e18Var16, b.e(fqbVar, 8.0f));
                    if (((List) dnhVar.n.getValue()).isEmpty()) {
                        e18Var16.a0(-788048129);
                        String localizedText4 = (octopusConfig == null || (empty_state = octopusConfig.getEmpty_state()) == null) ? null : empty_state.getLocalizedText();
                        tjh.b(localizedText4 == null ? "" : localizedText4, gb9.K(b.c(fqbVar, 1.0f), 16.0f, 24.0f), gm3.a(e18Var16).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var16).e.E).g, e18Var16, 0, 0, 131064);
                        e18Var16.p(false);
                    } else {
                        e18Var16.a0(-787632822);
                        List list7 = (List) dnhVar.n.getValue();
                        boolean zF8 = e18Var16.f(wg4Var);
                        Object objN12 = e18Var16.N();
                        if (zF8 || objN12 == lz1Var) {
                            objN12 = new ub2(1, wg4Var, wg4.class, "getPermissionState", "getPermissionState(Ljava/lang/String;)Lcom/anthropic/claude/tool/custom/ToolPermissionState;", 0, 20);
                            e18Var16.k0(objN12);
                        }
                        bz7 bz7Var10 = (bz7) ((jm9) objN12);
                        boolean zF9 = e18Var16.f(wg4Var);
                        Object objN13 = e18Var16.N();
                        if (zF9 || objN13 == lz1Var) {
                            objN13 = new bo(2, wg4Var, wg4.class, "setPermissionState", "setPermissionState(Ljava/lang/String;Lcom/anthropic/claude/tool/custom/ToolPermissionState;)V", 0, 12);
                            e18Var16.k0(objN13);
                        }
                        pz7 pz7Var3 = (pz7) ((jm9) objN13);
                        boolean zF10 = e18Var16.f(wg4Var);
                        Object objN14 = e18Var16.N();
                        if (zF10 || objN14 == lz1Var) {
                            objN14 = new bo(2, wg4Var, wg4.class, "setAllToolsForApp", "setAllToolsForApp(Ljava/lang/String;Lcom/anthropic/claude/tool/custom/ToolPermissionState;)V", 0, 13);
                            e18Var16.k0(objN14);
                        }
                        pz7 pz7Var4 = (pz7) ((jm9) objN14);
                        Object objN15 = e18Var16.N();
                        if (objN15 == lz1Var) {
                            objN15 = new x40(20, nwbVar);
                            e18Var16.k0(objN15);
                        }
                        ah4.b(list7, bz7Var10, pz7Var3, pz7Var4, (bz7) objN15, gb9.N(gb9.L(b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), e18Var16, 24576);
                        e18Var16.p(false);
                    }
                    e18Var16.p(true);
                } else {
                    e18Var16.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ ye(Object obj, List list, bz7 bz7Var, int i) {
        this.E = i;
        this.F = obj;
        this.G = list;
        this.H = bz7Var;
    }
}
