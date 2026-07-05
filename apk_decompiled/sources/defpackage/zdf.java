package defpackage;

import com.anthropic.claude.analytics.events.SearchEvents$SearchType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class zdf {
    public final KSerializer serializer() {
        return (KSerializer) SearchEvents$SearchType.$cachedSerializer$delegate.getValue();
    }
}
