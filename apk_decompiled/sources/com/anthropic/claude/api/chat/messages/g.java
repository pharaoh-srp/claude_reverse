package com.anthropic.claude.api.chat.messages;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends MessageFlag {
    public static final g a = new g(null);
    public static final String b = "election";

    @Override // com.anthropic.claude.api.chat.messages.MessageFlag
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g);
    }

    @Override // com.anthropic.claude.api.chat.messages.MessageFlag
    public final String getRawValue() {
        return b;
    }

    @Override // com.anthropic.claude.api.chat.messages.MessageFlag
    public final int hashCode() {
        return 957956949;
    }

    @Override // com.anthropic.claude.api.chat.messages.MessageFlag
    public final String toString() {
        return "Election";
    }
}
