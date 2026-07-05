package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class to2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$ConversationLoadSource.$cachedSerializer$delegate.getValue();
    }
}
