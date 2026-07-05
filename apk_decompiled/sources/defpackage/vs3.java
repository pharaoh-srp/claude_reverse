package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionSuppressReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class vs3 {
    public final KSerializer serializer() {
        return (KSerializer) CodeEvents$CodePromptSuggestionSuppressReason.$cachedSerializer$delegate.getValue();
    }
}
