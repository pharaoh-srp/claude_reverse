package defpackage;

import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hj3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zqc F;

    public /* synthetic */ hj3(zqc zqcVar, int i) {
        this.E = i;
        this.F = zqcVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        ChatScreenParams params;
        int i = this.E;
        String strM591getChatIdRjYBDck = null;
        iei ieiVar = iei.a;
        zqc zqcVar = this.F;
        switch (i) {
            case 0:
                SessionResource sessionResource = (SessionResource) obj;
                sessionResource.getClass();
                iv1.F(zqcVar, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams(sessionResource.m875getIdOcx55TE(), false, (NewCodeSessionPrefill) null, (fwc) null, (CodeSessionListScope) CodeSessionListScope.DramaticShrimp.INSTANCE, 14, (mq5) null)));
                break;
            case 1:
                SessionResource sessionResource2 = (SessionResource) obj;
                sessionResource2.getClass();
                iv1.F(zqcVar, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams(sessionResource2.m875getIdOcx55TE(), false, (NewCodeSessionPrefill) null, (fwc) null, (CodeSessionListScope) CodeSessionListScope.DramaticShrimp.INSTANCE, 14, (mq5) null)));
                break;
            case 2:
                Project project = (Project) obj;
                project.getClass();
                iv1.G(zqcVar, new ClaudeAppDestination.List.ProjectDetails(new ProjectDetailsScreenParams(project.m404getUuid5pmjbU(), false, 2, (mq5) null)));
                break;
            case 3:
                SessionResource sessionResource3 = (SessionResource) obj;
                sessionResource3.getClass();
                iv1.F(zqcVar, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams(sessionResource3.m875getIdOcx55TE(), false, (NewCodeSessionPrefill) null, (fwc) null, (CodeSessionListScope) null, 30, (mq5) null)));
                break;
            case 4:
                NewCodeSessionPrefill newCodeSessionPrefill = (NewCodeSessionPrefill) obj;
                newCodeSessionPrefill.getClass();
                iv1.F(zqcVar, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams((String) null, false, newCodeSessionPrefill, (fwc) null, (CodeSessionListScope) null, 26, (mq5) null)));
                break;
            case 5:
                NewCodeSessionPrefill newCodeSessionPrefill2 = (NewCodeSessionPrefill) obj;
                newCodeSessionPrefill2.getClass();
                iv1.F(zqcVar, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams((String) null, false, newCodeSessionPrefill2, (fwc) null, (CodeSessionListScope) null, 26, (mq5) null)));
                break;
            case 6:
                SessionResource sessionResource4 = (SessionResource) obj;
                sessionResource4.getClass();
                iv1.F(zqcVar, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams(sessionResource4.m875getIdOcx55TE(), false, (NewCodeSessionPrefill) null, (fwc) null, (CodeSessionListScope) null, 30, (mq5) null)));
                break;
            case 7:
                ChatScreenParams chatScreenParams = (ChatScreenParams) obj;
                chatScreenParams.getClass();
                ie3 ie3Var = (ie3) w44.V0(((te3) zqcVar.F.getValue()).b);
                ClaudeAppDestination.Detail detail = ie3Var != null ? (ClaudeAppDestination.Detail) ie3Var.a : null;
                ClaudeAppDestination.Detail.Chat chat = detail instanceof ClaudeAppDestination.Detail.Chat ? (ClaudeAppDestination.Detail.Chat) detail : null;
                if (chat != null && (params = chat.getParams()) != null) {
                    strM591getChatIdRjYBDck = params.m591getChatIdRjYBDck();
                }
                if (!(strM591getChatIdRjYBDck != null ? ChatId.m981equalsimpl0(strM591getChatIdRjYBDck, chatScreenParams.m591getChatIdRjYBDck()) : false)) {
                    iv1.F(zqcVar, new ClaudeAppDestination.Detail.Chat(chatScreenParams));
                }
                break;
            default:
                ye3 ye3Var = (ye3) obj;
                ye3Var.getClass();
                zqcVar.E.m(new tz9(14, ye3Var), new y1c(18));
                if (ye3Var != ye3.E && ((te3) zqcVar.F.getValue()).a.isEmpty()) {
                    iv1.G(zqcVar, ClaudeAppDestination.List.AllChatsList.INSTANCE);
                }
                break;
        }
        return ieiVar;
    }
}
