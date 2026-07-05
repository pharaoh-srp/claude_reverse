package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptChoice;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class vu3 {
    public final KSerializer serializer() {
        return (KSerializer) CodeEvents$RefusalFallbackPromptChoice.$cachedSerializer$delegate.getValue();
    }
}
