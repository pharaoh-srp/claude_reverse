package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g59 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ h59 F;

    public /* synthetic */ g59(h59 h59Var, int i) {
        this.E = i;
        this.F = h59Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        h59 h59Var = this.F;
        p6i p6iVar = (p6i) obj;
        switch (i) {
            case 0:
                p6iVar.getClass();
                h59 h59Var2 = (h59) p6iVar;
                wbj wbjVar = h59Var.T;
                if (!x44.r(h59Var2.S, wbjVar)) {
                    h59Var2.S = wbjVar;
                    h59Var2.q1();
                }
                return o6i.F;
            default:
                p6iVar.getClass();
                h59Var.S = ((h59) p6iVar).T;
                return Boolean.FALSE;
        }
    }
}
