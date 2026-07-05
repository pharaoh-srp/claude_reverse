package defpackage;

import com.anthropic.claude.analytics.events.NetworkingEvents$RequestFailureReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class f2c {
    public final KSerializer serializer() {
        return (KSerializer) NetworkingEvents$RequestFailureReason.$cachedSerializer$delegate.getValue();
    }
}
