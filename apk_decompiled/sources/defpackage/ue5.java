package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ue5 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ bz7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue5(int i, tp4 tp4Var, bz7 bz7Var) {
        super(2, tp4Var);
        this.E = i;
        this.G = bz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        bz7 bz7Var = this.G;
        switch (i) {
            case 0:
                ue5 ue5Var = new ue5(0, tp4Var, bz7Var);
                ue5Var.F = obj;
                return ue5Var;
            default:
                ue5 ue5Var2 = new ue5(1, tp4Var, bz7Var);
                ue5Var2.F = obj;
                return ue5Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        guc gucVar = (guc) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((ue5) create(gucVar, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        bz7 bz7Var = this.G;
        switch (i) {
            case 0:
                sf5.h0(obj);
                guc gucVar = (guc) this.F;
                gucVar.getClass();
                return bz7Var.invoke(gucVar.c());
            default:
                sf5.h0(obj);
                guc gucVar2 = (guc) this.F;
                gucVar2.getClass();
                return bz7Var.invoke(gucVar2.c());
        }
    }
}
