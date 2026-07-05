package defpackage;

import com.anthropic.claude.types.strings.McpServerId;

/* JADX INFO: loaded from: classes2.dex */
public final class bi4 implements di4 {
    public final String a;

    public bi4(String str) {
        str.getClass();
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi4) && McpServerId.m1032equalsimpl0(this.a, ((bi4) obj).a);
    }

    public final int hashCode() {
        return McpServerId.m1033hashCodeimpl(this.a);
    }

    public final String toString() {
        return ij0.j("McpServer(serverId=", McpServerId.m1034toStringimpl(this.a), ")");
    }
}
