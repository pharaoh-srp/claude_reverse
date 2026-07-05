package defpackage;

import com.anthropic.claude.sessions.types.SessionFileAttachment;

/* JADX INFO: loaded from: classes2.dex */
public final class j32 implements n32 {
    public final SessionFileAttachment a;

    public j32(SessionFileAttachment sessionFileAttachment) {
        this.a = sessionFileAttachment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j32) && this.a.equals(((j32) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Done(attachment=" + this.a + ")";
    }
}
