package defpackage;

import com.anthropic.claude.api.notification.TestPushCategory;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class zch {
    public final KSerializer serializer() {
        return (KSerializer) TestPushCategory.$cachedSerializer$delegate.getValue();
    }
}
