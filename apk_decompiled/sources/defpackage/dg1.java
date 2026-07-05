package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dg1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ dkh F;
    public final /* synthetic */ bz7 G;

    public /* synthetic */ dg1(dkh dkhVar, bz7 bz7Var, int i) {
        this.E = i;
        this.F = dkhVar;
        this.G = bz7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        bz7 bz7Var = this.G;
        dkh dkhVar = this.F;
        switch (i) {
            case 0:
                yjh yjhVar = (yjh) obj;
                if (dkhVar != null) {
                    dkhVar.a.setValue(yjhVar);
                }
                if (bz7Var != null) {
                    bz7Var.invoke(yjhVar);
                }
                return iei.a;
            default:
                dkhVar.c.add(bz7Var);
                return new r5(dkhVar, 11, bz7Var);
        }
    }
}
