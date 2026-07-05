package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class qyk extends qsk implements ayk, lzk, RandomAccess {
    public static final qyk H = new qyk(new long[0], 0, false);
    public long[] F;
    public int G;

    public qyk(long[] jArr, int i, boolean z) {
        super(z);
        this.F = jArr;
        this.G = i;
    }

    public static qyk g() {
        return H;
    }

    public final void a(long j) {
        zza();
        int i = this.G;
        long[] jArr = this.F;
        if (i == jArr.length) {
            long[] jArr2 = new long[grc.m(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.F = jArr2;
        }
        long[] jArr3 = this.F;
        int i2 = this.G;
        this.G = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i < 0 || i > (i2 = this.G)) {
            xh6.j(grc.o(i, this.G, "Index:", ", Size:"));
            return;
        }
        long[] jArr = this.F;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[grc.m(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.F, i, jArr2, i + 1, this.G - i);
            this.F = jArr2;
        }
        this.F[i] = jLongValue;
        this.G++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.qsk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = sxk.a;
        collection.getClass();
        if (!(collection instanceof qyk)) {
            return super.addAll(collection);
        }
        qyk qykVar = (qyk) collection;
        int i = qykVar.G;
        if (i == 0) {
            return false;
        }
        int i2 = this.G;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.F;
        if (i3 > jArr.length) {
            this.F = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(qykVar.F, 0, this.F, this.G, qykVar.G);
        this.G = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long b(int i) {
        h(i);
        return this.F[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.dyk
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final qyk d(int i) {
        if (i >= this.G) {
            return new qyk(Arrays.copyOf(this.F, i), this.G, true);
        }
        mr9.y();
        return null;
    }

    @Override // defpackage.qsk, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyk)) {
            return super.equals(obj);
        }
        qyk qykVar = (qyk) obj;
        if (this.G != qykVar.G) {
            return false;
        }
        long[] jArr = qykVar.F;
        for (int i = 0; i < this.G; i++) {
            if (this.F[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(b(i));
    }

    public final void h(int i) {
        if (i < 0 || i >= this.G) {
            xh6.j(grc.o(i, this.G, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.qsk, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i = 0; i < this.G; i++) {
            iA = (iA * 31) + sxk.a(this.F[i]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.G;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.F[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.qsk, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        h(i);
        long[] jArr = this.F;
        long j = jArr[i];
        if (i < this.G - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.G--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            xh6.j("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.F;
        System.arraycopy(jArr, i2, jArr, i, this.G - i2);
        this.G -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        h(i);
        long[] jArr = this.F;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.G;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        a(((Long) obj).longValue());
        return true;
    }
}
