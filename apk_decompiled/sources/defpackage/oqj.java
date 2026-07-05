package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oqj extends sqj {
    public final transient int I;
    public final transient int J;
    public final /* synthetic */ sqj K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqj(sqj sqjVar, int i, int i2) {
        super(0);
        this.K = sqjVar;
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.upj
    public final Object[] e() {
        return this.K.e();
    }

    @Override // defpackage.upj
    public final int g() {
        return this.K.g() + this.I;
    }

    @Override // java.util.List
    public final Object get(int i) {
        msk.i(i, this.J);
        return this.K.get(i + this.I);
    }

    @Override // defpackage.upj
    public final int h() {
        return this.K.g() + this.I + this.J;
    }

    @Override // defpackage.sqj, java.util.List
    /* JADX INFO: renamed from: p */
    public final sqj subList(int i, int i2) {
        msk.j(i, i2, this.J);
        int i3 = this.I;
        return this.K.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.J;
    }
}
