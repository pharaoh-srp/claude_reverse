package defpackage;

import com.anthropic.claude.analytics.events.AppIntentEvents$AppIntentType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class vj0 {
    public final KSerializer serializer() {
        return (KSerializer) AppIntentEvents$AppIntentType.$cachedSerializer$delegate.getValue();
    }
}
