package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ifh extends xzg implements pz7 {
    public int E;
    public /* synthetic */ int F;
    public final /* synthetic */ kfh G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifh(kfh kfhVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = kfhVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        ifh ifhVar = new ifh(this.G, tp4Var);
        ifhVar.F = ((Number) obj).intValue();
        return ifhVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((ifh) create(Integer.valueOf(((Number) obj).intValue()), (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        pd5 pd5Var;
        int i = this.E;
        tp4 tp4Var = null;
        iei ieiVar = iei.a;
        if (i == 0) {
            sf5.h0(obj);
            if (Math.abs(this.F) == 1 && (pd5Var = this.G.f0) != null) {
                this.E = 1;
                Object objN = fd9.N(new ab0(pd5Var, tp4Var, 6), this);
                m45 m45Var = m45.E;
                if (objN != m45Var) {
                    objN = ieiVar;
                }
                if (objN == m45Var) {
                    return m45Var;
                }
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return ieiVar;
    }
}
