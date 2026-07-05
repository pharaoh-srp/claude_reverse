package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class fbi {
    public static final ku6 a = nu6.c(mu6.DONT_CARE, new String[0]);
    public static final ku6 b = nu6.c(mu6.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);
    public static final ebi c = new ebi("NO_EXPECTED_TYPE");
    public static final ebi d = new ebi("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r27) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbi.a(int):void");
    }

    public static boolean b(yr9 yr9Var) {
        if (yr9Var == null) {
            a(28);
            throw null;
        }
        if (yr9Var.b0()) {
            return true;
        }
        return (yr9Var.k0() instanceof sn7) && b(((sn7) yr9Var.k0()).G);
    }

    public static boolean c(yr9 yr9Var, bz7 bz7Var, qbg qbgVar) {
        if (yr9Var == null) {
            return false;
        }
        fhi fhiVarK0 = yr9Var.k0();
        if (m(yr9Var)) {
            return ((Boolean) bz7Var.invoke(fhiVarK0)).booleanValue();
        }
        if (qbgVar != null && qbgVar.contains(yr9Var)) {
            return false;
        }
        if (((Boolean) bz7Var.invoke(fhiVarK0)).booleanValue()) {
            return true;
        }
        if (qbgVar == null) {
            qbgVar = qbg.a();
        }
        qbgVar.add(yr9Var);
        sn7 sn7Var = fhiVarK0 instanceof sn7 ? (sn7) fhiVarK0 : null;
        if (sn7Var != null && (c(sn7Var.F, bz7Var, qbgVar) || c(sn7Var.G, bz7Var, qbgVar))) {
            return true;
        }
        if ((fhiVarK0 instanceof fw5) && c(((fw5) fhiVarK0).F, bz7Var, qbgVar)) {
            return true;
        }
        u9i u9iVarO = yr9Var.O();
        if (u9iVarO instanceof qa9) {
            Iterator it = ((qa9) u9iVarO).b.iterator();
            while (it.hasNext()) {
                if (c((yr9) it.next(), bz7Var, qbgVar)) {
                    return true;
                }
            }
            return false;
        }
        for (vai vaiVar : yr9Var.H()) {
            if (!vaiVar.c() && c(vaiVar.b(), bz7Var, qbgVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new wai(((qai) it.next()).W()));
        }
        return w44.p1(arrayList);
    }

    public static boolean e(yr9 yr9Var) {
        if (yr9Var == null) {
            a(27);
            throw null;
        }
        if (!yr9Var.b0() && (!(yr9Var.k0() instanceof sn7) || !e(((sn7) yr9Var.k0()).G))) {
            if (!(yr9Var.k0() instanceof fw5)) {
                if (f(yr9Var)) {
                    if (!(yr9Var.O().a() instanceof qqb)) {
                        a aVarD = a.d(yr9Var);
                        Collection<yr9> collectionB = yr9Var.O().b();
                        ArrayList arrayList = new ArrayList(collectionB.size());
                        for (yr9 yr9Var2 : collectionB) {
                            if (yr9Var2 == null) {
                                a(21);
                                throw null;
                            }
                            yr9 yr9VarK = aVarD.k(1, yr9Var2);
                            yr9 yr9VarI = yr9VarK != null ? i(yr9VarK, yr9Var.b0()) : null;
                            if (yr9VarI != null) {
                                arrayList.add(yr9VarI);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((yr9) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                u9i u9iVarO = yr9Var.O();
                if (u9iVarO instanceof qa9) {
                    Iterator it2 = ((qa9) u9iVarO).b.iterator();
                    while (it2.hasNext()) {
                        if (e((yr9) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(yr9 yr9Var) {
        if (yr9Var == null) {
            a(60);
            throw null;
        }
        if ((yr9Var.O().a() instanceof qai ? (qai) yr9Var.O().a() : null) != null) {
            return true;
        }
        yr9Var.O();
        return false;
    }

    public static fhi g(yr9 yr9Var) {
        if (yr9Var != null) {
            return h(yr9Var, true);
        }
        a(1);
        throw null;
    }

    public static fhi h(yr9 yr9Var, boolean z) {
        if (yr9Var == null) {
            a(3);
            throw null;
        }
        fhi fhiVarL0 = yr9Var.k0().l0(z);
        if (fhiVarL0 != null) {
            return fhiVarL0;
        }
        a(4);
        throw null;
    }

    public static yr9 i(yr9 yr9Var, boolean z) {
        if (yr9Var != null) {
            return z ? h(yr9Var, true) : yr9Var;
        }
        a(8);
        throw null;
    }

    public static j7g j(j7g j7gVar, boolean z) {
        if (j7gVar == null) {
            a(5);
            throw null;
        }
        if (!z) {
            return j7gVar;
        }
        j7g j7gVarL0 = j7gVar.l0(true);
        if (j7gVarL0 != null) {
            return j7gVarL0;
        }
        a(6);
        throw null;
    }

    public static skg k(qai qaiVar) {
        if (qaiVar != null) {
            return new skg(qaiVar);
        }
        a(45);
        throw null;
    }

    public static vai l(qai qaiVar, ze9 ze9Var) {
        if (qaiVar != null) {
            return ze9Var.d() == 1 ? new wai(xwj.f(qaiVar)) : new skg(qaiVar);
        }
        a(46);
        throw null;
    }

    public static boolean m(yr9 yr9Var) {
        if (yr9Var != null) {
            return yr9Var == c || yr9Var == d;
        }
        a(0);
        throw null;
    }
}
