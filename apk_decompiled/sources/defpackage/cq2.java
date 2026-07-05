package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class cq2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$PollingRecoveryTriggerReason.$cachedSerializer$delegate.getValue();
    }
}
