package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryOutcome;

/* JADX INFO: loaded from: classes2.dex */
public final class v43 extends vp4 {
    public ChatEvents$PollingRecoveryOutcome E;
    public bae F;
    public /* synthetic */ Object G;
    public final /* synthetic */ t53 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v43(t53 t53Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = t53Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.i1(null, false, null, null, null, null, null, this);
    }
}
