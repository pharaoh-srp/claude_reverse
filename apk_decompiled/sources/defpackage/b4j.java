package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTrainingConsentDismissTrigger;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class b4j {
    public final KSerializer serializer() {
        return (KSerializer) VoiceEvents$VoiceTrainingConsentDismissTrigger.$cachedSerializer$delegate.getValue();
    }
}
