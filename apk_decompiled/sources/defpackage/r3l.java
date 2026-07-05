package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r3l extends n4l {
    public final transient int J;
    public final transient int K;
    public final /* synthetic */ n4l L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3l(n4l n4lVar, int i, int i2) {
        super(1);
        this.L = n4lVar;
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
        ink.b(i, this.K);
        return this.L.get(i + this.J);
    }

    @Override // defpackage.n4l, java.util.List
    /* JADX INFO: renamed from: h */
    public final n4l subList(int i, int i2) {
        ink.c(i, i2, this.K);
        int i3 = this.J;
        return this.L.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.K;
    }
}
