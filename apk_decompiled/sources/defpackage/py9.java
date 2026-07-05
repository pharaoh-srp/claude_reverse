package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class py9 extends d2 {
    public final el5 O;
    public final ybe P;

    /* JADX WARN: Illegal instructions before constructor call */
    public py9(el5 el5Var, ybe ybeVar, int i, do5 do5Var) {
        ybeVar.getClass();
        ke9 ke9Var = (ke9) el5Var.E;
        super(ke9Var.a, do5Var, new sx9(el5Var, ybeVar, false), sxb.e(ybeVar.a.getName()), 1, false, i, ke9Var.m);
        this.O = el5Var;
        this.P = ybeVar;
    }

    @Override // defpackage.r4
    public final List N0(List list) {
        py9 py9Var;
        el5 el5Var = this.O;
        ((ke9) el5Var.E).r.getClass();
        List<yr9> list2 = list;
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        for (yr9 yr9Var : list2) {
            p9d p9dVar = p9d.h0;
            yr9Var.getClass();
            if (fbi.c(yr9Var, p9dVar, null)) {
                py9Var = this;
            } else {
                py9Var = this;
                t6g t6gVar = new t6g(py9Var, false, el5Var, nc0.TYPE_PARAMETER_BOUNDS, false);
                yr9 yr9VarL = ql8.p(yr9Var.k0(), t6gVar.a(yr9Var, lm6.E, null, false), 0, t6gVar.e()).l();
                if (yr9VarL != null) {
                    yr9Var = yr9VarL;
                }
            }
            arrayList.add(yr9Var);
            this = py9Var;
        }
        return arrayList;
    }

    @Override // defpackage.r4
    public final List O0() {
        Type[] bounds = this.P.a.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new mbe(type));
        }
        mbe mbeVar = (mbe) w44.g1(arrayList);
        Collection collection = arrayList;
        if (x44.r(mbeVar != null ? mbeVar.a : null, Object.class)) {
            collection = lm6.E;
        }
        Collection collection2 = collection;
        boolean zIsEmpty = collection2.isEmpty();
        el5 el5Var = this.O;
        if (zIsEmpty) {
            return x44.W(yfd.z(((ke9) el5Var.E).o.f().e(), ((ke9) el5Var.E).o.f().n()));
        }
        Collection collection3 = collection2;
        ArrayList arrayList2 = new ArrayList(x44.y(collection3, 10));
        Iterator it = collection3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((fj0) el5Var.I).Q((mbe) it.next(), oyk.j(2, false, this, 3)));
        }
        return arrayList2;
    }
}
