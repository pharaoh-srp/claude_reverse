package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class zmf implements Iterator, tp4, mm9 {
    public int E;
    public Object F;
    public tp4 G;

    public final RuntimeException a() {
        int i = this.E;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.E);
    }

    public final void c(tp4 tp4Var) {
        this.G = tp4Var;
    }

    public final void d(tp4 tp4Var, Object obj) {
        this.F = obj;
        this.E = 3;
        this.G = tp4Var;
        tp4Var.getClass();
    }

    @Override // defpackage.tp4
    public final c45 getContext() {
        return im6.E;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.E;
            if (i != 0) {
                break;
            }
            this.E = 5;
            tp4 tp4Var = this.G;
            tp4Var.getClass();
            this.G = null;
            tp4Var.resumeWith(iei.a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.E;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            pmf.d();
            return null;
        }
        if (i == 2) {
            this.E = 1;
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.E = 0;
        Object obj = this.F;
        this.F = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.tp4
    public final void resumeWith(Object obj) {
        sf5.h0(obj);
        this.E = 4;
    }
}
