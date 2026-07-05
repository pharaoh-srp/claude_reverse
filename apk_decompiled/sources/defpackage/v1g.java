package defpackage;

import com.anthropic.claude.api.share.ChatSnapshot;

/* JADX INFO: loaded from: classes2.dex */
public final class v1g extends vp4 {
    public ChatSnapshot E;
    public /* synthetic */ Object F;
    public final /* synthetic */ w1g G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1g(w1g w1gVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = w1gVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return w1g.O(this.G, null, this);
    }
}
