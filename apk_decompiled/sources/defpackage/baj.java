package defpackage;

import com.anthropic.claude.analytics.events.WidgetEvents$ShortcutType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class baj {
    public final KSerializer serializer() {
        return (KSerializer) WidgetEvents$ShortcutType.$cachedSerializer$delegate.getValue();
    }
}
