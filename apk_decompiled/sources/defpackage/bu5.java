package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bu5 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu5(zy7 zy7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new bu5(this.F, tp4Var, 0);
            default:
                return new bu5(this.F, tp4Var, 1);
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
                ((bu5) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((bu5) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                zy7Var.a();
                break;
            default:
                sf5.h0(obj);
                zy7Var.a();
                break;
        }
        return ieiVar;
    }
}
