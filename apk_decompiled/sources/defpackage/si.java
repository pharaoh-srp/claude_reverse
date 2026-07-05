package defpackage;

import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsErrorType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class si {
    public final KSerializer serializer() {
        return (KSerializer) AgeSignalsEvents$AgeSignalsErrorType.$cachedSerializer$delegate.getValue();
    }
}
