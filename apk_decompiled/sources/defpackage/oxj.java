package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oxj extends txj {
    public final transient int G;
    public final transient int H;
    public final /* synthetic */ txj I;

    public oxj(txj txjVar, int i, int i2) {
        this.I = txjVar;
        this.G = i;
        this.H = i2;
    }

    @Override // defpackage.hxj
    public final int b() {
        return this.I.e() + this.G + this.H;
    }

    @Override // defpackage.hxj
    public final int e() {
        return this.I.e() + this.G;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yvj.b(i, this.H);
        return this.I.get(i + this.G);
    }

    @Override // defpackage.hxj
    public final boolean h() {
        return true;
    }

    @Override // defpackage.hxj
    public final Object[] k() {
        return this.I.k();
    }

    @Override // defpackage.txj, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final txj subList(int i, int i2) {
        yvj.d(i, i2, this.H);
        int i3 = this.G;
        return this.I.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.H;
    }
}
