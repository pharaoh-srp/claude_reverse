package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ya0 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya0(Object obj, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return new ya0((qi3) obj, tp4Var, 0);
            default:
                return new ya0((kfh) obj, tp4Var, 1);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((ya0) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((ya0) create(tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                ((qi3) obj2).a(sx.LOGIN);
                break;
            default:
                sf5.h0(obj);
                ((kfh) obj2).Y.u.setValue(Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
