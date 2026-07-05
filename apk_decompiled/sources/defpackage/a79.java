package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a79 implements Iterator, mm9 {
    public final int E;
    public final int F;
    public boolean G;
    public int H;

    public a79(int i, int i2, int i3) {
        this.E = i3;
        this.F = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.G = z;
        this.H = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.G;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.H;
        if (i != this.F) {
            this.H = this.E + i;
            return i;
        }
        if (this.G) {
            this.G = false;
            return i;
        }
        pmf.d();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
