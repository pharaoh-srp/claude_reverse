package defpackage;

import com.anthropic.claude.api.mcp.McpResource;

/* JADX INFO: loaded from: classes2.dex */
public final class e3b implements f3b {
    public final McpResource a;

    public e3b(McpResource mcpResource) {
        mcpResource.getClass();
        this.a = mcpResource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3b) && x44.r(this.a, ((e3b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Resource(resource=" + this.a + ")";
    }
}
