package defpackage;

import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ar {
    public final String a;
    public final ArrayList b;
    public final int c;
    public final boolean d;
    public final Instant e;

    public ar(String str, ArrayList arrayList, int i, boolean z, Instant instant) {
        str.getClass();
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = z;
        this.e = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return x44.r(this.a, arVar.a) && this.b.equals(arVar.b) && this.c == arVar.c && this.d == arVar.d && x44.r(this.e, arVar.e);
    }

    public final int hashCode() {
        int iP = fsh.p(vb7.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
        Instant instant = this.e;
        return iP + (instant == null ? 0 : instant.hashCode());
    }

    public final String toString() {
        return "AgentSummary(description=" + this.a + ", urls=" + this.b + ", totalSources=" + this.c + ", completed=" + this.d + ", startedAt=" + this.e + ")";
    }
}
