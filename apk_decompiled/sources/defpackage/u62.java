package defpackage;

import com.anthropic.claude.tool.model.EventCreateV1Input;

/* JADX INFO: loaded from: classes3.dex */
public final class u62 extends vp4 {
    public EventCreateV1Input E;
    public /* synthetic */ Object F;
    public final /* synthetic */ n78 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u62(n78 n78Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = n78Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.H(null, this);
    }
}
