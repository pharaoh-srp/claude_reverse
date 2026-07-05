package defpackage;

import com.anthropic.claude.login.LoginScreens;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class nja {
    public final KSerializer serializer() {
        return (KSerializer) LoginScreens.$cachedSerializer$delegate.getValue();
    }
}
