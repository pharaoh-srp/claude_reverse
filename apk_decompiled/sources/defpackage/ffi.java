package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ffi implements ListIterator {
    public final /* synthetic */ int E;
    public ListIterator F;

    public ffi(ifi ifiVar, int i) {
        this.E = 1;
        this.F = ifiVar.E.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.E) {
        }
        return this.F.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.E) {
        }
        return this.F.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.E) {
        }
        return (String) this.F.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.E) {
        }
        return this.F.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.E) {
        }
        return (String) this.F.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.E) {
        }
        return this.F.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ ffi(int i) {
        this.E = i;
    }
}
