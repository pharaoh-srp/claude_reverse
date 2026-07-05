package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class td2 extends xzg implements rz7 {
    public int E;
    public /* synthetic */ uub F;
    public /* synthetic */ float G;
    public final /* synthetic */ gri H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td2(gri griVar, tp4 tp4Var) {
        super(3, tp4Var);
        this.H = griVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        td2 td2Var = new td2(this.H, (tp4) obj3);
        td2Var.F = (uub) obj;
        td2Var.G = fFloatValue;
        return td2Var.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        uub uubVar = this.F;
        float f = this.G;
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            vc2 vc2Var = (vc2) this.H.a;
            this.F = null;
            this.G = f;
            this.E = 1;
            Object objD = vc2Var.d(uubVar, f, this);
            m45 m45Var = m45.E;
            if (objD == m45Var) {
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
