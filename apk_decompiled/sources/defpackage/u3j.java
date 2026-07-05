package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceEntrySource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class u3j {
    public final KSerializer serializer() {
        return (KSerializer) VoiceEvents$VoiceEntrySource.$cachedSerializer$delegate.getValue();
    }
}
