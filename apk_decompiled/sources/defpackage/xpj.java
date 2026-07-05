package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xpj extends e5l {
    public final transient Object[] J;
    public final transient int K;
    public final transient int L;

    public xpj(int i, Object[] objArr) {
        super(2);
        this.J = objArr;
        this.K = i;
        this.L = 1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qzi.a(i, this.L);
        Object obj = this.J[i + i + this.K];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.L;
    }
}
