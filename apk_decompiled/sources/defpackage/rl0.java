package defpackage;

import com.anthropic.claude.api.account.AppStartResponse;

/* JADX INFO: loaded from: classes.dex */
public final class rl0 extends vp4 {
    public String E;
    public AppStartResponse F;
    public /* synthetic */ Object G;
    public final /* synthetic */ tl0 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl0(tl0 tl0Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = tl0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.g(null, null, this);
    }
}
