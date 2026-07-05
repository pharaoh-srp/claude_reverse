package defpackage;

import com.anthropic.claude.analytics.events.LoginEvents$LogoutReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class oia {
    public final KSerializer serializer() {
        return (KSerializer) LoginEvents$LogoutReason.$cachedSerializer$delegate.getValue();
    }
}
