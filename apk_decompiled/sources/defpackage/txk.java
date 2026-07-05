package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class txk extends qsk implements byk, lzk, RandomAccess {
    public static final txk H = new txk(new int[0], 0, false);
    public int[] F;
    public int G;

    public txk(int[] iArr, int i, boolean z) {
        super(z);
        this.F = iArr;
        this.G = i;
    }

    public final int a(int i) {
        e(i);
        return this.F[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i < 0 || i > (i2 = this.G)) {
            xh6.j(grc.o(i, this.G, "Index:", ", Size:"));
            return;
        }
        int[] iArr = this.F;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[grc.m(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.F, i, iArr2, i + 1, this.G - i);
            this.F = iArr2;
        }
        this.F[i] = iIntValue;
        this.G++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.qsk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = sxk.a;
        collection.getClass();
        if (!(collection instanceof txk)) {
            return super.addAll(collection);
        }
        txk txkVar = (txk) collection;
        int i = txkVar.G;
        if (i == 0) {
            return false;
        }
        int i2 = this.G;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.F;
        if (i3 > iArr.length) {
            this.F = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(txkVar.F, 0, this.F, this.G, txkVar.G);
        this.G = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        zza();
        int i2 = this.G;
        int[] iArr = this.F;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[grc.m(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.F = iArr2;
        }
        int[] iArr3 = this.F;
        int i3 = this.G;
        this.G = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.dyk
    public final dyk d(int i) {
        if (i >= this.G) {
            return new txk(Arrays.copyOf(this.F, i), this.G, true);
        }
        mr9.y();
        return null;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.G) {
            xh6.j(grc.o(i, this.G, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.qsk, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txk)) {
            return super.equals(obj);
        }
        txk txkVar = (txk) obj;
        if (this.G != txkVar.G) {
            return false;
        }
        int[] iArr = txkVar.F;
        for (int i = 0; i < this.G; i++) {
            if (this.F[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(a(i));
    }

    @Override // defpackage.qsk, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.G; i2++) {
            i = (i * 31) + this.F[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.G;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.F[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.qsk, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        e(i);
        int[] iArr = this.F;
        int i2 = iArr[i];
        if (i < this.G - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.G--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            xh6.j("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.F;
        System.arraycopy(iArr, i2, iArr, i, this.G - i2);
        this.G -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        e(i);
        int[] iArr = this.F;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.G;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}
