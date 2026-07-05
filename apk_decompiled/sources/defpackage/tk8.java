package defpackage;

import com.anthropic.claude.analytics.health.HealthMetricAction;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class tk8 {
    public final KSerializer serializer() {
        return (KSerializer) HealthMetricAction.$cachedSerializer$delegate.getValue();
    }
}
