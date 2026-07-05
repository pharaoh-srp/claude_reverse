package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class okj extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ qkj F;
    public final /* synthetic */ long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ long I;
    public final /* synthetic */ long J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okj(qkj qkjVar, long j, float f, long j2, long j3, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = qkjVar;
        this.G = j;
        this.H = f;
        this.I = j2;
        this.J = j3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new okj(this.F, this.G, this.H, this.I, this.J, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((okj) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return ieiVar;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        gkj gkjVar = this.F.U;
        this.E = 1;
        gkjVar.getClass();
        Object objN = fd9.N(new ckj(gkjVar, this.H, this.I, this.G, this.J, null), this);
        m45 m45Var = m45.E;
        if (objN != m45Var) {
            objN = ieiVar;
        }
        return objN == m45Var ? m45Var : ieiVar;
    }
}
