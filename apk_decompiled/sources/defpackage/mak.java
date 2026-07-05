package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mak extends qak {
    public final transient int G;
    public final transient int H;
    public final /* synthetic */ qak I;

    public mak(qak qakVar, int i, int i2) {
        this.I = qakVar;
        this.G = i;
        this.H = i2;
    }

    @Override // defpackage.dak
    public final Object[] a() {
        return this.I.a();
    }

    @Override // defpackage.dak
    public final int b() {
        return this.I.b() + this.G;
    }

    @Override // defpackage.dak
    public final int e() {
        return this.I.b() + this.G + this.H;
    }

    @Override // defpackage.dak
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        bqk.f(i, this.H);
        return this.I.get(i + this.G);
    }

    @Override // defpackage.qak, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final qak subList(int i, int i2) {
        bqk.g(i, i2, this.H);
        int i3 = this.G;
        return this.I.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.H;
    }
}
