package defpackage;

import com.anthropic.claude.api.chat.ChatCompletionRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class km2 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ nm2 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ ChatCompletionRequest H;
    public final /* synthetic */ im2 I;
    public final /* synthetic */ String J;
    public final /* synthetic */ int K;
    public final /* synthetic */ String L;
    public final /* synthetic */ boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km2(nm2 nm2Var, String str, ChatCompletionRequest chatCompletionRequest, im2 im2Var, String str2, int i, String str3, boolean z, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = nm2Var;
        this.G = str;
        this.H = chatCompletionRequest;
        this.I = im2Var;
        this.J = str2;
        this.K = i;
        this.L = str3;
        this.M = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new km2(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((km2) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            nm2 nm2Var = this.F;
            iib iibVar = nm2Var.d;
            this.E = 1;
            Object objA = nm2.a(nm2Var, iibVar, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this);
            m45 m45Var = m45.E;
            if (objA == m45Var) {
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
