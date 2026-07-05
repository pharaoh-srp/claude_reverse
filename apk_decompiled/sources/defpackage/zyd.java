package defpackage;

import com.anthropic.claude.analytics.events.PushEvents$SessionReplyOutcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class zyd {
    public final KSerializer serializer() {
        return (KSerializer) PushEvents$SessionReplyOutcome.$cachedSerializer$delegate.getValue();
    }
}
