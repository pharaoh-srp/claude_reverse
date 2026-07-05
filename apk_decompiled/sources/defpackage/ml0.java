package defpackage;

import io.sentry.t4;

/* JADX INFO: loaded from: classes.dex */
public final class ml0 extends xzg implements pz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ml0(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new ml0(2, tp4Var, 0);
            case 1:
                return new ml0(2, tp4Var, 1);
            case 2:
                return new ml0(2, tp4Var, 2);
            case 3:
                return new ml0(2, tp4Var, 3);
            default:
                return new ml0(2, tp4Var, 4);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                break;
            case 1:
                ((ml0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((ml0) create((kp7) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((ml0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                ((ml0) create((lp7) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        int i2 = 13;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                sf5.h0(obj);
                break;
            case 1:
                sf5.h0(obj);
                t4.e(new cd(i2, vmf.ChatScreen));
                break;
            case 2:
                sf5.h0(obj);
                break;
            case 3:
                sf5.h0(obj);
                t4.e(new cd(i2, vmf.LoginApp));
                break;
            default:
                sf5.h0(obj);
                break;
        }
        return ieiVar;
    }
}
