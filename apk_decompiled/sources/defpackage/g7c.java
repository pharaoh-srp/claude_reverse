package defpackage;

import com.anthropic.claude.api.notification.NotificationChannelStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class g7c {
    public final KSerializer serializer() {
        return (KSerializer) NotificationChannelStatus.$cachedSerializer$delegate.getValue();
    }
}
