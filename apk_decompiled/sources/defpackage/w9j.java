package defpackage;

import com.anthropic.claude.analytics.events.WidgetEvents$OpenAppURLActionType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class w9j {
    public final KSerializer serializer() {
        return (KSerializer) WidgetEvents$OpenAppURLActionType.$cachedSerializer$delegate.getValue();
    }
}
