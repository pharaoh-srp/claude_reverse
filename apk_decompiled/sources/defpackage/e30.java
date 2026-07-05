package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes3.dex */
public final class e30 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ k30 F;
    public final /* synthetic */ Activity G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e30(k30 k30Var, Activity activity, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.F = k30Var;
        this.G = activity;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Activity activity = this.G;
        k30 k30Var = this.F;
        switch (i) {
            case 0:
                return new e30(k30Var, activity, tp4Var, 0);
            case 1:
                return new e30(k30Var, activity, tp4Var, 1);
            default:
                return new e30(k30Var, activity, tp4Var, 2);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((e30) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((e30) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((e30) create(tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        k30 k30Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                gx gxVarE = k30Var.e();
                gxVarE.b().b(new pgg(1, 15));
                break;
            case 1:
                sf5.h0(obj);
                gx gxVarE2 = k30Var.e();
                gxVarE2.b().b(new pgg(1, 16));
                break;
            default:
                sf5.h0(obj);
                gx gxVarE3 = k30Var.e();
                gxVarE3.b().b(new pgg(1, 18));
                break;
        }
        return ieiVar;
    }
}
