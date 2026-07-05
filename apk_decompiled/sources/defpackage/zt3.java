package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$ModelSelectorPersistTrigger;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class zt3 {
    public final KSerializer serializer() {
        return (KSerializer) CodeEvents$ModelSelectorPersistTrigger.$cachedSerializer$delegate.getValue();
    }
}
