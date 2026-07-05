package defpackage;

import com.anthropic.claude.analytics.events.LoginEvents$LoginClientErrorKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class nia {
    public final KSerializer serializer() {
        return (KSerializer) LoginEvents$LoginClientErrorKind.$cachedSerializer$delegate.getValue();
    }
}
