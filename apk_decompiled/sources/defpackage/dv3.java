package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptWithdrawnReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class dv3 {
    public final KSerializer serializer() {
        return (KSerializer) CodeEvents$RefusalFallbackPromptWithdrawnReason.$cachedSerializer$delegate.getValue();
    }
}
