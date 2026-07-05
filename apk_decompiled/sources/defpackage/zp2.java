package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryOutcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class zp2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$PollingRecoveryOutcome.$cachedSerializer$delegate.getValue();
    }
}
