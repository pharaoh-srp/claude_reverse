package defpackage;

import com.anthropic.claude.tool.model.EventSearchV0Input;

/* JADX INFO: loaded from: classes3.dex */
public final class f72 extends vp4 {
    public EventSearchV0Input E;
    public /* synthetic */ Object F;
    public final /* synthetic */ tk5 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f72(tk5 tk5Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = tk5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.f(null, this);
    }
}
