package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class g2 extends f2 implements ListIterator {
    public final /* synthetic */ i2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(i2 i2Var, int i) {
        super(i2Var);
        this.H = i2Var;
        e2 e2Var = i2.Companion;
        int size = i2Var.size();
        e2Var.getClass();
        e2.c(i, size);
        this.F = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.F > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.F;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            pmf.d();
            return null;
        }
        int i = this.F - 1;
        this.F = i;
        return this.H.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.F - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
