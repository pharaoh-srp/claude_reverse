package defpackage;

import com.anthropic.claude.sessions.types.EnvironmentState;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class er6 {
    public final KSerializer serializer() {
        return (KSerializer) EnvironmentState.$cachedSerializer$delegate.getValue();
    }
}
