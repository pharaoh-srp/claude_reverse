package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yrj extends dsj {
    public final transient int J;
    public final transient int K;
    public final /* synthetic */ dsj L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrj(dsj dsjVar, int i, int i2) {
        super(0);
        this.L = dsjVar;
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
        vpj.b(i, this.K);
        return this.L.get(i + this.J);
    }

    @Override // defpackage.dsj, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final dsj subList(int i, int i2) {
        vpj.d(i, i2, this.K);
        int i3 = this.J;
        return this.L.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.K;
    }
}
