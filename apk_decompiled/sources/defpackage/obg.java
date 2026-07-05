package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class obg implements Iterator {
    public boolean E;
    public final int F;
    public final /* synthetic */ pbg G;

    public obg(pbg pbgVar) {
        this.G = pbgVar;
        this.F = ((AbstractList) pbgVar).modCount;
    }

    public final void a() {
        pbg pbgVar = this.G;
        int i = ((AbstractList) pbgVar).modCount;
        int i2 = this.F;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) pbgVar).modCount + "; expected: " + i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.E;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.E) {
            pmf.d();
            return null;
        }
        this.E = true;
        a();
        return this.G.F;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.G.clear();
    }
}
