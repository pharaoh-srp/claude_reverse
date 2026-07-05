package defpackage;

import com.anthropic.claude.tool.model.EventDeleteV0Input;

/* JADX INFO: loaded from: classes2.dex */
public final class y62 extends vp4 {
    public EventDeleteV0Input E;
    public /* synthetic */ Object F;
    public final /* synthetic */ efe G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y62(efe efeVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = efeVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.p(null, this);
    }
}
