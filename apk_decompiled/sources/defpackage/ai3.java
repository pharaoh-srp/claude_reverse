package defpackage;

import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$FailureStage;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ai3 {
    public final KSerializer serializer() {
        return (KSerializer) ClaudeAiMessageEvents$FailureStage.$cachedSerializer$delegate.getValue();
    }
}
