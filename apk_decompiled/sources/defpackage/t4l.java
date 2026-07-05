package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t4l extends e5l {
    public final transient int J;
    public final transient int K;
    public final /* synthetic */ e5l L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4l(e5l e5lVar, int i, int i2) {
        super(2);
        this.L = e5lVar;
        this.J = i;
        this.K = i2;
    }

    @Override // defpackage.hrj
    public final int b() {
        return this.L.e() + this.J + this.K;
    }

    @Override // defpackage.hrj
    public final int e() {
        return this.L.e() + this.J;
    }

    @Override // defpackage.hrj
    public final Object[] g() {
        return this.L.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        qzi.a(i, this.K);
        return this.L.get(i + this.J);
    }

    @Override // defpackage.e5l, java.util.List
    /* JADX INFO: renamed from: h */
    public final e5l subList(int i, int i2) {
        qzi.b(i, i2, this.K);
        int i3 = this.J;
        return this.L.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.K;
    }
}
