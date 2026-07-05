package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTurnOutcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class e4j {
    public final KSerializer serializer() {
        return (KSerializer) VoiceEvents$VoiceTurnOutcome.$cachedSerializer$delegate.getValue();
    }
}
