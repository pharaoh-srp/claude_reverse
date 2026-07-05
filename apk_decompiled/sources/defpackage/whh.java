package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class whh extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zhh F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ whh(zhh zhhVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = zhhVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        zhh zhhVar = this.F;
        switch (i) {
            case 0:
                return new whh(zhhVar, tp4Var, 0);
            case 1:
                return new whh(zhhVar, tp4Var, 1);
            default:
                return new whh(zhhVar, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((whh) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((whh) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((whh) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zhh zhhVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                zhhVar.i(true);
                break;
            case 1:
                sf5.h0(obj);
                zhhVar.k();
                break;
            default:
                sf5.h0(obj);
                zhhVar.v();
                break;
        }
        return ieiVar;
    }
}
