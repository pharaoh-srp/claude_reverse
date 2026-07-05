package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aj2 extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ eqh G;
    public final /* synthetic */ int H;
    public final /* synthetic */ i04 I;
    public final /* synthetic */ long J;
    public final /* synthetic */ i04 K;
    public final /* synthetic */ m14 L;
    public final /* synthetic */ v70 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj2(eqh eqhVar, int i, i04 i04Var, long j, i04 i04Var2, m14 m14Var, v70 v70Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = eqhVar;
        this.H = i;
        this.I = i04Var;
        this.J = j;
        this.K = i04Var2;
        this.L = m14Var;
        this.M = v70Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        aj2 aj2Var = new aj2(this.G, this.H, this.I, this.J, this.K, this.L, this.M, tp4Var);
        aj2Var.F = obj;
        return aj2Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((aj2) create((lp7) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        lp7 lp7Var = (lp7) this.F;
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            yi2 yi2Var = new yi2(this.G, this.H, this.I, this.J, this.K, lp7Var, this.L, this.M, null);
            this.F = null;
            this.E = 1;
            Object objN = fd9.N(yi2Var, this);
            m45 m45Var = m45.E;
            if (objN == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }
}
