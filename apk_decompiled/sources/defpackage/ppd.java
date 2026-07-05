package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ppd {
    public final KSerializer serializer() {
        return (KSerializer) ProjectsEvents$ProjectFileSource.$cachedSerializer$delegate.getValue();
    }
}
