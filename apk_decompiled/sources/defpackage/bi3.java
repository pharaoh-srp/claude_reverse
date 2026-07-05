package defpackage;

import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$FailureType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class bi3 {
    public final KSerializer serializer() {
        return (KSerializer) ClaudeAiMessageEvents$FailureType.$cachedSerializer$delegate.getValue();
    }
}
