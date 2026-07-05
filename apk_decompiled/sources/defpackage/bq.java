package defpackage;

import com.anthropic.claude.sessions.types.SessionFileAttachment;

/* JADX INFO: loaded from: classes2.dex */
public final class bq implements dq {
    public final SessionFileAttachment a;

    public bq(SessionFileAttachment sessionFileAttachment) {
        this.a = sessionFileAttachment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bq) && this.a.equals(((bq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(attachment=" + this.a + ")";
    }
}
