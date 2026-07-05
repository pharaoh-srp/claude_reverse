package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$StreamingEndpointType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ir2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$StreamingEndpointType.$cachedSerializer$delegate.getValue();
    }
}
