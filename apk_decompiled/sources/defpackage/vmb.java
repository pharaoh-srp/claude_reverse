package defpackage;

import com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class vmb {
    public final KSerializer serializer() {
        return (KSerializer) MobileToolEvents$MobileToolKind.$cachedSerializer$delegate.getValue();
    }
}
