package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class wn2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$AttachmentSource.$cachedSerializer$delegate.getValue();
    }
}
