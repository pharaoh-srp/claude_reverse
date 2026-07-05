package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l43 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t53 F;
    public final /* synthetic */ ctc G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l43(t53 t53Var, ctc ctcVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = t53Var;
        this.G = ctcVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        ctc ctcVar = this.G;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                return new l43(t53Var, ctcVar, tp4Var, 0);
            default:
                return new l43(t53Var, ctcVar, tp4Var, 1);
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
                return ((l43) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            default:
                ((l43) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        ctc ctcVar = this.G;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                return Boolean.valueOf(t53Var.o0.remove(ctcVar.a));
            default:
                sf5.h0(obj);
                t53Var.n0.put(ctcVar.a, new txa(null, null, null, null, nxa.a, null, null, null, null, null, 1007));
                t53Var.D1(ctcVar, "No MCP App resource found", "NoAppResource", null);
                return iei.a;
        }
    }
}
