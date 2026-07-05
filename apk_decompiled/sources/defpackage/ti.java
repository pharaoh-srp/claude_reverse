package defpackage;

import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsResult;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ti {
    public final KSerializer serializer() {
        return (KSerializer) AgeSignalsEvents$AgeSignalsResult.$cachedSerializer$delegate.getValue();
    }
}
