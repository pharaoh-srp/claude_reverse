package defpackage;

import com.anthropic.claude.api.project.ProjectFilter;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class bmd {
    public final KSerializer serializer() {
        return (KSerializer) ProjectFilter.$cachedSerializer$delegate.getValue();
    }
}
