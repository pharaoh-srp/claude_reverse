package defpackage;

import com.anthropic.claude.sessions.types.SessionResource;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kpf {
    public final SessionResource a;
    public final List b;
    public final boolean c;

    public kpf(SessionResource sessionResource, List list, boolean z) {
        sessionResource.getClass();
        this.a = sessionResource;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpf)) {
            return false;
        }
        kpf kpfVar = (kpf) obj;
        return x44.r(this.a, kpfVar.a) && this.b.equals(kpfVar.b) && this.c == kpfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kgh.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedSession(session=");
        sb.append(this.a);
        sb.append(", events=");
        sb.append(this.b);
        sb.append(", isReadOnly=");
        return sq6.v(")", sb, this.c);
    }
}
