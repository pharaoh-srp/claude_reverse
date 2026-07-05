package defpackage;

import com.anthropic.claude.analytics.events.OfflineEvents$OfflineScreen;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ybc {
    public final KSerializer serializer() {
        return (KSerializer) OfflineEvents$OfflineScreen.$cachedSerializer$delegate.getValue();
    }
}
