package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class xte extends i2 implements RandomAccess {
    public final Object[] E;
    public final int F;
    public int G;
    public int H;

    public xte(int i, Object[] objArr) {
        this.E = objArr;
        if (i < 0) {
            mr9.q(grc.p(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.F = objArr.length;
            this.H = i;
        } else {
            pmf.f(objArr.length, vb7.u("ring buffer filled size: ", i, " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    public final void a(int i) {
        if (i < 0) {
            mr9.q(grc.p(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > size()) {
            pmf.f(size(), vb7.u("n shouldn't be greater than the buffer size: n = ", i, ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.G;
            int i3 = this.F;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.E;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.G = i4;
            this.H = size() - i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        e2 e2Var = i2.Companion;
        int size = size();
        e2Var.getClass();
        e2.b(i, size);
        return this.E[(this.G + i) % this.F];
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.H;
    }

    @Override // defpackage.i2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new wte(this);
    }

    @Override // defpackage.w0, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int size = size();
        int i = this.G;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr2 = this.E;
            if (i3 >= size || i >= this.F) {
                break;
            }
            objArr[i3] = objArr2[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = objArr2[i2];
            i3++;
            i2++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
