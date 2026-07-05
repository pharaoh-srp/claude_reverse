package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class db8 implements Iterator, mm9 {
    public final sag E;
    public final int F;
    public int G;
    public final int H;

    public db8(sag sagVar, int i, int i2) {
        this.E = sagVar;
        this.F = i2;
        this.G = i;
        this.H = sagVar.L;
        if (sagVar.K) {
            uag.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.G < this.F;
    }

    @Override // java.util.Iterator
    public final Object next() {
        sag sagVar = this.E;
        int i = sagVar.L;
        int i2 = this.H;
        if (i != i2) {
            uag.f();
        }
        int i3 = this.G;
        this.G = sagVar.E[(i3 * 5) + 3] + i3;
        return new tag(sagVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
