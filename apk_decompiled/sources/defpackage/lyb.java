package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lyb implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ lyb(boolean z, zy7 zy7Var, int i) {
        this.E = i;
        this.F = z;
        this.G = zy7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.G;
        boolean z = this.F;
        switch (i) {
            case 0:
                ((xre) obj).b(z ? 1.0f : ((Number) zy7Var.a()).floatValue());
                break;
            case 1:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                if (!z) {
                    ckf.c(ekfVar, new kl1(23, zy7Var));
                } else {
                    ckf.a(ekfVar, new kl1(22, zy7Var));
                }
                break;
            case 2:
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                if (!z) {
                    ckf.c(ekfVar2, new kl1(29, zy7Var));
                } else {
                    ckf.a(ekfVar2, new kl1(28, zy7Var));
                }
                break;
            default:
                ekf ekfVar3 = (ekf) obj;
                ekfVar3.getClass();
                if (!z) {
                    ckf.c(ekfVar3, new o5h(1, zy7Var));
                } else {
                    ckf.a(ekfVar3, new o5h(0, zy7Var));
                }
                break;
        }
        return ieiVar;
    }
}
