package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ami extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qi3 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ami(qi3 qi3Var, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.F = qi3Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new ami(this.F, tp4Var, 0);
            default:
                return new ami(this.F, tp4Var, 1);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((ami) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((ami) create(tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        qi3 qi3Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                qi3Var.a(sx.USAGE);
                break;
            default:
                sf5.h0(obj);
                qi3Var.a(sx.CLAUDE_STORE_VIEW);
                break;
        }
        return ieiVar;
    }
}
