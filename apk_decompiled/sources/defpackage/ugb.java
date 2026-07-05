package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$FilePreviewResult;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ugb {
    public final KSerializer serializer() {
        return (KSerializer) MessageFileEvents$FilePreviewResult.$cachedSerializer$delegate.getValue();
    }
}
