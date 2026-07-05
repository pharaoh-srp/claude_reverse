package defpackage;

import com.anthropic.claude.api.chat.ChatConversation;

/* JADX INFO: loaded from: classes2.dex */
public final class ud3 extends vp4 {
    public ChatConversation E;
    public /* synthetic */ Object F;
    public final /* synthetic */ vd3 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud3(vd3 vd3Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = vd3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.w(null, this);
    }
}
