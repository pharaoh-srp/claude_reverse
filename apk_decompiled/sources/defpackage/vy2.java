package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class vy2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatMessageActionEvents$ActionSource.$cachedSerializer$delegate.getValue();
    }
}
