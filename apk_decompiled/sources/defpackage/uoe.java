package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uoe {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final List f;

    public uoe(int i, String str, String str2, String str3, Long l, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = arrayList;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        int i = this.a;
        if (i != 0) {
            qh9Var.o("operationType", new vh9(gid.j(i)));
        }
        String str = this.b;
        if (str != null) {
            qh9Var.r("operationName", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            qh9Var.r("payload", str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            qh9Var.r("variables", str3);
        }
        Long l = this.e;
        if (l != null) {
            grc.A(l, qh9Var, "error_count");
        }
        List<soe> list = this.f;
        if (list != null) {
            ig9 ig9Var = new ig9(list.size());
            for (soe soeVar : list) {
                soeVar.getClass();
                qh9 qh9Var2 = new qh9();
                qh9Var2.r("message", soeVar.a);
                String str4 = soeVar.b;
                if (str4 != null) {
                    qh9Var2.r("code", str4);
                }
                List<woe> list2 = soeVar.c;
                if (list2 != null) {
                    ig9 ig9Var2 = new ig9(list2.size());
                    for (woe woeVar : list2) {
                        woeVar.getClass();
                        qh9 qh9Var3 = new qh9();
                        qh9Var3.p(Long.valueOf(woeVar.a), "line");
                        qh9Var3.p(Long.valueOf(woeVar.b), "column");
                        ig9Var2.o(qh9Var3);
                    }
                    qh9Var2.o("locations", ig9Var2);
                }
                List list3 = soeVar.d;
                if (list3 != null) {
                    ig9 ig9Var3 = new ig9(list3.size());
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        ig9Var3.o(((ape) it.next()).a());
                    }
                    qh9Var2.o("path", ig9Var3);
                }
                ig9Var.o(qh9Var2);
            }
            qh9Var.o("errors", ig9Var);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoe)) {
            return false;
        }
        uoe uoeVar = (uoe) obj;
        return this.a == uoeVar.a && x44.r(this.b, uoeVar.b) && x44.r(this.c, uoeVar.c) && x44.r(this.d, uoeVar.d) && x44.r(this.e, uoeVar.e) && x44.r(this.f, uoeVar.f);
    }

    public final int hashCode() {
        int i = this.a;
        int iF = (i == 0 ? 0 : sq6.F(i)) * 31;
        String str = this.b;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.e;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.f;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Graphql(operationType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "SUBSCRIPTION" : "MUTATION" : "QUERY");
        sb.append(", operationName=");
        sb.append(this.b);
        sb.append(", payload=");
        kgh.u(sb, this.c, ", variables=", this.d, ", errorCount=");
        sb.append(this.e);
        sb.append(", errors=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
