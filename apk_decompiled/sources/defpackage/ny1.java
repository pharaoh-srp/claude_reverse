package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ny1 extends j2 {
    public final /* synthetic */ int G = 1;
    public final Object H;

    public ny1(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.H = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.G;
        Object obj = this.H;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    pmf.d();
                } else {
                    int i2 = this.E;
                    this.E = i2 + 1;
                }
                break;
            default:
                if (!hasNext()) {
                    pmf.d();
                } else {
                    this.E++;
                }
                break;
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.G;
        Object obj = this.H;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    pmf.d();
                } else {
                    int i2 = this.E - 1;
                    this.E = i2;
                }
                break;
            default:
                if (!hasPrevious()) {
                    pmf.d();
                } else {
                    this.E--;
                }
                break;
        }
        return null;
    }

    public ny1(int i, Object obj) {
        super(i, 1);
        this.H = obj;
    }
}
