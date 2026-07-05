package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddImageFailureReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class pn2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$AddImageFailureReason.$cachedSerializer$delegate.getValue();
    }
}
