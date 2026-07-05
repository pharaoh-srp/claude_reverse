package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e53 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t53 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e53(t53 t53Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = t53Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                return new e53(t53Var, tp4Var, 0);
            default:
                return new e53(t53Var, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((e53) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                ((e53) create((im2) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                skd skdVarQ0 = t53Var.Q0();
                t53.R(t53Var, skdVarQ0 != null ? skdVarQ0.a : null);
                t53Var.w1(true);
                t53Var.y1(false);
                break;
            default:
                sf5.h0(obj);
                t53.d0(t53Var);
                break;
        }
        return ieiVar;
    }
}
