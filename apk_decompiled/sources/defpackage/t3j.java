package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceEndReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class t3j {
    public final KSerializer serializer() {
        return (KSerializer) VoiceEvents$VoiceEndReason.$cachedSerializer$delegate.getValue();
    }
}
