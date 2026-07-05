package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ei1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ ki1 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei1(ki1 ki1Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = ki1Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        ki1 ki1Var = this.G;
        switch (i) {
            case 0:
                return new ei1(ki1Var, tp4Var, 0);
            case 1:
                return new ei1(ki1Var, tp4Var, 1);
            case 2:
                return new ei1(ki1Var, tp4Var, 2);
            default:
                return new ei1(ki1Var, tp4Var, 3);
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
        return ((ei1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        int i2 = 0;
        int i3 = 2;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        ki1 ki1Var = this.G;
        int i4 = 1;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    p41 p41Var = ki1Var.d;
                    kp7 kp7VarK = j8.K(j8.A(j8.q(new o41(ki1Var.a.f, p41Var, null))), p41Var.a.b());
                    di1 di1Var = new di1(ki1Var, 0);
                    this.F = 1;
                    if (kp7VarK.a(di1Var, this) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    p41 p41Var2 = ki1Var.d;
                    kp7 kp7VarK2 = j8.K(j8.A(j8.q(new l41(i2, p41Var2, tp4Var))), p41Var2.a.b());
                    fi1 fi1Var = new fi1(ki1Var, tp4Var, i4);
                    this.F = 1;
                    if (j8.u(kp7VarK2, fi1Var, this) == m45Var) {
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    p41 p41Var3 = ki1Var.d;
                    kp7 kp7VarK3 = j8.K(j8.A(j8.q(new l41(i3, p41Var3, tp4Var))), p41Var3.a.b());
                    di1 di1Var2 = new di1(ki1Var, 1);
                    this.F = 1;
                    if (kp7VarK3.a(di1Var2, this) == m45Var) {
                    }
                } else if (i7 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i8 = this.F;
                if (i8 == 0) {
                    sf5.h0(obj);
                    p41 p41Var4 = ki1Var.d;
                    kp7 kp7VarK4 = j8.K(j8.A(j8.q(new l41(3, p41Var4, tp4Var))), p41Var4.a.b());
                    di1 di1Var3 = new di1(ki1Var, 2);
                    this.F = 1;
                    if (kp7VarK4.a(di1Var3, this) == m45Var) {
                    }
                } else if (i8 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
