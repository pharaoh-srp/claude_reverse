package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.api.chat.messages.CompactionStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public final KSerializer serializer() {
        return (KSerializer) CompactionStatus.Status.$cachedSerializer$delegate.getValue();
    }
}
