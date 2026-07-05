package defpackage;

import com.anthropic.claude.bell.tts.TTSApiMessage;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class b2h {
    public final KSerializer serializer() {
        return (KSerializer) TTSApiMessage.$cachedSerializer$delegate.getValue();
    }
}
