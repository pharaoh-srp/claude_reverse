package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class clk extends l8k implements RandomAccess {
    public static final Object[] H;
    public static final clk I;
    public Object[] F;
    public int G;

    static {
        Object[] objArr = new Object[0];
        H = objArr;
        I = new clk(objArr, 0, false);
    }

    public clk(Object[] objArr, int i, boolean z) {
        super(z);
        this.F = objArr;
        this.G = i;
    }

    public static clk e() {
        return I;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.G)) {
            xh6.j(grc.o(i, this.G, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.F;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.F, 0, objArr2, 0, i);
            System.arraycopy(this.F, i, objArr2, i3, this.G - i);
            this.F = objArr2;
        }
        this.F[i] = obj;
        this.G++;
        ((AbstractList) this).modCount++;
    }

    public final void g(int i) {
        if (i < 0 || i >= this.G) {
            xh6.j(grc.o(i, this.G, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g(i);
        return this.F[i];
    }

    @Override // defpackage.xek
    public final /* bridge */ /* synthetic */ xek n(int i) {
        if (i >= this.G) {
            return new clk(i == 0 ? H : Arrays.copyOf(this.F, i), this.G, true);
        }
        mr9.y();
        return null;
    }

    @Override // defpackage.l8k, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        g(i);
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
        zza();
        g(i);
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
        zza();
        int i = this.G;
        int length = this.F.length;
        if (i == length) {
            this.F = Arrays.copyOf(this.F, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.F;
        int i2 = this.G;
        this.G = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
