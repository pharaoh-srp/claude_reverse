package defpackage;

import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchOutcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class vx2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatListEvents$ConversationSearchOutcome.$cachedSerializer$delegate.getValue();
    }
}
