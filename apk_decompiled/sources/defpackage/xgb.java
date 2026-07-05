package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$FilePreviewSurface;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class xgb {
    public final KSerializer serializer() {
        return (KSerializer) MessageFileEvents$FilePreviewSurface.$cachedSerializer$delegate.getValue();
    }
}
