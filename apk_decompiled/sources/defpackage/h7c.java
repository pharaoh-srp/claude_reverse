package defpackage;

import com.anthropic.claude.api.notification.NotificationChannelType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class h7c {
    public final KSerializer serializer() {
        return (KSerializer) NotificationChannelType.$cachedSerializer$delegate.getValue();
    }
}
