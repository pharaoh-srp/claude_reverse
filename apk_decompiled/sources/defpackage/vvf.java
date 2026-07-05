package defpackage;

import com.anthropic.claude.sessions.types.SessionResource;

/* JADX INFO: loaded from: classes3.dex */
public final class vvf implements wvf {
    public final SessionResource a;

    public vvf(SessionResource sessionResource) {
        sessionResource.getClass();
        this.a = sessionResource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvf) && x44.r(this.a, ((vvf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Upserted(session=" + this.a + ")";
    }
}
