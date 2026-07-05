package defpackage;

import com.anthropic.claude.types.environment.AppEnvironment;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class si0 {
    public final KSerializer serializer() {
        return (KSerializer) AppEnvironment.$cachedSerializer$delegate.getValue();
    }
}
