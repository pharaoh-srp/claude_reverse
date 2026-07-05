package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a89 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ b89 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a89(b89 b89Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = b89Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new a89(this.G, tp4Var, 0);
            default:
                return new a89(this.G, tp4Var, 1);
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
        return ((a89) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        tp4 tp4Var = null;
        switch (this.E) {
            case 0:
                m45 m45Var = m45.E;
                int i = this.F;
                if (i == 0) {
                    sf5.h0(obj);
                    this.G.a();
                    b89 b89Var = this.G;
                    this.F = 1;
                    ua2 ua2Var = new ua2(1, zni.I(this));
                    ua2Var.t();
                    synchronized (b89Var.H) {
                        b89Var.I = 20;
                        b89Var.K = ua2Var;
                    }
                    ua2Var.w(new cv(28, b89Var));
                    if (ua2Var.r() == m45Var) {
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
            default:
                m45 m45Var2 = m45.E;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    b89 b89Var2 = this.G;
                    this.F = 1;
                    b89Var2.getClass();
                    if (iuj.Q(5000L, new a89(b89Var2, tp4Var, 0), this) == m45Var2) {
                        return m45Var2;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return iei.a;
        }
    }
}
