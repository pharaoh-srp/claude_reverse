package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qzc extends j2 {
    public final Object[] G;
    public final u6i H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzc(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        objArr.getClass();
        objArr2.getClass();
        this.G = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.H = new u6i(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        u6i u6iVar = this.H;
        if (u6iVar.hasNext()) {
            this.E++;
            return u6iVar.next();
        }
        int i = this.E;
        this.E = i + 1;
        return this.G[i - u6iVar.F];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            pmf.d();
            return null;
        }
        int i = this.E;
        u6i u6iVar = this.H;
        int i2 = u6iVar.F;
        if (i <= i2) {
            this.E = i - 1;
            return u6iVar.previous();
        }
        int i3 = i - 1;
        this.E = i3;
        return this.G[i3 - i2];
    }
}
