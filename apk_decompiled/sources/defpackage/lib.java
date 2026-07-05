package defpackage;

import com.anthropic.claude.api.chat.MessageSender;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class lib {
    public final KSerializer serializer() {
        return (KSerializer) MessageSender.$cachedSerializer$delegate.getValue();
    }
}
