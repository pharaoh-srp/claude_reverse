package defpackage;

import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchVersion;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class yx2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatListEvents$ConversationSearchVersion.$cachedSerializer$delegate.getValue();
    }
}
