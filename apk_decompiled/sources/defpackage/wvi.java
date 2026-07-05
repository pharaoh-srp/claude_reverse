package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wvi {
    public final int a;
    public final List b;
    public final int c;
    public final tvi d;

    public wvi(int i, List list, int i2, tvi tviVar) {
        sq6.a(i);
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = tviVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvi)) {
            return false;
        }
        wvi wviVar = (wvi) obj;
        return this.a == wviVar.a && x44.r(this.b, wviVar.b) && this.c == wviVar.c && x44.r(this.d, wviVar.d);
    }

    public final int hashCode() {
        int iF = sq6.F(this.a) * 31;
        List list = this.b;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        int i = this.c;
        int iF2 = (iHashCode + (i == 0 ? 0 : sq6.F(i))) * 31;
        tvi tviVar = this.d;
        return iF2 + (tviVar != null ? tviVar.hashCode() : 0);
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
