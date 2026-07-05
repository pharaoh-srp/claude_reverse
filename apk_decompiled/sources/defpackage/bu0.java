package defpackage;

import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactViewResult;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class bu0 {
    public final KSerializer serializer() {
        return (KSerializer) ArtifactViewerEvents$ArtifactViewResult.$cachedSerializer$delegate.getValue();
    }
}
