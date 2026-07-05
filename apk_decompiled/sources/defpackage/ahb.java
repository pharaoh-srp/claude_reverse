package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$PdfPreviewResult;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ahb {
    public final KSerializer serializer() {
        return (KSerializer) MessageFileEvents$PdfPreviewResult.$cachedSerializer$delegate.getValue();
    }
}
