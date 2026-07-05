package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class x1 implements Iterator, mm9 {
    public int E;
    public Object F;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.E;
        if (i == 0) {
            this.E = 3;
            a();
            return this.E == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        sz6.p("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.E;
        if (i == 1) {
            this.E = 0;
            return this.F;
        }
        if (i != 2) {
            this.E = 3;
            a();
            if (this.E == 1) {
                this.E = 0;
                return this.F;
            }
        }
        pmf.d();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
