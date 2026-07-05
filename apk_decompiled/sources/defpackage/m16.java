package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class m16 extends gab {
    public static final /* synthetic */ wn9[] f;
    public final wk b;
    public final k16 c;
    public final dfa d;
    public final cfa e;

    static {
        kce kceVar = jce.a;
        f = new wn9[]{kceVar.g(new mrd(kceVar.b(m16.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), kceVar.g(new mrd(kceVar.b(m16.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public m16(wk wkVar, List list, List list2, List list3, zy7 zy7Var) {
        wkVar.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.b = wkVar;
        r06 r06Var = (r06) wkVar.d;
        r06Var.c.getClass();
        this.c = new k16(this, list, list2, list3);
        gfa gfaVar = r06Var.a;
        l16 l16Var = new l16(0, zy7Var);
        gfaVar.getClass();
        this.d = new dfa(gfaVar, l16Var);
        l4 l4Var = new l4(12, this);
        gfaVar.getClass();
        this.e = new cfa(gfaVar, l4Var);
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set a() {
        return (Set) wd6.s0(this.c.g, k16.j[0]);
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set c() {
        wn9 wn9Var = f[1];
        cfa cfaVar = this.e;
        cfaVar.getClass();
        wn9Var.getClass();
        return (Set) cfaVar.a();
    }

    @Override // defpackage.gab, defpackage.fab
    public Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        k16 k16Var = this.c;
        k16Var.getClass();
        sq6.a(i);
        return !((Set) wd6.s0(k16Var.h, k16.j[1])).contains(sxbVar) ? lm6.E : (Collection) k16Var.e.invoke(sxbVar);
    }

    @Override // defpackage.gab, defpackage.fab
    public xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        if (q(sxbVar)) {
            r06 r06Var = (r06) this.b.d;
            gh3 gh3VarL = l(sxbVar);
            bh3 bh3Var = r06Var.t;
            Set set = bh3.c;
            return bh3Var.a(gh3VarL, null);
        }
        k16 k16Var = this.c;
        if (!k16Var.c.keySet().contains(sxbVar)) {
            return null;
        }
        k16Var.getClass();
        return (q16) k16Var.f.invoke(sxbVar);
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set f() {
        return (Set) wd6.s0(this.c.h, k16.j[1]);
    }

    @Override // defpackage.gab, defpackage.fab
    public Collection g(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        k16 k16Var = this.c;
        k16Var.getClass();
        sq6.a(i);
        return !((Set) wd6.s0(k16Var.g, k16.j[0])).contains(sxbVar) ? lm6.E : (Collection) k16Var.d.invoke(sxbVar);
    }

    public abstract void h(ArrayList arrayList, bz7 bz7Var);

    public final Collection i(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        sq6.a(13);
        ArrayList arrayList = new ArrayList(0);
        bm4 bm4Var = c06.c;
        if (c06Var.a(bm4.l())) {
            h(arrayList, bz7Var);
        }
        k16 k16Var = this.c;
        k16Var.getClass();
        dfa dfaVar = k16Var.g;
        dfa dfaVar2 = k16Var.h;
        mt7 mt7Var = mt7.H;
        boolean zA = c06Var.a(bm4.n());
        lm6 lm6Var = lm6.E;
        if (zA) {
            Set<sxb> set = (Set) wd6.s0(dfaVar2, k16.j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (sxb sxbVar : set) {
                if (((Boolean) bz7Var.invoke(sxbVar)).booleanValue()) {
                    sxbVar.getClass();
                    sq6.a(13);
                    arrayList2.addAll(!((Set) wd6.s0(dfaVar2, k16.j[1])).contains(sxbVar) ? lm6Var : (Collection) k16Var.e.invoke(sxbVar));
                }
            }
            a54.s0(arrayList2, mt7Var);
            arrayList.addAll(arrayList2);
        }
        bm4 bm4Var2 = c06.c;
        if (c06Var.a(bm4.i())) {
            Set<sxb> set2 = (Set) wd6.s0(dfaVar, k16.j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (sxb sxbVar2 : set2) {
                if (((Boolean) bz7Var.invoke(sxbVar2)).booleanValue()) {
                    sxbVar2.getClass();
                    sq6.a(13);
                    arrayList3.addAll(!((Set) wd6.s0(dfaVar, k16.j[0])).contains(sxbVar2) ? lm6Var : (Collection) k16Var.d.invoke(sxbVar2));
                }
            }
            a54.s0(arrayList3, mt7Var);
            arrayList.addAll(arrayList3);
        }
        bm4 bm4Var3 = c06.c;
        if (c06Var.a(bm4.h())) {
            for (sxb sxbVar3 : m()) {
                if (((Boolean) bz7Var.invoke(sxbVar3)).booleanValue()) {
                    r06 r06Var = (r06) this.b.d;
                    gh3 gh3VarL = l(sxbVar3);
                    bh3 bh3Var = r06Var.t;
                    Set set3 = bh3.c;
                    qqb qqbVarA = bh3Var.a(gh3VarL, null);
                    if (qqbVarA != null) {
                        arrayList.add(qqbVarA);
                    }
                }
            }
        }
        bm4 bm4Var4 = c06.c;
        if (c06Var.a(bm4.m())) {
            for (sxb sxbVar4 : k16Var.c.keySet()) {
                if (((Boolean) bz7Var.invoke(sxbVar4)).booleanValue()) {
                    k16Var.getClass();
                    sxbVar4.getClass();
                    q16 q16Var = (q16) k16Var.f.invoke(sxbVar4);
                    if (q16Var != null) {
                        arrayList.add(q16Var);
                    }
                }
            }
        }
        return gb9.r(arrayList);
    }

    public void j(sxb sxbVar, ArrayList arrayList) {
        sxbVar.getClass();
    }

    public void k(sxb sxbVar, ArrayList arrayList) {
        sxbVar.getClass();
    }

    public abstract gh3 l(sxb sxbVar);

    public final Set m() {
        return (Set) wd6.s0(this.d, f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(sxb sxbVar) {
        sxbVar.getClass();
        return m().contains(sxbVar);
    }

    public boolean r(p16 p16Var) {
        return true;
    }
}
