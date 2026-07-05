package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dm5 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bt7 F;
    public final /* synthetic */ ps7 G;

    public /* synthetic */ dm5(bt7 bt7Var, ps7 ps7Var, int i) {
        this.E = i;
        this.F = bt7Var;
        this.G = ps7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        ps7 ps7Var = this.G;
        bt7 bt7Var = this.F;
        switch (i) {
            case 0:
                bt7.a(bt7Var);
                ps7Var.a(1);
                break;
            default:
                if (!bt7.a(bt7Var)) {
                    ps7Var.a(6);
                }
                break;
        }
        return ieiVar;
    }
}
