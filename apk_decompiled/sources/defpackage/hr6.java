package defpackage;

import com.anthropic.claude.code.remote.stores.b;
import com.anthropic.claude.sessions.types.CCRNetworkConfig;
import com.anthropic.claude.sessions.types.EnvironmentConfiguration;
import com.anthropic.claude.sessions.types.EnvironmentCreateRequest;
import com.anthropic.claude.sessions.types.EnvironmentKind;
import com.anthropic.claude.sessions.types.EnvironmentLanguage;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hr6 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ b F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr6(b bVar, String str, String str2, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = bVar;
        this.G = str;
        this.H = str2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new hr6(this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((hr6) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return obj;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        jwf jwfVar = this.F.a;
        EnvironmentKind environmentKind = EnvironmentKind.ANTHROPIC_CLOUD;
        List listX = x44.X(new EnvironmentLanguage("python", "3.11"), new EnvironmentLanguage("node", "20"));
        CCRNetworkConfig.Companion.getClass();
        EnvironmentCreateRequest environmentCreateRequest = new EnvironmentCreateRequest(this.G, environmentKind, this.H, new EnvironmentConfiguration.Anthropic("/home/user", (String) null, nm6.E, listX, CCRNetworkConfig.TRUSTED_ACCESS, 2, (mq5) null));
        this.E = 1;
        Object objQ = jwfVar.a.Q(jwfVar.b, environmentCreateRequest, this);
        m45 m45Var = m45.E;
        return objQ == m45Var ? m45Var : objQ;
    }
}
