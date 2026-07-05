package defpackage;

import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsBlockingPoint;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class mi {
    public final KSerializer serializer() {
        return (KSerializer) AgeSignalsEvents$AgeSignalsBlockingPoint.$cachedSerializer$delegate.getValue();
    }
}
