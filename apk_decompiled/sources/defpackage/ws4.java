package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ws4 extends xzg implements tz7 {
    public int E;
    public /* synthetic */ String F;
    public /* synthetic */ String G;
    public /* synthetic */ String H;
    public /* synthetic */ String I;
    public final /* synthetic */ mc J;
    public final /* synthetic */ v72 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws4(mc mcVar, v72 v72Var, tp4 tp4Var) {
        super(5, tp4Var);
        this.J = mcVar;
        this.K = v72Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.F;
        String str2 = this.G;
        String str3 = this.H;
        String str4 = this.I;
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
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.E = 1;
        Object objB = esk.b(this.J, this.K, str, str2, str3, str4, this);
        m45 m45Var = m45.E;
        return objB == m45Var ? m45Var : objB;
    }

    @Override // defpackage.tz7
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ws4 ws4Var = new ws4(this.J, this.K, (tp4) obj5);
        ws4Var.F = (String) obj;
        ws4Var.G = (String) obj2;
        ws4Var.H = (String) obj3;
        ws4Var.I = (String) obj4;
        return ws4Var.invokeSuspend(iei.a);
    }
}
