package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class fse implements ListIterator, mm9 {
    public final ListIterator E;
    public final /* synthetic */ mva F;

    public fse(mva mvaVar, int i) {
        this.F = mvaVar;
        this.E = ((List) mvaVar.F).listIterator(w44.C0(i, mvaVar));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.E.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.E.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.E.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return (this.F.size() - 1) - this.E.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.E.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.F.size() - 1) - this.E.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
