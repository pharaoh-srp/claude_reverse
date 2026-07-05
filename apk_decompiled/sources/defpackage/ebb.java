package defpackage;

import com.anthropic.claude.analytics.events.MemoryEvents$MemoryStyleSelectedStyle;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ebb {
    public final KSerializer serializer() {
        return (KSerializer) MemoryEvents$MemoryStyleSelectedStyle.$cachedSerializer$delegate.getValue();
    }
}
