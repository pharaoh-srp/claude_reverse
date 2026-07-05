package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e29 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ u2a F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e29(u2a u2aVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = u2aVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new e29(this.F, tp4Var, 0);
            default:
                return new e29(this.F, tp4Var, 1);
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
                ((e29) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((e29) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        u2a u2aVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                gb9.D(u2aVar.b, null, null, new fj(u2aVar, null, 17), 3);
                break;
            default:
                sf5.h0(obj);
                gb9.D(u2aVar.b, null, null, new fj(u2aVar, null, 17), 3);
                break;
        }
        return ieiVar;
    }
}
