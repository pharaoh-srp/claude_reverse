package defpackage;

import com.anthropic.claude.api.mcp.McpToolVisibility;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class b5b extends nq6 {
    public static final b5b d;

    static {
        McpToolVisibility.Companion.getClass();
        d = new b5b((KSerializer) McpToolVisibility.$cachedKeepSerializer$delegate.getValue(), McpToolVisibility.UNKNOWN);
    }
}
