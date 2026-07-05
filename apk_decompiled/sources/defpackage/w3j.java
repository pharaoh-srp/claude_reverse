package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceFocusResult;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class w3j {
    public final KSerializer serializer() {
        return (KSerializer) VoiceEvents$VoiceFocusResult.$cachedSerializer$delegate.getValue();
    }
}
