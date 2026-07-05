package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;

/* JADX INFO: loaded from: classes2.dex */
public final class wz8 extends vp4 {
    public ChatConversationWithProjectReference E;
    public /* synthetic */ Object F;
    public final /* synthetic */ xz8 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz8(xz8 xz8Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = xz8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.v(null, false, null, this);
    }
}
