package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tjg implements jyb {
    public final List a;
    public final ArrayList b;

    public tjg(List list) {
        list.getClass();
        this.a = list;
        if (list.isEmpty()) {
            sz6.p("Configuration stack must not be empty");
            throw null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            arrayList.add(new x6g(obj, i == x44.M(this.a) ? re3.F : re3.E));
            i = i2;
        }
        this.b = arrayList;
    }

    @Override // defpackage.jyb
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tjg) && x44.r(this.a, ((tjg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StackNavState(configurations=" + this.a + ')';
    }
}
