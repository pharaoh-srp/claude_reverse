package defpackage;

import com.anthropic.claude.api.chat.ChatCompletionRequest;
import com.anthropic.claude.chat.b;
import com.anthropic.claude.configs.flags.MessageQueueConfig;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k53 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ MessageQueueConfig F;
    public final /* synthetic */ t53 G;
    public final /* synthetic */ ChatCompletionRequest H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ uhd K;
    public final /* synthetic */ List L;
    public final /* synthetic */ String M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k53(MessageQueueConfig messageQueueConfig, t53 t53Var, ChatCompletionRequest chatCompletionRequest, boolean z, boolean z2, uhd uhdVar, List list, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = messageQueueConfig;
        this.G = t53Var;
        this.H = chatCompletionRequest;
        this.I = z;
        this.J = z2;
        this.K = uhdVar;
        this.L = list;
        this.M = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new k53(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((k53) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            this.E = 1;
            Object objD = b.d(this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.F, this);
            m45 m45Var = m45.E;
            if (objD == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }
}
