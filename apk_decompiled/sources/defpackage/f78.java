package defpackage;

import com.anthropic.claude.api.account.BootstrapResponse;

/* JADX INFO: loaded from: classes.dex */
public final class f78 extends vp4 {
    public of0 E;
    public of0 F;
    public BootstrapResponse G;
    public /* synthetic */ Object H;
    public final /* synthetic */ g78 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f78(g78 g78Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = g78Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return g78.a(this.I, this);
    }
}
