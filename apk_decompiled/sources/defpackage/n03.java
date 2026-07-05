package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n03 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ f03 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n03(f03 f03Var, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.F = f03Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        f03 f03Var = this.F;
        switch (i) {
            case 0:
                return new n03(f03Var, tp4Var, 0);
            default:
                return new n03(f03Var, tp4Var, 1);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((n03) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((n03) create(tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        f03 f03Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                f03Var.v = true;
                gb9.D(f03Var.a, null, null, new b03(f03Var, null, 1), 3);
                break;
            default:
                sf5.h0(obj);
                f03Var.v = true;
                break;
        }
        return ieiVar;
    }
}
