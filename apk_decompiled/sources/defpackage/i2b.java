package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$SuggestionAction;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class i2b {
    public final KSerializer serializer() {
        return (KSerializer) McpEvents$SuggestionAction.$cachedSerializer$delegate.getValue();
    }
}
