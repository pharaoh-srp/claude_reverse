package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e0i extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ q0i G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0i(q0i q0iVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = q0iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        q0i q0iVar = this.G;
        switch (i) {
            case 0:
                e0i e0iVar = new e0i(q0iVar, tp4Var, 0);
                e0iVar.F = obj;
                return e0iVar;
            default:
                e0i e0iVar2 = new e0i(q0iVar, tp4Var, 1);
                e0iVar2.F = obj;
                return e0iVar2;
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
                return ((e0i) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            default:
                ((e0i) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        q0i q0iVar = this.G;
        tp4 tp4Var = null;
        int i2 = 3;
        l45 l45Var = (l45) this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                gb9.D(l45Var, null, null, new d0i(q0iVar, tp4Var, 0), 3);
                gb9.D(l45Var, null, null, new d0i(q0iVar, tp4Var, 1), 3);
                gb9.D(l45Var, null, null, new d0i(q0iVar, tp4Var, 2), 3);
                return gb9.D(l45Var, null, null, new d0i(q0iVar, tp4Var, i2), 3);
            default:
                sf5.h0(obj);
                if (((Boolean) q0iVar.m.g.getValue()).booleanValue()) {
                    gb9.D(l45Var, null, null, new d0i(q0iVar, tp4Var, 4), 3);
                }
                return iei.a;
        }
    }
}
