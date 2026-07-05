package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e7i extends z6i {
    public final syc H;

    public e7i(syc sycVar) {
        this.H = sycVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.G;
        this.G = i + 2;
        Object[] objArr = this.E;
        return new hvb(this.H, objArr[i], objArr[i + 1]);
    }
}
