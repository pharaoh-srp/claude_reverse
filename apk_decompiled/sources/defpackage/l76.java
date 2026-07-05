package defpackage;

import com.anthropic.claude.analytics.events.DispatchEvents$PairingFailureReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class l76 {
    public final KSerializer serializer() {
        return (KSerializer) DispatchEvents$PairingFailureReason.$cachedSerializer$delegate.getValue();
    }
}
