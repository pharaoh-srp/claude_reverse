package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$DraftRestoreTrigger;

/* JADX INFO: loaded from: classes.dex */
public final class yv2 extends vp4 {
    public ChatEvents$DraftRestoreTrigger E;
    public vhd F;
    public qi3 G;
    public boolean H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ hw2 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv2(hw2 hw2Var, vp4 vp4Var) {
        super(vp4Var);
        this.K = hw2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.h0(null, null, false, this);
    }
}
