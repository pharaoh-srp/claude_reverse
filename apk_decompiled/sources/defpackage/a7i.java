package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a7i extends y6i {
    public final /* synthetic */ int H;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.H) {
            case 0:
                int i = this.G;
                this.G = i + 2;
                Object[] objArr = this.E;
                return new xra(objArr[i], 0, objArr[i + 1]);
            case 1:
                int i2 = this.G;
                this.G = i2 + 2;
                return this.E[i2];
            default:
                int i3 = this.G;
                this.G = i3 + 2;
                return this.E[i3 + 1];
        }
    }
}
