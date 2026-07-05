package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareVisibility;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ts0 {
    public final KSerializer serializer() {
        return (KSerializer) ArtifactSharingEvents$ArtifactShareVisibility.$cachedSerializer$delegate.getValue();
    }
}
