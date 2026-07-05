package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressedSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class rp2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$NewChatButtonPressedSource.$cachedSerializer$delegate.getValue();
    }
}
