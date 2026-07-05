package defpackage;

import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ye6 {
    public final KSerializer serializer() {
        return (KSerializer) DrawerEvents$DrawerItem.$cachedSerializer$delegate.getValue();
    }
}
