package defpackage;

import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yk {
    public final String a;
    public final xm b;
    public final String c;
    public final List d;
    public final boolean e;
    public final Instant f;
    public final to g;

    public /* synthetic */ yk(String str, xm xmVar, String str2, List list, boolean z, Instant instant, to toVar, int i) {
        this(str, xmVar, str2, (i & 8) != 0 ? lm6.E : list, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : toVar);
    }

    public static yk a(yk ykVar, List list, Instant instant, to toVar, int i) {
        String str = ykVar.a;
        xm xmVar = ykVar.b;
        String str2 = ykVar.c;
        if ((i & 8) != 0) {
            list = ykVar.d;
        }
        List list2 = list;
        boolean z = ykVar.e;
        if ((i & 32) != 0) {
            instant = ykVar.f;
        }
        Instant instant2 = instant;
        if ((i & 64) != 0) {
            toVar = ykVar.g;
        }
        ykVar.getClass();
        str.getClass();
        xmVar.getClass();
        str2.getClass();
        list2.getClass();
        return new yk(str, xmVar, str2, list2, z, instant2, toVar);
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final xm d() {
        return this.b;
    }

    public final to e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk)) {
            return false;
        }
        yk ykVar = (yk) obj;
        return x44.r(this.a, ykVar.a) && this.b == ykVar.b && x44.r(this.c, ykVar.c) && x44.r(this.d, ykVar.d) && this.e == ykVar.e && x44.r(this.f, ykVar.f) && x44.r(this.g, ykVar.g);
    }

    public final Instant f() {
        return this.f;
    }

    public final int hashCode() {
        int iP = fsh.p(kgh.m(kgh.l((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        Instant instant = this.f;
        int iHashCode = (iP + (instant == null ? 0 : instant.hashCode())) * 31;
        to toVar = this.g;
        return iHashCode + (toVar != null ? toVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgentChatMessage(id=");
        sb.append(this.a);
        sb.append(", role=");
        sb.append(this.b);
        sb.append(", content=");
        qy1.p(this.c, ", attachments=", ", isError=", sb, this.d);
        sb.append(this.e);
        sb.append(", timestamp=");
        sb.append(this.f);
        sb.append(", task=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public yk(String str, xm xmVar, String str2, List list, boolean z, Instant instant, to toVar) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = xmVar;
        this.c = str2;
        this.d = list;
        this.e = z;
        this.f = instant;
        this.g = toVar;
    }
}
