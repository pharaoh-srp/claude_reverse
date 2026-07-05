package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class mai {
    public static final mai a = new mai();

    public static ArrayList a(AbstractCollection abstractCollection, pz7 pz7Var) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            j7g j7gVar = (j7g) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    j7g j7gVar2 = (j7g) it2.next();
                    if (j7gVar2 != j7gVar) {
                        j7gVar2.getClass();
                        j7gVar.getClass();
                        if (((Boolean) pz7Var.invoke(j7gVar2, j7gVar)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, r9i] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [r9i] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v15, types: [j7g] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [j7g, java.lang.Object, yr9] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Set] */
    public final j7g b(ArrayList arrayList) {
        j7g j7gVarE;
        arrayList.size();
        ArrayList<j7g> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j7g j7gVar = (j7g) it.next();
            if (j7gVar.O() instanceof qa9) {
                Collection collectionB = j7gVar.O().b();
                collectionB.getClass();
                Collection<yr9> collection = collectionB;
                ArrayList arrayList3 = new ArrayList(x44.y(collection, 10));
                for (yr9 yr9Var : collection) {
                    yr9Var.getClass();
                    j7g j7gVarS = yb5.S(yr9Var);
                    if (j7gVar.b0()) {
                        j7gVarS = j7gVarS.l0(true);
                    }
                    arrayList3.add(j7gVarS);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(j7gVar);
            }
        }
        Iterator it2 = arrayList2.iterator();
        kai kaiVarA = kai.E;
        while (it2.hasNext()) {
            kaiVarA = kaiVarA.a((fhi) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (j7g j7gVarL0 : arrayList2) {
            if (kaiVarA == kai.H) {
                if (j7gVarL0 instanceof i2c) {
                    i2c i2cVar = (i2c) j7gVarL0;
                    j7gVarL0 = new i2c(i2cVar.F, i2cVar.G, i2cVar.H, i2cVar.I, i2cVar.J, true);
                }
                j7gVarL0.getClass();
                j7g j7gVarW = am4.w(j7gVarL0, false);
                j7gVarL0 = (j7gVarW == null && (j7gVarW = u00.B(j7gVarL0)) == null) ? j7gVarL0.l0(false) : j7gVarW;
            }
            linkedHashSet.add(j7gVarL0);
        }
        ArrayList arrayList4 = new ArrayList(x44.y(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((j7g) it3.next()).K());
        }
        Iterator it4 = arrayList4.iterator();
        j7g j7gVar2 = null;
        if (!it4.hasNext()) {
            pmf.n("Empty collection can't be reduced.");
            return null;
        }
        ?? next = it4.next();
        while (it4.hasNext()) {
            r9i r9iVar = (r9i) it4.next();
            next = (r9i) next;
            next.getClass();
            cbf cbfVar = r9i.F;
            r9iVar.getClass();
            if (!next.isEmpty() || !r9iVar.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) cbfVar.F).values();
                collectionValues.getClass();
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    yc0 yc0Var = (yc0) next.E.get(iIntValue);
                    yc0 yc0Var2 = (yc0) r9iVar.E.get(iIntValue);
                    yc0 yc0VarC = yc0Var == null ? yc0Var2 != null ? yc0Var2.c(yc0Var) : null : yc0Var.c(yc0Var2);
                    if (yc0VarC != null) {
                        arrayList5.add(yc0VarC);
                    }
                }
                next = cbf.b(arrayList5);
            }
        }
        r9i r9iVar2 = (r9i) next;
        if (linkedHashSet.size() == 1) {
            j7gVarE = (j7g) w44.d1(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new lai(2, this, 0));
            arrayListA.isEmpty();
            if (!arrayListA.isEmpty()) {
                Iterator it6 = arrayListA.iterator();
                if (!it6.hasNext()) {
                    pmf.n("Empty collection can't be reduced.");
                    return null;
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    j7g j7gVar3 = (j7g) it6.next();
                    next2 = (j7g) next2;
                    if (next2 != 0 && j7gVar3 != null) {
                        u9i u9iVarO = next2.O();
                        u9i u9iVarO2 = j7gVar3.O();
                        boolean z = u9iVarO instanceof j79;
                        if (z && (u9iVarO2 instanceof j79)) {
                            Set set = ((j79) u9iVarO).a;
                            Set set2 = ((j79) u9iVarO2).a;
                            set.getClass();
                            set2.getClass();
                            Set setS1 = w44.s1(set);
                            b54.t0(setS1, set2);
                            j79 j79Var = new j79(setS1);
                            r9i.F.getClass();
                            r9i r9iVar3 = r9i.G;
                            r9iVar3.getClass();
                            next2 = yfd.d0(nu6.a(2, true, "unknown integer literal type"), r9iVar3, j79Var, lm6.E, false);
                        } else if (z) {
                            if (((j79) u9iVarO).a.contains(j7gVar3)) {
                                next2 = j7gVar3;
                            }
                        } else if (!(u9iVarO2 instanceof j79) || !((j79) u9iVarO2).a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                j7gVar2 = (j7g) next2;
            }
            if (j7gVar2 != null) {
                j7gVarE = j7gVar2;
            } else {
                c3c.b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new lai(2, b3c.b, 1));
                arrayListA2.isEmpty();
                j7gVarE = arrayListA2.size() < 2 ? (j7g) w44.d1(arrayListA2) : new qa9(linkedHashSet).e();
            }
        }
        return j7gVarE.n0(r9iVar2);
    }
}
