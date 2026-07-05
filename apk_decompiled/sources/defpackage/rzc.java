package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rzc extends k2 {
    public final Object[] G;
    public final v6i H;

    public rzc(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.G = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.H = new v6i(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        v6i v6iVar = this.H;
        if (v6iVar.hasNext()) {
            this.E++;
            return v6iVar.next();
        }
        int i = this.E;
        this.E = i + 1;
        return this.G[i - v6iVar.F];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            pmf.d();
            return null;
        }
        int i = this.E;
        v6i v6iVar = this.H;
        int i2 = v6iVar.F;
        if (i <= i2) {
            this.E = i - 1;
            return v6iVar.previous();
        }
        int i3 = i - 1;
        this.E = i3;
        return this.G[i3 - i2];
    }
}
