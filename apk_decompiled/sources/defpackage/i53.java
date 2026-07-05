package defpackage;

import com.anthropic.claude.api.chat.ChatCompletionRequest;
import com.anthropic.claude.configs.flags.MessageQueueConfig;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i53 extends xzg implements rz7 {
    public uhd E;
    public int F;
    public /* synthetic */ Throwable G;
    public final /* synthetic */ z9e H;
    public final /* synthetic */ t53 I;
    public final /* synthetic */ dae J;
    public final /* synthetic */ hi6 K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ m02 M;
    public final /* synthetic */ MessageQueueConfig N;
    public final /* synthetic */ z9e O;
    public final /* synthetic */ dae P;
    public final /* synthetic */ ChatCompletionRequest Q;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ boolean S;
    public final /* synthetic */ uhd T;
    public final /* synthetic */ List U;
    public final /* synthetic */ String V;
    public final /* synthetic */ vhd W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i53(z9e z9eVar, t53 t53Var, dae daeVar, hi6 hi6Var, boolean z, m02 m02Var, MessageQueueConfig messageQueueConfig, z9e z9eVar2, dae daeVar2, ChatCompletionRequest chatCompletionRequest, boolean z2, boolean z3, uhd uhdVar, List list, String str, vhd vhdVar, tp4 tp4Var) {
        super(3, tp4Var);
        this.H = z9eVar;
        this.I = t53Var;
        this.J = daeVar;
        this.K = hi6Var;
        this.L = z;
        this.M = m02Var;
        this.N = messageQueueConfig;
        this.O = z9eVar2;
        this.P = daeVar2;
        this.Q = chatCompletionRequest;
        this.R = z2;
        this.S = z3;
        this.T = uhdVar;
        this.U = list;
        this.V = str;
        this.W = vhdVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = this.V;
        vhd vhdVar = this.W;
        i53 i53Var = new i53(this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, str, vhdVar, (tp4) obj3);
        i53Var.G = (Throwable) obj2;
        return i53Var.invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i53.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
