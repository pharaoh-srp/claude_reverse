package defpackage;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class w44 extends b54 {
    public static final int B0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbU = vb7.u("Element index ", i, " must be in range [");
        sbU.append(new b79(0, list.size() - 1, 1));
        sbU.append("].");
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public static final int C0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbU = vb7.u("Position index ", i, " must be in range [");
        sbU.append(new b79(0, list.size(), 1));
        sbU.append("].");
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public static mva D0(List list) {
        list.getClass();
        return new mva(list);
    }

    public static c54 E0(Iterable iterable) {
        iterable.getClass();
        return new c54(0, iterable);
    }

    public static ArrayList F0(Iterable iterable, int i) {
        iterable.getClass();
        tvj.c(i, i);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itG = tvj.g(iterable.iterator(), i, i);
            while (itG.hasNext()) {
                arrayList.add((List) itG.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static boolean G0(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : P0(iterable, obj) >= 0;
    }

    public static List H0(Iterable iterable) {
        iterable.getClass();
        return p1(s1(iterable));
    }

    public static List I0(Iterable iterable, int i) {
        ArrayList arrayList;
        iterable.getClass();
        if (i < 0) {
            mr9.q(grc.u("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return p1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return lm6.E;
            }
            if (size == 1) {
                return x44.W(T0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return x44.b0(arrayList);
    }

    public static List J0(int i, List list) {
        list.getClass();
        if (i < 0) {
            mr9.q(grc.u("Requested element count ", i, " is less than zero."));
            return null;
        }
        List list2 = list;
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return j1(list2, size);
    }

    public static Object K0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return L0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        pmf.h("Collection is empty.");
        return null;
    }

    public static Object L0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        pmf.h("List is empty.");
        return null;
    }

    public static Object M0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object N0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object O0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int P0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                x44.n0();
                throw null;
            }
            if (x44.r(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void Q0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, bz7 bz7Var) throws IOException {
        iterable.getClass();
        appendable.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        appendable.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                appendable.append(charSequence);
            }
            csg.m(appendable, obj, bz7Var);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void R0(Iterable iterable, StringBuilder sb, String str, String str2, String str3, bz7 bz7Var, int i) throws IOException {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 64) != 0) {
            bz7Var = null;
        }
        Q0(iterable, sb, str, str2, str3, "...", bz7Var);
    }

    public static String S0(Iterable iterable, CharSequence charSequence, String str, String str2, bz7 bz7Var, int i) throws IOException {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            bz7Var = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        Q0(iterable, sb, charSequence2, str3, str4, "...", bz7Var);
        return sb.toString();
    }

    public static Object T0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return U0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            pmf.h("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object U0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        pmf.h("List is empty.");
        return null;
    }

    public static Object V0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable W0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList X0(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(x44.y(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && x44.r(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList Y0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return a1((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        b54.t0(arrayList, iterable);
        b54.t0(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList Z0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return b1((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        b54.t0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList a1(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            b54.t0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList b1(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List c1(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return p1(iterable);
        }
        List listR1 = r1(iterable);
        Collections.reverse(listR1);
        return listR1;
    }

    public static Object d1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return e1((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            pmf.h("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        sz6.p("Collection has more than one element.");
        return null;
    }

    public static Object e1(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            pmf.h("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        sz6.p("List has more than one element.");
        return null;
    }

    public static Object f1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object g1(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List h1(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listR1 = r1(iterable);
            a54.r0(listR1);
            return listR1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return p1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return mp0.l0(array);
    }

    public static List i1(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listR1 = r1(iterable);
            a54.s0(listR1, comparator);
            return listR1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return p1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List j1(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            mr9.q(grc.u("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return lm6.E;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return p1(iterable);
            }
            if (i == 1) {
                return x44.W(K0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return x44.b0(arrayList);
    }

    public static List k1(int i, List list) {
        list.getClass();
        if (i < 0) {
            mr9.q(grc.u("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return lm6.E;
        }
        int size = list.size();
        if (i >= size) {
            return p1(list);
        }
        if (i == 1) {
            return x44.W(U0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] l1(Collection collection) {
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void m1(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] n1(List list) {
        list.getClass();
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] o1(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List p1(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return x44.b0(r1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return lm6.E;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return x44.W(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList q1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List r1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m1(iterable, arrayList);
        return arrayList;
    }

    public static Set s1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set t1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return sf5.f0(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(tta.d0(collection.size()));
                m1(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : sf5.f0(linkedHashSet2.iterator().next());
            }
        }
        return um6.E;
    }

    public static c19 u1(Iterable iterable) {
        iterable.getClass();
        return new c19(0, new p7(14, iterable));
    }

    public static ArrayList v1(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(x44.y(iterable, 10), x44.y(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new cpc(it.next(), it2.next()));
        }
        return arrayList;
    }
}
