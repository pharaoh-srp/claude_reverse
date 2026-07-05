package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bp5 implements tp4 {
    public yi9 E;
    public tp4 F;
    public Object G;

    public final void a(zi9 zi9Var) {
        this.F = zi9Var;
    }

    @Override // defpackage.tp4
    public final c45 getContext() {
        return im6.E;
    }

    @Override // defpackage.tp4
    public final void resumeWith(Object obj) {
        this.F = null;
        this.G = obj;
    }
}
