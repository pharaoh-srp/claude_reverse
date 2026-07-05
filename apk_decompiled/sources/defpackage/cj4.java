package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cj4 implements ej4 {
    public final List a;
    public final g56 b;
    public final String c;
    public final List d;

    public cj4(List list, g56 g56Var, String str, List list2) {
        g56Var.getClass();
        list2.getClass();
        this.a = list;
        this.b = g56Var;
        this.c = str;
        this.d = list2;
    }

    public static cj4 a(cj4 cj4Var, ArrayList arrayList, String str) {
        g56 g56Var = cj4Var.b;
        List list = cj4Var.d;
        g56Var.getClass();
        list.getClass();
        return new cj4(arrayList, g56Var, str, list);
    }

    public final String b() {
        return this.c;
    }

    public final g56 c() {
        return this.b;
    }

    public final List d() {
        return this.a;
    }

    public final List e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj4)) {
            return false;
        }
        cj4 cj4Var = (cj4) obj;
        return this.a.equals(cj4Var.a) && x44.r(this.b, cj4Var.b) && x44.r(this.c, cj4Var.c) && x44.r(this.d, cj4Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Loaded(servers=" + this.a + ", query=" + this.b + ", nextCursor=" + this.c + ", visibility=" + this.d + ")";
    }
}
