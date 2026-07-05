package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class y06 extends m16 {
    public final es9 g;
    public final dfa h;
    public final dfa i;
    public final /* synthetic */ c16 j;

    public y06(c16 c16Var, es9 es9Var) {
        es9Var.getClass();
        this.j = c16Var;
        wk wkVar = c16Var.P;
        esd esdVar = c16Var.I;
        List list = esdVar.U;
        list.getClass();
        List list2 = esdVar.V;
        list2.getClass();
        List list3 = esdVar.W;
        list3.getClass();
        List list4 = esdVar.O;
        list4.getClass();
        List list5 = list4;
        txb txbVar = (txb) c16Var.P.e;
        ArrayList arrayList = new ArrayList(x44.y(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(iv1.w(txbVar, ((Number) it.next()).intValue()));
        }
        super(wkVar, list, list2, list3, new l4(11, arrayList));
        r06 r06Var = (r06) wkVar.d;
        this.g = es9Var;
        gfa gfaVar = r06Var.a;
        w06 w06Var = new w06(this, 0);
        gfaVar.getClass();
        this.h = new dfa(gfaVar, w06Var);
        gfa gfaVar2 = r06Var.a;
        w06 w06Var2 = new w06(this, 1);
        gfaVar2.getClass();
        this.i = new dfa(gfaVar2, w06Var2);
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        return (Collection) this.h.a();
    }

    @Override // defpackage.m16, defpackage.gab, defpackage.fab
    public final Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        s(sxbVar, i);
        return super.d(sxbVar, i);
    }

    @Override // defpackage.m16, defpackage.gab, defpackage.fab
    public final xh3 e(sxb sxbVar, int i) {
        qqb qqbVar;
        sxbVar.getClass();
        sq6.a(i);
        s(sxbVar, i);
        dpf dpfVar = this.j.T;
        return (dpfVar == null || (qqbVar = (qqb) ((efa) dpfVar.G).invoke(sxbVar)) == null) ? super.e(sxbVar, i) : qqbVar;
    }

    @Override // defpackage.m16, defpackage.gab, defpackage.fab
    public final Collection g(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        s(sxbVar, i);
        return super.g(sxbVar, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [lm6] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // defpackage.m16
    public final void h(ArrayList arrayList, bz7 bz7Var) {
        ?? arrayList2;
        dpf dpfVar = this.j.T;
        if (dpfVar != null) {
            Set<sxb> setKeySet = ((LinkedHashMap) dpfVar.F).keySet();
            arrayList2 = new ArrayList();
            for (sxb sxbVar : setKeySet) {
                sxbVar.getClass();
                qqb qqbVar = (qqb) ((efa) dpfVar.G).invoke(sxbVar);
                if (qqbVar != null) {
                    arrayList2.add(qqbVar);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = lm6.E;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // defpackage.m16
    public final void j(sxb sxbVar, ArrayList arrayList) {
        sxbVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.a()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((yr9) it.next()).G().g(sxbVar, 12));
        }
        wk wkVar = this.b;
        arrayList.addAll(((r06) wkVar.d).n.w(sxbVar, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((d3c) ((r06) wkVar.d).q).d.h(sxbVar, arrayList2, arrayList3, this.j, new x06(arrayList, 0));
    }

    @Override // defpackage.m16
    public final void k(sxb sxbVar, ArrayList arrayList) {
        sxbVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.a()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((yr9) it.next()).G().d(sxbVar, 12));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((d3c) ((r06) this.b.d).q).d.h(sxbVar, arrayList2, arrayList3, this.j, new x06(arrayList, 0));
    }

    @Override // defpackage.m16
    public final gh3 l(sxb sxbVar) {
        sxbVar.getClass();
        return this.j.L.d(sxbVar);
    }

    @Override // defpackage.m16
    public final Set n() {
        List listB = this.j.R.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            Set setC = ((yr9) it.next()).G().c();
            if (setC == null) {
                return null;
            }
            b54.t0(linkedHashSet, setC);
        }
        return linkedHashSet;
    }

    @Override // defpackage.m16
    public final Set o() {
        c16 c16Var = this.j;
        List listB = c16Var.R.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            b54.t0(linkedHashSet, ((yr9) it.next()).G().a());
        }
        linkedHashSet.addAll(((r06) this.b.d).n.i(c16Var));
        return linkedHashSet;
    }

    @Override // defpackage.m16
    public final Set p() {
        List listB = this.j.R.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            b54.t0(linkedHashSet, ((yr9) it.next()).G().f());
        }
        return linkedHashSet;
    }

    @Override // defpackage.m16
    public final boolean r(p16 p16Var) {
        return ((r06) this.b.d).o.c(this.j, p16Var);
    }

    public final void s(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        ((r06) this.b.d).i.getClass();
        sq6.a(i);
        this.j.getClass();
    }
}
