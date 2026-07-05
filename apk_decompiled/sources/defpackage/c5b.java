package defpackage;

import com.anthropic.claude.mcpapps.transport.McpUiContentBlock;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class c5b {
    public final KSerializer serializer() {
        return (KSerializer) McpUiContentBlock.$cachedSerializer$delegate.getValue();
    }
}
