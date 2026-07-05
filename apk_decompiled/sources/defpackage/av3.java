package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptTrigger;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class av3 {
    public final KSerializer serializer() {
        return (KSerializer) CodeEvents$RefusalFallbackPromptTrigger.$cachedSerializer$delegate.getValue();
    }
}
