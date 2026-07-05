package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$BusyContainerSendRetryOutcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class bo2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$BusyContainerSendRetryOutcome.$cachedSerializer$delegate.getValue();
    }
}
