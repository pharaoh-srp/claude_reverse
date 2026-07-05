package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class spd {
    public final KSerializer serializer() {
        return (KSerializer) ProjectsEvents$ProjectUploadSource.$cachedSerializer$delegate.getValue();
    }
}
