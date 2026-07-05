package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class dek extends l8k implements RandomAccess, tek {
    public static final int[] H;
    public static final dek I;
    public int[] F;
    public int G;

    static {
        int[] iArr = new int[0];
        H = iArr;
        I = new dek(iArr, 0, false);
    }

    public dek(int[] iArr, int i, boolean z) {
        super(z);
        this.F = iArr;
        this.G = i;
    }

    public static dek g() {
        return I;
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
        int i3 = i + 1;
        int[] iArr = this.F;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.F, 0, iArr2, 0, i);
            System.arraycopy(this.F, i, iArr2, i3, this.G - i);
            this.F = iArr2;
        }
        this.F[i] = iIntValue;
        this.G++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.l8k, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = kfk.a;
        collection.getClass();
        if (!(collection instanceof dek)) {
            return super.addAll(collection);
        }
        dek dekVar = (dek) collection;
        int i = dekVar.G;
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
        System.arraycopy(dekVar.F, 0, this.F, this.G, dekVar.G);
        this.G = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i) {
        l(i);
        return this.F[i];
    }

    @Override // defpackage.l8k, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dek)) {
            return super.equals(obj);
        }
        dek dekVar = (dek) obj;
        if (this.G != dekVar.G) {
            return false;
        }
        int[] iArr = dekVar.F;
        for (int i = 0; i < this.G; i++) {
            if (this.F[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        l(i);
        return Integer.valueOf(this.F[i]);
    }

    public final void h(int i) {
        zza();
        int i2 = this.G;
        int length = this.F.length;
        if (i2 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.F, 0, iArr, 0, this.G);
            this.F = iArr;
        }
        int[] iArr2 = this.F;
        int i3 = this.G;
        this.G = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // defpackage.l8k, java.util.AbstractList, java.util.Collection, java.util.List
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

    public final void k(int i) {
        int length = this.F.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.F = new int[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.F = Arrays.copyOf(this.F, length);
    }

    public final void l(int i) {
        if (i < 0 || i >= this.G) {
            xh6.j(grc.o(i, this.G, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.xek
    public final /* bridge */ /* synthetic */ xek n(int i) {
        if (i >= this.G) {
            return new dek(i == 0 ? H : Arrays.copyOf(this.F, i), this.G, true);
        }
        mr9.y();
        return null;
    }

    @Override // defpackage.l8k, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        l(i);
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
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        l(i);
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
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
