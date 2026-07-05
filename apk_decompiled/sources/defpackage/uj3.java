package defpackage;

import com.anthropic.claude.analytics.events.DispatchEvents$TabSelected;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.app.SettingsScreenParams;
import com.anthropic.claude.settings.SettingsAppScreen;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uj3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zqc F;
    public final /* synthetic */ qi3 G;
    public final /* synthetic */ l45 H;
    public final /* synthetic */ of6 I;

    public /* synthetic */ uj3(qi3 qi3Var, l45 l45Var, of6 of6Var, zqc zqcVar) {
        this.E = 0;
        this.G = qi3Var;
        this.F = zqcVar;
        this.H = l45Var;
        this.I = of6Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        of6 of6Var = this.I;
        l45 l45Var = this.H;
        qi3 qi3Var = this.G;
        zqc zqcVar = this.F;
        switch (i) {
            case 0:
                qi3Var.e(new DispatchEvents$TabSelected(), DispatchEvents$TabSelected.Companion.serializer());
                dk3.b(qi3Var, l45Var, of6Var, DrawerEvents$DrawerItem.COWORK);
                ClaudeAppDestination.List.AgentChat agentChat = ClaudeAppDestination.List.AgentChat.INSTANCE;
                pj3 pj3Var = pj3.K;
                zqcVar.E.m(new qj3(agentChat, zqcVar, 1), pj3Var);
                break;
            case 1:
                dk3.b(qi3Var, l45Var, of6Var, DrawerEvents$DrawerItem.PROJECTS);
                ClaudeAppDestination.List.AllProjectsList allProjectsList = ClaudeAppDestination.List.AllProjectsList.INSTANCE;
                pj3 pj3Var2 = pj3.T;
                zqcVar.E.m(new qj3(allProjectsList, zqcVar, 8), pj3Var2);
                break;
            case 2:
                dk3.b(qi3Var, l45Var, of6Var, DrawerEvents$DrawerItem.SETTINGS);
                ClaudeAppDestination.List.Settings settings = new ClaudeAppDestination.List.Settings(new SettingsScreenParams(x44.W(new SettingsAppScreen.SettingsScreen(false, 1, (mq5) null)), 0L, 2, (mq5) null));
                pj3 pj3Var3 = pj3.J;
                zqcVar.E.m(new ck3(settings, zqcVar, 0), pj3Var3);
                break;
            case 3:
                dk3.b(qi3Var, l45Var, of6Var, DrawerEvents$DrawerItem.CONWAY);
                ClaudeAppDestination.List.Conway conway = ClaudeAppDestination.List.Conway.INSTANCE;
                pj3 pj3Var4 = pj3.L;
                zqcVar.E.m(new qj3(conway, zqcVar, 2), pj3Var4);
                break;
            case 4:
                dk3.b(qi3Var, l45Var, of6Var, DrawerEvents$DrawerItem.TASKS);
                ClaudeAppDestination.List.Tasks tasks = ClaudeAppDestination.List.Tasks.INSTANCE;
                pj3 pj3Var5 = pj3.M;
                zqcVar.E.m(new qj3(tasks, zqcVar, 3), pj3Var5);
                break;
            case 5:
                dk3.b(qi3Var, l45Var, of6Var, DrawerEvents$DrawerItem.CHATS);
                ClaudeAppDestination.List.AllChatsList allChatsList = ClaudeAppDestination.List.AllChatsList.INSTANCE;
                pj3 pj3Var6 = pj3.P;
                zqcVar.E.m(new qj3(allChatsList, zqcVar, 4), pj3Var6);
                break;
            case 6:
                dk3.b(qi3Var, l45Var, of6Var, DrawerEvents$DrawerItem.ARTIFACTS);
                ClaudeAppDestination.List.ArtifactGallery artifactGallery = ClaudeAppDestination.List.ArtifactGallery.INSTANCE;
                pj3 pj3Var7 = pj3.Q;
                zqcVar.E.m(new qj3(artifactGallery, zqcVar, 5), pj3Var7);
                break;
            default:
                dk3.b(qi3Var, l45Var, of6Var, DrawerEvents$DrawerItem.CODE);
                ClaudeAppDestination.List.CodeRemote codeRemote = ClaudeAppDestination.List.CodeRemote.INSTANCE;
                pj3 pj3Var8 = pj3.R;
                zqcVar.E.m(new qj3(codeRemote, zqcVar, 6), pj3Var8);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ uj3(zqc zqcVar, qi3 qi3Var, l45 l45Var, of6 of6Var, int i) {
        this.E = i;
        this.F = zqcVar;
        this.G = qi3Var;
        this.H = l45Var;
        this.I = of6Var;
    }
}
