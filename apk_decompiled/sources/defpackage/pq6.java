package defpackage;

import com.anthropic.claude.sessions.types.EnvironmentConfiguration;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class pq6 {
    public final KSerializer serializer() {
        return (KSerializer) EnvironmentConfiguration.$cachedSerializer$delegate.getValue();
    }
}
