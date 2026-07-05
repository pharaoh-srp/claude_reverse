package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class uud extends p3 implements RandomAccess {
    public static final uud H = new uud(new Object[0], 0, false);
    public Object[] F;
    public int G;

    public uud(Object[] objArr, int i, boolean z) {
        this.E = z;
        this.F = objArr;
        this.G = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.G)) {
            mr9.e(this.G, vb7.u("Index:", i, ", Size:"));
            return;
        }
        Object[] objArr = this.F;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[grc.m(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.F, i, objArr2, i + 1, this.G - i);
            this.F = objArr2;
        }
        this.F[i] = obj;
        this.G++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.G) {
            mr9.e(this.G, vb7.u("Index:", i, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.F[i];
    }

    @Override // defpackage.o89
    public final o89 j(int i) {
        if (i >= this.G) {
            return new uud(Arrays.copyOf(this.F, i), this.G, true);
        }
        mr9.y();
        return null;
    }

    @Override // defpackage.p3, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.F;
        Object obj = objArr[i];
        if (i < this.G - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.G--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.F;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.G;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.G;
        Object[] objArr = this.F;
        if (i == objArr.length) {
            this.F = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.F;
        int i2 = this.G;
        this.G = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
