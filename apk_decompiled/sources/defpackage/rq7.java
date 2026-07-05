package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rq7 extends xzg implements rz7 {
    public final /* synthetic */ int E;
    public lp7 F;
    public int G;
    public /* synthetic */ lp7 H;
    public /* synthetic */ Object I;
    public final /* synthetic */ qz7 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rq7(qz7 qz7Var, tp4 tp4Var, int i) {
        super(3, tp4Var);
        this.E = i;
        this.J = qz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        qz7 qz7Var = this.J;
        lp7 lp7Var = (lp7) obj;
        switch (i) {
            case 0:
                rq7 rq7Var = new rq7((pz7) qz7Var, (tp4) obj3, 0);
                rq7Var.H = lp7Var;
                rq7Var.I = obj2;
                return rq7Var.invokeSuspend(ieiVar);
            default:
                rq7 rq7Var2 = new rq7((rz7) qz7Var, (tp4) obj3, 1);
                rq7Var2.H = lp7Var;
                rq7Var2.I = (Object[]) obj2;
                return rq7Var2.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        qz7 qz7Var = this.J;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                lp7 lp7Var = this.H;
                Object obj2 = this.I;
                int i2 = this.G;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.H = null;
                    this.I = null;
                    this.F = lp7Var;
                    this.G = 1;
                    obj = ((pz7) qz7Var).invoke(obj2, this);
                    if (obj != m45Var) {
                    }
                } else if (i2 == 1) {
                    lp7Var = this.F;
                    sf5.h0(obj);
                } else if (i2 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                this.H = null;
                this.I = null;
                this.F = null;
                this.G = 2;
                if (lp7Var.g(obj, this) != m45Var) {
                }
                break;
            default:
                lp7 lp7Var2 = this.H;
                Object[] objArr = (Object[]) this.I;
                int i3 = this.G;
                if (i3 == 0) {
                    sf5.h0(obj);
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    this.H = null;
                    this.I = null;
                    this.F = lp7Var2;
                    this.G = 1;
                    obj = ((rz7) qz7Var).invoke(obj3, obj4, this);
                    if (obj != m45Var) {
                    }
                } else if (i3 == 1) {
                    lp7Var2 = this.F;
                    sf5.h0(obj);
                } else if (i3 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                this.H = null;
                this.I = null;
                this.F = null;
                this.G = 2;
                if (lp7Var2.g(obj, this) != m45Var) {
                }
                break;
        }
        return m45Var;
    }
}
