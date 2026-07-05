package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ContinueChatButtonPressedSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class qo2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$ContinueChatButtonPressedSource.$cachedSerializer$delegate.getValue();
    }
}
