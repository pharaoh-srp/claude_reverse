package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xoa extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bt7 F;
    public final /* synthetic */ wlg G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xoa(bt7 bt7Var, wlg wlgVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = bt7Var;
        this.G = wlgVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new xoa(this.F, this.G, tp4Var, 0);
            case 1:
                return new xoa(this.F, this.G, tp4Var, 1);
            case 2:
                return new xoa(this.F, this.G, tp4Var, 2);
            case 3:
                return new xoa(this.F, this.G, tp4Var, 3);
            default:
                return new xoa(this.F, this.G, tp4Var, 4);
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
                ((xoa) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((xoa) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((xoa) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((xoa) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((xoa) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        bt7 bt7Var = this.F;
        wlg wlgVar = this.G;
        switch (i) {
            case 0:
                sf5.h0(obj);
                if (!((Boolean) wlgVar.getValue()).booleanValue()) {
                    bt7.a(bt7Var);
                }
                break;
            case 1:
                sf5.h0(obj);
                if (!((Boolean) wlgVar.getValue()).booleanValue()) {
                    bt7.a(bt7Var);
                }
                break;
            case 2:
                sf5.h0(obj);
                if (!((Boolean) wlgVar.getValue()).booleanValue()) {
                    bt7.a(bt7Var);
                }
                break;
            case 3:
                sf5.h0(obj);
                if (!((Boolean) wlgVar.getValue()).booleanValue()) {
                    bt7.a(bt7Var);
                }
                break;
            default:
                sf5.h0(obj);
                if (!((Boolean) wlgVar.getValue()).booleanValue()) {
                    bt7.a(bt7Var);
                }
                break;
        }
        return ieiVar;
    }
}
