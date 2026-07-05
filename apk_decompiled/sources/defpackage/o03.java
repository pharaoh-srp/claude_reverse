package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o03 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ uj4 G;
    public final /* synthetic */ f03 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o03(uj4 uj4Var, f03 f03Var, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.G = uj4Var;
        this.H = f03Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        f03 f03Var = this.H;
        uj4 uj4Var = this.G;
        switch (i) {
            case 0:
                return new o03(uj4Var, f03Var, tp4Var, 0);
            default:
                return new o03(uj4Var, f03Var, tp4Var, 1);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
        }
        return ((o03) create(tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        f03 f03Var = this.H;
        uj4 uj4Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    zy1 zy1Var = uj4Var.f;
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
                    zy1 zy1Var3 = uj4Var.f;
                    zy1 zy1Var4 = f03Var.l;
                    this.F = 1;
                    if (x44.I(zy1Var3, zy1Var4, this) == m45Var) {
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
