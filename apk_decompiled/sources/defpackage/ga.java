package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ga {
    public final int a;
    public final List b;
    public final int c;
    public final da d;

    public ga(int i, List list, int i2, da daVar) {
        sq6.a(i);
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = daVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj;
        return this.a == gaVar.a && x44.r(this.b, gaVar.b) && this.c == gaVar.c && x44.r(this.d, gaVar.d);
    }

    public final int hashCode() {
        int iF = sq6.F(this.a) * 31;
        List list = this.b;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        int i = this.c;
        int iF2 = (iHashCode + (i == 0 ? 0 : sq6.F(i))) * 31;
        da daVar = this.d;
        return iF2 + (daVar != null ? daVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connectivity(status=");
        String str = "null";
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "MAYBE" : "NOT_CONNECTED" : "CONNECTED");
        sb.append(", interfaces=");
        sb.append(this.b);
        sb.append(", effectiveType=");
        int i2 = this.c;
        if (i2 == 1) {
            str = "SLOW_2G";
        } else if (i2 == 2) {
            str = "2G";
        } else if (i2 == 3) {
            str = "3G";
        } else if (i2 == 4) {
            str = "4G";
        }
        sb.append(str);
        sb.append(", cellular=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
