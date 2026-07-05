package defpackage;

import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.api.chat.ProjectReference;

/* JADX INFO: loaded from: classes2.dex */
public final class sx2 {
    public final ChatConversation a;
    public final ProjectReference b;
    public final qdf c;

    public sx2(ChatConversation chatConversation, ProjectReference projectReference, qdf qdfVar) {
        this.a = chatConversation;
        this.b = projectReference;
        this.c = qdfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx2)) {
            return false;
        }
        sx2 sx2Var = (sx2) obj;
        return this.a.equals(sx2Var.a) && x44.r(this.b, sx2Var.b) && x44.r(this.c, sx2Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ProjectReference projectReference = this.b;
        int iHashCode2 = (iHashCode + (projectReference == null ? 0 : projectReference.hashCode())) * 31;
        qdf qdfVar = this.c;
        return iHashCode2 + (qdfVar != null ? qdfVar.hashCode() : 0);
    }

    public final String toString() {
        return "ChatListChatItem(chat=" + this.a + ", project=" + this.b + ", searchContext=" + this.c + ")";
    }
}
