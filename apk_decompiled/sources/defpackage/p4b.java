package defpackage;

import com.anthropic.claude.api.mcp.McpToolMaxPermission;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class p4b extends nq6 {
    public static final p4b d;

    static {
        McpToolMaxPermission.Companion.getClass();
        d = new p4b((KSerializer) McpToolMaxPermission.$cachedKeepSerializer$delegate.getValue(), McpToolMaxPermission.UNKNOWN);
    }
}
