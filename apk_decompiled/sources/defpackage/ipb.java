package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.model.ThinkingOption;
import com.anthropic.claude.bell.BellOverlayDestination;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ipb implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ pl3 J;

    public /* synthetic */ ipb(mj1 mj1Var, nwb nwbVar, rwe rweVar, boolean z, pl3 pl3Var) {
        this.E = 2;
        this.F = mj1Var;
        this.H = nwbVar;
        this.I = rweVar;
        this.G = z;
        this.J = pl3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [zb0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [zb0] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        _ServerLocalizedString description;
        String localizedText;
        _ServerLocalizedString name;
        _ServerLocalizedString description2;
        String localizedText2;
        _ServerLocalizedString name2;
        int i = this.E;
        fqb fqbVar = fqb.E;
        ?? zb0Var = 0;
        zb0Var = null;
        zb0Var = null;
        zb0Var = null;
        zb0 zb0Var2 = null;
        zb0Var = 0;
        zb0Var = 0;
        zb0Var = 0;
        iei ieiVar = iei.a;
        Object obj5 = this.I;
        Object obj6 = this.H;
        Object obj7 = this.F;
        int i2 = 0;
        switch (i) {
            case 0:
                ThinkingOption thinkingOption = (ThinkingOption) obj7;
                bz7 bz7Var = (bz7) obj6;
                qnc qncVar = (qnc) obj5;
                ld4 ld4Var = (ld4) obj3;
                int iH = ebh.h((Integer) obj4, (s64) obj, (mnc) obj2);
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iH & 1, (iH & 129) != 128)) {
                    String localizedText3 = (thinkingOption == null || (name = thinkingOption.getName()) == null) ? null : name.getLocalizedText();
                    if (localizedText3 == null) {
                        localizedText3 = vb7.n(e18Var, -1095023667, R.string.model_selector_extended_thinking, e18Var, false);
                    } else {
                        e18Var.a0(-1095025372);
                        e18Var.p(false);
                    }
                    String str = localizedText3;
                    if (thinkingOption != null && (description = thinkingOption.getDescription()) != null && (localizedText = description.getLocalizedText()) != null) {
                        if (bsg.I0(localizedText)) {
                            localizedText = null;
                        }
                        if (localizedText != null) {
                            zb0Var = new zb0(localizedText);
                        }
                    }
                    rkj.c(null, str, this.G, bz7Var, b.c(fqbVar, 1.0f), null, zb0Var, true, null, null, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, lja.Q, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, ysk.d(0L, gm3.a(e18Var).k, e18Var, 253), this.J, e18Var, 12607494, 384, 0, 1043232);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                ThinkingOption thinkingOption2 = (ThinkingOption) obj7;
                bz7 bz7Var2 = (bz7) obj6;
                qnc qncVar2 = (qnc) obj5;
                ld4 ld4Var2 = (ld4) obj3;
                int iH2 = ebh.h((Integer) obj4, (s64) obj, (mnc) obj2);
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iH2 & 1, (iH2 & 129) != 128)) {
                    String localizedText4 = (thinkingOption2 == null || (name2 = thinkingOption2.getName()) == null) ? null : name2.getLocalizedText();
                    if (localizedText4 == null) {
                        localizedText4 = vb7.n(e18Var2, -1295244713, R.string.chat_options_extended_thinking, e18Var2, false);
                    } else {
                        e18Var2.a0(-1295246418);
                        e18Var2.p(false);
                    }
                    String str2 = localizedText4;
                    if (thinkingOption2 != null && (description2 = thinkingOption2.getDescription()) != null && (localizedText2 = description2.getLocalizedText()) != null) {
                        if (bsg.I0(localizedText2)) {
                            localizedText2 = null;
                        }
                        if (localizedText2 != null) {
                            zb0Var2 = new zb0(localizedText2);
                        }
                    }
                    rkj.c(null, str2, this.G, bz7Var2, b.c(fqbVar, 1.0f), null, zb0Var2, true, null, null, qncVar2, MTTypesetterKt.kLineSkipLimitMultiplier, lja.Q, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, ysk.d(0L, gm3.a(e18Var2).k, e18Var2, 253), this.J, e18Var2, 12607494, 384, 0, 1043232);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            default:
                mj1 mj1Var = (mj1) obj7;
                final wlg wlgVar = (wlg) obj6;
                final rwe rweVar = (rwe) obj5;
                final BellOverlayDestination bellOverlayDestination = (BellOverlayDestination) obj2;
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((ia0) obj).getClass();
                bellOverlayDestination.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var3).f(bellOverlayDestination) : ((e18) ld4Var3).h(bellOverlayDestination) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                    e18Var3.T();
                } else if (bellOverlayDestination.equals(BellOverlayDestination.Closed.INSTANCE)) {
                    e18Var3.a0(586605362);
                    e18Var3.p(false);
                } else {
                    boolean zEquals = bellOverlayDestination.equals(BellOverlayDestination.Settings.INSTANCE);
                    lz1 lz1Var = jd4.a;
                    if (zEquals) {
                        e18Var3.a0(586686954);
                        boolean zF = e18Var3.f(mj1Var);
                        Object objN = e18Var3.N();
                        Object obj8 = objN;
                        if (zF || objN == lz1Var) {
                            tl1 tl1Var = new tl1(mj1Var, zb0Var, i2);
                            e18Var3.k0(tl1Var);
                            obj8 = tl1Var;
                        }
                        csg.g((bz7) obj8, e18Var3, 0, 1);
                        boolean zF2 = e18Var3.f(wlgVar) | e18Var3.f(mj1Var) | e18Var3.h(rweVar);
                        Object objN2 = e18Var3.N();
                        Object obj9 = objN2;
                        if (zF2 || objN2 == lz1Var) {
                            ei eiVar = new ei(mj1Var, rweVar, wlgVar, 9);
                            e18Var3.k0(eiVar);
                            obj9 = eiVar;
                        }
                        com.anthropic.claude.bell.b.m(mj1Var, (zy7) obj9, this.G, this.J, e18Var3, 0);
                        e18Var3.p(false);
                    } else if (bellOverlayDestination instanceof BellOverlayDestination.ToolApproval) {
                        e18Var3.a0(587390096);
                        final Context context = ((View) e18Var3.j(w00.f)).getContext();
                        boolean zH = e18Var3.h(context);
                        Object objN3 = e18Var3.N();
                        Object obj10 = objN3;
                        if (zH || objN3 == lz1Var) {
                            nl1 nl1Var = new nl1(context, i2);
                            e18Var3.k0(nl1Var);
                            obj10 = nl1Var;
                        }
                        fd9.d(ieiVar, (bz7) obj10, e18Var3);
                        MobileAppToolPreviewInfo toolPreviewInfo = ((BellOverlayDestination.ToolApproval) bellOverlayDestination).getToolPreviewInfo();
                        int i3 = iIntValue & 112;
                        boolean zH2 = e18Var3.h(context) | e18Var3.f(wlgVar) | (i3 == 32 || ((iIntValue & 64) != 0 && e18Var3.h(bellOverlayDestination))) | e18Var3.h(rweVar);
                        Object objN4 = e18Var3.N();
                        if (zH2 || objN4 == lz1Var) {
                            final int i4 = 0;
                            zy7 zy7Var = new zy7() { // from class: ol1
                                @Override // defpackage.zy7
                                public final Object a() {
                                    int i5 = i4;
                                    iei ieiVar2 = iei.a;
                                    wlg wlgVar2 = wlgVar;
                                    rwe rweVar2 = rweVar;
                                    BellOverlayDestination bellOverlayDestination2 = bellOverlayDestination;
                                    Context context2 = context;
                                    switch (i5) {
                                        case 0:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var = (fn1) wlgVar2.getValue();
                                            if (fn1Var != null) {
                                                BellOverlayDestination.ToolApproval toolApproval = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var).s(toolApproval.getToolName(), toolApproval.m556getToolUseIdERU6ZeY());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                        case 1:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var2 = (fn1) wlgVar2.getValue();
                                            if (fn1Var2 != null) {
                                                BellOverlayDestination.ToolApproval toolApproval2 = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var2).s(toolApproval2.getToolName(), toolApproval2.m556getToolUseIdERU6ZeY());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                        case 2:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var3 = (fn1) wlgVar2.getValue();
                                            if (fn1Var3 != null) {
                                                BellOverlayDestination.ToolApproval toolApproval3 = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var3).r(toolApproval3.getToolName(), toolApproval3.getToolInput(), toolApproval3.m556getToolUseIdERU6ZeY(), false, toolApproval3.m555getMessageIdsaiyK68());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                        default:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var4 = (fn1) wlgVar2.getValue();
                                            if (fn1Var4 != null) {
                                                BellOverlayDestination.ToolApproval toolApproval4 = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var4).r(toolApproval4.getToolName(), toolApproval4.getToolInput(), toolApproval4.m556getToolUseIdERU6ZeY(), true, toolApproval4.m555getMessageIdsaiyK68());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                    }
                                    return ieiVar2;
                                }
                            };
                            e18Var3.k0(zy7Var);
                            objN4 = zy7Var;
                        }
                        zy7 zy7Var2 = (zy7) objN4;
                        boolean zH3 = e18Var3.h(context) | e18Var3.f(wlgVar) | (i3 == 32 || ((iIntValue & 64) != 0 && e18Var3.h(bellOverlayDestination))) | e18Var3.h(rweVar);
                        Object objN5 = e18Var3.N();
                        Object obj11 = objN5;
                        if (zH3 || objN5 == lz1Var) {
                            final int i5 = 1;
                            zy7 zy7Var3 = new zy7() { // from class: ol1
                                @Override // defpackage.zy7
                                public final Object a() {
                                    int i52 = i5;
                                    iei ieiVar2 = iei.a;
                                    wlg wlgVar2 = wlgVar;
                                    rwe rweVar2 = rweVar;
                                    BellOverlayDestination bellOverlayDestination2 = bellOverlayDestination;
                                    Context context2 = context;
                                    switch (i52) {
                                        case 0:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var = (fn1) wlgVar2.getValue();
                                            if (fn1Var != null) {
                                                BellOverlayDestination.ToolApproval toolApproval = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var).s(toolApproval.getToolName(), toolApproval.m556getToolUseIdERU6ZeY());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                        case 1:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var2 = (fn1) wlgVar2.getValue();
                                            if (fn1Var2 != null) {
                                                BellOverlayDestination.ToolApproval toolApproval2 = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var2).s(toolApproval2.getToolName(), toolApproval2.m556getToolUseIdERU6ZeY());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                        case 2:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var3 = (fn1) wlgVar2.getValue();
                                            if (fn1Var3 != null) {
                                                BellOverlayDestination.ToolApproval toolApproval3 = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var3).r(toolApproval3.getToolName(), toolApproval3.getToolInput(), toolApproval3.m556getToolUseIdERU6ZeY(), false, toolApproval3.m555getMessageIdsaiyK68());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                        default:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var4 = (fn1) wlgVar2.getValue();
                                            if (fn1Var4 != null) {
                                                BellOverlayDestination.ToolApproval toolApproval4 = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var4).r(toolApproval4.getToolName(), toolApproval4.getToolInput(), toolApproval4.m556getToolUseIdERU6ZeY(), true, toolApproval4.m555getMessageIdsaiyK68());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                    }
                                    return ieiVar2;
                                }
                            };
                            e18Var3.k0(zy7Var3);
                            obj11 = zy7Var3;
                        }
                        zy7 zy7Var4 = (zy7) obj11;
                        boolean zH4 = e18Var3.h(context) | e18Var3.f(wlgVar) | (i3 == 32 || ((iIntValue & 64) != 0 && e18Var3.h(bellOverlayDestination))) | e18Var3.h(rweVar);
                        boolean z = true;
                        Object objN6 = e18Var3.N();
                        if (zH4 || objN6 == lz1Var) {
                            final int i6 = 2;
                            zy7 zy7Var5 = new zy7() { // from class: ol1
                                @Override // defpackage.zy7
                                public final Object a() {
                                    int i52 = i6;
                                    iei ieiVar2 = iei.a;
                                    wlg wlgVar2 = wlgVar;
                                    rwe rweVar2 = rweVar;
                                    BellOverlayDestination bellOverlayDestination2 = bellOverlayDestination;
                                    Context context2 = context;
                                    switch (i52) {
                                        case 0:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var = (fn1) wlgVar2.getValue();
                                            if (fn1Var != null) {
                                                BellOverlayDestination.ToolApproval toolApproval = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var).s(toolApproval.getToolName(), toolApproval.m556getToolUseIdERU6ZeY());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                        case 1:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var2 = (fn1) wlgVar2.getValue();
                                            if (fn1Var2 != null) {
                                                BellOverlayDestination.ToolApproval toolApproval2 = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var2).s(toolApproval2.getToolName(), toolApproval2.m556getToolUseIdERU6ZeY());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                        case 2:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var3 = (fn1) wlgVar2.getValue();
                                            if (fn1Var3 != null) {
                                                BellOverlayDestination.ToolApproval toolApproval3 = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var3).r(toolApproval3.getToolName(), toolApproval3.getToolInput(), toolApproval3.m556getToolUseIdERU6ZeY(), false, toolApproval3.m555getMessageIdsaiyK68());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                        default:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var4 = (fn1) wlgVar2.getValue();
                                            if (fn1Var4 != null) {
                                                BellOverlayDestination.ToolApproval toolApproval4 = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var4).r(toolApproval4.getToolName(), toolApproval4.getToolInput(), toolApproval4.m556getToolUseIdERU6ZeY(), true, toolApproval4.m555getMessageIdsaiyK68());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                    }
                                    return ieiVar2;
                                }
                            };
                            e18Var3.k0(zy7Var5);
                            objN6 = zy7Var5;
                        }
                        zy7 zy7Var6 = (zy7) objN6;
                        boolean zH5 = e18Var3.h(context) | e18Var3.f(wlgVar);
                        if (i3 != 32 && ((iIntValue & 64) == 0 || !e18Var3.h(bellOverlayDestination))) {
                            z = false;
                        }
                        boolean zH6 = zH5 | z | e18Var3.h(rweVar);
                        Object objN7 = e18Var3.N();
                        if (zH6 || objN7 == lz1Var) {
                            final int i7 = 3;
                            zy7 zy7Var7 = new zy7() { // from class: ol1
                                @Override // defpackage.zy7
                                public final Object a() {
                                    int i52 = i7;
                                    iei ieiVar2 = iei.a;
                                    wlg wlgVar2 = wlgVar;
                                    rwe rweVar2 = rweVar;
                                    BellOverlayDestination bellOverlayDestination2 = bellOverlayDestination;
                                    Context context2 = context;
                                    switch (i52) {
                                        case 0:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var = (fn1) wlgVar2.getValue();
                                            if (fn1Var != null) {
                                                BellOverlayDestination.ToolApproval toolApproval = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var).s(toolApproval.getToolName(), toolApproval.m556getToolUseIdERU6ZeY());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                        case 1:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var2 = (fn1) wlgVar2.getValue();
                                            if (fn1Var2 != null) {
                                                BellOverlayDestination.ToolApproval toolApproval2 = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var2).s(toolApproval2.getToolName(), toolApproval2.m556getToolUseIdERU6ZeY());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                        case 2:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var3 = (fn1) wlgVar2.getValue();
                                            if (fn1Var3 != null) {
                                                BellOverlayDestination.ToolApproval toolApproval3 = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var3).r(toolApproval3.getToolName(), toolApproval3.getToolInput(), toolApproval3.m556getToolUseIdERU6ZeY(), false, toolApproval3.m555getMessageIdsaiyK68());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                        default:
                                            context2.getClass();
                                            com.anthropic.claude.bell.b.q(context2);
                                            fn1 fn1Var4 = (fn1) wlgVar2.getValue();
                                            if (fn1Var4 != null) {
                                                BellOverlayDestination.ToolApproval toolApproval4 = (BellOverlayDestination.ToolApproval) bellOverlayDestination2;
                                                ((tn1) fn1Var4).r(toolApproval4.getToolName(), toolApproval4.getToolInput(), toolApproval4.m556getToolUseIdERU6ZeY(), true, toolApproval4.m555getMessageIdsaiyK68());
                                            }
                                            com.anthropic.claude.bell.b.r(rweVar2);
                                            break;
                                    }
                                    return ieiVar2;
                                }
                            };
                            e18Var3.k0(zy7Var7);
                            objN7 = zy7Var7;
                        }
                        com.anthropic.claude.bell.b.p(toolPreviewInfo, zy7Var2, zy7Var4, zy7Var6, (zy7) objN7, e18Var3, 0);
                        e18Var3.p(false);
                    } else {
                        if (!(bellOverlayDestination instanceof BellOverlayDestination.ViewAllSources)) {
                            throw ebh.u(e18Var3, -1643643652, false);
                        }
                        e18Var3.a0(589694636);
                        eli eliVar = (eli) e18Var3.j(ve4.t);
                        BellOverlayDestination.ViewAllSources viewAllSources = (BellOverlayDestination.ViewAllSources) bellOverlayDestination;
                        List<KnowledgeSource> citations = viewAllSources.getCitations();
                        List<KnowledgeSource> otherSources = viewAllSources.getOtherSources();
                        boolean zF3 = e18Var3.f(mj1Var) | e18Var3.h(eliVar);
                        Object objN8 = e18Var3.N();
                        Object obj12 = objN8;
                        if (zF3 || objN8 == lz1Var) {
                            kn knVar = new kn(mj1Var, 13, eliVar);
                            e18Var3.k0(knVar);
                            obj12 = knVar;
                        }
                        pz7 pz7Var = (pz7) obj12;
                        boolean zH7 = e18Var3.h(rweVar);
                        Object objN9 = e18Var3.N();
                        Object obj13 = objN9;
                        if (zH7 || objN9 == lz1Var) {
                            av avVar = new av(rweVar, 2);
                            e18Var3.k0(avVar);
                            obj13 = avVar;
                        }
                        wvj.a(citations, otherSources, pz7Var, (zy7) obj13, null, e18Var3, 0);
                        e18Var3.p(false);
                    }
                }
                return ieiVar;
        }
    }

    public /* synthetic */ ipb(ThinkingOption thinkingOption, boolean z, bz7 bz7Var, qnc qncVar, pl3 pl3Var, int i) {
        this.E = i;
        this.F = thinkingOption;
        this.G = z;
        this.H = bz7Var;
        this.I = qncVar;
        this.J = pl3Var;
    }
}
