package defpackage;

import com.anthropic.claude.analytics.events.PushEvents$FailureCause;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class myd {
    public final KSerializer serializer() {
        return (KSerializer) PushEvents$FailureCause.$cachedSerializer$delegate.getValue();
    }
}
