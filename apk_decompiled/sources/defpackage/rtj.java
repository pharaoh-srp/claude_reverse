package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rtj extends dsj {
    public final transient Object[] J;
    public final transient int K;
    public final transient int L;

    public rtj(Object[] objArr, int i, int i2) {
        super(0);
        this.J = objArr;
        this.K = i;
        this.L = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vpj.b(i, this.L);
        Object obj = this.J[i + i + this.K];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.L;
    }
}
