package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTrainingConsentState;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class c4j {
    public final KSerializer serializer() {
        return (KSerializer) VoiceEvents$VoiceTrainingConsentState.$cachedSerializer$delegate.getValue();
    }
}
