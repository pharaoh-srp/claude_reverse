package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pc2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ w79 G;
    public final /* synthetic */ kdg H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc2(w79 w79Var, kdg kdgVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = w79Var;
        this.H = kdgVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new pc2(this.G, this.H, tp4Var, 0);
            default:
                return new pc2(this.G, this.H, tp4Var, 1);
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
        return ((pc2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        kdg kdgVar = this.H;
        w79 w79Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    kp7 kp7VarA = w79Var.a();
                    oc2 oc2Var = new oc2(kdgVar, 0);
                    this.F = 1;
                    if (kp7VarA.a(oc2Var, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    kp7 kp7VarA2 = w79Var.a();
                    oc2 oc2Var2 = new oc2(kdgVar, 1);
                    this.F = 1;
                    if (kp7VarA2.a(oc2Var2, this) == m45Var) {
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
}
