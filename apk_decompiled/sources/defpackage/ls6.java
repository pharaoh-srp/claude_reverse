package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ls6 {
    public final int a;
    public final List b;
    public final int c;
    public final is6 d;

    public ls6(int i, List list, int i2, is6 is6Var) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = is6Var;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.o("status", new vh9(ms6.e(this.a)));
        List list = this.b;
        if (list != null) {
            ig9 ig9Var = new ig9(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ig9Var.o(new vh9(((zs6) it.next()).E));
            }
            qh9Var.o("interfaces", ig9Var);
        }
        int i = this.c;
        if (i != 0) {
            qh9Var.o("effective_type", new vh9(ms6.l(i)));
        }
        is6 is6Var = this.d;
        if (is6Var != null) {
            qh9 qh9Var2 = new qh9();
            String str = is6Var.a;
            if (str != null) {
                qh9Var2.r("technology", str);
            }
            String str2 = is6Var.b;
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
        if (!(obj instanceof ls6)) {
            return false;
        }
        ls6 ls6Var = (ls6) obj;
        return this.a == ls6Var.a && x44.r(this.b, ls6Var.b) && this.c == ls6Var.c && x44.r(this.d, ls6Var.d);
    }

    public final int hashCode() {
        int iF = sq6.F(this.a) * 31;
        List list = this.b;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        int i = this.c;
        int iF2 = (iHashCode + (i == 0 ? 0 : sq6.F(i))) * 31;
        is6 is6Var = this.d;
        return iF2 + (is6Var != null ? is6Var.hashCode() : 0);
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

    public /* synthetic */ ls6(int i, List list, is6 is6Var) {
        this(i, list, 0, is6Var);
    }
}
