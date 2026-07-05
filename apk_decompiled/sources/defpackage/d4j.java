package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTrainingConsentSurface;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class d4j {
    public final KSerializer serializer() {
        return (KSerializer) VoiceEvents$VoiceTrainingConsentSurface.$cachedSerializer$delegate.getValue();
    }
}
