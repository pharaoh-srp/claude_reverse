package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;

/* JADX INFO: loaded from: classes2.dex */
public final class gq4 extends vp4 {
    public hq4 E;
    public String F;
    public ChatConversationWithProjectReference G;
    public /* synthetic */ Object H;
    public final /* synthetic */ hq4 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq4(hq4 hq4Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = hq4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return hq4.u(this.I, null, null, null, this);
    }
}
