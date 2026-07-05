package defpackage;

import com.anthropic.claude.api.chat.MessageFile;

/* JADX INFO: loaded from: classes3.dex */
public final class xji implements yji {
    public final MessageFile a;

    public xji(MessageFile messageFile) {
        messageFile.getClass();
        this.a = messageFile;
    }

    public final MessageFile a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xji) && x44.r(this.a, ((xji) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(file=" + this.a + ")";
    }
}
