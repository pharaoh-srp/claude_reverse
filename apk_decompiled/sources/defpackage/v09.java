package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class v09 implements Iterator, mm9 {
    public int E;
    public int F;
    public boolean G;

    public v09(int i) {
        this.E = i;
    }

    public abstract Object a(int i);

    public abstract void c(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.F < this.E;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        Object objA = a(this.F);
        this.F++;
        this.G = true;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.G) {
            gtk.g("Call next() before removing an element.");
            throw null;
        }
        int i = this.F - 1;
        this.F = i;
        c(i);
        this.E--;
        this.G = false;
    }
}
