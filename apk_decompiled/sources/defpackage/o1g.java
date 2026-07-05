package defpackage;

import com.anthropic.claude.sessions.types.ShareStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class o1g {
    public final KSerializer serializer() {
        return (KSerializer) ShareStatus.$cachedSerializer$delegate.getValue();
    }
}
