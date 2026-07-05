package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class veg implements Iterator, mm9 {
    public final sag E;
    public final int F;
    public final fwj G;
    public final int H;
    public int I;

    public veg(sag sagVar, int i, g18 g18Var, fwj fwjVar) {
        this.E = sagVar;
        this.F = i;
        this.G = fwjVar;
        this.H = sagVar.L;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
