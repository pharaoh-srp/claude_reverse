package defpackage;

import com.anthropic.claude.analytics.events.SearchEvents$SourceType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class cef {
    public final KSerializer serializer() {
        return (KSerializer) SearchEvents$SourceType.$cachedSerializer$delegate.getValue();
    }
}
