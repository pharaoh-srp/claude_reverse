package defpackage;

import com.anthropic.claude.sessions.types.SessionContextSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class vpf {
    public final KSerializer serializer() {
        return (KSerializer) SessionContextSource.$cachedSerializer$delegate.getValue();
    }
}
