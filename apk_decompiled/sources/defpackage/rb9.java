package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class rb9 extends AbstractList implements RandomAccess, Serializable {
    public final int[] E;
    public final int F;
    public final int G;

    public rb9(int i, int i2, int[] iArr) {
        this.E = iArr;
        this.F = i;
        this.G = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.F;
        while (true) {
            if (i >= this.G) {
                i = -1;
                break;
            }
            if (this.E[i] == iIntValue) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rb9)) {
            return super.equals(obj);
        }
        rb9 rb9Var = (rb9) obj;
        int size = size();
        if (rb9Var.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.E[this.F + i] != rb9Var.E[rb9Var.F + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        fd9.G(i, size());
        return Integer.valueOf(this.E[this.F + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.F; i2 < this.G; i2++) {
            i = (i * 31) + this.E[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i = this.F;
            int i2 = i;
            while (true) {
                if (i2 >= this.G) {
                    i2 = -1;
                    break;
                }
                if (this.E[i2] == iIntValue) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.G;
            while (true) {
                i2--;
                i = this.F;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (this.E[i2] == iIntValue) {
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        fd9.G(i, size());
        int i2 = this.F + i;
        int[] iArr = this.E;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.G - this.F;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        fd9.K(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.F;
        return new rb9(i + i3, i3 + i2, this.E);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.E;
        int i = this.F;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.G) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
