package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o34 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ qnc I;
    public final /* synthetic */ xm8 J;
    public final /* synthetic */ int K;

    public /* synthetic */ o34(String str, String str2, iqb iqbVar, qnc qncVar, xm8 xm8Var, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = str2;
        this.H = iqbVar;
        this.I = qncVar;
        this.J = xm8Var;
        this.K = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.K;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                unk.b(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                uuj.b(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
