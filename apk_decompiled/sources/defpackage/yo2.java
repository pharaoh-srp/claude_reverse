package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$DraftRestoreTrigger;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class yo2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$DraftRestoreTrigger.$cachedSerializer$delegate.getValue();
    }
}
