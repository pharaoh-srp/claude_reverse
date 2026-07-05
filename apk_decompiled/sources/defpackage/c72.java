package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0Input;

/* JADX INFO: loaded from: classes2.dex */
public final class c72 extends vp4 {
    public EventUpdateV0Input E;
    public /* synthetic */ Object F;
    public final /* synthetic */ gmf G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c72(gmf gmfVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = gmfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.A(null, this);
    }
}
