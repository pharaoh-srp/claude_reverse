package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactInteractionType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ys0 {
    public final KSerializer serializer() {
        return (KSerializer) ArtifactSharingEvents$SharedArtifactInteractionType.$cachedSerializer$delegate.getValue();
    }
}
