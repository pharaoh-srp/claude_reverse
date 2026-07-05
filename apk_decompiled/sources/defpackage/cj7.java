package defpackage;

import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes3.dex */
public final class cj7 implements ej7 {
    public final String a;

    public cj7(String str) {
        str.getClass();
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cj7) && ChatId.m981equalsimpl0(this.a, ((cj7) obj).a);
    }

    public final int hashCode() {
        return ChatId.m982hashCodeimpl(this.a);
    }

    public final String toString() {
        return ij0.j("Chat(chatId=", ChatId.m983toStringimpl(this.a), ")");
    }
}
