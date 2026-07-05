package defpackage;

import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$RequestFailureReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class gb5 {
    public final KSerializer serializer() {
        return (KSerializer) CronetAnalyticsEvents$RequestFailureReason.$cachedSerializer$delegate.getValue();
    }
}
