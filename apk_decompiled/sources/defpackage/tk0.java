package defpackage;

import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchStartType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class tk0 {
    public final KSerializer serializer() {
        return (KSerializer) AppStartEvents$AppLaunchStartType.$cachedSerializer$delegate.getValue();
    }
}
