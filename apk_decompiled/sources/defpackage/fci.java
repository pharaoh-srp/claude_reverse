package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class fci implements Iterator, mm9 {
    public final /* synthetic */ int E;
    public int F;
    public final Object G;

    public /* synthetic */ fci(int i, Object obj) {
        this.E = i;
        this.G = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 0:
                if (this.F < ((byte[]) obj).length) {
                }
                break;
            case 1:
                if (this.F < ((int[]) obj).length) {
                }
                break;
            case 2:
                if (this.F < ((long[]) obj).length) {
                }
                break;
            default:
                if (this.F < ((short[]) obj).length) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                byte[] bArr = (byte[]) obj;
                if (i2 >= bArr.length) {
                    pmf.h(String.valueOf(i2));
                } else {
                    this.F = i2 + 1;
                }
                break;
            case 1:
                int i3 = this.F;
                int[] iArr = (int[]) obj;
                if (i3 >= iArr.length) {
                    pmf.h(String.valueOf(i3));
                } else {
                    this.F = i3 + 1;
                }
                break;
            case 2:
                int i4 = this.F;
                long[] jArr = (long[]) obj;
                if (i4 >= jArr.length) {
                    pmf.h(String.valueOf(i4));
                } else {
                    this.F = i4 + 1;
                }
                break;
            default:
                int i5 = this.F;
                short[] sArr = (short[]) obj;
                if (i5 >= sArr.length) {
                    pmf.h(String.valueOf(i5));
                } else {
                    this.F = i5 + 1;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
