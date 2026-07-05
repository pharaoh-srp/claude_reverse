package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sc9 extends efi {
    public final Object F;
    public boolean G;

    public sc9(Object obj) {
        super(0);
        this.F = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.G;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.G) {
            pmf.d();
            return null;
        }
        this.G = true;
        return this.F;
    }
}
