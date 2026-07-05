package defpackage;

import com.anthropic.claude.sessions.types.SessionFileAttachment;

/* JADX INFO: loaded from: classes2.dex */
public final class b42 implements d42 {
    public final SessionFileAttachment a;

    public b42(SessionFileAttachment sessionFileAttachment) {
        this.a = sessionFileAttachment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b42) && this.a.equals(((b42) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(attachment=" + this.a + ")";
    }
}
