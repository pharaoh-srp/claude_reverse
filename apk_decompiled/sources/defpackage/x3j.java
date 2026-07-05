package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceInputTrigger;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class x3j {
    public final KSerializer serializer() {
        return (KSerializer) VoiceEvents$VoiceInputTrigger.$cachedSerializer$delegate.getValue();
    }
}
