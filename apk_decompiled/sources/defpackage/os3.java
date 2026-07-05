package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionOutcomeType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class os3 {
    public final KSerializer serializer() {
        return (KSerializer) CodeEvents$CodePromptSuggestionOutcomeType.$cachedSerializer$delegate.getValue();
    }
}
