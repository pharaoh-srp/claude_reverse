package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class al7 implements Iterator, mm9 {
    public final Iterator E;
    public int F = -1;
    public Object G;
    public final /* synthetic */ bl7 H;

    public al7(bl7 bl7Var) {
        this.H = bl7Var;
        this.E = bl7Var.a.iterator();
    }

    public final void a() {
        Object next;
        bl7 bl7Var;
        do {
            Iterator it = this.E;
            if (!it.hasNext()) {
                this.F = 0;
                return;
            } else {
                next = it.next();
                bl7Var = this.H;
            }
        } while (((Boolean) bl7Var.c.invoke(next)).booleanValue() != bl7Var.b);
        this.G = next;
        this.F = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.F == -1) {
            a();
        }
        return this.F == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.F == -1) {
            a();
        }
        if (this.F == 0) {
            pmf.d();
            return null;
        }
        Object obj = this.G;
        this.G = null;
        this.F = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
