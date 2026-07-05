package defpackage;

import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageImageAsset;

/* JADX INFO: loaded from: classes2.dex */
public final class v83 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ m83 F;

    public /* synthetic */ v83(m83 m83Var, int i) {
        this.E = i;
        this.F = m83Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m83 m83Var = this.F;
        switch (i) {
            case 0:
                MessageImageAsset messageImageAsset = (MessageImageAsset) obj;
                messageImageAsset.getClass();
                m83Var.c.invoke(messageImageAsset);
                break;
            case 1:
                MessageDocumentFile messageDocumentFile = (MessageDocumentFile) obj;
                messageDocumentFile.getClass();
                m83Var.d.invoke(messageDocumentFile);
                break;
            case 2:
                MessageBlobFile messageBlobFile = (MessageBlobFile) obj;
                messageBlobFile.getClass();
                m83Var.e.invoke(messageBlobFile);
                break;
            default:
                MessageAttachment messageAttachment = (MessageAttachment) obj;
                messageAttachment.getClass();
                m83Var.f.invoke(messageAttachment);
                break;
        }
        return ieiVar;
    }
}
