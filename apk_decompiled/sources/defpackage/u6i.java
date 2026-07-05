package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u6i extends j2 {
    public int G;
    public Object[] H;
    public boolean I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public u6i(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        objArr.getClass();
        this.G = i3;
        Object[] objArr2 = new Object[i3];
        this.H = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.I = r5;
        objArr2[0] = objArr;
        c(i - r5, 1);
    }

    public final Object a() {
        int i = this.E & 31;
        Object obj = this.H[this.G - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void c(int i, int i2) {
        int i3 = (this.G - i2) * 5;
        while (i2 < this.G) {
            Object[] objArr = this.H;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[nuj.m(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void d(int i) {
        int i2 = 0;
        while (nuj.m(this.E, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            c(this.E, ((this.G - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        Object objA = a();
        int i = this.E + 1;
        this.E = i;
        if (i == this.F) {
            this.I = true;
            return objA;
        }
        d(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            pmf.d();
            return null;
        }
        this.E--;
        if (this.I) {
            this.I = false;
            return a();
        }
        d(31);
        return a();
    }
}
