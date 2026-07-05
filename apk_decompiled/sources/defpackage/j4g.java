package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j4g implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ k4g F;
    public final /* synthetic */ String G;
    public final /* synthetic */ iqb H;

    public /* synthetic */ j4g(k4g k4gVar, String str, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = k4gVar;
        this.G = str;
        this.H = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.H;
        String str = this.G;
        k4g k4gVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k4gVar.c(str, iqbVar, ld4Var, x44.p0(385));
                break;
            default:
                k4gVar.b(str, iqbVar, ld4Var, x44.p0(385));
                break;
        }
        return ieiVar;
    }
}
