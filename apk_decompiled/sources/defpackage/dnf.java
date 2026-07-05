package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dnf implements Iterator, mm9 {
    public final /* synthetic */ int E;
    public final Object F;
    public boolean G = true;

    public /* synthetic */ dnf(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.E) {
        }
        return this.G;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                if (!this.G) {
                    pmf.d();
                } else {
                    this.G = false;
                }
                break;
            case 1:
                if (!this.G) {
                    pmf.d();
                } else {
                    this.G = false;
                }
                break;
            default:
                if (!this.G) {
                    pmf.d();
                } else {
                    this.G = false;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
