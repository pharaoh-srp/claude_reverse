package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ioe {
    public final int a;
    public final List b;
    public final int c;
    public final eoe d;

    public ioe(int i, List list, int i2, eoe eoeVar) {
        sq6.a(i);
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = eoeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioe)) {
            return false;
        }
        ioe ioeVar = (ioe) obj;
        return this.a == ioeVar.a && x44.r(this.b, ioeVar.b) && this.c == ioeVar.c && x44.r(this.d, ioeVar.d);
    }

    public final int hashCode() {
        int iF = sq6.F(this.a) * 31;
        List list = this.b;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        int i = this.c;
        int iF2 = (iHashCode + (i == 0 ? 0 : sq6.F(i))) * 31;
        eoe eoeVar = this.d;
        return iF2 + (eoeVar != null ? eoeVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connectivity(status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "MAYBE" : "NOT_CONNECTED" : "CONNECTED");
        sb.append(", interfaces=");
        sb.append(this.b);
        sb.append(", effectiveType=");
        sb.append(gid.z(this.c));
        sb.append(", cellular=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
