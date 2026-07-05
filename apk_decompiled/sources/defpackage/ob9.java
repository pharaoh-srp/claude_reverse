package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ob9 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ggc F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ int H;

    public /* synthetic */ ob9(ggc ggcVar, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = ggcVar;
        this.G = iqbVar;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        iqb iqbVar = this.G;
        ggc ggcVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                jwk.i(ggcVar, iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                jpi.b(ggcVar, iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
