package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fya extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ctc F;
    public final /* synthetic */ m83 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fya(int i, m83 m83Var, tp4 tp4Var, ctc ctcVar) {
        super(2, tp4Var);
        this.E = i;
        this.F = ctcVar;
        this.G = m83Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        m83 m83Var = this.G;
        ctc ctcVar = this.F;
        switch (i) {
            case 0:
                return new fya(0, m83Var, tp4Var, ctcVar);
            default:
                return new fya(1, m83Var, tp4Var, ctcVar);
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
                ((fya) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((fya) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        bz7 bz7Var;
        bz7 bz7Var2;
        int i = this.E;
        m83 m83Var = this.G;
        ctc ctcVar = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                sf5.h0(obj);
                if (ctcVar.c() && (bz7Var = m83Var.v) != null) {
                    bz7Var.invoke(ctcVar);
                }
                break;
            default:
                sf5.h0(obj);
                if (ctcVar.c() && (bz7Var2 = m83Var.w) != null) {
                    bz7Var2.invoke(ctcVar);
                }
                break;
        }
        return ieiVar;
    }
}
