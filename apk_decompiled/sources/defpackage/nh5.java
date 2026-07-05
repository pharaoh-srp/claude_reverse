package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nh5 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ bi5 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nh5(int i, tp4 tp4Var, bi5 bi5Var) {
        super(1, tp4Var);
        this.E = i;
        this.G = bi5Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        bi5 bi5Var = this.G;
        switch (i) {
            case 0:
                return new nh5(0, tp4Var, bi5Var);
            default:
                return new nh5(1, tp4Var, bi5Var);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
        }
        return ((nh5) create(tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        bi5 bi5Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    z7g z7gVarF = bi5Var.f();
                    this.F = 1;
                    Integer numA = z7gVarF.a();
                    if (numA == m45Var) {
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
                    nj7 nj7Var = (nj7) bi5Var.i.getValue();
                    this.F = 1;
                    Object objA = nj7Var.a(new jh5(3, (tp4) null), this);
                    if (objA == m45Var) {
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
