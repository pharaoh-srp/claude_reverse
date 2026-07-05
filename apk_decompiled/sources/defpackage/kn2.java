package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddFileFailureReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class kn2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$AddFileFailureReason.$cachedSerializer$delegate.getValue();
    }
}
