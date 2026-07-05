package defpackage;

import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k03 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t4g F;

    public /* synthetic */ k03(t4g t4gVar, int i) {
        this.E = i;
        this.F = t4gVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        t4g t4gVar = this.F;
        switch (i) {
            case 0:
                DirectoryServer directoryServer = (DirectoryServer) obj;
                directoryServer.getClass();
                t4gVar.d(new ChatOptionsBottomSheetDestination.ConnectorDirectoryDetail(directoryServer));
                break;
            case 1:
                rvh rvhVar = (rvh) obj;
                rvhVar.getClass();
                t4gVar.d(new CodeRemoteBottomSheetDestination.ToolCallDetail(rvhVar));
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                t4gVar.d(new CodeRemoteBottomSheetDestination.PairedActiveSessions(str));
                break;
            case 3:
                rvh rvhVar2 = (rvh) obj;
                rvhVar2.getClass();
                t4gVar.d(new CodeRemoteBottomSheetDestination.ToolCallDetail(rvhVar2));
                break;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                t4gVar.d(new CodeRemoteBottomSheetDestination.WorkflowDetail(str2));
                break;
            case 5:
                String str3 = (String) obj;
                str3.getClass();
                t4gVar.d(new CodeRemoteBottomSheetDestination.ViewThinking(str3));
                break;
            case 6:
                fk fkVar = (fk) obj;
                fkVar.getClass();
                t4gVar.d(new CodeRemoteBottomSheetDestination.AttachmentText(fkVar));
                break;
            case 7:
                fk fkVar2 = (fk) obj;
                fkVar2.getClass();
                t4gVar.d(new CodeRemoteBottomSheetDestination.AttachmentVideo(fkVar2));
                break;
            case 8:
                g44 g44Var = (g44) obj;
                g44Var.getClass();
                rvh rvhVar3 = (rvh) w44.g1(g44Var.d);
                if (rvhVar3 == null) {
                    t4gVar.d(new CodeRemoteBottomSheetDestination.CollapsedToolCalls(g44Var));
                } else {
                    t4gVar.d(new CodeRemoteBottomSheetDestination.ToolCallDetail(rvhVar3));
                }
                break;
            case 9:
                c44 c44Var = (c44) obj;
                c44Var.getClass();
                t4gVar.d(new CodeRemoteBottomSheetDestination.ChannelEvents(c44Var));
                break;
            case 10:
                McpServer mcpServer = (McpServer) obj;
                mcpServer.getClass();
                t4gVar.d(new ChatOptionsBottomSheetDestination.AddFromMcpServer(mcpServer.m346getUuidowoRr7k(), null));
                break;
            default:
                TaskResponse taskResponse = (TaskResponse) obj;
                taskResponse.getClass();
                t4gVar.d(new TasksBottomSheetDestination.TaskDetail(taskResponse.m450getUuidFxcw9s(), null));
                break;
        }
        return ieiVar;
    }
}
