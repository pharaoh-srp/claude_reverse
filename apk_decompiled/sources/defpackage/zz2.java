package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zz2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ f03 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz2(f03 f03Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = f03Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        f03 f03Var = this.G;
        switch (i) {
            case 0:
                return new zz2(f03Var, tp4Var, 0);
            default:
                return new zz2(f03Var, tp4Var, 1);
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
        return ((zz2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        f03 f03Var = this.G;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    zy1 zy1Var = f03Var.h.i;
                    zy1 zy1Var2 = f03Var.l;
                    this.F = 1;
                    if (x44.I(zy1Var, zy1Var2, this) == m45Var) {
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
                    kp7 kp7VarY = j8.y(mpk.d0(new xz2(f03Var, 2)), 200L);
                    dx dxVar = new dx(f03Var, tp4Var, 10);
                    this.F = 1;
                    if (j8.u(kp7VarY, dxVar, this) == m45Var) {
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
