package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionState;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class amb {
    public final KSerializer serializer() {
        return (KSerializer) MobileAppUseEvents$MobileAppUsePermissionState.$cachedSerializer$delegate.getValue();
    }
}
