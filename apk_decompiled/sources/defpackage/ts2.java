package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ts2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts2(int i, tp4 tp4Var, nwb nwbVar) {
        super(2, tp4Var);
        this.E = i;
        this.F = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new ts2(0, tp4Var, this.F);
            case 1:
                return new ts2(1, tp4Var, this.F);
            case 2:
                return new ts2(2, tp4Var, this.F);
            default:
                return new ts2(3, tp4Var, this.F);
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
                ((ts2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((ts2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((ts2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((ts2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 1:
                sf5.h0(obj);
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 2:
                sf5.h0(obj);
                nwbVar.setValue(Boolean.TRUE);
                break;
            default:
                sf5.h0(obj);
                nwbVar.setValue(Boolean.TRUE);
                break;
        }
        return ieiVar;
    }
}
