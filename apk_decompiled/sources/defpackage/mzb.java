package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class mzb {
    public final amg a = bmg.a(nzb.f);
    public final amg b;
    public final a4e c;
    public final qo0 d;
    public final qo0 e;
    public jzb f;
    public int g;
    public lzb h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public mzb() {
        amg amgVarA = bmg.a(new kzb());
        this.b = amgVarA;
        this.c = j8.k(amgVarA);
        this.d = new qo0();
        this.e = new qo0();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(dpf dpfVar, lzb lzbVar, int i) {
        dpfVar.getClass();
        if (lzbVar.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(lzbVar);
            lzbVar.a = dpfVar;
            ((kzb) this.c.E.getValue()).getClass();
            lzbVar.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(lzbVar);
        dpf dpfVar2 = lzbVar.a;
        sb.append("' is already added to dispatcher ");
        sb.append(dpfVar2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        kzb kzbVar;
        qo0 qo0Var = this.d;
        if (qo0Var == null || !qo0Var.isEmpty()) {
            Iterator it = qo0Var.iterator();
            while (it.hasNext()) {
                if (((jzb) it.next()).b) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        qo0 qo0Var2 = this.e;
        if (qo0Var2 == null || !qo0Var2.isEmpty()) {
            Iterator it2 = qo0Var2.iterator();
            while (it2.hasNext()) {
                if (((jzb) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((lzb) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((lzb) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((lzb) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        jzb jzbVarC = this.f;
        if (jzbVarC == null) {
            jzbVarC = c(0);
        }
        jzb jzbVarC2 = this.f;
        if (jzbVarC2 == null) {
            jzbVarC2 = c(0);
        }
        if (x44.r(jzbVarC2, jzbVarC)) {
            if (jzbVarC2 == null) {
                kzbVar = new kzb();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = qo0Var.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((jzb) it6.next()).b;
                }
                Iterator<E> it7 = qo0Var2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((jzb) it7.next()).b;
                }
                sf5 sf5Var = jzbVarC2.a;
                d8a d8aVarE = x44.E();
                b54.t0(d8aVarE, arrayList);
                d8aVarE.add(sf5Var);
                b54.t0(d8aVarE, lm6.E);
                kzbVar = new kzb(x44.v(d8aVarE), arrayList.size());
            }
            amg amgVar = this.b;
            if (x44.r((kzb) amgVar.getValue(), kzbVar)) {
                return;
            }
            amgVar.n(null, kzbVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((lzb) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((lzb) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((lzb) it10.next()).getClass();
            }
        }
    }

    public final jzb c(int i) {
        Object next;
        Object next2;
        qo0 qo0Var = this.e;
        qo0 qo0Var2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = qo0Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((jzb) next).b) {
                    break;
                }
            }
            jzb jzbVar = (jzb) next;
            if (jzbVar != null) {
                return jzbVar;
            }
            Iterator it2 = qo0Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((jzb) next3).b) {
                    obj = next3;
                    break;
                }
            }
            return (jzb) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = qo0Var2.iterator();
            while (it3.hasNext()) {
                ((jzb) it3.next()).getClass();
            }
            Iterator it4 = qo0Var.iterator();
            while (it4.hasNext()) {
                ((jzb) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = qo0Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((jzb) next2).b) {
                break;
            }
        }
        jzb jzbVar2 = (jzb) next2;
        if (jzbVar2 != null) {
            return jzbVar2;
        }
        Iterator it6 = qo0Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((jzb) next4).b) {
                obj = next4;
                break;
            }
        }
        return (jzb) obj;
    }
}
