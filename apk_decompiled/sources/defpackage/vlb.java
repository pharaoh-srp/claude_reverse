package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionAction;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class vlb {
    public final KSerializer serializer() {
        return (KSerializer) MobileAppUseEvents$MobileAppUsePermissionAction.$cachedSerializer$delegate.getValue();
    }
}
