package defpackage;

import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchDestination;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class sk0 {
    public final KSerializer serializer() {
        return (KSerializer) AppStartEvents$AppLaunchDestination.$cachedSerializer$delegate.getValue();
    }
}
