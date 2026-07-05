package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class aoe {
    public static final yne a = new yne();
    public static final umg b = new umg(new zcd(17));

    static {
        int i = zne.E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    public static final spe a(sne sneVar, xne xneVar) {
        sneVar.getClass();
        xneVar.getClass();
        List listP1 = w44.p1(sneVar.b);
        at9 at9Var = xneVar.a;
        mde mdeVar = xneVar.b;
        List list = listP1;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Set set = ((spe) obj).a;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (x44.r((szd) it.next(), at9Var)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Set set2 = ((spe) obj2).a;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (x44.r((szd) it2.next(), mdeVar)) {
                        arrayList2.add(obj2);
                        break;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                Set set3 = ((spe) obj3).a;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    Iterator it3 = set3.iterator();
                    while (it3.hasNext()) {
                        if (((szd) it3.next()) instanceof mde) {
                            break;
                        }
                    }
                }
                arrayList2.add(obj3);
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    Set<szd> set4 = ((spe) obj4).a;
                    if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                        for (szd szdVar : set4) {
                            if ((szdVar instanceof at9) || (szdVar instanceof mde)) {
                                break;
                            }
                        }
                    }
                    arrayList2.add(obj4);
                }
            }
        }
        if (arrayList2.size() == 1) {
            return (spe) w44.L0(arrayList2);
        }
        plh plhVar = xneVar.c;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj5 : arrayList2) {
            Set set5 = ((spe) obj5).a;
            if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                Iterator it4 = set5.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (x44.r((szd) it4.next(), plhVar)) {
                        arrayList3.add(obj5);
                        break;
                    }
                }
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = new ArrayList();
            for (Object obj6 : arrayList2) {
                Set set6 = ((spe) obj6).a;
                if (!(set6 instanceof Collection) || !set6.isEmpty()) {
                    Iterator it5 = set6.iterator();
                    while (it5.hasNext()) {
                        if (((szd) it5.next()).getClass() == plh.class) {
                            break;
                        }
                    }
                }
                arrayList3.add(obj6);
            }
        }
        if (arrayList3.size() == 1) {
            return (spe) w44.L0(arrayList3);
        }
        int i = xneVar.d.E;
        ArrayList arrayList4 = new ArrayList();
        gq6 gq6Var = gz5.N;
        for (Object obj7 : gq6Var) {
            if (((gz5) obj7).E >= i) {
                arrayList4.add(obj7);
            }
        }
        Iterator it6 = w44.i1(arrayList4, new x8e(4)).iterator();
        ?? arrayList5 = lm6.E;
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            gz5 gz5Var = (gz5) it6.next();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj8 : arrayList3) {
                Set set7 = ((spe) obj8).a;
                if (!(set7 instanceof Collection) || !set7.isEmpty()) {
                    Iterator it7 = set7.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        if (((szd) it7.next()) == gz5Var) {
                            arrayList6.add(obj8);
                            break;
                        }
                    }
                }
            }
            if (!arrayList6.isEmpty()) {
                arrayList5 = arrayList6;
                break;
            }
            arrayList5 = arrayList6;
        }
        if (((Collection) arrayList5).isEmpty()) {
            gz5 gz5Var2 = gz5.G;
            ArrayList arrayListX0 = w44.X0(gq6Var, gz5Var2);
            ArrayList arrayList7 = new ArrayList();
            for (Object obj9 : arrayListX0) {
                if (((gz5) obj9).E < i) {
                    arrayList7.add(obj9);
                }
            }
            for (gz5 gz5Var3 : w44.i1(arrayList7, new x8e(5))) {
                arrayList5 = new ArrayList();
                for (Object obj10 : arrayList3) {
                    Set set8 = ((spe) obj10).a;
                    if (!(set8 instanceof Collection) || !set8.isEmpty()) {
                        Iterator it8 = set8.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            }
                            if (((szd) it8.next()) == gz5Var3) {
                                arrayList5.add(obj10);
                                break;
                            }
                        }
                    }
                }
                if (!arrayList5.isEmpty()) {
                    break;
                }
            }
            if (((Collection) arrayList5).isEmpty()) {
                arrayList5 = new ArrayList();
                for (Object obj11 : arrayList3) {
                    Set set9 = ((spe) obj11).a;
                    if (!(set9 instanceof Collection) || !set9.isEmpty()) {
                        Iterator it9 = set9.iterator();
                        while (it9.hasNext()) {
                            if (((szd) it9.next()) instanceof gz5) {
                                break;
                            }
                        }
                    }
                    arrayList5.add(obj11);
                }
                if (arrayList5.isEmpty()) {
                    arrayList5 = new ArrayList();
                    for (Object obj12 : arrayList3) {
                        Set set10 = ((spe) obj12).a;
                        if (!(set10 instanceof Collection) || !set10.isEmpty()) {
                            Iterator it10 = set10.iterator();
                            while (true) {
                                if (!it10.hasNext()) {
                                    break;
                                }
                                if (((szd) it10.next()) == gz5Var2) {
                                    arrayList5.add(obj12);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arrayList5.size() == 1) {
            return (spe) w44.L0(arrayList5);
        }
        boolean zIsEmpty = arrayList5.isEmpty();
        String str = sneVar.a;
        if (zIsEmpty) {
            xh6.i(str, "' not found", "Resource with ID='");
            return null;
        }
        sz6.l("Resource with ID='", str, "' has more than one file: ", w44.S0((Iterable) arrayList5, null, null, null, new u9e(3), 31));
        return null;
    }

    public static final xne b(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        ((yne) e18Var.j(b)).getClass();
        return yne.a(e18Var);
    }
}
