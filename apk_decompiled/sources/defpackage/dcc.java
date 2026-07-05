package defpackage;

import com.anthropic.claude.analytics.events.OfflineEvents$ScreenResolvedOutcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class dcc {
    public final KSerializer serializer() {
        return (KSerializer) OfflineEvents$ScreenResolvedOutcome.$cachedSerializer$delegate.getValue();
    }
}
