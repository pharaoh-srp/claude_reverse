package defpackage;

import com.anthropic.claude.analytics.events.OfflineEvents$CacheAgeBucket;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class wbc {
    public final KSerializer serializer() {
        return (KSerializer) OfflineEvents$CacheAgeBucket.$cachedSerializer$delegate.getValue();
    }
}
