package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ze4 implements kw7 {
    public final List a;

    public ze4(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.kw7
    public af4 a() {
        List list = this.a;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c6c) it.next()).a());
        }
        return arrayList.size() == 1 ? (af4) w44.e1(arrayList) : new af4();
    }

    @Override // defpackage.kw7
    public auc b() {
        List list = this.a;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c6c) it.next()).b());
        }
        return kud.f(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ze4) {
            return x44.r(this.a, ((ze4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vb7.s(new StringBuilder("ConcatenatedFormatStructure("), w44.S0(this.a, ", ", null, null, null, 62), ')');
    }
}
