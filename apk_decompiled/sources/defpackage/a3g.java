package defpackage;

import com.anthropic.claude.sessions.types.SessionResource;

/* JADX INFO: loaded from: classes2.dex */
public final class a3g {
    public final puf a;
    public final SessionResource b;
    public final String c;

    public a3g(puf pufVar, SessionResource sessionResource, String str) {
        pufVar.getClass();
        sessionResource.getClass();
        this.a = pufVar;
        this.b = sessionResource;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3g)) {
            return false;
        }
        a3g a3gVar = (a3g) obj;
        return x44.r(this.a, a3gVar.a) && x44.r(this.b, a3gVar.b) && x44.r(this.c, a3gVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharedSessionResult(events=");
        sb.append(this.a);
        sb.append(", session=");
        sb.append(this.b);
        sb.append(", sharerDisplayName=");
        return ij0.m(sb, this.c, ")");
    }
}
