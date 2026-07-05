package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jf8 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ jf8(int i, zy7 zy7Var, String str) {
        this.E = i;
        this.F = str;
        this.G = zy7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.G;
        String str = this.F;
        ekf ekfVar = (ekf) obj;
        switch (i) {
            case 0:
                ekfVar.getClass();
                ckf.n(ekfVar, x44.W(new qd5(new px2(7, zy7Var), str)));
                break;
            default:
                wn9[] wn9VarArr = ckf.a;
                dkf dkfVar = akf.u;
                wn9 wn9Var = ckf.a[11];
                ekfVar.a(dkfVar, Float.valueOf(1.0f));
                if (str != null) {
                    ckf.l(ekfVar, str);
                }
                ckf.g(ekfVar, null, new kl1(25, zy7Var));
                break;
        }
        return ieiVar;
    }
}
