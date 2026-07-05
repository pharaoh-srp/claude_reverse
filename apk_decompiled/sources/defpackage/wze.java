package defpackage;

import com.anthropic.claude.stt.repo.api.STTApiMessage;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class wze {
    public final KSerializer serializer() {
        return (KSerializer) STTApiMessage.$cachedSerializer$delegate.getValue();
    }
}
