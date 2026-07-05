package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class kpd {
    public final KSerializer serializer() {
        return (KSerializer) ProjectsEvents$ProjectDocumentSource.$cachedSerializer$delegate.getValue();
    }
}
