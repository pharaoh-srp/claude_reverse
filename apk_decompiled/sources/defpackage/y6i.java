package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y6i implements Iterator, mm9 {
    public Object[] E = w6i.e.d;
    public int F;
    public int G;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.G < this.F;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
