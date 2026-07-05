package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.bell.BellModelSheetDestination;
import com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination;
import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;
import com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.MobileAppUseDestination;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.project.knowledge.ProjectKnowledgeBottomSheetDestination;
import com.anthropic.claude.tool.ui.chat.FormSheetDestination;
import com.anthropic.claude.tool.ui.chat.PhoneCallSheetDestination;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ue implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t4g F;

    public /* synthetic */ ue(t4g t4gVar, int i) {
        this.E = i;
        this.F = t4gVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        CodeRemoteBottomSheetDestination.ModelSelection modelSelection = CodeRemoteBottomSheetDestination.ModelSelection.a;
        iei ieiVar = iei.a;
        t4g t4gVar = this.F;
        switch (i) {
            case 0:
                t4gVar.d(ChatOptionsBottomSheetDestination.SelectProject.INSTANCE);
                break;
            case 1:
                t4gVar.d(ChatOptionsBottomSheetDestination.SelectToolAccess.INSTANCE);
                break;
            case 2:
                t4gVar.d(ChatOptionsBottomSheetDestination.Connectors.INSTANCE);
                break;
            case 3:
                t4gVar.d(BellModelSheetDestination.SelectModel.INSTANCE);
                break;
            case 4:
                t4gVar.d(BellModelSheetDestination.SelectEffort.INSTANCE);
                break;
            case 5:
                t4gVar.d(BellModelSheetDestination.MoreModels.INSTANCE);
                break;
            case 6:
                t4gVar.d(ChatOptionsBottomSheetDestination.ConnectorDirectory.INSTANCE);
                break;
            case 7:
                t4gVar.d(CodeRemoteBottomSheetDestination.ConnectorDirectory.a);
                break;
            case 8:
                t4gVar.d(CodeRemoteBottomSheetDestination.Connectors.a);
                break;
            case 9:
                t4gVar.d(CodeRemoteBottomSheetDestination.AddContext.a);
                break;
            case 10:
                t4gVar.d(CodeRemoteBottomSheetDestination.AttachmentOptions.a);
                break;
            case 11:
                t4gVar.d(modelSelection);
                break;
            case 12:
                t4gVar.d(CodeRemoteBottomSheetDestination.DiffView.a);
                break;
            case 13:
                t4gVar.a();
                break;
            case 14:
                t4gVar.d(CodeRemoteBottomSheetDestination.EnvironmentSelection.a);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                t4gVar.d(CodeRemoteBottomSheetDestination.PlanView.a);
                break;
            case 16:
                t4gVar.d(CodeRemoteBottomSheetDestination.ShareSession.a);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                t4gVar.d(modelSelection);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                t4gVar.d(modelSelection);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                t4gVar.d(CodeRemoteBottomSheetDestination.ConnectGitHub.a);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                t4gVar.d(MobileAppUseDestination.CalendarSelection.INSTANCE);
                break;
            case 21:
                t4gVar.d(PhoneCallSheetDestination.Transcript.INSTANCE);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                t4gVar.d(ProjectKnowledgeBottomSheetDestination.CreateDoc.INSTANCE);
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                t4gVar.d(ProjectKnowledgeBottomSheetDestination.AddContent.INSTANCE);
                break;
            case 24:
                t4gVar.d(FormSheetDestination.FormInput.INSTANCE);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                t4gVar.c();
                break;
            case 26:
                t4gVar.d(ModelSelectorBottomSheetDestination.SelectEffort.INSTANCE);
                break;
            default:
                t4gVar.d(ModelSelectorBottomSheetDestination.MoreModels.INSTANCE);
                break;
        }
        return ieiVar;
    }
}
