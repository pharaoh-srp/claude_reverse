package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class iz8 extends efi implements ListIterator {
    public final int F;
    public int G;
    public final nz8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz8(nz8 nz8Var, int i) {
        super(0);
        int size = nz8Var.size();
        fd9.J(i, size);
        this.F = size;
        this.G = i;
        this.H = nz8Var;
    }

    public final Object a(int i) {
        return this.H.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.G < this.F;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.G > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        int i = this.G;
        this.G = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.G;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            pmf.d();
            return null;
        }
        int i = this.G - 1;
        this.G = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.G - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
