package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceSettingKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class a4j {
    public final KSerializer serializer() {
        return (KSerializer) VoiceEvents$VoiceSettingKind.$cachedSerializer$delegate.getValue();
    }
}
