package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f2 implements Iterator, mm9 {
    public final /* synthetic */ int E = 3;
    public int F;
    public final Object G;

    public f2(eq6 eq6Var) {
        this.G = eq6Var;
        this.F = eq6Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 0:
                return this.F < ((i2) obj).size();
            case 1:
                return this.F < ((Object[]) obj).length;
            case 2:
                return ((Iterator) obj).hasNext();
            default:
                return this.F > 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    pmf.d();
                    return null;
                }
                int i2 = this.F;
                this.F = i2 + 1;
                return ((i2) obj).get(i2);
            case 1:
                try {
                    int i3 = this.F;
                    this.F = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.F--;
                    pmf.h(e.getMessage());
                    return null;
                }
            case 2:
                int i4 = this.F;
                this.F = i4 + 1;
                if (i4 >= 0) {
                    return new b19(i4, ((Iterator) obj).next());
                }
                x44.n0();
                throw null;
            default:
                eq6 eq6Var = (eq6) obj;
                int i5 = eq6Var.c;
                int i6 = this.F;
                this.F = i6 - 1;
                return eq6Var.e[i5 - i6];
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f2(Iterator it) {
        it.getClass();
        this.G = it;
    }

    public f2(i2 i2Var) {
        this.G = i2Var;
    }

    public f2(Object[] objArr) {
        objArr.getClass();
        this.G = objArr;
    }
}
