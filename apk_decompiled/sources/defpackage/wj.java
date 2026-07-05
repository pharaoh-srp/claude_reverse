package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wj extends xzg implements bz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj(int i) {
        super(1, null);
        this.E = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new wj(1, tp4Var, 0);
            case 1:
                return new wj(1, tp4Var, 1);
            case 2:
                return new wj(1, tp4Var, 2);
            case 3:
                return new wj(1, tp4Var, 3);
            default:
                return new wj(1, tp4Var, 4);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((wj) create(tp4Var)).invokeSuspend(ieiVar);
                return sj.a;
            case 1:
                ((wj) create(tp4Var)).invokeSuspend(ieiVar);
                return null;
            case 2:
                return ((wj) create(tp4Var)).invokeSuspend(ieiVar);
            case 3:
                ((wj) create(tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
            default:
                ((wj) create(tp4Var)).invokeSuspend(ieiVar);
                return mqf.a;
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        switch (this.E) {
            case 0:
                sf5.h0(obj);
                return sj.a;
            case 1:
                sf5.h0(obj);
                return null;
            case 2:
                sf5.h0(obj);
                i15 i15Var = i15.d;
                return new i15(null, "client backgrounded; tool unavailable", 2, false);
            case 3:
                sf5.h0(obj);
                return iei.a;
            default:
                sf5.h0(obj);
                return mqf.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }
}
