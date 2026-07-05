package defpackage;

import com.anthropic.claude.api.mcp.McpServer;

/* JADX INFO: loaded from: classes.dex */
public final class g0b implements j0b {
    public final McpServer a;

    public g0b(McpServer mcpServer) {
        this.a = mcpServer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0b) && this.a.equals(((g0b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ServerUpdate(server=" + this.a + ")";
    }
}
