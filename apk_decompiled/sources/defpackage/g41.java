package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g41 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ int F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g41(int i, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new g41(this.F, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((g41) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        tp4 tp4Var = null;
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return obj;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        k92 k92VarQ = j8.q(new e41(this.F, null));
        f41 f41Var = new f41(2, tp4Var, 0);
        this.E = 1;
        Object objH = j8.H(k92VarQ, f41Var, this);
        m45 m45Var = m45.E;
        return objH == m45Var ? m45Var : objH;
    }
}
