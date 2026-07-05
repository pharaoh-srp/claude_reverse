package defpackage;

import io.sentry.b2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public final class gmc {
    public static final List b = w44.p1(ServiceLoader.load(qd7.class, qd7.class.getClassLoader()));
    public static final gmc c;
    public static final k2e d;
    public final zr9 a;

    static {
        k2e k2eVar = new k2e(24);
        d = k2eVar;
        c = new gmc(k2eVar);
    }

    public gmc(zr9 zr9Var) {
        if (zr9Var != null) {
            this.a = zr9Var;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r25) {
        /*
            Method dump skipped, instruction units count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmc.a(int):void");
    }

    public static boolean b(yr9 yr9Var, yr9 yr9Var2, t9i t9iVar) {
        if (yr9Var == null) {
            a(46);
            throw null;
        }
        if (yr9Var2 == null) {
            a(47);
            throw null;
        }
        if (ttj.j(yr9Var) && ttj.j(yr9Var2)) {
            return true;
        }
        return hj6.y(t9iVar, yr9Var.k0(), yr9Var2.k0());
    }

    public static void c(e92 e92Var, LinkedHashSet linkedHashSet) {
        if (e92Var == null) {
            a(17);
            throw null;
        }
        if (e92Var.getKind() != 2) {
            linkedHashSet.add(e92Var);
        } else {
            if (e92Var.i().isEmpty()) {
                xh6.m("No overridden descriptors found for (fake override) ", e92Var);
                return;
            }
            Iterator it = e92Var.i().iterator();
            while (it.hasNext()) {
                c((e92) it.next(), linkedHashSet);
            }
        }
    }

    public static ArrayList d(c92 c92Var) {
        l6e l6eVarS = c92Var.S();
        ArrayList arrayList = new ArrayList();
        if (l6eVarS != null) {
            arrayList.add(((mw9) l6eVarS).getType());
        }
        Iterator it = c92Var.I().iterator();
        while (it.hasNext()) {
            arrayList.add(((eri) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x016a, code lost:
    
        if (r1 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016c, code lost:
    
        r0 = defpackage.q06.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016f, code lost:
    
        r0 = defpackage.q06.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0171, code lost:
    
        r13 = ((defpackage.e92) s(r12, new defpackage.dah(10))).M(r13, r7, r0);
        r14.o(r13, r12);
        r14.j(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0188, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.util.Collection r12, defpackage.qqb r13, defpackage.huk r14) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmc.e(java.util.Collection, qqb, huk):void");
    }

    public static ArrayList g(Object obj, LinkedList linkedList, bz7 bz7Var, bz7 bz7Var2) {
        if (obj == null) {
            a(99);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        c92 c92Var = (c92) bz7Var.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            c92 c92Var2 = (c92) bz7Var.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(c92Var, c92Var2);
                if (iJ == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    bz7Var2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static fmc i(c92 c92Var, c92 c92Var2) {
        boolean z;
        if (c92Var == null) {
            a(40);
            throw null;
        }
        if (c92Var2 == null) {
            a(41);
            throw null;
        }
        boolean z2 = c92Var instanceof h08;
        if ((z2 && !(c92Var2 instanceof h08)) || (((z = c92Var instanceof hrd)) && !(c92Var2 instanceof hrd))) {
            return fmc.d("Member kind mismatch");
        }
        if (!z2 && !z) {
            xh6.k("This type of CallableDescriptor cannot be checked for overridability: ", c92Var);
            return null;
        }
        if (!c92Var.getName().equals(c92Var2.getName())) {
            return fmc.d("Name mismatch");
        }
        fmc fmcVarD = (c92Var.S() == null) != (c92Var2.S() == null) ? fmc.d("Receiver presence mismatch") : c92Var.I().size() != c92Var2.I().size() ? fmc.d("Value parameter number mismatch") : null;
        if (fmcVarD != null) {
            return fmcVarD;
        }
        return null;
    }

    public static int j(c92 c92Var, c92 c92Var2) {
        gmc gmcVar = c;
        int iC = gmcVar.l(c92Var2, c92Var, null).c();
        int iC2 = gmcVar.m(c92Var, c92Var2, null, false).c();
        if (iC == 1 && iC2 == 1) {
            return 1;
        }
        return (iC == 3 || iC2 == 3) ? 3 : 2;
    }

    public static boolean k(c92 c92Var, c92 c92Var2) {
        if (c92Var == null) {
            a(67);
            throw null;
        }
        if (c92Var2 == null) {
            a(68);
            throw null;
        }
        yr9 returnType = c92Var.getReturnType();
        yr9 returnType2 = c92Var2.getReturnType();
        if (p(c92Var, c92Var2)) {
            t9i t9iVarF = c.f(c92Var.getTypeParameters(), c92Var2.getTypeParameters());
            if (c92Var instanceof h08) {
                return o(c92Var, returnType, c92Var2, returnType2, t9iVarF);
            }
            if (!(c92Var instanceof hrd)) {
                b2.g("Unexpected callable: ", c92Var.getClass());
                return false;
            }
            hrd hrdVar = (hrd) c92Var;
            hrd hrdVar2 = (hrd) c92Var2;
            prd prdVarC = hrdVar.c();
            prd prdVarC2 = hrdVar2.c();
            if ((prdVarC == null || prdVarC2 == null) ? true : p(prdVarC, prdVarC2)) {
                if (hrdVar.R() && hrdVar2.R()) {
                    return hj6.y(t9iVarF, returnType.k0(), returnType2.k0());
                }
                if ((hrdVar.R() || !hrdVar2.R()) && o(c92Var, returnType, c92Var2, returnType2, t9iVarF)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(c92 c92Var, yr9 yr9Var, c92 c92Var2, yr9 yr9Var2, t9i t9iVar) {
        if (c92Var == null) {
            a(73);
            throw null;
        }
        if (yr9Var == null) {
            a(74);
            throw null;
        }
        if (c92Var2 == null) {
            a(75);
            throw null;
        }
        if (yr9Var2 != null) {
            return hj6.F.G(t9iVar, yr9Var.k0(), yr9Var2.k0());
        }
        a(76);
        throw null;
    }

    public static boolean p(c92 c92Var, c92 c92Var2) {
        if (c92Var == null) {
            a(69);
            throw null;
        }
        if (c92Var2 != null) {
            Integer numB = q06.b(c92Var.getVisibility(), c92Var2.getVisibility());
            return numB == null || numB.intValue() >= 0;
        }
        a(70);
        throw null;
    }

    public static boolean q(c92 c92Var, c92 c92Var2) {
        lyk lykVar = lyk.L;
        if (c92Var == null) {
            a(13);
            throw null;
        }
        if (c92Var2 == null) {
            a(14);
            throw null;
        }
        if (!c92Var.equals(c92Var2) && lykVar.f(c92Var.a(), c92Var2.a(), false)) {
            return true;
        }
        c92 c92VarA = c92Var2.a();
        int i = m06.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m06.b(c92Var.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (lykVar.f(c92VarA, (c92) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(e92 e92Var, bz7 bz7Var) {
        ow5 ow5Var;
        ow5 ow5VarF;
        ow5 ow5Var2;
        if (e92Var == null) {
            a(107);
            throw null;
        }
        for (e92 e92Var2 : e92Var.i()) {
            if (e92Var2.getVisibility() == q06.g) {
                r(e92Var2, bz7Var);
            }
        }
        if (e92Var.getVisibility() != q06.g) {
            return;
        }
        Collection<e92> collectionI = e92Var.i();
        if (collectionI == null) {
            a(109);
            throw null;
        }
        if (collectionI.isEmpty()) {
            ow5VarF = q06.j;
        } else {
            Iterator it = collectionI.iterator();
            loop3: while (true) {
                ow5Var = null;
                while (it.hasNext()) {
                    ow5 visibility = ((e92) it.next()).getVisibility();
                    if (ow5Var != null) {
                        Integer numB = q06.b(visibility, ow5Var);
                        if (numB == null) {
                            break;
                        } else if (numB.intValue() > 0) {
                        }
                    }
                    ow5Var = visibility;
                }
            }
            if (ow5Var == null) {
                ow5VarF = null;
                break;
            }
            Iterator it2 = collectionI.iterator();
            while (it2.hasNext()) {
                Integer numB2 = q06.b(ow5Var, ((e92) it2.next()).getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    ow5VarF = null;
                    break;
                }
            }
            ow5VarF = ow5Var;
        }
        if (ow5VarF == null) {
            ow5VarF = null;
            break;
        }
        if (e92Var.getKind() == 2) {
            for (e92 e92Var3 : collectionI) {
                if (e92Var3.q() != 4 && !e92Var3.getVisibility().equals(ow5VarF)) {
                    ow5VarF = null;
                    break;
                }
            }
        } else {
            ow5VarF = q06.f(ow5VarF.a.c());
        }
        if (ow5VarF == null) {
            if (bz7Var != null) {
                bz7Var.invoke(e92Var);
            }
            ow5Var2 = q06.e;
        } else {
            ow5Var2 = ow5VarF;
        }
        if (e92Var instanceof jrd) {
            jrd jrdVar = (jrd) e92Var;
            if (ow5Var2 == null) {
                jrd.k0(20);
                throw null;
            }
            jrdVar.N = ow5Var2;
            Iterator it3 = ((hrd) e92Var).l().iterator();
            while (it3.hasNext()) {
                r((erd) it3.next(), ow5VarF == null ? null : bz7Var);
            }
            return;
        }
        if (e92Var instanceof j08) {
            j08 j08Var = (j08) e92Var;
            if (ow5Var2 != null) {
                j08Var.P = ow5Var2;
                return;
            } else {
                j08.k0(10);
                throw null;
            }
        }
        erd erdVar = (erd) e92Var;
        erdVar.R0(ow5Var2);
        if (ow5Var2 != erdVar.N0().getVisibility()) {
            erdVar.Q0();
        }
    }

    public static Object s(Collection collection, bz7 bz7Var) {
        Object next;
        if (collection.size() == 1) {
            Object objK0 = w44.K0(collection);
            if (objK0 != null) {
                return objK0;
            }
            a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(x44.y(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(bz7Var.invoke(it.next()));
        }
        Object objK02 = w44.K0(collection);
        c92 c92Var = (c92) bz7Var.invoke(objK02);
        for (Object obj : collection) {
            c92 c92Var2 = (c92) bz7Var.invoke(obj);
            if (c92Var2 == null) {
                a(71);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
                if (!k(c92Var2, (c92) it2.next())) {
                    break;
                }
            }
            if (k(c92Var2, c92Var) && !k(c92Var, c92Var2)) {
                objK02 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objK02 != null) {
                return objK02;
            }
            a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objK03 = w44.K0(arrayList);
            if (objK03 != null) {
                return objK03;
            }
            a(82);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            yr9 returnType = ((c92) bz7Var.invoke(next)).getReturnType();
            returnType.getClass();
            if (!(returnType.k0() instanceof sn7)) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objK04 = w44.K0(arrayList);
        if (objK04 != null) {
            return objK04;
        }
        a(84);
        throw null;
    }

    public final t9i f(List list, List list2) {
        if (list == null) {
            a(42);
            throw null;
        }
        if (list2 == null) {
            a(43);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        zr9 zr9Var = this.a;
        if (zIsEmpty) {
            return new i49((HashMap) null, zr9Var).Q0();
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(((qai) list.get(i)).p(), ((qai) list2.get(i)).p());
        }
        return new i49(map, zr9Var).Q0();
    }

    public final void h(sxb sxbVar, Collection collection, Collection collection2, qqb qqbVar, huk hukVar) {
        if (sxbVar == null) {
            a(52);
            throw null;
        }
        if (collection == null) {
            a(53);
            throw null;
        }
        if (collection2 == null) {
            a(54);
            throw null;
        }
        if (qqbVar == null) {
            a(55);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            e92 e92Var = (e92) it.next();
            if (e92Var == null) {
                a(59);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            qbg qbgVarA = qbg.a();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                e92 e92Var2 = (e92) it2.next();
                int iC = l(e92Var2, e92Var, qqbVar).c();
                boolean z = !q06.e(e92Var2.getVisibility()) && q06.c(q06.l, e92Var2, e92Var) == null;
                int iF = sq6.F(iC);
                if (iF == 0) {
                    if (z) {
                        qbgVarA.add(e92Var2);
                    }
                    arrayList.add(e92Var2);
                } else if (iF == 2) {
                    if (z) {
                        hukVar.n(e92Var2, e92Var);
                    }
                    arrayList.add(e92Var2);
                }
            }
            hukVar.o(e92Var, qbgVarA);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            u3a u3aVar = new u3a(6, ((e92) linkedHashSet.iterator().next()).h());
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (!((Boolean) u3aVar.invoke(it3.next())).booleanValue()) {
                        LinkedList linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            e92 e92VarC = xik.c(linkedList);
                            e(g(e92VarC, linkedList, new dah(11), new z04(hukVar, 28, e92VarC)), qqbVar, hukVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((e92) it4.next()), qqbVar, hukVar);
        }
    }

    public final fmc l(c92 c92Var, c92 c92Var2, qqb qqbVar) {
        if (c92Var == null) {
            a(19);
            throw null;
        }
        if (c92Var2 != null) {
            return m(c92Var, c92Var2, qqbVar, false);
        }
        a(20);
        throw null;
    }

    public final fmc m(c92 c92Var, c92 c92Var2, qqb qqbVar, boolean z) {
        if (c92Var == null) {
            a(22);
            throw null;
        }
        if (c92Var2 == null) {
            a(23);
            throw null;
        }
        fmc fmcVarN = n(c92Var, c92Var2, z);
        boolean z2 = fmcVarN.c() == 1;
        List<qd7> list = b;
        for (qd7 qd7Var : list) {
            if (qd7Var.a() != 1 && (!z2 || qd7Var.a() != 2)) {
                int iF = sq6.F(qd7Var.b(c92Var, c92Var2, qqbVar));
                if (iF == 0) {
                    z2 = true;
                } else {
                    if (iF == 1) {
                        return fmc.b("External condition failed");
                    }
                    if (iF == 2) {
                        return fmc.d("External condition");
                    }
                }
            }
        }
        if (!z2) {
            return fmcVarN;
        }
        for (qd7 qd7Var2 : list) {
            if (qd7Var2.a() == 1) {
                int iF2 = sq6.F(qd7Var2.b(c92Var, c92Var2, qqbVar));
                if (iF2 == 0) {
                    throw new IllegalStateException("Contract violation in " + qd7Var2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iF2 == 1) {
                    return fmc.b("External condition failed");
                }
                if (iF2 == 2) {
                    return fmc.d("External condition");
                }
            }
        }
        fmc fmcVarE = fmc.e();
        if (fmcVarE != null) {
            return fmcVarE;
        }
        a(29);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        r10.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fmc n(defpackage.c92 r13, defpackage.c92 r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmc.n(c92, c92, boolean):fmc");
    }
}
