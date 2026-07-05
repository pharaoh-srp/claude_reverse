package defpackage;

import com.anthropic.claude.login.WelcomeNotice;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class h9j {
    public final KSerializer serializer() {
        return (KSerializer) WelcomeNotice.$cachedSerializer$delegate.getValue();
    }
}
