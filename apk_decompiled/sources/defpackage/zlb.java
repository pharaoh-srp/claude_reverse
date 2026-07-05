package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionChangedSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class zlb {
    public final KSerializer serializer() {
        return (KSerializer) MobileAppUseEvents$MobileAppUsePermissionChangedSource.$cachedSerializer$delegate.getValue();
    }
}
