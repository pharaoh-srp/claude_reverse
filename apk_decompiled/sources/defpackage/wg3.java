package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class wg3 implements io5 {
    public final vd9 a;
    public final bz7 b;
    public final h4 c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public wg3(vd9 vd9Var, bz7 bz7Var) {
        vd9Var.getClass();
        this.a = vd9Var;
        this.b = bz7Var;
        h4 h4Var = new h4(9, this);
        this.c = h4Var;
        bl7 bl7VarV = bnf.V(new c54(0, ((jbe) vd9Var).e()), h4Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        al7 al7Var = new al7(bl7VarV);
        while (al7Var.hasNext()) {
            Object next = al7Var.next();
            sxb sxbVarD = ((tbe) next).d();
            Object arrayList = linkedHashMap.get(sxbVarD);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(sxbVarD, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        bl7 bl7VarV2 = bnf.V(new c54(0, ((jbe) this.a).c()), this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        al7 al7Var2 = new al7(bl7VarV2);
        while (al7Var2.hasNext()) {
            Object next2 = al7Var2.next();
            linkedHashMap2.put(((qbe) next2).d(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList arrayListH = ((jbe) this.a).h();
        bz7 bz7Var2 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListH) {
            if (((Boolean) bz7Var2.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iD0 = tta.d0(x44.y(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iD0 < 16 ? 16 : iD0);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((wbe) obj2).d(), obj2);
        }
        this.f = linkedHashMap3;
    }

    @Override // defpackage.io5
    public final Set a() {
        bl7 bl7VarV = bnf.V(new c54(0, ((jbe) this.a).e()), this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        al7 al7Var = new al7(bl7VarV);
        while (al7Var.hasNext()) {
            linkedHashSet.add(((tbe) al7Var.next()).d());
        }
        return linkedHashSet;
    }

    @Override // defpackage.io5
    public final wbe b(sxb sxbVar) {
        sxbVar.getClass();
        return (wbe) this.f.get(sxbVar);
    }

    @Override // defpackage.io5
    public final Collection c(sxb sxbVar) {
        sxbVar.getClass();
        List list = (List) this.d.get(sxbVar);
        return list != null ? list : lm6.E;
    }

    @Override // defpackage.io5
    public final qbe d(sxb sxbVar) {
        sxbVar.getClass();
        return (qbe) this.e.get(sxbVar);
    }

    @Override // defpackage.io5
    public final Set e() {
        return this.f.keySet();
    }

    @Override // defpackage.io5
    public final Set f() {
        bl7 bl7VarV = bnf.V(new c54(0, ((jbe) this.a).c()), this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        al7 al7Var = new al7(bl7VarV);
        while (al7Var.hasNext()) {
            linkedHashSet.add(((qbe) al7Var.next()).d());
        }
        return linkedHashSet;
    }
}
