package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceErrorKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class v3j {
    public final KSerializer serializer() {
        return (KSerializer) VoiceEvents$VoiceErrorKind.$cachedSerializer$delegate.getValue();
    }
}
