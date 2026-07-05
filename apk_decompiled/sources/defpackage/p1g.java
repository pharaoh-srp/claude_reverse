package defpackage;

import com.anthropic.claude.sessions.types.ShareVisibilityType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class p1g {
    public final KSerializer serializer() {
        return (KSerializer) ShareVisibilityType.$cachedSerializer$delegate.getValue();
    }
}
