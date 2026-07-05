package defpackage;

import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.stores.SessionTarget;
import com.anthropic.claude.sessions.types.CodeAgent;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.SelfHostedRunnerPool;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l3c implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ c F;
    public final /* synthetic */ r4g G;

    public /* synthetic */ l3c(c cVar, r4g r4gVar, int i) {
        this.E = i;
        this.F = cVar;
        this.G = r4gVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        r4g r4gVar = this.G;
        c cVar = this.F;
        switch (i) {
            case 0:
                EnvironmentResource environmentResource = (EnvironmentResource) obj;
                environmentResource.getClass();
                cVar.h.q(new SessionTarget.Environment(environmentResource));
                r4gVar.a();
                break;
            case 1:
                SelfHostedRunnerPool selfHostedRunnerPool = (SelfHostedRunnerPool) obj;
                selfHostedRunnerPool.getClass();
                cVar.h.q(new SessionTarget.SelfHostedPool(selfHostedRunnerPool));
                r4gVar.a();
                break;
            default:
                CodeAgent codeAgent = (CodeAgent) obj;
                codeAgent.getClass();
                cVar.i.g(codeAgent.m833getIdVN9v2L4());
                r4gVar.a();
                break;
        }
        return ieiVar;
    }
}
