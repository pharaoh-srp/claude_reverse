package defpackage;

import com.anthropic.claude.types.strings.McpServerId;
import com.anthropic.claude.types.strings.ToolUseId;

/* JADX INFO: loaded from: classes2.dex */
public final class iwc {
    public final String a;
    public final String b;

    public iwc(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwc)) {
            return false;
        }
        iwc iwcVar = (iwc) obj;
        return McpServerId.m1032equalsimpl0(this.a, iwcVar.a) && ToolUseId.m1160equalsimpl0(this.b, iwcVar.b);
    }

    public final int hashCode() {
        return ToolUseId.m1161hashCodeimpl(this.b) + (McpServerId.m1033hashCodeimpl(this.a) * 31);
    }

    public final String toString() {
        return ij0.l("PendingMcpAuth(serverId=", McpServerId.m1034toStringimpl(this.a), ", toolUseId=", ToolUseId.m1162toStringimpl(this.b), ")");
    }
}
