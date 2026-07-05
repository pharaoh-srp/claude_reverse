package defpackage;

import com.anthropic.claude.api.chat.ChatCompletionRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class lm2 extends xzg implements rz7 {
    public final /* synthetic */ dae E;
    public final /* synthetic */ nm2 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ ChatCompletionRequest H;
    public final /* synthetic */ int I;
    public final /* synthetic */ String J;
    public final /* synthetic */ boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm2(dae daeVar, nm2 nm2Var, String str, ChatCompletionRequest chatCompletionRequest, int i, String str2, boolean z, tp4 tp4Var) {
        super(3, tp4Var);
        this.E = daeVar;
        this.F = nm2Var;
        this.G = str;
        this.H = chatCompletionRequest;
        this.I = i;
        this.J = str2;
        this.K = z;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = this.J;
        boolean z = this.K;
        lm2 lm2Var = new lm2(this.E, this.F, this.G, this.H, this.I, str, z, (tp4) obj3);
        iei ieiVar = iei.a;
        lm2Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String str;
        sf5.h0(obj);
        im2 im2Var = (im2) this.E.E;
        iei ieiVar = iei.a;
        if (im2Var == null || (str = im2Var.b) == null) {
            return ieiVar;
        }
        nm2 nm2Var = this.F;
        gb9.D(nm2Var.e, null, null, new km2(nm2Var, this.G, this.H, im2Var, str, this.I, this.J, this.K, null), 3);
        return ieiVar;
    }
}
