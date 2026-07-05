package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gla {
    public final int a;
    public final List b;
    public final int c;
    public final dla d;

    public gla(int i, List list, int i2, dla dlaVar) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = dlaVar;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.o("status", new vh9(y6a.b(this.a)));
        List list = this.b;
        if (list != null) {
            ig9 ig9Var = new ig9(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ig9Var.o(new vh9(((ola) it.next()).E));
            }
            qh9Var.o("interfaces", ig9Var);
        }
        int i = this.c;
        if (i != 0) {
            qh9Var.o("effective_type", new vh9(y6a.d(i)));
        }
        dla dlaVar = this.d;
        if (dlaVar != null) {
            qh9 qh9Var2 = new qh9();
            String str = dlaVar.a;
            if (str != null) {
                qh9Var2.r("technology", str);
            }
            String str2 = dlaVar.b;
            if (str2 != null) {
                qh9Var2.r("carrier_name", str2);
            }
            qh9Var.o("cellular", qh9Var2);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gla)) {
            return false;
        }
        gla glaVar = (gla) obj;
        return this.a == glaVar.a && x44.r(this.b, glaVar.b) && this.c == glaVar.c && x44.r(this.d, glaVar.d);
    }

    public final int hashCode() {
        int iF = sq6.F(this.a) * 31;
        List list = this.b;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        int i = this.c;
        int iF2 = (iHashCode + (i == 0 ? 0 : sq6.F(i))) * 31;
        dla dlaVar = this.d;
        return iF2 + (dlaVar != null ? dlaVar.hashCode() : 0);
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
