package defpackage;

import com.anthropic.claude.analytics.events.OfflineEvents$OfflineErrorKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class xbc {
    public final KSerializer serializer() {
        return (KSerializer) OfflineEvents$OfflineErrorKind.$cachedSerializer$delegate.getValue();
    }
}
