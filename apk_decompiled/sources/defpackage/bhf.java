package defpackage;

import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes.dex */
public final class bhf implements hhf {
    public final String a;

    public bhf(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhf) && ChatId.m981equalsimpl0(this.a, ((bhf) obj).a);
    }

    public final int hashCode() {
        return ChatId.m982hashCodeimpl(this.a);
    }

    public final String toString() {
        return ij0.j("Chat(chatId=", ChatId.m983toStringimpl(this.a), ")");
    }
}
