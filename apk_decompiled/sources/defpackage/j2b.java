package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$SuggestionOptInAction;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class j2b {
    public final KSerializer serializer() {
        return (KSerializer) McpEvents$SuggestionOptInAction.$cachedSerializer$delegate.getValue();
    }
}
