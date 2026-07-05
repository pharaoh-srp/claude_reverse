package defpackage;

import com.anthropic.claude.analytics.events.ChatSharingEvents$SharedChatInteractionType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class mb3 {
    public final KSerializer serializer() {
        return (KSerializer) ChatSharingEvents$SharedChatInteractionType.$cachedSerializer$delegate.getValue();
    }
}
