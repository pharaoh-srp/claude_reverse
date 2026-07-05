package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qve {
    public final String a;
    public final ArrayList b;
    public final long c;

    public qve(long j, String str, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = arrayList;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qve)) {
            return false;
        }
        qve qveVar = (qve) obj;
        return x44.r(this.a, qveVar.a) && this.b.equals(qveVar.b) && this.c == qveVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResolvedHost(hostname=");
        sb.append(this.a);
        sb.append(", addresses=");
        sb.append(this.b);
        sb.append(", resolutionTimestamp=");
        return grc.r(this.c, ")", sb);
    }
}
