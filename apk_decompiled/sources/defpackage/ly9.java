package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ly9 extends gab {
    public static final /* synthetic */ wn9[] m;
    public final el5 b;
    public final ly9 c;
    public final yea d;
    public final dfa e;
    public final afa f;
    public final efa g;
    public final afa h;
    public final dfa i;
    public final dfa j;
    public final dfa k;
    public final afa l;

    static {
        kce kceVar = jce.a;
        m = new wn9[]{kceVar.g(new mrd(kceVar.b(ly9.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), kceVar.g(new mrd(kceVar.b(ly9.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), kceVar.g(new mrd(kceVar.b(ly9.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public ly9(el5 el5Var, zx9 zx9Var) {
        el5Var.getClass();
        this.b = el5Var;
        this.c = zx9Var;
        gfa gfaVar = ((ke9) el5Var.E).a;
        int i = 0;
        jy9 jy9Var = new jy9(this, i);
        gfaVar.getClass();
        this.d = new yea(gfaVar, jy9Var);
        int i2 = 2;
        jy9 jy9Var2 = new jy9(this, i2);
        gfaVar.getClass();
        this.e = new dfa(gfaVar, jy9Var2);
        int i3 = 1;
        this.f = gfaVar.b(new ky9(this, i3));
        this.g = gfaVar.c(new ky9(this, i));
        this.h = gfaVar.b(new ky9(this, i2));
        int i4 = 3;
        jy9 jy9Var3 = new jy9(this, i4);
        gfaVar.getClass();
        this.i = new dfa(gfaVar, jy9Var3);
        jy9 jy9Var4 = new jy9(this, 4);
        gfaVar.getClass();
        this.j = new dfa(gfaVar, jy9Var4);
        jy9 jy9Var5 = new jy9(this, i3);
        gfaVar.getClass();
        this.k = new dfa(gfaVar, jy9Var5);
        this.l = gfaVar.b(new ky9(this, i4));
    }

    public static yr9 l(tbe tbeVar, el5 el5Var) {
        tbeVar.getClass();
        return ((fj0) el5Var.I).Q(tbeVar.k(), oyk.j(2, tbeVar.b().i(), null, 6));
    }

    public static z5l u(el5 el5Var, j08 j08Var, List list) {
        cpc cpcVar;
        sxb sxbVarB;
        fj0 fj0Var = (fj0) el5Var.I;
        ke9 ke9Var = (ke9) el5Var.E;
        tqb tqbVar = ke9Var.o;
        c19 c19VarU1 = w44.u1(list);
        ArrayList arrayList = new ArrayList(x44.y(c19VarU1, 10));
        Iterator it = c19VarU1.iterator();
        boolean z = false;
        while (true) {
            f2 f2Var = (f2) it;
            if (!((Iterator) f2Var.G).hasNext()) {
                return new z5l(w44.p1(arrayList), z, 2);
            }
            b19 b19Var = (b19) f2Var.next();
            int i = b19Var.a;
            zbe zbeVar = (zbe) b19Var.b;
            sx9 sx9VarA0 = mpk.a0(el5Var, zbeVar);
            ze9 ze9VarJ = oyk.j(2, false, null, 7);
            if (zbeVar.d()) {
                xbe xbeVarC = zbeVar.c();
                dbe dbeVar = xbeVarC instanceof dbe ? (dbe) xbeVarC : null;
                if (dbeVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + zbeVar);
                }
                fhi fhiVarP = fj0Var.P(dbeVar, ze9VarJ, true);
                cpcVar = new cpc(fhiVarP, tqbVar.f().f(fhiVarP));
            } else {
                cpcVar = new cpc(fj0Var.Q(zbeVar.c(), ze9VarJ), null);
            }
            yr9 yr9Var = (yr9) cpcVar.E;
            yr9 yr9Var2 = (yr9) cpcVar.F;
            if (x44.r(j08Var.getName().b(), "equals") && list.size() == 1 && tqbVar.f().n().equals(yr9Var)) {
                sxbVarB = sxb.e("other");
            } else {
                sxbVarB = zbeVar.b();
                if (sxbVarB == null) {
                    z = true;
                }
                if (sxbVarB == null) {
                    sxbVarB = sxb.e("p" + i);
                }
            }
            sxb sxbVar = sxbVarB;
            ke9Var.j.getClass();
            arrayList.add(new eri(j08Var, null, i, sx9VarA0, sxbVar, yr9Var, false, false, false, yr9Var2, ql8.x(zbeVar)));
        }
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set a() {
        return (Set) wd6.s0(this.i, m[0]);
    }

    @Override // defpackage.gab, defpackage.fab
    public Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        return (Collection) this.d.a();
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set c() {
        return (Set) wd6.s0(this.k, m[2]);
    }

    @Override // defpackage.gab, defpackage.fab
    public Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return !f().contains(sxbVar) ? lm6.E : (Collection) this.l.invoke(sxbVar);
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set f() {
        return (Set) wd6.s0(this.j, m[1]);
    }

    @Override // defpackage.gab, defpackage.fab
    public Collection g(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return !a().contains(sxbVar) ? lm6.E : (Collection) this.h.invoke(sxbVar);
    }

    public abstract Set h(c06 c06Var, bz7 bz7Var);

    public abstract Set i(c06 c06Var, f06 f06Var);

    public void j(sxb sxbVar, ArrayList arrayList) {
        sxbVar.getClass();
    }

    public abstract io5 k();

    public abstract void m(LinkedHashSet linkedHashSet, sxb sxbVar);

    public abstract void n(sxb sxbVar, ArrayList arrayList);

    public abstract Set o(c06 c06Var);

    public abstract l6e p();

    public abstract bo5 q();

    public boolean r(ge9 ge9Var) {
        return true;
    }

    public abstract iy9 s(tbe tbeVar, ArrayList arrayList, yr9 yr9Var, List list);

    public final ge9 t(tbe tbeVar) {
        tbeVar.getClass();
        el5 el5Var = this.b;
        sx9 sx9VarA0 = mpk.a0(el5Var, tbeVar);
        bo5 bo5VarQ = q();
        sxb sxbVarD = tbeVar.d();
        ((ke9) el5Var.E).j.getClass();
        int i = 1;
        ge9 ge9VarC1 = ge9.c1(bo5VarQ, sx9VarA0, sxbVarD, ql8.x(tbeVar), ((io5) this.e.a()).b(tbeVar.d()) != null && ((ArrayList) tbeVar.l()).isEmpty());
        el5Var.getClass();
        el5 el5Var2 = new el5((ke9) el5Var.E, new f4i(el5Var, ge9VarC1, tbeVar, 0), (kw9) el5Var.G);
        ArrayList typeParameters = tbeVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(x44.y(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            qai qaiVarJ = ((tai) el5Var2.F).j((ybe) it.next());
            qaiVarJ.getClass();
            arrayList.add(qaiVarJ);
        }
        z5l z5lVarU = u(el5Var2, ge9VarC1, tbeVar.l());
        iy9 iy9VarS = s(tbeVar, arrayList, l(tbeVar, el5Var2), z5lVarU.d());
        l6e l6eVarP = p();
        List listC = iy9VarS.c();
        List listD = iy9VarS.d();
        yr9 yr9VarB = iy9VarS.b();
        boolean zG = tbeVar.g();
        boolean zH = tbeVar.h();
        if (zG) {
            i = 4;
        } else if (!zH) {
            i = 3;
        }
        ge9VarC1.b1(null, l6eVarP, lm6.E, listC, listD, yr9VarB, i, ztj.j(tbeVar.f()), nm6.E);
        ge9VarC1.d1(false, z5lVarU.e());
        if (iy9VarS.a().isEmpty()) {
            return ge9VarC1;
        }
        ((ke9) el5Var2.E).e.getClass();
        pmf.n("Should not be called");
        return null;
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
