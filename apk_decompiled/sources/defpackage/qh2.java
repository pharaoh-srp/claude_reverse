package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qh2 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ th2 H;
    public final /* synthetic */ lp7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh2(th2 th2Var, lp7 lp7Var, Object obj, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = th2Var;
        this.I = lp7Var;
        this.G = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        lp7 lp7Var = this.I;
        th2 th2Var = this.H;
        switch (i) {
            case 0:
                return new qh2(th2Var, lp7Var, this.G, tp4Var);
            default:
                qh2 qh2Var = new qh2(th2Var, lp7Var, tp4Var);
                qh2Var.G = obj;
                return qh2Var;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((qh2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    rz7 rz7Var = this.H.I;
                    Object obj2 = this.G;
                    this.F = 1;
                    if (rz7Var.invoke(this.I, obj2, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                l45 l45Var = (l45) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    dae daeVarH = vb7.h(obj);
                    th2 th2Var = this.H;
                    kp7 kp7Var = th2Var.H;
                    sh2 sh2Var = new sh2(daeVarH, l45Var, th2Var, this.I, 0);
                    this.G = null;
                    this.F = 1;
                    if (kp7Var.a(sh2Var, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh2(th2 th2Var, lp7 lp7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = th2Var;
        this.I = lp7Var;
    }
}
