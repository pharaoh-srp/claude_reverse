package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xcg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ bz7 G;

    public /* synthetic */ xcg(bz7 bz7Var, bz7 bz7Var2, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = bz7Var2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.G;
        bz7 bz7Var2 = this.F;
        switch (i) {
            case 0:
                bz7Var2.invoke(obj);
                bz7Var.invoke(obj);
                break;
            default:
                bz7Var2.invoke(obj);
                bz7Var.invoke(obj);
                break;
        }
        return ieiVar;
    }
}
