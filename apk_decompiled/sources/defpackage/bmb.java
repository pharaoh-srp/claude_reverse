package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class bmb {
    public final KSerializer serializer() {
        return (KSerializer) MobileAppUseEvents$MobileAppUsePermissionType.$cachedSerializer$delegate.getValue();
    }
}
