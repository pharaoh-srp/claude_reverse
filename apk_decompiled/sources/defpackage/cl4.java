package defpackage;

import com.anthropic.claude.api.consent.ConsentType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class cl4 {
    public final KSerializer serializer() {
        return (KSerializer) ConsentType.$cachedSerializer$delegate.getValue();
    }
}
