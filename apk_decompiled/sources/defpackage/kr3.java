package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$AttachmentReorderSurface;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class kr3 {
    public final KSerializer serializer() {
        return (KSerializer) CodeEvents$AttachmentReorderSurface.$cachedSerializer$delegate.getValue();
    }
}
