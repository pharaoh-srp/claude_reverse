package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.api.chat.GenerateChatTitleResponse;
import com.anthropic.claude.api.chat.UpdateChatModelFallbackResponse;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.project.details.custominstructions.CustomInstructionsDialogRoute;
import com.anthropic.claude.settings.internal.InternalSettingsAppScreen;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ModelId;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class cv implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ cv(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        boolean z = true;
        int i = 3;
        tp4 tp4Var = null;
        switch (this.E) {
            case 0:
                String strM984unboximpl = ((ChatId) obj).m984unboximpl();
                strM984unboximpl.getClass();
                lu luVar = (lu) this.F;
                luVar.getClass();
                luVar.p.setValue(luVar.Q().contains(ChatId.m978boximpl(strM984unboximpl)) ? dxf.n0(luVar.Q(), ChatId.m978boximpl(strM984unboximpl)) : dxf.q0(luVar.Q(), ChatId.m978boximpl(strM984unboximpl)));
                return iei.a;
            case 1:
                ((aid) this.F).r(null);
                return iei.a;
            case 2:
                ((f4e) ((v82) this.F)).cancel();
                return iei.a;
            case 3:
                List list = (List) obj;
                list.getClass();
                Object objU0 = w44.U0(list);
                ChatScreenArtifactSheetDestination.ViewAnalysis viewAnalysis = (ChatScreenArtifactSheetDestination.ViewAnalysis) this.F;
                return x44.r(objU0, viewAnalysis) ? list : w44.b1(list, viewAnalysis);
            case 4:
                List list2 = (List) obj;
                list2.getClass();
                Object objU02 = w44.U0(list2);
                ChatScreenModalBottomSheetDestination.ViewCombinedSources viewCombinedSources = (ChatScreenModalBottomSheetDestination.ViewCombinedSources) this.F;
                return x44.r(objU02, viewCombinedSources) ? list2 : w44.b1(list2, viewCombinedSources);
            case 5:
                List list3 = (List) obj;
                list3.getClass();
                Object objU03 = w44.U0(list3);
                ChatScreenModalBottomSheetDestination.ViewToolContent viewToolContent = (ChatScreenModalBottomSheetDestination.ViewToolContent) this.F;
                return x44.r(objU03, viewToolContent) ? list3 : w44.b1(list3, viewToolContent);
            case 6:
                List list4 = (List) obj;
                list4.getClass();
                Object objU04 = w44.U0(list4);
                ChatScreenModalBottomSheetDestination.ViewResearchDetails viewResearchDetails = (ChatScreenModalBottomSheetDestination.ViewResearchDetails) this.F;
                return x44.r(objU04, viewResearchDetails) ? list4 : w44.b1(list4, viewResearchDetails);
            case 7:
                List list5 = (List) obj;
                list5.getClass();
                Object objU05 = w44.U0(list5);
                ChatScreenModalBottomSheetDestination.ViewCollapsedTools viewCollapsedTools = (ChatScreenModalBottomSheetDestination.ViewCollapsedTools) this.F;
                return x44.r(objU05, viewCollapsedTools) ? list5 : w44.b1(list5, viewCollapsedTools);
            case 8:
                List list6 = (List) obj;
                list6.getClass();
                Object objU06 = w44.U0(list6);
                ChatScreenModalBottomSheetDestination.SshHelplines sshHelplines = (ChatScreenModalBottomSheetDestination.SshHelplines) this.F;
                return x44.r(objU06, sshHelplines) ? list6 : w44.b1(list6, sshHelplines);
            case 9:
                List list7 = (List) obj;
                list7.getClass();
                Object objU07 = w44.U0(list7);
                ChatScreenModalBottomSheetDestination.ViewCode viewCode = (ChatScreenModalBottomSheetDestination.ViewCode) this.F;
                return x44.r(objU07, viewCode) ? list7 : w44.b1(list7, viewCode);
            case 10:
                List list8 = (List) obj;
                list8.getClass();
                Object objU08 = w44.U0(list8);
                ChatScreenModalBottomSheetDestination.PreviewDocument previewDocument = (ChatScreenModalBottomSheetDestination.PreviewDocument) this.F;
                return x44.r(objU08, previewDocument) ? list8 : w44.b1(list8, previewDocument);
            case 11:
                ChatConversation chatConversation = (ChatConversation) obj;
                chatConversation.getClass();
                return ChatConversation.m167copytBaNr2I$default(chatConversation, null, null, null, ((GenerateChatTitleResponse) this.F).getTitle(), null, null, null, false, null, false, null, 2039, null);
            case 12:
                ChatConversation chatConversation2 = (ChatConversation) obj;
                chatConversation2.getClass();
                return ChatConversation.m167copytBaNr2I$default(chatConversation2, null, null, null, null, null, ((UpdateChatModelFallbackResponse) this.F).m287getModeli4oh0I(), null, false, null, false, null, 2015, null);
            case 13:
                List list9 = (List) obj;
                list9.getClass();
                Object objU09 = w44.U0(list9);
                ChatScreenModalBottomSheetDestination.ToolApproval toolApproval = (ChatScreenModalBottomSheetDestination.ToolApproval) this.F;
                return x44.r(objU09, toolApproval) ? list9 : w44.b1(list9, toolApproval);
            case 14:
                List list10 = (List) obj;
                list10.getClass();
                Object objU010 = w44.U0(list10);
                ChatScreenModalBottomSheetDestination chatScreenModalBottomSheetDestination = (ChatScreenModalBottomSheetDestination) this.F;
                return x44.r(objU010, chatScreenModalBottomSheetDestination) ? list10 : w44.b1(list10, chatScreenModalBottomSheetDestination);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                List list11 = (List) obj;
                list11.getClass();
                Object objU011 = w44.U0(list11);
                ChatScreenModalBottomSheetDestination.VoiceFeedback voiceFeedback = (ChatScreenModalBottomSheetDestination.VoiceFeedback) this.F;
                return x44.r(objU011, voiceFeedback) ? list11 : w44.b1(list11, voiceFeedback);
            case 16:
                ft7 ft7Var = (ft7) obj;
                ft7Var.getClass();
                nwb nwbVar = (nwb) this.F;
                boolean zB = ft7Var.b();
                iqb iqbVar = e93.a;
                nwbVar.setValue(Boolean.valueOf(zB));
                return iei.a;
            case g.MAX_FIELD_NUMBER /* 17 */:
                List list12 = (List) obj;
                list12.getClass();
                Object objU012 = w44.U0(list12);
                ChatScreenModalBottomSheetDestination.PreviewPdf previewPdf = (ChatScreenModalBottomSheetDestination.PreviewPdf) this.F;
                return x44.r(objU012, previewPdf) ? list12 : w44.b1(list12, previewPdf);
            case g.AVG_FIELD_NUMBER /* 18 */:
                List list13 = (List) obj;
                list13.getClass();
                Object objU013 = w44.U0(list13);
                ClaudeAppOverlay.BellMode bellMode = (ClaudeAppOverlay.BellMode) this.F;
                return x44.r(objU013, bellMode) ? list13 : w44.b1(list13, bellMode);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                List list14 = (List) obj;
                list14.getClass();
                Object objU014 = w44.U0(list14);
                ClaudeAppOverlay.ImageGalleryFullScreen imageGalleryFullScreen = (ClaudeAppOverlay.ImageGalleryFullScreen) this.F;
                return x44.r(objU014, imageGalleryFullScreen) ? list14 : w44.b1(list14, imageGalleryFullScreen);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                List list15 = (List) obj;
                list15.getClass();
                Object objU015 = w44.U0(list15);
                ClaudeAppOverlay.ExperienceSpotlightSheet experienceSpotlightSheet = (ClaudeAppOverlay.ExperienceSpotlightSheet) this.F;
                return x44.r(objU015, experienceSpotlightSheet) ? list15 : w44.b1(list15, experienceSpotlightSheet);
            case 21:
                String strM1064unboximpl = ((ModelId) obj).m1064unboximpl();
                strM1064unboximpl.getClass();
                Set set = (Set) ((pkc) this.F).a().l.getValue();
                if ((set instanceof Collection) && set.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (ModelId.m1061equalsimpl0(((cqb) it.next()).a, strM1064unboximpl)) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                String strM1064unboximpl2 = ((ModelId) obj).m1064unboximpl();
                strM1064unboximpl2.getClass();
                i iVar = (i) this.F;
                if (iVar.R0()) {
                    gb9.D(iVar.a, null, null, new v14(iVar, strM1064unboximpl2, tp4Var, i), 3);
                } else {
                    iVar.Y0.setValue(ModelId.m1058boximpl(strM1064unboximpl2));
                }
                return iei.a;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.v(ekfVar, (String) this.F);
                return iei.a;
            case 24:
                List list16 = (List) obj;
                list16.getClass();
                Object objU016 = w44.U0(list16);
                CustomInstructionsDialogRoute.EditCustomInstructions editCustomInstructions = (CustomInstructionsDialogRoute.EditCustomInstructions) this.F;
                return x44.r(objU016, editCustomInstructions) ? list16 : w44.b1(list16, editCustomInstructions);
            case BuildConfig.VERSION_CODE /* 25 */:
                KeyEvent keyEvent = ((so9) obj).a;
                ps7 ps7Var = (ps7) this.F;
                if (no9.a(ssj.i(keyEvent), no9.d) || (keyEvent.isShiftPressed() && no9.a(zsj.b(keyEvent.getKeyCode()), no9.p))) {
                    ps7Var.a(2);
                    return Boolean.TRUE;
                }
                if (!no9.a(zsj.b(keyEvent.getKeyCode()), no9.e) && !no9.a(zsj.b(keyEvent.getKeyCode()), no9.p)) {
                    return Boolean.FALSE;
                }
                ps7Var.a(1);
                return Boolean.TRUE;
            case 26:
                e92 e92Var = (e92) obj;
                if (e92Var != null) {
                    ((l06) this.F).b.h(e92Var);
                    return iei.a;
                }
                sz6.p("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                return null;
            case 27:
                o5l o5lVar = (o5l) this.F;
                o5lVar.F = 3;
                if (((v59) o5lVar.I) != null) {
                    wvk.j("Unbinding from service.");
                    ((Context) o5lVar.G).unbindService((v59) o5lVar.I);
                    o5lVar.I = null;
                }
                o5lVar.H = null;
                return iei.a;
            case 28:
                b89 b89Var = (b89) this.F;
                synchronized (b89Var.H) {
                    b89Var.I = 5;
                    b89Var.K = null;
                }
                return iei.a;
            default:
                List list17 = (List) obj;
                list17.getClass();
                Object objU017 = w44.U0(list17);
                InternalSettingsAppScreen.GrowthBookFeatureJsonEditor growthBookFeatureJsonEditor = (InternalSettingsAppScreen.GrowthBookFeatureJsonEditor) this.F;
                return x44.r(objU017, growthBookFeatureJsonEditor) ? list17 : w44.b1(list17, growthBookFeatureJsonEditor);
        }
    }
}
