package defpackage;

import com.anthropic.claude.configs.flags.SendRetryConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class o53 extends vp4 {
    public Throwable E;
    public SendRetryConfig F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ t53 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o53(t53 t53Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = t53Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return t53.j0(this.J, null, 0, null, this);
    }
}
