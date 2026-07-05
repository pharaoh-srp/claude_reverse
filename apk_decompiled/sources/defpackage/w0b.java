package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$McpAppErrorPhase;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class w0b {
    public final KSerializer serializer() {
        return (KSerializer) McpEvents$McpAppErrorPhase.$cachedSerializer$delegate.getValue();
    }
}
