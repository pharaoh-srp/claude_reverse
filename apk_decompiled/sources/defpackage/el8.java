package defpackage;

import com.anthropic.claude.analytics.health.HealthMetricOutcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class el8 {
    public final KSerializer serializer() {
        return (KSerializer) HealthMetricOutcome.$cachedSerializer$delegate.getValue();
    }
}
