package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$SendRetryOutcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class dr2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$SendRetryOutcome.$cachedSerializer$delegate.getValue();
    }
}
