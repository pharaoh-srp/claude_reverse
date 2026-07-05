package defpackage;

import com.anthropic.claude.analytics.events.AnonymousEvents$AccountCreationErrorSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ad0 {
    public final KSerializer serializer() {
        return (KSerializer) AnonymousEvents$AccountCreationErrorSource.$cachedSerializer$delegate.getValue();
    }
}
