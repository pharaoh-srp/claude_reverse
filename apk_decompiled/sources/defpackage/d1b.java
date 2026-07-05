package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$McpAuthFailureType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class d1b {
    public final KSerializer serializer() {
        return (KSerializer) McpEvents$McpAuthFailureType.$cachedSerializer$delegate.getValue();
    }
}
