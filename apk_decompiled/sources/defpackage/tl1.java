package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tl1 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ mj1 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl1(mj1 mj1Var, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.F = mj1Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        mj1 mj1Var = this.F;
        switch (i) {
            case 0:
                return new tl1(mj1Var, tp4Var, 0);
            default:
                return new tl1(mj1Var, tp4Var, 1);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((tl1) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((tl1) create(tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        mj1 mj1Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                gb9.D(mj1Var.a, null, null, new jj1(mj1Var, null, 2), 3);
                break;
            default:
                sf5.h0(obj);
                mj1Var.k.a(sx.BELL_MODE);
                break;
        }
        return ieiVar;
    }
}
