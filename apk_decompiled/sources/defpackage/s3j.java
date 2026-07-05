package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class s3j {
    public final KSerializer serializer() {
        return (KSerializer) VoiceEvents$VoiceActivationMode.$cachedSerializer$delegate.getValue();
    }
}
