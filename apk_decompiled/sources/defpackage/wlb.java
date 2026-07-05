package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionCategory;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class wlb {
    public final KSerializer serializer() {
        return (KSerializer) MobileAppUseEvents$MobileAppUsePermissionCategory.$cachedSerializer$delegate.getValue();
    }
}
