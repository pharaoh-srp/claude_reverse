package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class uf6 {
    public static final ih9 d = u00.c(new xg5(11));
    public final List a;
    public final List b;
    public final pf6 c;

    public uf6(List list, List list2, pf6 pf6Var) {
        list.getClass();
        list2.getClass();
        pf6Var.getClass();
        this.a = list;
        this.b = list2;
        this.c = pf6Var;
    }

    public static uf6 b(uf6 uf6Var, ArrayList arrayList, ArrayList arrayList2, pf6 pf6Var, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = uf6Var.a;
        }
        List list2 = arrayList2;
        if ((i & 2) != 0) {
            list2 = uf6Var.b;
        }
        if ((i & 4) != 0) {
            pf6Var = uf6Var.c;
        }
        list.getClass();
        list2.getClass();
        pf6Var.getClass();
        return new uf6(list, list2, pf6Var);
    }

    public final cpc a(List list) {
        list.getClass();
        if (!c()) {
            return new cpc(list, lm6.E);
        }
        List list2 = list;
        Set setT1 = w44.t1(list2);
        List list3 = this.a;
        List list4 = this.b;
        Set setT12 = w44.t1(w44.a1(list3, list4));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (setT1.contains((pf6) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!setT12.contains((pf6) obj2)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayListA1 = w44.a1(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list4) {
            if (setT1.contains((pf6) obj3)) {
                arrayList3.add(obj3);
            }
        }
        return new cpc(arrayListA1, arrayList3);
    }

    public final boolean c() {
        return (this.a.isEmpty() && this.b.isEmpty()) ? false : true;
    }

    public final uf6 d(ArrayList arrayList, int i, int i2) {
        if (arrayList.isEmpty() || i < 0 || i >= arrayList.size()) {
            return b(this, arrayList, null, null, 6);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(wd6.e0(i2, 0, arrayList2.size()), (pf6) arrayList2.remove(i));
        return b(this, arrayList2, null, null, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf6)) {
            return false;
        }
        uf6 uf6Var = (uf6) obj;
        return x44.r(this.a, uf6Var.a) && x44.r(this.b, uf6Var.b) && this.c == uf6Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "DrawerTabPreferences(visible=" + this.a + ", hidden=" + this.b + ", launchTab=" + this.c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ uf6(List list, List list2, int i) {
        int i2 = i & 1;
        lm6 lm6Var = lm6.E;
        this(i2 != 0 ? lm6Var : list, (i & 2) != 0 ? lm6Var : list2, pf6.I);
    }
}
