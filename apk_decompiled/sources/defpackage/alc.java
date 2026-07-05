package defpackage;

import com.anthropic.claude.sessions.types.Outcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class alc {
    public final KSerializer serializer() {
        return (KSerializer) Outcome.$cachedSerializer$delegate.getValue();
    }
}
