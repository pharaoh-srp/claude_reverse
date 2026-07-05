package defpackage;

import com.anthropic.claude.api.mcp.McpPrompt;

/* JADX INFO: loaded from: classes2.dex */
public final class d3b implements f3b {
    public final McpPrompt a;

    public d3b(McpPrompt mcpPrompt) {
        mcpPrompt.getClass();
        this.a = mcpPrompt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3b) && x44.r(this.a, ((d3b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Prompt(prompt=" + this.a + ")";
    }
}
