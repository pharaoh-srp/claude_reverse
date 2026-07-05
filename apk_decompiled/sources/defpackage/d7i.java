package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d7i extends y6i {
    public final syc H;

    public d7i(syc sycVar) {
        this.H = sycVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.G;
        this.G = i + 2;
        Object[] objArr = this.E;
        return new gvb(this.H, objArr[i], objArr[i + 1]);
    }
}
