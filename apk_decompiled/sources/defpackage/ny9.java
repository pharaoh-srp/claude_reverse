package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ny9 extends oy9 {
    public static final /* synthetic */ int p = 0;
    public final vd9 n;
    public final vx9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny9(el5 el5Var, vd9 vd9Var, vx9 vx9Var) {
        super(el5Var, null);
        vd9Var.getClass();
        this.n = vd9Var;
        this.o = vx9Var;
    }

    public static hrd v(hrd hrdVar) {
        if (hrdVar.getKind() != 2) {
            return hrdVar;
        }
        Collection collectionI = hrdVar.i();
        collectionI.getClass();
        Collection<hrd> collection = collectionI;
        ArrayList arrayList = new ArrayList(x44.y(collection, 10));
        for (hrd hrdVar2 : collection) {
            hrdVar2.getClass();
            arrayList.add(v(hrdVar2));
        }
        return (hrd) w44.e1(w44.p1(w44.s1(arrayList)));
    }

    @Override // defpackage.gab, defpackage.fab
    public final xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i != 0) {
            return null;
        }
        throw null;
    }

    @Override // defpackage.ly9
    public final Set h(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        return um6.E;
    }

    @Override // defpackage.ly9
    public final Set i(c06 c06Var, f06 f06Var) {
        c06Var.getClass();
        Set setS1 = w44.s1(((io5) this.e.a()).a());
        vx9 vx9Var = this.o;
        ny9 ny9VarE = ntj.e(vx9Var);
        Set setA = ny9VarE != null ? ny9VarE.a() : null;
        if (setA == null) {
            setA = um6.E;
        }
        setS1.addAll(setA);
        if (((jbe) this.n).a.isEnum()) {
            setS1.addAll(x44.X(pkg.c, pkg.a));
        }
        el5 el5Var = this.b;
        ((lja) ((ke9) el5Var.E).x).getClass();
        el5Var.getClass();
        vx9Var.getClass();
        setS1.addAll(new ArrayList());
        return setS1;
    }

    @Override // defpackage.ly9
    public final void j(sxb sxbVar, ArrayList arrayList) {
        sxbVar.getClass();
        el5 el5Var = this.b;
        ((lja) ((ke9) el5Var.E).x).getClass();
        el5Var.getClass();
        this.o.getClass();
        sxbVar.getClass();
    }

    @Override // defpackage.ly9
    public final io5 k() {
        return new wg3(this.n, f06.Z);
    }

    @Override // defpackage.ly9
    public final void m(LinkedHashSet linkedHashSet, sxb sxbVar) {
        sxbVar.getClass();
        vx9 vx9Var = this.o;
        ny9 ny9VarE = ntj.e(vx9Var);
        Collection collectionT1 = ny9VarE == null ? um6.E : w44.t1(ny9VarE.g(sxbVar, 15));
        ke9 ke9Var = (ke9) this.b.E;
        linkedHashSet.addAll(ac1.i(ke9Var.f, this.o, sxbVar, ((d3c) ke9Var.u).d, linkedHashSet, collectionT1));
        if (((jbe) this.n).a.isEnum()) {
            if (sxbVar.equals(pkg.c)) {
                linkedHashSet.add(xzk.s(vx9Var));
            } else if (sxbVar.equals(pkg.a)) {
                linkedHashSet.add(xzk.t(vx9Var));
            }
        }
    }

    @Override // defpackage.oy9, defpackage.ly9
    public final void n(sxb sxbVar, ArrayList arrayList) {
        sxb sxbVar2;
        ArrayList arrayList2;
        jrd jrdVarR;
        sxbVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        vj9 vj9Var = new vj9(sxbVar, 1);
        vx9 vx9Var = this.o;
        ovk.d(x44.W(vx9Var), pyk.N, new my9(vx9Var, linkedHashSet, vj9Var));
        boolean zIsEmpty = arrayList.isEmpty();
        el5 el5Var = this.b;
        if (zIsEmpty) {
            sxbVar2 = sxbVar;
            arrayList2 = arrayList;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                hrd hrdVarV = v((hrd) obj);
                Object arrayList3 = linkedHashMap.get(hrdVarV);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(hrdVarV, arrayList3);
                }
                ((List) arrayList3).add(obj);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                ke9 ke9Var = (ke9) el5Var.E;
                b54.t0(arrayList4, ac1.i(ke9Var.f, this.o, sxbVar2, ((d3c) ke9Var.u).d, arrayList2, collection));
            }
            arrayList2.addAll(arrayList4);
        } else {
            ke9 ke9Var2 = (ke9) el5Var.E;
            sxbVar2 = sxbVar;
            arrayList2 = arrayList;
            arrayList2.addAll(ac1.i(ke9Var2.f, this.o, sxbVar2, ((d3c) ke9Var2.u).d, arrayList2, linkedHashSet));
        }
        if (((jbe) this.n).a.isEnum() && sxbVar2.equals(pkg.b) && (jrdVarR = xzk.r(vx9Var)) != null) {
            arrayList2.add(jrdVarR);
        }
    }

    @Override // defpackage.ly9
    public final Set o(c06 c06Var) {
        c06Var.getClass();
        Set setS1 = w44.s1(((io5) this.e.a()).f());
        f06 f06Var = f06.a0;
        vx9 vx9Var = this.o;
        ovk.d(x44.W(vx9Var), pyk.N, new my9(vx9Var, setS1, f06Var));
        if (((jbe) this.n).a.isEnum()) {
            setS1.add(pkg.b);
        }
        return setS1;
    }

    @Override // defpackage.ly9
    public final bo5 q() {
        return this.o;
    }
}
