package com.anthropic.claude.api.chat.messages;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends MessageFlag {
    public static final h a = new h(null);
    public static final String b = "self_harm_risk";

    @Override // com.anthropic.claude.api.chat.messages.MessageFlag
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h);
    }

    @Override // com.anthropic.claude.api.chat.messages.MessageFlag
    public final String getRawValue() {
        return b;
    }

    @Override // com.anthropic.claude.api.chat.messages.MessageFlag
    public final int hashCode() {
        return 17096331;
    }

    @Override // com.anthropic.claude.api.chat.messages.MessageFlag
    public final String toString() {
        return "SelfHarmRisk";
    }
}
