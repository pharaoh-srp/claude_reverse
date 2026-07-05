package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w5l extends n4l {
    public static final w5l L = new w5l(0, new Object[0]);
    public final transient Object[] J;
    public final transient int K;

    public w5l(int i, Object[] objArr) {
        super(1);
        this.J = objArr;
        this.K = i;
    }

    @Override // defpackage.n4l, defpackage.hrj
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.J;
        int i = this.K;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.hrj
    public final int b() {
        return this.K;
    }

    @Override // defpackage.hrj
    public final int e() {
        return 0;
    }

    @Override // defpackage.hrj
    public final Object[] g() {
        return this.J;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ink.b(i, this.K);
        Object obj = this.J[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.K;
    }
}
