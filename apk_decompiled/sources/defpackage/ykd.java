package defpackage;

import com.anthropic.claude.api.chat.ChatConversation;

/* JADX INFO: loaded from: classes3.dex */
public final class ykd implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ ChatConversation G;

    public /* synthetic */ ykd(bz7 bz7Var, ChatConversation chatConversation, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = chatConversation;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        ChatConversation chatConversation = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(chatConversation);
                break;
            default:
                bz7Var.invoke(chatConversation);
                break;
        }
        return ieiVar;
    }
}
