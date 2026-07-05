package defpackage;

import com.anthropic.claude.api.chat.ToolStateContentBlock;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class u0i {
    public final KSerializer serializer() {
        return (KSerializer) ToolStateContentBlock.$cachedSerializer$delegate.getValue();
    }
}
