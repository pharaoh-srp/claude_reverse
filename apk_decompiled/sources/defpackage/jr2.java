package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$StreamingErrorSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class jr2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$StreamingErrorSource.$cachedSerializer$delegate.getValue();
    }
}
