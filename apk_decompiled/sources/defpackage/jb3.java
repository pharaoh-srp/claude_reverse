package defpackage;

import com.anthropic.claude.analytics.events.ChatSharingEvents$ChatShareVisibility;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class jb3 {
    public final KSerializer serializer() {
        return (KSerializer) ChatSharingEvents$ChatShareVisibility.$cachedSerializer$delegate.getValue();
    }
}
