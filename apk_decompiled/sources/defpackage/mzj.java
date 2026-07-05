package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mzj extends pzj {
    public final transient int I;
    public final transient int J;
    public final /* synthetic */ pzj K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzj(pzj pzjVar, int i, int i2) {
        super(1);
        this.K = pzjVar;
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.upj
    public final int b() {
        return this.K.g() + this.I + this.J;
    }

    @Override // defpackage.upj
    public final int g() {
        return this.K.g() + this.I;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zok.h(i, this.J);
        return this.K.get(i + this.I);
    }

    @Override // defpackage.upj
    public final Object[] l() {
        return this.K.l();
    }

    @Override // defpackage.pzj, java.util.List
    /* JADX INFO: renamed from: p */
    public final pzj subList(int i, int i2) {
        zok.i(i, i2, this.J);
        int i3 = this.I;
        return this.K.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.J;
    }
}
