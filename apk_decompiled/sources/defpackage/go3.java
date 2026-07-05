package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class go3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ go3(int i, zy7 zy7Var, String str) {
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
                ckf.j(ekfVar, str, new kl1(6, zy7Var));
                break;
            case 1:
                ekfVar.getClass();
                ckf.l(ekfVar, str);
                ckf.g(ekfVar, null, new kl1(17, zy7Var));
                break;
            default:
                ekfVar.getClass();
                ckf.n(ekfVar, x44.W(new qd5(new kl1(27, zy7Var), str)));
                break;
        }
        return ieiVar;
    }
}
