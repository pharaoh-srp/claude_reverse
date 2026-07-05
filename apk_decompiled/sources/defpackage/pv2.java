package defpackage;

import com.anthropic.claude.api.chat.InputMode;

/* JADX INFO: loaded from: classes.dex */
public final class pv2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ hw2 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv2(hw2 hw2Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = hw2Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        hw2 hw2Var = this.F;
        switch (i) {
            case 0:
                return new pv2(hw2Var, tp4Var, 0);
            default:
                return new pv2(hw2Var, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((pv2) create((InputMode) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((pv2) create(bool, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        hw2 hw2Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                hw2Var.H.setValue(null);
                break;
            default:
                sf5.h0(obj);
                hw2Var.F.setValue(null);
                break;
        }
        return ieiVar;
    }
}
