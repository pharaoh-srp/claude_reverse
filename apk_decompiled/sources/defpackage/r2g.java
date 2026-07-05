package defpackage;

import com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId;

/* JADX INFO: loaded from: classes2.dex */
public final class r2g extends vp4 {
    public ChatSnapshotSummaryWithChatId E;
    public /* synthetic */ Object F;
    public final /* synthetic */ s2g G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2g(s2g s2gVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = s2gVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.O(this);
    }
}
