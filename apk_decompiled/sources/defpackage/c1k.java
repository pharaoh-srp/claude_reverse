package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c1k extends efi {
    public static final Object G = new Object();
    public Object F;

    public c1k(Object obj) {
        super(3);
        this.F = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.F != G;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.F;
        Object obj2 = G;
        if (obj != obj2) {
            this.F = obj2;
            return obj;
        }
        pmf.d();
        return null;
    }
}
