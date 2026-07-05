package defpackage;

import com.anthropic.claude.sessions.types.SessionResource;

/* JADX INFO: loaded from: classes2.dex */
public final class o85 implements p85 {
    public final SessionResource a;

    public o85(SessionResource sessionResource) {
        sessionResource.getClass();
        this.a = sessionResource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o85) && x44.r(this.a, ((o85) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(session=" + this.a + ")";
    }
}
