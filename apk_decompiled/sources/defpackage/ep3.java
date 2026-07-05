package defpackage;

import com.anthropic.claude.api.notification.ClientPlatform;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ep3 {
    public final KSerializer serializer() {
        return (KSerializer) ClientPlatform.$cachedSerializer$delegate.getValue();
    }
}
