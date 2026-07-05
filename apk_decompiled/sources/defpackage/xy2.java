package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageAction;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class xy2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatMessageActionEvents$ChatMessageAction.$cachedSerializer$delegate.getValue();
    }
}
