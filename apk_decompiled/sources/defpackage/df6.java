package defpackage;

import com.anthropic.claude.analytics.events.DrawerEvents$DrawerOpenSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class df6 {
    public final KSerializer serializer() {
        return (KSerializer) DrawerEvents$DrawerOpenSource.$cachedSerializer$delegate.getValue();
    }
}
