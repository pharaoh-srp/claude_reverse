package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hy9 extends oy9 {
    public final ube n;
    public final by9 o;
    public final cfa p;
    public final efa q;

    public hy9(el5 el5Var, ube ubeVar, by9 by9Var) {
        super(el5Var, null);
        this.n = ubeVar;
        this.o = by9Var;
        gfa gfaVar = ((ke9) el5Var.E).a;
        mx1 mx1Var = new mx1(el5Var, 12, this);
        gfaVar.getClass();
        this.p = new cfa(gfaVar, mx1Var);
        this.q = gfaVar.c(new j40(this, 6, el5Var));
    }

    @Override // defpackage.ly9, defpackage.gab, defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        bm4 bm4Var = c06.c;
        if (!c06Var.a(bm4.h() | bm4.j())) {
            return lm6.E;
        }
        Iterable iterable = (Iterable) this.d.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            bo5 bo5Var = (bo5) obj;
            if (bo5Var instanceof qqb) {
                sxb name = ((qqb) bo5Var).getName();
                name.getClass();
                if (((Boolean) bz7Var.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.ly9, defpackage.gab, defpackage.fab
    public final Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return lm6.E;
    }

    @Override // defpackage.gab, defpackage.fab
    public final xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return v(sxbVar, null);
    }

    @Override // defpackage.ly9
    public final Set h(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        bm4 bm4Var = c06.c;
        if (!c06Var.a(bm4.j())) {
            return um6.E;
        }
        Set set = (Set) this.p.a();
        if (set == null) {
            this.n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(sxb.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // defpackage.ly9
    public final Set i(c06 c06Var, f06 f06Var) {
        c06Var.getClass();
        return um6.E;
    }

    @Override // defpackage.ly9
    public final io5 k() {
        return ho5.a;
    }

    @Override // defpackage.ly9
    public final void m(LinkedHashSet linkedHashSet, sxb sxbVar) {
        sxbVar.getClass();
    }

    @Override // defpackage.ly9
    public final Set o(c06 c06Var) {
        c06Var.getClass();
        return um6.E;
    }

    @Override // defpackage.ly9
    public final bo5 q() {
        return this.o;
    }

    public final qqb v(sxb sxbVar, vd9 vd9Var) {
        sxb sxbVar2 = ygg.a;
        sxbVar.getClass();
        String strB = sxbVar.b();
        strB.getClass();
        if (strB.length() <= 0 || sxbVar.F) {
            return null;
        }
        Set set = (Set) this.p.a();
        if (vd9Var == null && set != null && !set.contains(sxbVar.b())) {
            return null;
        }
        return (qqb) this.q.invoke(new dy9(sxbVar, vd9Var));
    }
}
