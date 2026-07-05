package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oy1 extends k2 {
    public final Object[] G;

    public oy1(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.G = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        int i = this.E;
        this.E = i + 1;
        return this.G[i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            pmf.d();
            return null;
        }
        int i = this.E - 1;
        this.E = i;
        return this.G[i];
    }
}
