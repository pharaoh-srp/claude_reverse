package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nz8 extends cz8 implements List, RandomAccess {
    public static final iz8 F = new iz8(vde.I, 0);

    public static vde m(int i, Object[] objArr) {
        return i == 0 ? vde.I : new vde(i, objArr);
    }

    public static hz8 o() {
        return new hz8(4);
    }

    public static hz8 p(int i) {
        fok.c(i, "expectedSize");
        return new hz8(i);
    }

    public static nz8 q(Collection collection) {
        if (!(collection instanceof cz8)) {
            Object[] array = collection.toArray();
            bvk.e(array.length, array);
            return m(array.length, array);
        }
        nz8 nz8VarA = ((cz8) collection).a();
        if (!nz8VarA.k()) {
            return nz8VarA;
        }
        Object[] array2 = nz8VarA.toArray(cz8.E);
        return m(array2.length, array2);
    }

    public static vde r(Object[] objArr) {
        if (objArr.length == 0) {
            return vde.I;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        bvk.e(objArr2.length, objArr2);
        return m(objArr2.length, objArr2);
    }

    public static vde t(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        bvk.e(5, objArr);
        return m(5, objArr);
    }

    public static vde u(Object obj) {
        Object[] objArr = {obj};
        bvk.e(1, objArr);
        return m(1, objArr);
    }

    public static vde v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        bvk.e(2, objArr);
        return m(2, objArr);
    }

    public static vde w(wjc wjcVar, List list) {
        List list2;
        wjcVar.getClass();
        if (list instanceof Collection) {
            list2 = list;
        } else {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list2 = arrayList;
        }
        Object[] array = list2.toArray();
        bvk.e(array.length, array);
        Arrays.sort(array, wjcVar);
        return m(array.length, array);
    }

    @Override // defpackage.cz8
    public final nz8 a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cz8
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.cz8, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && cvk.l(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (cvk.l(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.cz8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.cz8
    /* JADX INFO: renamed from: l */
    public final efi iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final iz8 listIterator(int i) {
        fd9.J(i, size());
        return isEmpty() ? F : new iz8(this, i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public nz8 subList(int i, int i2) {
        fd9.K(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? vde.I : new jz8(this, i, i3);
    }
}
