package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class brf extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ v84 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brf(v84 v84Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = v84Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new brf(this.F, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((brf) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return obj;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        this.E = 1;
        Object objW = this.F.w(this);
        m45 m45Var = m45.E;
        return objW == m45Var ? m45Var : objW;
    }
}
