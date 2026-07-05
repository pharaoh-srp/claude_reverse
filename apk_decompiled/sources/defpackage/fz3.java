package defpackage;

import com.anthropic.claude.core.telemetry.SilentException;

/* JADX INFO: loaded from: classes2.dex */
public final class fz3 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bt7 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz3(bt7 bt7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = bt7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        bt7 bt7Var = this.F;
        switch (i) {
            case 0:
                return new fz3(bt7Var, tp4Var, 0);
            case 1:
                return new fz3(bt7Var, tp4Var, 1);
            case 2:
                return new fz3(bt7Var, tp4Var, 2);
            case 3:
                return new fz3(bt7Var, tp4Var, 3);
            case 4:
                return new fz3(bt7Var, tp4Var, 4);
            case 5:
                return new fz3(bt7Var, tp4Var, 5);
            case 6:
                return new fz3(bt7Var, tp4Var, 6);
            case 7:
                return new fz3(bt7Var, tp4Var, 7);
            case 8:
                return new fz3(bt7Var, tp4Var, 8);
            case 9:
                return new fz3(bt7Var, tp4Var, 9);
            default:
                return new fz3(bt7Var, tp4Var, 10);
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
                ((fz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((fz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((fz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((fz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 4:
                ((fz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 5:
                ((fz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 6:
                ((fz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 7:
                ((fz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 8:
                ((fz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 9:
                ((fz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((fz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        bt7 bt7Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                bt7.a(bt7Var);
                break;
            case 1:
                sf5.h0(obj);
                bt7.a(bt7Var);
                break;
            case 2:
                sf5.h0(obj);
                bt7.a(bt7Var);
                break;
            case 3:
                sf5.h0(obj);
                bt7Var.getClass();
                try {
                    bt7.a(bt7Var);
                } catch (Throwable th) {
                    SilentException.a(new SilentException("Failed to request focus", th), null, false, 3);
                }
                break;
            case 4:
                sf5.h0(obj);
                bt7.a(bt7Var);
                break;
            case 5:
                sf5.h0(obj);
                bt7.a(bt7Var);
                break;
            case 6:
                sf5.h0(obj);
                bt7.a(bt7Var);
                break;
            case 7:
                sf5.h0(obj);
                bt7.a(bt7Var);
                break;
            case 8:
                sf5.h0(obj);
                bt7.a(bt7Var);
                break;
            case 9:
                sf5.h0(obj);
                bt7.a(bt7Var);
                break;
            default:
                sf5.h0(obj);
                bt7.a(bt7Var);
                break;
        }
        return ieiVar;
        return ieiVar;
    }
}
