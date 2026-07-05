package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class eh6 implements Iterator, mm9 {
    public final /* synthetic */ int E = 0;
    public int F;
    public final Iterator G;

    public eh6(fh6 fh6Var, byte b) {
        this.F = fh6Var.c;
        this.G = fh6Var.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.E;
        Iterator it = this.G;
        switch (i) {
            case 0:
                break;
            default:
                return this.F > 0 && it.hasNext();
        }
        while (this.F > 0 && it.hasNext()) {
            it.next();
            this.F--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.E;
        Iterator it = this.G;
        switch (i) {
            case 0:
                break;
            default:
                int i2 = this.F;
                if (i2 != 0) {
                    this.F = i2 - 1;
                    return it.next();
                }
                pmf.d();
                return null;
        }
        while (this.F > 0 && it.hasNext()) {
            it.next();
            this.F--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public eh6(fh6 fh6Var) {
        this.G = fh6Var.b.iterator();
        this.F = fh6Var.c;
    }
}
