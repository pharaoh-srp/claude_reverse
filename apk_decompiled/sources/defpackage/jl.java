package defpackage;

import com.anthropic.claude.sessions.types.SessionFileAttachment;

/* JADX INFO: loaded from: classes2.dex */
public final class jl implements nl {
    public final SessionFileAttachment a;

    public jl(SessionFileAttachment sessionFileAttachment) {
        this.a = sessionFileAttachment;
    }

    public final SessionFileAttachment a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jl) && this.a.equals(((jl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Done(attachment=" + this.a + ")";
    }
}
