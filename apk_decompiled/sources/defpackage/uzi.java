package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uzi {
    public final int a;
    public final List b;
    public final szi c;

    public uzi(int i, List list, szi sziVar) {
        sq6.a(i);
        this.a = i;
        this.b = list;
        this.c = sziVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzi)) {
            return false;
        }
        uzi uziVar = (uzi) obj;
        return this.a == uziVar.a && this.b.equals(uziVar.b) && x44.r(this.c, uziVar.c);
    }

    public final int hashCode() {
        int iM = kgh.m(sq6.F(this.a) * 31, 961, this.b);
        szi sziVar = this.c;
        return iM + (sziVar == null ? 0 : sziVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connectivity(status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "MAYBE" : "NOT_CONNECTED" : "CONNECTED");
        sb.append(", interfaces=");
        sb.append(this.b);
        sb.append(", effectiveType=");
        sb.append("null");
        sb.append(", cellular=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
