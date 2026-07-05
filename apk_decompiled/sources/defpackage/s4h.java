package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s4h extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ mdd F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4h(mdd mddVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = mddVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        mdd mddVar = this.F;
        switch (i) {
            case 0:
                return new s4h(mddVar, tp4Var, 0);
            case 1:
                return new s4h(mddVar, tp4Var, 1);
            case 2:
                return new s4h(mddVar, tp4Var, 2);
            case 3:
                return new s4h(mddVar, tp4Var, 3);
            case 4:
                return new s4h(mddVar, tp4Var, 4);
            case 5:
                return new s4h(mddVar, tp4Var, 5);
            case 6:
                return new s4h(mddVar, tp4Var, 6);
            default:
                return new s4h(mddVar, tp4Var, 7);
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
                ((s4h) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((s4h) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((s4h) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((s4h) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 4:
                ((s4h) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 5:
                ((s4h) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 6:
                ((s4h) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((s4h) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        mdd mddVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                mddVar.a();
                break;
            case 1:
                sf5.h0(obj);
                mddVar.b();
                break;
            case 2:
                sf5.h0(obj);
                mddVar.b();
                break;
            case 3:
                sf5.h0(obj);
                mddVar.a();
                break;
            case 4:
                sf5.h0(obj);
                mddVar.b();
                break;
            case 5:
                sf5.h0(obj);
                mddVar.b();
                break;
            case 6:
                sf5.h0(obj);
                mddVar.a();
                break;
            default:
                sf5.h0(obj);
                mddVar.b();
                break;
        }
        return ieiVar;
    }
}
