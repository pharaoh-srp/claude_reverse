package defpackage;

import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.sessions.types.PermissionMode;
import com.anthropic.claude.sessions.types.SelfHostedRunnerPool;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ty3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t4g F;
    public final /* synthetic */ bz7 G;

    public /* synthetic */ ty3(bz7 bz7Var, t4g t4gVar, int i) {
        this.E = i;
        this.G = bz7Var;
        this.F = t4gVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        t4g t4gVar = this.F;
        bz7 bz7Var = this.G;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                t4gVar.a();
                bz7Var.invoke(list);
                break;
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                t4gVar.a();
                bz7Var.invoke(list2);
                break;
            case 2:
                PermissionMode permissionMode = (PermissionMode) obj;
                permissionMode.getClass();
                bz7Var.invoke(permissionMode);
                t4gVar.a();
                break;
            case 3:
                GitHubRepo gitHubRepo = (GitHubRepo) obj;
                gitHubRepo.getClass();
                bz7Var.invoke(gitHubRepo);
                t4gVar.a();
                break;
            case 4:
                EnvironmentResource environmentResource = (EnvironmentResource) obj;
                environmentResource.getClass();
                bz7Var.invoke(environmentResource);
                t4gVar.a();
                break;
            case 5:
                SelfHostedRunnerPool selfHostedRunnerPool = (SelfHostedRunnerPool) obj;
                selfHostedRunnerPool.getClass();
                bz7Var.invoke(selfHostedRunnerPool);
                t4gVar.a();
                break;
            default:
                String str = (String) obj;
                str.getClass();
                bz7Var.invoke(str);
                t4gVar.a();
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ty3(t4g t4gVar, bz7 bz7Var, int i) {
        this.E = i;
        this.F = t4gVar;
        this.G = bz7Var;
    }
}
