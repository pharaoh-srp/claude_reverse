package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddAttachment;

/* JADX INFO: loaded from: classes2.dex */
public final class tw2 {
    public final dk7 a;
    public final ChatEvents$AddAttachment b;

    public tw2(dk7 dk7Var, ChatEvents$AddAttachment chatEvents$AddAttachment) {
        chatEvents$AddAttachment.getClass();
        this.a = dk7Var;
        this.b = chatEvents$AddAttachment;
    }

    public final ChatEvents$AddAttachment a() {
        return this.b;
    }

    public final dk7 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw2)) {
            return false;
        }
        tw2 tw2Var = (tw2) obj;
        return this.a.equals(tw2Var.a) && x44.r(this.b, tw2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreparedUpload(uploadInfo=" + this.a + ", analyticsEvent=" + this.b + ")";
    }
}
