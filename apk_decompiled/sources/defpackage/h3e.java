package defpackage;

import com.anthropic.claude.sessions.types.SessionFileContent;

/* JADX INFO: loaded from: classes2.dex */
public final class h3e implements i3e {
    public final SessionFileContent a;

    public h3e(SessionFileContent sessionFileContent) {
        sessionFileContent.getClass();
        this.a = sessionFileContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3e) && x44.r(this.a, ((h3e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(file=" + this.a + ")";
    }
}
