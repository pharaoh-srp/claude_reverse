package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryCancellationCause;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class wp2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$PollingRecoveryCancellationCause.$cachedSerializer$delegate.getValue();
    }
}
