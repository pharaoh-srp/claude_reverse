package defpackage;

import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchEntryPoint;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ux2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatListEvents$ConversationSearchEntryPoint.$cachedSerializer$delegate.getValue();
    }
}
