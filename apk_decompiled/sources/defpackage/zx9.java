package defpackage;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import io.sentry.e0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zx9 extends ly9 {
    public final qqb n;
    public final vd9 o;
    public final boolean p;
    public final dfa q;
    public final dfa r;
    public final dfa s;
    public final dfa t;
    public final efa u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx9(el5 el5Var, qqb qqbVar, vd9 vd9Var, boolean z, zx9 zx9Var) {
        super(el5Var, zx9Var);
        el5Var.getClass();
        vd9Var.getClass();
        this.n = qqbVar;
        this.o = vd9Var;
        this.p = z;
        gfa gfaVar = ((ke9) el5Var.E).a;
        xx9 xx9Var = new xx9(this, el5Var);
        gfaVar.getClass();
        this.q = new dfa(gfaVar, xx9Var);
        yx9 yx9Var = new yx9(this, 1);
        gfaVar.getClass();
        this.r = new dfa(gfaVar, yx9Var);
        xx9 xx9Var2 = new xx9(el5Var, this);
        gfaVar.getClass();
        this.s = new dfa(gfaVar, xx9Var2);
        yx9 yx9Var2 = new yx9(this, 0);
        gfaVar.getClass();
        this.t = new dfa(gfaVar, yx9Var2);
        this.u = gfaVar.c(new g4(this, 9, el5Var));
    }

    public static c7g C(c7g c7gVar, h08 h08Var, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return c7gVar;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            c7g c7gVar2 = (c7g) it.next();
            if (!c7gVar.equals(c7gVar2) && c7gVar2.f0 == null && F(c7gVar2, h08Var)) {
                h08 h08VarBuild = c7gVar.f0().p().build();
                h08VarBuild.getClass();
                return (c7g) h08VarBuild;
            }
        }
        return c7gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c7g D(defpackage.c7g r4) {
        /*
            java.util.List r0 = r4.I()
            r0.getClass()
            java.lang.Object r0 = defpackage.w44.V0(r0)
            eri r0 = (defpackage.eri) r0
            r1 = 0
            if (r0 == 0) goto L7b
            yr9 r2 = r0.getType()
            u9i r2 = r2.O()
            xh3 r2 = r2.a()
            if (r2 == 0) goto L36
            int r3 = defpackage.o06.a
            xw7 r2 = defpackage.m06.g(r2)
            r2.getClass()
            boolean r3 = r2.d()
            if (r3 == 0) goto L2e
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L36
            ww7 r2 = r2.g()
            goto L37
        L36:
            r2 = r1
        L37:
            ww7 r3 = defpackage.pkg.f
            boolean r2 = defpackage.x44.r(r2, r3)
            if (r2 == 0) goto L40
            goto L41
        L40:
            r0 = r1
        L41:
            if (r0 != 0) goto L44
            goto L7b
        L44:
            g08 r1 = r4.f0()
            java.util.List r4 = r4.I()
            r4.getClass()
            r2 = 1
            java.util.List r4 = defpackage.w44.J0(r2, r4)
            g08 r4 = r1.a(r4)
            yr9 r0 = r0.getType()
            java.util.List r0 = r0.H()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            vai r0 = (defpackage.vai) r0
            yr9 r0 = r0.b()
            g08 r4 = r4.n(r0)
            h08 r4 = r4.build()
            c7g r4 = (defpackage.c7g) r4
            if (r4 != 0) goto L78
            return r4
        L78:
            r4.Y = r2
            return r4
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx9.D(c7g):c7g");
    }

    public static boolean F(h08 h08Var, h08 h08Var2) {
        int iC = gmc.c.n(h08Var2, h08Var, true).c();
        if (iC != 0) {
            return iC == 1 && !iuj.s(h08Var2, h08Var);
        }
        throw null;
    }

    public static boolean G(c7g c7gVar, c7g c7gVar2) {
        int i = yz1.l;
        c7gVar.getClass();
        if (x44.r(c7gVar.getName().b(), "removeAt") && x44.r(csk.f(c7gVar), wgg.g.b)) {
            c7gVar2 = c7gVar2.M0();
        }
        c7gVar2.getClass();
        return F(c7gVar2, c7gVar);
    }

    public static c7g H(hrd hrdVar, String str, bz7 bz7Var) {
        c7g c7gVar;
        Iterator it = ((Iterable) bz7Var.invoke(sxb.e(str))).iterator();
        do {
            c7gVar = null;
            if (!it.hasNext()) {
                break;
            }
            c7g c7gVar2 = (c7g) it.next();
            if (c7gVar2.I().size() == 0) {
                d3c d3cVar = as9.a;
                yr9 yr9Var = c7gVar2.K;
                if (yr9Var == null ? false : d3cVar.b(yr9Var, hrdVar.getType())) {
                    c7gVar = c7gVar2;
                }
            }
        } while (c7gVar == null);
        return c7gVar;
    }

    public static c7g J(hrd hrdVar, bz7 bz7Var) {
        c7g c7gVar;
        yr9 yr9Var;
        String strB = hrdVar.getName().b();
        strB.getClass();
        Iterator it = ((Iterable) bz7Var.invoke(sxb.e(lj9.b(strB)))).iterator();
        do {
            c7gVar = null;
            if (!it.hasNext()) {
                break;
            }
            c7g c7gVar2 = (c7g) it.next();
            if (c7gVar2.I().size() == 1 && (yr9Var = c7gVar2.K) != null) {
                sxb sxbVar = or9.e;
                if (or9.C(yr9Var, okg.d)) {
                    d3c d3cVar = as9.a;
                    List listI = c7gVar2.I();
                    listI.getClass();
                    if (d3cVar.a(((eri) w44.e1(listI)).getType(), hrdVar.getType())) {
                        c7gVar = c7gVar2;
                    }
                }
            }
        } while (c7gVar == null);
        return c7gVar;
    }

    public static boolean M(c7g c7gVar, h08 h08Var) {
        String strE = csk.e(c7gVar, 2);
        h08 h08VarA = h08Var.a();
        h08VarA.getClass();
        return strE.equals(csk.e(h08VarA, 2)) && !F(c7gVar, h08Var);
    }

    public static final ArrayList v(zx9 zx9Var, sxb sxbVar) {
        Collection collectionC = ((io5) zx9Var.e.a()).c(sxbVar);
        ArrayList arrayList = new ArrayList(x44.y(collectionC, 10));
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(zx9Var.t((tbe) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList w(zx9 zx9Var, sxb sxbVar) {
        LinkedHashSet linkedHashSetK = zx9Var.K(sxbVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetK) {
            c7g c7gVar = (c7g) obj;
            c7gVar.getClass();
            if (!(mwj.j(c7gVar) != null) && zz1.a(c7gVar) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, qbg qbgVar, bz7 bz7Var) {
        c7g c7gVarJ;
        prd prdVarX;
        ee9 ee9Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hrd hrdVar = (hrd) it.next();
            if (E(hrdVar, bz7Var)) {
                c7g c7gVarI = I(hrdVar, bz7Var);
                c7gVarI.getClass();
                if (hrdVar.R()) {
                    c7gVarJ = J(hrdVar, bz7Var);
                    c7gVarJ.getClass();
                } else {
                    c7gVarJ = null;
                }
                if (c7gVarJ != null) {
                    c7gVarJ.q();
                    c7gVarI.q();
                }
                qqb qqbVar = this.n;
                qqbVar.getClass();
                ee9 ee9Var2 = new ee9(qqbVar, dd8.F, c7gVarI.q(), c7gVarI.getVisibility(), c7gVarJ != null, hrdVar.getName(), c7gVarI.d(), null, 1, false, null);
                yr9 yr9Var = c7gVarI.K;
                yr9Var.getClass();
                l6e l6eVarP = p();
                lm6 lm6Var = lm6.E;
                ee9Var2.U0(yr9Var, lm6Var, l6eVarP, null, lm6Var);
                krd krdVarV = xzk.v(ee9Var2, c7gVarI.getAnnotations(), false, c7gVarI.d());
                krdVarV.P = c7gVarI;
                krdVarV.T0(ee9Var2.getType());
                if (c7gVarJ != null) {
                    List listI = c7gVarJ.I();
                    listI.getClass();
                    eri eriVar = (eri) w44.N0(listI);
                    if (eriVar == null) {
                        throw new AssertionError("No parameter found for " + c7gVarJ);
                    }
                    prdVarX = xzk.x(ee9Var2, c7gVarJ.getAnnotations(), eriVar.getAnnotations(), false, c7gVarJ.getVisibility(), c7gVarJ.d());
                    prdVarX.P = c7gVarJ;
                } else {
                    prdVarX = null;
                }
                ee9Var2.R0(krdVarV, prdVarX, null, null);
                ee9Var = ee9Var2;
            } else {
                ee9Var = null;
            }
            if (ee9Var != null) {
                abstractCollection.add(ee9Var);
                if (qbgVar != null) {
                    qbgVar.add(hrdVar);
                    return;
                }
                return;
            }
        }
    }

    public final Collection B() {
        boolean z = this.p;
        qqb qqbVar = this.n;
        if (z) {
            Collection collectionB = qqbVar.p().b();
            collectionB.getClass();
            return collectionB;
        }
        ((d3c) ((ke9) this.b.E).u).getClass();
        qqbVar.getClass();
        Collection collectionB2 = qqbVar.p().b();
        collectionB2.getClass();
        return collectionB2;
    }

    public final boolean E(hrd hrdVar, bz7 bz7Var) {
        if (kyk.h(hrdVar)) {
            return false;
        }
        c7g c7gVarI = I(hrdVar, bz7Var);
        c7g c7gVarJ = J(hrdVar, bz7Var);
        if (c7gVarI == null) {
            return false;
        }
        if (hrdVar.R()) {
            return c7gVarJ != null && c7gVarJ.q() == c7gVarI.q();
        }
        return true;
    }

    public final c7g I(hrd hrdVar, bz7 bz7Var) {
        sxb sxbVar;
        krd krdVarB = hrdVar.b();
        String strB = null;
        krd krdVar = krdVarB != null ? (krd) mwj.j(krdVarB) : null;
        if (krdVar != null) {
            or9.y(krdVar);
            e92 e92VarB = o06.b(o06.i(krdVar), ex.e0);
            if (e92VarB != null && (sxbVar = (sxb) a02.a.get(o06.g(e92VarB))) != null) {
                strB = sxbVar.b();
            }
        }
        if (strB != null && !mwj.l(this.n, krdVar)) {
            return H(hrdVar, strB, bz7Var);
        }
        String strB2 = hrdVar.getName().b();
        strB2.getClass();
        return H(hrdVar, lj9.a(strB2), bz7Var);
    }

    public final LinkedHashSet K(sxb sxbVar) {
        Collection collectionB = B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            b54.t0(linkedHashSet, ((yr9) it.next()).G().g(sxbVar, 15));
        }
        return linkedHashSet;
    }

    public final Set L(sxb sxbVar) {
        Collection collectionB = B();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            Collection collectionD = ((yr9) it.next()).G().d(sxbVar, 15);
            ArrayList arrayList2 = new ArrayList(x44.y(collectionD, 10));
            Iterator it2 = collectionD.iterator();
            while (it2.hasNext()) {
                arrayList2.add((hrd) it2.next());
            }
            b54.t0(arrayList, arrayList2);
        }
        return w44.t1(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cb A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(defpackage.c7g r10) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx9.N(c7g):boolean");
    }

    public final void O(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i == 0) {
            throw null;
        }
        ((ke9) this.b.E).n.getClass();
        sq6.a(i);
        this.n.getClass();
    }

    @Override // defpackage.ly9, defpackage.gab, defpackage.fab
    public final Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i == 0) {
            throw null;
        }
        O(sxbVar, i);
        return super.d(sxbVar, i);
    }

    @Override // defpackage.gab, defpackage.fab
    public final xh3 e(sxb sxbVar, int i) {
        efa efaVar;
        qqb qqbVar;
        sxbVar.getClass();
        if (i == 0) {
            throw null;
        }
        O(sxbVar, i);
        zx9 zx9Var = (zx9) this.c;
        return (zx9Var == null || (efaVar = zx9Var.u) == null || (qqbVar = (qqb) efaVar.invoke(sxbVar)) == null) ? (xh3) this.u.invoke(sxbVar) : qqbVar;
    }

    @Override // defpackage.ly9, defpackage.gab, defpackage.fab
    public final Collection g(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i == 0) {
            throw null;
        }
        O(sxbVar, i);
        return super.g(sxbVar, i);
    }

    @Override // defpackage.ly9
    public final Set h(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        return dxf.p0((Set) this.r.a(), ((Map) this.t.a()).keySet());
    }

    @Override // defpackage.ly9
    public final Set i(c06 c06Var, f06 f06Var) {
        c06Var.getClass();
        qqb qqbVar = this.n;
        Collection collectionB = qqbVar.p().b();
        collectionB.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            b54.t0(linkedHashSet, ((yr9) it.next()).G().a());
        }
        dfa dfaVar = this.e;
        linkedHashSet.addAll(((io5) dfaVar.a()).a());
        linkedHashSet.addAll(((io5) dfaVar.a()).e());
        linkedHashSet.addAll(h(c06Var, f06Var));
        el5 el5Var = this.b;
        ((lja) ((ke9) el5Var.E).x).getClass();
        el5Var.getClass();
        qqbVar.getClass();
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override // defpackage.ly9
    public final void j(sxb sxbVar, ArrayList arrayList) throws IllegalAccessException, InvocationTargetException {
        sxbVar.getClass();
        boolean zJ = ((jbe) this.o).j();
        qqb qqbVar = this.n;
        el5 el5Var = this.b;
        if (zJ) {
            dfa dfaVar = this.e;
            if (((io5) dfaVar.a()).b(sxbVar) != null) {
                if (arrayList.isEmpty()) {
                    wbe wbeVarB = ((io5) dfaVar.a()).b(sxbVar);
                    wbeVarB.getClass();
                    sx9 sx9VarA0 = mpk.a0(el5Var, wbeVarB);
                    ke9 ke9Var = (ke9) el5Var.E;
                    sxb sxbVarD = wbeVarB.d();
                    ke9Var.j.getClass();
                    ge9 ge9VarC1 = ge9.c1(qqbVar, sx9VarA0, sxbVarD, ql8.x(wbeVarB), true);
                    yr9 yr9VarQ = ((fj0) el5Var.I).Q(wbeVarB.j(), oyk.j(2, false, null, 6));
                    l6e l6eVarP = p();
                    p06 p06Var = q06.e;
                    lm6 lm6Var = lm6.E;
                    ge9VarC1.b1(null, l6eVarP, lm6Var, lm6Var, lm6Var, yr9VarQ, 3, p06Var, null);
                    ge9VarC1.h0 = 1;
                    ke9Var.g.getClass();
                    arrayList.add(ge9VarC1);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((c7g) it.next()).I().isEmpty()) {
                            break;
                        }
                    }
                    wbe wbeVarB2 = ((io5) dfaVar.a()).b(sxbVar);
                    wbeVarB2.getClass();
                    sx9 sx9VarA02 = mpk.a0(el5Var, wbeVarB2);
                    ke9 ke9Var2 = (ke9) el5Var.E;
                    sxb sxbVarD2 = wbeVarB2.d();
                    ke9Var2.j.getClass();
                    ge9 ge9VarC12 = ge9.c1(qqbVar, sx9VarA02, sxbVarD2, ql8.x(wbeVarB2), true);
                    yr9 yr9VarQ2 = ((fj0) el5Var.I).Q(wbeVarB2.j(), oyk.j(2, false, null, 6));
                    l6e l6eVarP2 = p();
                    p06 p06Var2 = q06.e;
                    lm6 lm6Var2 = lm6.E;
                    ge9VarC12.b1(null, l6eVarP2, lm6Var2, lm6Var2, lm6Var2, yr9VarQ2, 3, p06Var2, null);
                    ge9VarC12.h0 = 1;
                    ke9Var2.g.getClass();
                    arrayList.add(ge9VarC12);
                }
            }
        }
        ((lja) ((ke9) el5Var.E).x).getClass();
        el5Var.getClass();
        qqbVar.getClass();
        sxbVar.getClass();
    }

    @Override // defpackage.ly9
    public final io5 k() {
        return new wg3(this.o, f06.X);
    }

    @Override // defpackage.ly9
    public final void m(LinkedHashSet linkedHashSet, sxb sxbVar) {
        sxbVar.getClass();
        LinkedHashSet linkedHashSetK = K(sxbVar);
        ArrayList arrayList = wgg.a;
        if (!wgg.j.contains(sxbVar)) {
            int i = zz1.l;
            if (!wgg.e.contains(sxbVar)) {
                if (!linkedHashSetK.isEmpty()) {
                    Iterator it = linkedHashSetK.iterator();
                    while (it.hasNext()) {
                        if (((h08) it.next()).isSuspend()) {
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetK) {
                    if (N((c7g) obj)) {
                        arrayList2.add(obj);
                    }
                }
                y(linkedHashSet, sxbVar, arrayList2, false);
                return;
            }
        }
        qbg qbgVar = new qbg();
        LinkedHashSet linkedHashSetH = ac1.h(du6.i, this.n, sxbVar, ((d3c) ((ke9) this.b.E).u).d, linkedHashSetK, lm6.E);
        int i2 = 1;
        z(sxbVar, linkedHashSet, linkedHashSetH, linkedHashSet, new b16(i2, this, 3));
        z(sxbVar, linkedHashSet, linkedHashSetH, qbgVar, new b16(i2, this, 4));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetK) {
            if (N((c7g) obj2)) {
                arrayList3.add(obj2);
            }
        }
        y(linkedHashSet, sxbVar, w44.a1(arrayList3, qbgVar), true);
    }

    @Override // defpackage.ly9
    public final void n(sxb sxbVar, ArrayList arrayList) {
        sxb sxbVar2;
        sxbVar.getClass();
        boolean zIsAnnotation = ((jbe) this.o).a.isAnnotation();
        el5 el5Var = this.b;
        if (zIsAnnotation) {
            sxbVar2 = sxbVar;
            tbe tbeVar = (tbe) w44.f1(((io5) this.e.a()).c(sxbVar2));
            if (tbeVar != null) {
                sx9 sx9VarA0 = mpk.a0(el5Var, tbeVar);
                ow5 ow5VarJ = ztj.j(tbeVar.f());
                sxb sxbVarD = tbeVar.d();
                ((ke9) el5Var.E).j.getClass();
                je9 je9VarV0 = je9.V0(this.n, sx9VarA0, ow5VarJ, false, sxbVarD, ql8.x(tbeVar), false);
                krd krdVarP = xzk.p(je9VarV0, dd8.F);
                je9VarV0.R0(krdVarP, null, null, null);
                el5Var.getClass();
                yr9 yr9VarL = ly9.l(tbeVar, new el5((ke9) el5Var.E, new f4i(el5Var, je9VarV0, tbeVar, 0), (kw9) el5Var.G));
                l6e l6eVarP = p();
                lm6 lm6Var = lm6.E;
                je9VarV0.U0(yr9VarL, lm6Var, l6eVarP, null, lm6Var);
                krdVarP.Q = yr9VarL;
                arrayList.add(je9VarV0);
            }
        } else {
            sxbVar2 = sxbVar;
        }
        Set setL = L(sxbVar);
        if (setL.isEmpty()) {
            return;
        }
        qbg qbgVar = new qbg();
        qbg qbgVar2 = new qbg();
        A(setL, arrayList, qbgVar, new wx9(this, 0));
        A(dxf.o0(setL, qbgVar), qbgVar2, null, new wx9(this, 1));
        LinkedHashSet linkedHashSetP0 = dxf.p0(setL, qbgVar2);
        ke9 ke9Var = (ke9) el5Var.E;
        arrayList.addAll(ac1.h(ke9Var.f, this.n, sxbVar2, ((d3c) ke9Var.u).d, linkedHashSetP0, arrayList));
    }

    @Override // defpackage.ly9
    public final Set o(c06 c06Var) {
        c06Var.getClass();
        if (((jbe) this.o).a.isAnnotation()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((io5) this.e.a()).f());
        Collection collectionB = this.n.p().b();
        collectionB.getClass();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            b54.t0(linkedHashSet, ((yr9) it.next()).G().f());
        }
        return linkedHashSet;
    }

    @Override // defpackage.ly9
    public final l6e p() {
        qqb qqbVar = this.n;
        if (qqbVar != null) {
            int i = m06.a;
            return qqbVar.j0();
        }
        m06.a(0);
        throw null;
    }

    @Override // defpackage.ly9
    public final bo5 q() {
        return this.n;
    }

    @Override // defpackage.ly9
    public final boolean r(ge9 ge9Var) {
        if (((jbe) this.o).a.isAnnotation()) {
            return false;
        }
        return N(ge9Var);
    }

    @Override // defpackage.ly9
    public final iy9 s(tbe tbeVar, ArrayList arrayList, yr9 yr9Var, List list) {
        tbeVar.getClass();
        list.getClass();
        ((ke9) this.b.E).e.getClass();
        if (this.n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new iy9(yr9Var, list, arrayList, list2);
            }
            e0.g("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"});
            return null;
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = VerifyMagicLinkRequest.Credentials.DISCRIMINATOR;
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.ly9
    public final String toString() {
        return "Lazy Java member scope for " + ((jbe) this.o).d();
    }

    public final void x(ArrayList arrayList, wd9 wd9Var, int i, tbe tbeVar, yr9 yr9Var, yr9 yr9Var2) {
        abe pbeVar;
        vc0 vc0Var = dd8.F;
        sxb sxbVarD = tbeVar.d();
        if (yr9Var == null) {
            fbi.a(2);
            throw null;
        }
        fhi fhiVarH = fbi.h(yr9Var, false);
        Object defaultValue = tbeVar.a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = yae.a;
            pbeVar = Enum.class.isAssignableFrom(cls) ? new pbe(null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new bbe(null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new cbe(null, (Object[]) defaultValue) : defaultValue instanceof Class ? new lbe(null, (Class) defaultValue) : new rbe(null, defaultValue);
        } else {
            pbeVar = null;
        }
        boolean z = pbeVar != null;
        fhi fhiVarH2 = yr9Var2 != null ? fbi.h(yr9Var2, false) : null;
        ((ke9) this.b.E).j.getClass();
        arrayList.add(new eri(wd9Var, null, i, vc0Var, sxbVarD, fhiVarH, z, false, false, fhiVarH2, ql8.x(tbeVar)));
    }

    public final void y(LinkedHashSet linkedHashSet, sxb sxbVar, ArrayList arrayList, boolean z) {
        ke9 ke9Var = (ke9) this.b.E;
        LinkedHashSet<c7g> linkedHashSetH = ac1.h(ke9Var.f, this.n, sxbVar, ((d3c) ke9Var.u).d, arrayList, linkedHashSet);
        if (!z) {
            linkedHashSet.addAll(linkedHashSetH);
            return;
        }
        ArrayList arrayListA1 = w44.a1(linkedHashSet, linkedHashSetH);
        ArrayList arrayList2 = new ArrayList(x44.y(linkedHashSetH, 10));
        for (c7g c7gVarC : linkedHashSetH) {
            c7g c7gVar = (c7g) mwj.k(c7gVarC);
            if (c7gVar != null) {
                c7gVarC = C(c7gVarC, c7gVar, arrayListA1);
            }
            arrayList2.add(c7gVarC);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.sxb r9, java.util.LinkedHashSet r10, java.util.LinkedHashSet r11, java.util.AbstractSet r12, defpackage.bz7 r13) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx9.z(sxb, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, bz7):void");
    }
}
