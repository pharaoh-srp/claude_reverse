package defpackage;

import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$ResearchMode;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ni3 {
    public final KSerializer serializer() {
        return (KSerializer) ClaudeAiMessageEvents$ResearchMode.$cachedSerializer$delegate.getValue();
    }
}
