package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x73 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ boolean F;
    public final /* synthetic */ hw2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x73(hw2 hw2Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = hw2Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                x73 x73Var = new x73(this.G, tp4Var, 0);
                x73Var.F = ((Boolean) obj).booleanValue();
                return x73Var;
            default:
                x73 x73Var2 = new x73(this.G, tp4Var, 1);
                x73Var2.F = ((Boolean) obj).booleanValue();
                return x73Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((x73) create(bool, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((x73) create(bool, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        hw2 hw2Var = this.G;
        boolean z = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                hw2Var.C.setValue(Boolean.valueOf(z));
                break;
            default:
                sf5.h0(obj);
                hw2Var.u.setValue(Boolean.valueOf(z));
                break;
        }
        return ieiVar;
    }
}
