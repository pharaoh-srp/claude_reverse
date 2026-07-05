package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h60 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ ta4 G;
    public final /* synthetic */ int H;

    public /* synthetic */ h60(iqb iqbVar, ta4 ta4Var, int i, int i2) {
        this.E = i2;
        this.F = iqbVar;
        this.G = ta4Var;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        ta4 ta4Var = this.G;
        iqb iqbVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                grk.c(iqbVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 1:
                grk.d(iqbVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 2:
                dd2.b(iqbVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 3:
                x2k.c(iqbVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 4:
                ou5.d(iqbVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 5:
                xuj.d(iqbVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                xuj.c(iqbVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
