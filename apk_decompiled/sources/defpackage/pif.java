package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pif implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ pif(zy7 zy7Var, zy7 zy7Var2, int i) {
        this.E = i;
        this.F = zy7Var;
        this.G = zy7Var2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.G;
        zy7 zy7Var2 = this.F;
        meh mehVar = (meh) obj;
        switch (i) {
            case 0:
                zy7Var2.a();
                if (zy7Var != null ? ((Boolean) zy7Var.a()).booleanValue() : true) {
                    mehVar.close();
                }
                break;
            default:
                zy7Var2.a();
                if (zy7Var != null ? ((Boolean) zy7Var.a()).booleanValue() : true) {
                    mehVar.close();
                }
                break;
        }
        return ieiVar;
    }
}
