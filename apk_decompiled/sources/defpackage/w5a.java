package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w5a implements ee2 {
    public final List a;
    public final List b;
    public final int c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final uub h;

    public w5a(List list, uub uubVar) {
        if (list.isEmpty()) {
            sz6.p("At least one series should be added.");
            throw null;
        }
        List<List> list2 = list;
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        for (List list3 : list2) {
            if (list3.isEmpty()) {
                sz6.p("Series can’t be empty.");
                throw null;
            }
            arrayList.add(w44.i1(list3, new g67(15)));
        }
        this.b = arrayList;
        this.a = x44.G(arrayList);
        Iterator it = arrayList.iterator();
        List list4 = (List) it.next();
        double dMin = ((u5a) w44.L0(list4)).a;
        double dMax = ((u5a) w44.U0(list4)).a;
        while (it.hasNext()) {
            List list5 = (List) it.next();
            double d = ((u5a) w44.L0(list5)).a;
            double d2 = ((u5a) w44.U0(list5)).a;
            dMin = Math.min(dMin, d);
            dMax = Math.max(dMax, d2);
        }
        Iterator it2 = this.a.iterator();
        double dMin2 = ((u5a) it2.next()).b;
        double dMax2 = dMin2;
        while (it2.hasNext()) {
            double d3 = ((u5a) it2.next()).b;
            dMin2 = Math.min(dMin2, d3);
            dMax2 = Math.max(dMax2, d3);
        }
        this.c = this.b.hashCode();
        this.d = dMin;
        this.e = dMax;
        this.f = dMin2;
        this.g = dMax2;
        this.h = uubVar;
    }

    @Override // defpackage.ee2
    public final double a() {
        return this.e;
    }

    @Override // defpackage.ee2
    public final double b() {
        return this.d;
    }

    @Override // defpackage.ee2
    public final double c() {
        return ywj.k(this.a);
    }

    @Override // defpackage.ee2
    public final ee2 d(uub uubVar) {
        return new w5a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, uubVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5a)) {
            return false;
        }
        w5a w5aVar = (w5a) obj;
        return x44.r(this.b, w5aVar.b) && this.c == w5aVar.c && this.d == w5aVar.d && this.e == w5aVar.e && this.f == w5aVar.f && this.g == w5aVar.g && x44.r(this.h, w5aVar.h);
    }

    @Override // defpackage.ee2
    public final int getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.h.a.hashCode() + fsh.o(this.g, fsh.o(this.f, fsh.o(this.e, fsh.o(this.d, ((this.b.hashCode() * 31) + this.c) * 31, 31), 31), 31), 31);
    }

    public w5a(List list, List list2, int i, double d, double d2, double d3, double d4, uub uubVar) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = uubVar;
    }
}
