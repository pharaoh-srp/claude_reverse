package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m3c implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ ud0 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ iqb I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ int K;

    public /* synthetic */ m3c(ud0 ud0Var, String str, zy7 zy7Var, iqb iqbVar, boolean z, int i) {
        this.F = ud0Var;
        this.G = str;
        this.H = zy7Var;
        this.I = iqbVar;
        this.J = z;
        this.K = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(this.K | 1);
                t3c.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(1);
                t3c.g(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP02, this.K);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ m3c(ud0 ud0Var, String str, zy7 zy7Var, iqb iqbVar, boolean z, int i, int i2) {
        this.F = ud0Var;
        this.G = str;
        this.H = zy7Var;
        this.I = iqbVar;
        this.J = z;
        this.K = i2;
    }
}
