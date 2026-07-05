package defpackage;

import com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolOutcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class wmb {
    public final KSerializer serializer() {
        return (KSerializer) MobileToolEvents$MobileToolOutcome.$cachedSerializer$delegate.getValue();
    }
}
