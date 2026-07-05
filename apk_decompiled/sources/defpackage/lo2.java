package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$CompactionOutcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class lo2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$CompactionOutcome.$cachedSerializer$delegate.getValue();
    }
}
