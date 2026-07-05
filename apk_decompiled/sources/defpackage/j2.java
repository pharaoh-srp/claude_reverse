package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j2 implements ListIterator, mm9 {
    public int E;
    public int F;

    public j2(int i, int i2) {
        this.E = i;
        this.F = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.E < this.F;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.E > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.E;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.E - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
