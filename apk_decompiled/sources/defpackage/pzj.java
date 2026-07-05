package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pzj extends upj implements List, RandomAccess {
    public static final fyj H = new fyj(e2k.K, 0);

    public static e2k q(int i, Object[] objArr) {
        return i == 0 ? e2k.K : new e2k(i, objArr);
    }

    public static e2k r(Object[] objArr) {
        if (objArr.length == 0) {
            return e2k.K;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i = 0; i < length; i++) {
            if (objArr2[i] == null) {
                mr9.h(grc.p(i, "at index "));
                return null;
            }
        }
        return q(length, objArr2);
    }

    @Override // defpackage.upj
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
    public boolean contains(Object obj) {
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
                        if (yok.l(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                fyj fyjVarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (fyjVarListIterator.hasNext()) {
                        if (!it.hasNext() || !yok.l(fyjVarListIterator.next(), it.next())) {
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

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.upj
    public final efi k() {
        return listIterator(0);
    }

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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public pzj o() {
        return size() <= 1 ? this : new bzj(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public pzj subList(int i, int i2) {
        zok.i(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? e2k.K : new mzj(this, i, i3);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final fyj listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return isEmpty() ? H : new fyj(this, i);
        }
        xh6.j(zok.j(i, size, "index"));
        return null;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
