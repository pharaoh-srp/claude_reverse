package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qo0 extends f3 {
    public static final Object[] H = new Object[0];
    public int E;
    public Object[] F;
    public int G;

    public qo0(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = H;
        } else {
            if (i <= 0) {
                sz6.p(grc.p(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.F = objArr;
    }

    public final void a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.F.length;
        while (i < length && it.hasNext()) {
            this.F[i] = it.next();
            i++;
        }
        int i2 = this.E;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.F[i3] = it.next();
        }
        this.G = collection.size() + size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        e2 e2Var = i2.Companion;
        int size = size();
        e2Var.getClass();
        e2.c(i, size);
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        p();
        e(size() + 1);
        int iO = o(this.E + i);
        if (i < ((size() + 1) >> 1)) {
            if (iO == 0) {
                Object[] objArr = this.F;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iO - 1;
            }
            int length2 = this.E;
            if (length2 == 0) {
                Object[] objArr2 = this.F;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i2 = length2 - 1;
            int i3 = this.E;
            Object[] objArr3 = this.F;
            if (length >= i3) {
                objArr3[i2] = objArr3[i3];
                mp0.s0(i3, i3 + 1, length + 1, objArr3, objArr3);
            } else {
                mp0.s0(i3 - 1, i3, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.F;
                objArr4[objArr4.length - 1] = objArr4[0];
                mp0.s0(0, 1, length + 1, objArr4, objArr4);
            }
            this.F[length] = obj;
            this.E = i2;
        } else {
            int iO2 = o(size() + this.E);
            Object[] objArr5 = this.F;
            if (iO < iO2) {
                mp0.s0(iO + 1, iO, iO2, objArr5, objArr5);
            } else {
                mp0.s0(1, 0, iO2, objArr5, objArr5);
                Object[] objArr6 = this.F;
                objArr6[0] = objArr6[objArr6.length - 1];
                mp0.s0(iO + 1, iO, objArr6.length - 1, objArr6, objArr6);
            }
            this.F[iO] = obj;
        }
        this.G = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        e2 e2Var = i2.Companion;
        int size = size();
        e2Var.getClass();
        e2.c(i, size);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        p();
        e(collection.size() + size());
        int iO = o(size() + this.E);
        int iO2 = o(this.E + i);
        int size2 = collection.size();
        if (i >= ((size() + 1) >> 1)) {
            int i2 = iO2 + size2;
            Object[] objArr = this.F;
            if (iO2 < iO) {
                int i3 = size2 + iO;
                if (i3 <= objArr.length) {
                    mp0.s0(i2, iO2, iO, objArr, objArr);
                } else if (i2 >= objArr.length) {
                    mp0.s0(i2 - objArr.length, iO2, iO, objArr, objArr);
                } else {
                    int length = iO - (i3 - objArr.length);
                    mp0.s0(0, length, iO, objArr, objArr);
                    Object[] objArr2 = this.F;
                    mp0.s0(i2, iO2, length, objArr2, objArr2);
                }
            } else {
                mp0.s0(size2, 0, iO, objArr, objArr);
                Object[] objArr3 = this.F;
                if (i2 >= objArr3.length) {
                    mp0.s0(i2 - objArr3.length, iO2, objArr3.length, objArr3, objArr3);
                } else {
                    mp0.s0(0, objArr3.length - size2, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.F;
                    mp0.s0(i2, iO2, objArr4.length - size2, objArr4, objArr4);
                }
            }
            a(iO2, collection);
            return true;
        }
        int i4 = this.E;
        int length2 = i4 - size2;
        Object[] objArr5 = this.F;
        if (iO2 < i4) {
            mp0.s0(length2, i4, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.F;
            if (size2 >= iO2) {
                mp0.s0(objArr6.length - size2, 0, iO2, objArr6, objArr6);
            } else {
                mp0.s0(objArr6.length - size2, 0, size2, objArr6, objArr6);
                Object[] objArr7 = this.F;
                mp0.s0(0, size2, iO2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            mp0.s0(length2, i4, iO2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i5 = iO2 - i4;
            int length3 = objArr5.length - length2;
            if (length3 >= i5) {
                mp0.s0(length2, i4, iO2, objArr5, objArr5);
            } else {
                mp0.s0(length2, i4, i4 + length3, objArr5, objArr5);
                Object[] objArr8 = this.F;
                mp0.s0(0, this.E + length3, iO2, objArr8, objArr8);
            }
        }
        this.E = length2;
        a(l(iO2 - size2), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        p();
        e(size() + 1);
        int length = this.E;
        if (length == 0) {
            Object[] objArr = this.F;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.E = i;
        this.F[i] = obj;
        this.G = size() + 1;
    }

    public final void addLast(Object obj) {
        p();
        e(size() + 1);
        this.F[o(size() + this.E)] = obj;
        this.G = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            p();
            m(this.E, o(size() + this.E));
        }
        this.E = 0;
        this.G = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i) {
        if (i < 0) {
            sz6.j("Deque is too big.");
            return;
        }
        Object[] objArr = this.F;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == H) {
            if (i < 10) {
                i = 10;
            }
            this.F = new Object[i];
            return;
        }
        e2 e2Var = i2.Companion;
        int length = objArr.length;
        e2Var.getClass();
        Object[] objArr2 = new Object[e2.e(length, i)];
        Object[] objArr3 = this.F;
        mp0.s0(0, this.E, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.F;
        int length2 = objArr4.length;
        int i2 = this.E;
        mp0.s0(length2 - i2, 0, i2, objArr4, objArr2);
        this.E = 0;
        this.F = objArr2;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.F[this.E];
        }
        pmf.h("ArrayDeque is empty.");
        return null;
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.F[this.E];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        e2 e2Var = i2.Companion;
        int size = size();
        e2Var.getClass();
        e2.b(i, size);
        return this.F[o(this.E + i)];
    }

    @Override // defpackage.f3
    public final int getSize() {
        return this.G;
    }

    public final int h(int i) {
        this.F.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iO = o(size() + this.E);
        int length = this.E;
        if (length < iO) {
            while (length < iO) {
                if (x44.r(obj, this.F[length])) {
                    i = this.E;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.E) < iO) {
            return -1;
        }
        int length2 = this.F.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iO; i2++) {
                    if (x44.r(obj, this.F[i2])) {
                        length = i2 + this.F.length;
                        i = this.E;
                    }
                }
                return -1;
            }
            if (x44.r(obj, this.F[length])) {
                i = this.E;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object k() {
        if (isEmpty()) {
            return null;
        }
        return this.F[o((size() - 1) + this.E)];
    }

    public final int l(int i) {
        return i < 0 ? i + this.F.length : i;
    }

    public final Object last() {
        if (isEmpty()) {
            pmf.h("ArrayDeque is empty.");
            return null;
        }
        return this.F[o((size() - 1) + this.E)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iO = o(size() + this.E);
        int i2 = this.E;
        if (i2 < iO) {
            length = iO - 1;
            if (i2 <= length) {
                while (!x44.r(obj, this.F[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.E;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.E >= iO) {
            while (true) {
                iO--;
                Object[] objArr = this.F;
                if (-1 >= iO) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.E;
                    if (i3 <= length) {
                        while (!x44.r(obj, this.F[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.E;
                    }
                } else if (x44.r(obj, objArr[iO])) {
                    length = iO + this.F.length;
                    i = this.E;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    public final void m(int i, int i2) {
        Object[] objArr = this.F;
        if (i < i2) {
            mp0.z0(i, i2, null, objArr);
        } else {
            mp0.z0(i, objArr.length, null, objArr);
            mp0.z0(0, i2, null, this.F);
        }
    }

    public final int o(int i) {
        Object[] objArr = this.F;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void p() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iO;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.F.length != 0) {
            int iO2 = o(size() + this.E);
            int i = this.E;
            if (i < iO2) {
                iO = i;
                while (true) {
                    objArr = this.F;
                    if (i >= iO2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.F[iO] = obj;
                        iO++;
                    }
                    i++;
                }
                mp0.z0(iO, iO2, null, objArr);
            } else {
                int length = this.F.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.F;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.F[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iO = o(i2);
                for (int i3 = 0; i3 < iO2; i3++) {
                    Object[] objArr3 = this.F;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.F[iO] = obj3;
                        iO = h(iO);
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.G = l(iO - this.E);
            }
        }
        return z;
    }

    @Override // defpackage.f3
    public final Object removeAt(int i) {
        e2 e2Var = i2.Companion;
        int size = size();
        e2Var.getClass();
        e2.b(i, size);
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        p();
        int iO = o(this.E + i);
        Object obj = this.F[iO];
        int size2 = size() >> 1;
        int i2 = this.E;
        if (i < size2) {
            Object[] objArr = this.F;
            if (iO >= i2) {
                mp0.s0(i2 + 1, i2, iO, objArr, objArr);
            } else {
                mp0.s0(1, 0, iO, objArr, objArr);
                Object[] objArr2 = this.F;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i3 = this.E;
                mp0.s0(i3 + 1, i3, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.F;
            int i4 = this.E;
            objArr3[i4] = null;
            this.E = h(i4);
        } else {
            int iO2 = o((size() - 1) + i2);
            Object[] objArr4 = this.F;
            if (iO <= iO2) {
                mp0.s0(iO, iO + 1, iO2 + 1, objArr4, objArr4);
            } else {
                mp0.s0(iO, iO + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.F;
                objArr5[objArr5.length - 1] = objArr5[0];
                mp0.s0(0, 1, iO2 + 1, objArr5, objArr5);
            }
            this.F[iO2] = null;
        }
        this.G = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            pmf.h("ArrayDeque is empty.");
            return null;
        }
        p();
        Object[] objArr = this.F;
        int i = this.E;
        Object obj = objArr[i];
        objArr[i] = null;
        this.E = h(i);
        this.G = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            pmf.h("ArrayDeque is empty.");
            return null;
        }
        p();
        int iO = o((size() - 1) + this.E);
        Object[] objArr = this.F;
        Object obj = objArr[iO];
        objArr[iO] = null;
        this.G = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        e2 e2Var = i2.Companion;
        int size = size();
        e2Var.getClass();
        e2.d(i, i2, size);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            removeAt(i);
            return;
        }
        p();
        int size2 = size() - i2;
        int i4 = this.E;
        if (i < size2) {
            int iO = o((i - 1) + i4);
            int iO2 = o(this.E + (i2 - 1));
            while (i > 0) {
                int i5 = iO + 1;
                int iMin = Math.min(i, Math.min(i5, iO2 + 1));
                Object[] objArr = this.F;
                int i6 = iO2 - iMin;
                int i7 = iO - iMin;
                mp0.s0(i6 + 1, i7 + 1, i5, objArr, objArr);
                iO = l(i7);
                iO2 = l(i6);
                i -= iMin;
            }
            int iO3 = o(this.E + i3);
            m(this.E, iO3);
            this.E = iO3;
        } else {
            int iO4 = o(i4 + i2);
            int iO5 = o(this.E + i);
            int size3 = size();
            while (true) {
                size3 -= i2;
                if (size3 <= 0) {
                    break;
                }
                Object[] objArr2 = this.F;
                i2 = Math.min(size3, Math.min(objArr2.length - iO4, objArr2.length - iO5));
                Object[] objArr3 = this.F;
                int i8 = iO4 + i2;
                mp0.s0(iO5, iO4, i8, objArr3, objArr3);
                iO4 = o(i8);
                iO5 = o(iO5 + i2);
            }
            int iO6 = o(size() + this.E);
            m(l(iO6 - i3), iO6);
        }
        this.G = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iO;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.F.length != 0) {
            int iO2 = o(size() + this.E);
            int i = this.E;
            if (i < iO2) {
                iO = i;
                while (true) {
                    objArr = this.F;
                    if (i >= iO2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.F[iO] = obj;
                        iO++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                mp0.z0(iO, iO2, null, objArr);
            } else {
                int length = this.F.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.F;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.F[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iO = o(i2);
                for (int i3 = 0; i3 < iO2; i3++) {
                    Object[] objArr3 = this.F;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.F[iO] = obj3;
                        iO = h(iO);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.G = l(iO - this.E);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        e2 e2Var = i2.Companion;
        int size = size();
        e2Var.getClass();
        e2.b(i, size);
        int iO = o(this.E + i);
        Object[] objArr = this.F;
        Object obj2 = objArr[iO];
        objArr[iO] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        if (objArr.length < size()) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size());
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iO = o(size() + this.E);
        int i = this.E;
        if (i < iO) {
            mp0.v0(i, iO, 2, this.F, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.F;
            mp0.s0(0, this.E, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.F;
            mp0.s0(objArr3.length - this.E, 0, iO, objArr3, objArr);
        }
        int size = size();
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    public qo0() {
        this.F = H;
    }

    public qo0(mva mvaVar) {
        Object[] array = mvaVar.toArray(new Object[0]);
        this.F = array;
        this.G = array.length;
        if (array.length == 0) {
            this.F = H;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        p();
        e(collection.size() + size());
        a(o(size() + this.E), collection);
        return true;
    }
}
