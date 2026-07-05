package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y9f extends xzg implements pz7 {
    public int E;
    public /* synthetic */ long F;
    public final /* synthetic */ z9f G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9f(z9f z9fVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = z9fVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        y9f y9fVar = new y9f(this.G, tp4Var);
        y9fVar.F = ((fcc) obj).a;
        return y9fVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        long j = ((fcc) obj).a;
        y9f y9fVar = new y9f(this.G, (tp4) obj2);
        y9fVar.F = j;
        return y9fVar.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
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
        long j = this.F;
        raf rafVar = this.G.r0;
        this.E = 1;
        Object objA = r9f.a(rafVar, j, this);
        m45 m45Var = m45.E;
        return objA == m45Var ? m45Var : objA;
    }
}
