package defpackage;

import com.anthropic.claude.api.chat.MessageAttachment;

/* JADX INFO: loaded from: classes3.dex */
public final class vji implements yji {
    public final MessageAttachment a;

    public vji(MessageAttachment messageAttachment) {
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
        return (obj instanceof vji) && x44.r(this.a, ((vji) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Embedded(attachment=" + this.a + ")";
    }
}
