package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ip0 implements Collection, Set, nm9, an9 {
    public int[] E;
    public Object[] F;
    public int G;

    public ip0(int i) {
        this.E = sf5.b;
        this.F = sf5.d;
        if (i > 0) {
            this.E = new int[i];
            this.F = new Object[i];
        }
    }

    public final Object a(int i) {
        int i2 = this.G;
        Object[] objArr = this.F;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.E;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                mp0.r0(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.F;
                mp0.s0(i, i4, i2, objArr2, objArr2);
            }
            this.F[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.E = iArr2;
            this.F = new Object[i5];
            if (i > 0) {
                mp0.u0(0, i, 6, iArr, iArr2);
                mp0.v0(0, i, 6, objArr, this.F);
            }
            if (i < i3) {
                int i6 = i + 1;
                mp0.r0(i, i6, i2, iArr, this.E);
                mp0.s0(i, i6, i2, objArr, this.F);
            }
        }
        if (i2 == this.G) {
            this.G = i3;
            return obj;
        }
        sz6.c();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iU;
        int i2 = this.G;
        if (obj == null) {
            iU = d4c.U(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iU = d4c.U(this, obj, iHashCode);
        }
        if (iU >= 0) {
            return false;
        }
        int i3 = ~iU;
        int[] iArr = this.E;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.F;
            int[] iArr2 = new int[i4];
            this.E = iArr2;
            this.F = new Object[i4];
            if (i2 != this.G) {
                sz6.c();
                return false;
            }
            if (iArr2.length != 0) {
                mp0.u0(0, iArr.length, 6, iArr, iArr2);
                mp0.v0(0, objArr.length, 6, objArr, this.F);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.E;
            int i5 = i3 + 1;
            mp0.r0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.F;
            mp0.s0(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.G;
        if (i2 == i6) {
            int[] iArr4 = this.E;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.F[i3] = obj;
                this.G = i6 + 1;
                return true;
            }
        }
        sz6.c();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.G;
        int i = this.G;
        int[] iArr = this.E;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.F;
            int[] iArr2 = new int[size];
            this.E = iArr2;
            this.F = new Object[size];
            if (i > 0) {
                mp0.u0(0, i, 6, iArr, iArr2);
                mp0.v0(0, this.G, 6, objArr, this.F);
            }
        }
        if (this.G != i) {
            sz6.c();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.G != 0) {
            this.E = sf5.b;
            this.F = sf5.d;
            this.G = 0;
        }
        if (this.G == 0) {
            return;
        }
        sz6.c();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? d4c.U(this, null, 0) : d4c.U(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.G != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.G;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.F[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.E;
        int i = this.G;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.G <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new hp0(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iU = obj == null ? d4c.U(this, null, 0) : d4c.U(this, obj, obj.hashCode());
        if (iU < 0) {
            return false;
        }
        a(iU);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.G - 1; -1 < i; i--) {
            if (!w44.G0(collection, this.F[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.G;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        Object[] objArrF = vsk.f(this.G, objArr);
        mp0.s0(0, 0, this.G, this.F, objArrF);
        return objArrF;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.G * 14);
        sb.append('{');
        int i = this.G;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.F[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return mp0.y0(this.F, 0, this.G);
    }
}
