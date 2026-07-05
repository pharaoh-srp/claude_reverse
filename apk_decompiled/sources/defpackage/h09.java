package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;

/* JADX INFO: loaded from: classes2.dex */
public final class h09 {
    public final String a;
    public final ChatEvents$AttachmentSource b;

    public h09(String str) {
        this.a = str;
        this.b = null;
    }

    public final ChatEvents$AttachmentSource a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h09)) {
            return false;
        }
        h09 h09Var = (h09) obj;
        return x44.r(this.a, h09Var.a) && this.b == h09Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ChatEvents$AttachmentSource chatEvents$AttachmentSource = this.b;
        return iHashCode + (chatEvents$AttachmentSource == null ? 0 : chatEvents$AttachmentSource.hashCode());
    }

    public final String toString() {
        return "IncomingSharedText(text=" + this.a + ", source=" + this.b + ")";
    }

    public h09(String str, ChatEvents$AttachmentSource chatEvents$AttachmentSource) {
        this.a = str;
        this.b = chatEvents$AttachmentSource;
    }
}
