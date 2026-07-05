package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class txj extends hxj implements List, RandomAccess {
    public static final kxj F = new kxj(szj.I, 0);

    public static szj m(int i, Object[] objArr) {
        return i == 0 ? szj.I : new szj(i, objArr);
    }

    public static txj o(ArrayList arrayList) {
        Object[] array = arrayList.toArray();
        int length = array.length;
        kpk.k(length, array);
        return m(length, array);
    }

    public static szj p() {
        return szj.I;
    }

    public static szj q() {
        Object[] objArr = {"inapp"};
        kpk.k(1, objArr);
        return m(1, objArr);
    }

    public static szj r() {
        Object[] objArr = {"subs", "inapp"};
        kpk.k(2, objArr);
        return m(2, objArr);
    }

    @Override // defpackage.hxj
    public int a(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                kxj kxjVarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (kxjVarListIterator.hasNext()) {
                        if (!it.hasNext() || !Objects.equals(kxjVarListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.hxj
    public final txj g() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: l */
    public txj subList(int i, int i2) {
        yvj.d(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? szj.I : new oxj(this, i, i3);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final kxj listIterator(int i) {
        yvj.c(i, size());
        return isEmpty() ? F : new kxj(this, i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
