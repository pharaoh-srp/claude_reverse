package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s7g extends k2 {
    public final Object G;

    public s7g(int i, Object obj) {
        super(i, 1);
        this.G = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.E++;
            return this.G;
        }
        pmf.d();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.E--;
            return this.G;
        }
        pmf.d();
        return null;
    }
}
