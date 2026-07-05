package defpackage;

import java.util.AbstractList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wud extends r3 {
    public static final wud H;
    public Object[] F;
    public int G;

    static {
        wud wudVar = new wud(0, new Object[0]);
        H = wudVar;
        wudVar.E = false;
    }

    public wud(int i, Object[] objArr) {
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

    @Override // defpackage.r3
    public final r3 b(int i) {
        if (i >= this.G) {
            return new wud(this.G, Arrays.copyOf(this.F, i));
        }
        mr9.y();
        return null;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.G) {
            mr9.e(this.G, vb7.u("Index:", i, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        e(i);
        return this.F[i];
    }

    @Override // defpackage.r3, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        e(i);
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
        e(i);
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

    @Override // defpackage.r3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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
