package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$StreamingMessageCompletionStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class kr2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$StreamingMessageCompletionStatus.$cachedSerializer$delegate.getValue();
    }
}
