package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p1j implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ u1j F;
    public final /* synthetic */ iqb G;

    public /* synthetic */ p1j(u1j u1jVar, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = u1jVar;
        this.G = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.G;
        u1j u1jVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                yjk.k(u1jVar, iqbVar, ld4Var, x44.p0(1));
                break;
            default:
                yjk.j(u1jVar, iqbVar, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }
}
