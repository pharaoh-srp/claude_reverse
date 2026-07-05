package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ u0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(u0 u0Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = u0Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        u0 u0Var = this.F;
        switch (i) {
            case 0:
                return new t0(u0Var, tp4Var, 0);
            default:
                return new t0(u0Var, tp4Var, 1);
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
                ((t0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((t0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = null;
        u0 u0Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                if (u0Var.g0 == null) {
                    lp8 lp8Var = new lp8();
                    zub zubVar = u0Var.U;
                    if (zubVar != null) {
                        gb9.D(u0Var.d1(), null, null, new m0(zubVar, lp8Var, tp4Var, 0), 3);
                    }
                    u0Var.g0 = lp8Var;
                }
                break;
            default:
                sf5.h0(obj);
                lp8 lp8Var2 = u0Var.g0;
                if (lp8Var2 != null) {
                    mp8 mp8Var = new mp8(lp8Var2);
                    zub zubVar2 = u0Var.U;
                    if (zubVar2 != null) {
                        gb9.D(u0Var.d1(), null, null, new m0(zubVar2, mp8Var, tp4Var, 1), 3);
                    }
                    u0Var.g0 = null;
                }
                break;
        }
        return ieiVar;
    }
}
