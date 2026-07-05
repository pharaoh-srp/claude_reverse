package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b7i extends z6i {
    public final /* synthetic */ int H;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.H) {
            case 0:
                int i = this.G;
                this.G = i + 2;
                Object[] objArr = this.E;
                return new wra(objArr[i], objArr[i + 1]);
            default:
                int i2 = this.G;
                this.G = i2 + 2;
                return this.E[i2 + 1];
        }
    }
}
