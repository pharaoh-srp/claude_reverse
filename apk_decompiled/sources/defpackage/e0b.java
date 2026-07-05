package defpackage;

import com.anthropic.claude.api.mcp.McpAuthStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class e0b extends nq6 {
    public static final e0b d;

    static {
        McpAuthStatus.Companion.getClass();
        d = new e0b((KSerializer) McpAuthStatus.$cachedKeepSerializer$delegate.getValue(), McpAuthStatus.UNKNOWN);
    }
}
