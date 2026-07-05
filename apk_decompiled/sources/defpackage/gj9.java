package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class gj9 implements Iterator, Cloneable {
    public final bi9 E;
    public final Object[] F;
    public int G;

    public gj9(bi9 bi9Var, Object[] objArr, int i) {
        this.E = bi9Var;
        this.F = objArr;
        this.G = i;
    }

    public final Object clone() {
        return new gj9(this.E, this.F, this.G);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.G < this.F.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.G;
        this.G = i + 1;
        return this.F[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
