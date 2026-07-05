package defpackage;

import com.anthropic.claude.api.mcp.McpToolApprovalOption;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class j4b {
    public final KSerializer serializer() {
        return (KSerializer) McpToolApprovalOption.$cachedSerializer$delegate.getValue();
    }
}
