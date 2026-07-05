package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nq4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ boolean F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nq4(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                nq4 nq4Var = new nq4(2, tp4Var, 0);
                nq4Var.F = ((Boolean) obj).booleanValue();
                return nq4Var;
            default:
                nq4 nq4Var2 = new nq4(2, tp4Var, 1);
                nq4Var2.F = ((Boolean) obj).booleanValue();
                return nq4Var2;
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
        }
        return ((nq4) create(bool, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        boolean z = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                break;
            default:
                sf5.h0(obj);
                break;
        }
        return Boolean.valueOf(z);
    }
}
