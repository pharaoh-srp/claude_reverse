package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$MarkdownNodeKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class fp2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$MarkdownNodeKind.$cachedSerializer$delegate.getValue();
    }
}
