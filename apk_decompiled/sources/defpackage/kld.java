package defpackage;

import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kld implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ pz7 F;

    public /* synthetic */ kld(int i, pz7 pz7Var) {
        this.E = i;
        this.F = pz7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        pz7 pz7Var = this.F;
        switch (i) {
            case 0:
                ChatConversation chatConversation = (ChatConversation) obj;
                chatConversation.getClass();
                pz7Var.invoke(ChatId.m978boximpl(chatConversation.m176getUuidRjYBDck()), chatConversation.getName());
                break;
            case 1:
                KnowledgeSource knowledgeSource = (KnowledgeSource) obj;
                knowledgeSource.getClass();
                pz7Var.invoke(knowledgeSource.getUrl(), Boolean.valueOf(knowledgeSource.isTrusted()));
                break;
            case 2:
                lb0 lb0Var = (lb0) obj;
                pz7Var.invoke(lb0Var.e.getValue(), dgj.f.b.invoke(lb0Var.f));
                break;
            case 3:
                KnowledgeSource knowledgeSource2 = (KnowledgeSource) obj;
                knowledgeSource2.getClass();
                pz7Var.invoke(knowledgeSource2, Boolean.TRUE);
                break;
            default:
                KnowledgeSource knowledgeSource3 = (KnowledgeSource) obj;
                knowledgeSource3.getClass();
                pz7Var.invoke(knowledgeSource3, Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
