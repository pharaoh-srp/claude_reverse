package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class z6i implements Iterator, mm9 {
    public Object[] E = x6i.e.d;
    public int F;
    public int G;

    public final void a(Object[] objArr, int i, int i2) {
        this.E = objArr;
        this.F = i;
        this.G = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.G < this.F;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
