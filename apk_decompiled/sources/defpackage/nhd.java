package defpackage;

import com.anthropic.claude.api.chat.MessageAttachment;

/* JADX INFO: loaded from: classes3.dex */
public final class nhd implements phd {
    public final MessageAttachment a;

    public nhd(MessageAttachment messageAttachment) {
        messageAttachment.getClass();
        this.a = messageAttachment;
    }

    public final MessageAttachment a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nhd) && x44.r(this.a, ((nhd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Extracted(attachment=" + this.a + ")";
    }
}
