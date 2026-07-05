package defpackage;

import com.anthropic.claude.api.chat.messages.MessageFlag;

/* JADX INFO: loaded from: classes2.dex */
public final class chb extends MessageFlag {
    public final String a;

    public chb(String str) {
        super(null);
        this.a = str;
    }

    @Override // com.anthropic.claude.api.chat.messages.MessageFlag
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chb) && x44.r(this.a, ((chb) obj).a);
    }

    @Override // com.anthropic.claude.api.chat.messages.MessageFlag
    public final String getRawValue() {
        return this.a;
    }

    @Override // com.anthropic.claude.api.chat.messages.MessageFlag
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.anthropic.claude.api.chat.messages.MessageFlag
    public final String toString() {
        return ij0.j("Unknown(rawValue=", this.a, ")");
    }
}
