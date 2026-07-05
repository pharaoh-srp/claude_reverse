package defpackage;

import com.anthropic.claude.api.project.ProjectType;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.app.SettingsScreenParams;
import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.anthropic.claude.project.create.CreateTemplateProjectScreenParams;
import com.anthropic.claude.settings.SettingsAppScreen;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gj3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zqc F;

    public /* synthetic */ gj3(zqc zqcVar, int i) {
        this.E = i;
        this.F = zqcVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        zqc zqcVar = this.F;
        switch (i) {
            case 0:
                iv1.F(zqcVar, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams((String) null, false, (NewCodeSessionPrefill) null, (fwc) null, (CodeSessionListScope) CodeSessionListScope.DramaticShrimp.INSTANCE, 14, (mq5) null)));
                break;
            case 1:
                iv1.G(zqcVar, ClaudeAppDestination.List.AgentChatTasks.INSTANCE);
                break;
            case 2:
                iv1.G(zqcVar, new ClaudeAppDestination.List.Settings(new SettingsScreenParams(x44.X(new SettingsAppScreen.SettingsScreen(false, 1, (mq5) null), SettingsAppScreen.ConnectorsScreen.INSTANCE), 0L, 2, (mq5) null)));
                break;
            case 3:
                iv1.F(zqcVar, new ClaudeAppDestination.Detail.CreateTemplateProject(new CreateTemplateProjectScreenParams(ProjectType.STUDENT)));
                break;
            case 4:
                iv1.F(zqcVar, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams((String) null, false, (NewCodeSessionPrefill) null, (fwc) null, (CodeSessionListScope) null, 30, (mq5) null)));
                break;
            case 5:
                ClaudeAppDestination.List.Conway conway = ClaudeAppDestination.List.Conway.INSTANCE;
                zqcVar.E.m(new qj3(conway, zqcVar, 15), pj3.b0);
                break;
            case 6:
                zqcVar.m(new kac(19), new oua(17));
                break;
            default:
                zqcVar.m(new kac(19), new oua(17));
                break;
        }
        return ieiVar;
    }
}
