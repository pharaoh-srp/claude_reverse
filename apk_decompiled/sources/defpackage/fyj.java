package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class fyj extends efi implements ListIterator {
    public final int F;
    public int G;
    public final pzj H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyj(pzj pzjVar, int i) {
        super(3);
        int size = pzjVar.size();
        if (i < 0 || i > size) {
            xh6.j(zok.j(i, size, "index"));
            throw null;
        }
        this.F = size;
        this.G = i;
        this.H = pzjVar;
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
