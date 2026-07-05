package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q74 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zhh F;
    public final /* synthetic */ ta4 G;
    public final /* synthetic */ int H;

    public /* synthetic */ q74(zhh zhhVar, ta4 ta4Var, int i, int i2) {
        this.E = i2;
        this.F = zhhVar;
        this.G = ta4Var;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        ta4 ta4Var = this.G;
        zhh zhhVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                dch.d(zhhVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                yfd.c(zhhVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
