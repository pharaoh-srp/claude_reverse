package defpackage;

import android.net.Uri;
import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadRequested;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.mcp.McpToolApprovalOption;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.chat.bottomsheet.x0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k93 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ChatScreenModalBottomSheetDestination F;
    public final /* synthetic */ t53 G;
    public final /* synthetic */ rwe H;

    public /* synthetic */ k93(t53 t53Var, ChatScreenModalBottomSheetDestination chatScreenModalBottomSheetDestination, rwe rweVar, int i) {
        this.E = i;
        this.G = t53Var;
        this.F = chatScreenModalBottomSheetDestination;
        this.H = rweVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        t53 t53Var = this.G;
        iei ieiVar = iei.a;
        rwe rweVar = this.H;
        ChatScreenModalBottomSheetDestination chatScreenModalBottomSheetDestination = this.F;
        switch (i) {
            case 0:
                ChatScreenModalBottomSheetDestination.ToolApproval toolApproval = (ChatScreenModalBottomSheetDestination.ToolApproval) chatScreenModalBottomSheetDestination;
                t53.l1(t53Var, toolApproval.m625getToolUseIdERU6ZeY(), false, toolApproval.m624getApprovalKey05SLPRs(), null);
                x0.d(rweVar);
                break;
            case 1:
                ChatScreenModalBottomSheetDestination.ToolApproval toolApproval2 = (ChatScreenModalBottomSheetDestination.ToolApproval) chatScreenModalBottomSheetDestination;
                t53.l1(t53Var, toolApproval2.m625getToolUseIdERU6ZeY(), true, toolApproval2.m624getApprovalKey05SLPRs(), McpToolApprovalOption.ONCE);
                x0.d(rweVar);
                break;
            case 2:
                ChatScreenModalBottomSheetDestination.ToolApproval toolApproval3 = (ChatScreenModalBottomSheetDestination.ToolApproval) chatScreenModalBottomSheetDestination;
                t53.l1(t53Var, toolApproval3.m625getToolUseIdERU6ZeY(), true, toolApproval3.m624getApprovalKey05SLPRs(), McpToolApprovalOption.ALWAYS);
                x0.d(rweVar);
                break;
            case 3:
                ChatScreenModalBottomSheetDestination.LocalToolApproval localToolApproval = (ChatScreenModalBottomSheetDestination.LocalToolApproval) chatScreenModalBottomSheetDestination;
                t53Var.Y0(localToolApproval.getToolName(), localToolApproval.m607getToolUseIdERU6ZeY(), localToolApproval.getFromVoice());
                rweVar.E.m(hr0.M, new j83(7));
                break;
            case 4:
                ChatScreenModalBottomSheetDestination.LocalToolApproval localToolApproval2 = (ChatScreenModalBottomSheetDestination.LocalToolApproval) chatScreenModalBottomSheetDestination;
                t53Var.Y0(localToolApproval2.getToolName(), localToolApproval2.m607getToolUseIdERU6ZeY(), localToolApproval2.getFromVoice());
                rweVar.E.m(hr0.N, new j83(8));
                break;
            case 5:
                ChatScreenModalBottomSheetDestination.LocalToolApproval localToolApproval3 = (ChatScreenModalBottomSheetDestination.LocalToolApproval) chatScreenModalBottomSheetDestination;
                String toolName = localToolApproval3.getToolName();
                String toolInput = localToolApproval3.getToolInput();
                String strM607getToolUseIdERU6ZeY = localToolApproval3.m607getToolUseIdERU6ZeY();
                String strM606getMessageIdsaiyK68 = localToolApproval3.m606getMessageIdsaiyK68();
                this.G.X0(toolName, toolInput, false, localToolApproval3.getFromVoice(), strM607getToolUseIdERU6ZeY, strM606getMessageIdsaiyK68);
                rweVar.E.m(hr0.O, new j83(9));
                break;
            case 6:
                ChatScreenModalBottomSheetDestination.LocalToolApproval localToolApproval4 = (ChatScreenModalBottomSheetDestination.LocalToolApproval) chatScreenModalBottomSheetDestination;
                String toolName2 = localToolApproval4.getToolName();
                String toolInput2 = localToolApproval4.getToolInput();
                String strM607getToolUseIdERU6ZeY2 = localToolApproval4.m607getToolUseIdERU6ZeY();
                String strM606getMessageIdsaiyK682 = localToolApproval4.m606getMessageIdsaiyK68();
                this.G.X0(toolName2, toolInput2, true, localToolApproval4.getFromVoice(), strM607getToolUseIdERU6ZeY2, strM606getMessageIdsaiyK682);
                rweVar.E.m(hr0.P, new j83(10));
                break;
            case 7:
                MessageImageAsset image = ((ChatScreenModalBottomSheetDestination.PreviewImage) chatScreenModalBottomSheetDestination).getImage();
                image.getClass();
                String queryParameter = Uri.parse(image.getUrl()).getQueryParameter("path");
                if (queryParameter == null) {
                    queryParameter = image.getUrl();
                }
                String strB = ikb.b(queryParameter);
                t53 t53Var2 = this.G;
                t53Var2.w.e(new MessageFileEvents$FileDownloadRequested(MessageFileEvents$DownloadSource.IMAGE_PREVIEW, strB), MessageFileEvents$FileDownloadRequested.Companion.serializer());
                gb9.D(t53Var2.a, null, null, new pb2(t53Var2, image, strB, null, 16), 3);
                x0.d(rweVar);
                break;
            default:
                t53Var.B1(MessageFileEvents$DownloadSource.WIGGLE_PRESENT_FILES, npk.d(((ChatScreenModalBottomSheetDestination.PreviewPdf) chatScreenModalBottomSheetDestination).getRelativeUrl()));
                x0.d(rweVar);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ k93(ChatScreenModalBottomSheetDestination chatScreenModalBottomSheetDestination, t53 t53Var, rwe rweVar, int i) {
        this.E = i;
        this.F = chatScreenModalBottomSheetDestination;
        this.G = t53Var;
        this.H = rweVar;
    }
}
