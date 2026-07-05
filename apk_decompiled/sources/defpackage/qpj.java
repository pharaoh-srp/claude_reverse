package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qpj extends n4l {
    public final transient Object[] J;
    public final transient int K;
    public final transient int L;

    public qpj(int i, Object[] objArr) {
        super(1);
        this.J = objArr;
        this.K = i;
        this.L = 1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ink.b(i, this.L);
        Object obj = this.J[i + i + this.K];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.L;
    }
}
