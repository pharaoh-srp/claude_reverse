package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$SendMessageFailureReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ar2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$SendMessageFailureReason.$cachedSerializer$delegate.getValue();
    }
}
