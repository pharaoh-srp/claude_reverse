package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eh5 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ bi5 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh5(bi5 bi5Var, crd crdVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 3;
        this.G = bi5Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        bi5 bi5Var = this.G;
        switch (i) {
            case 0:
                return new eh5(0, tp4Var, bi5Var);
            case 1:
                return new eh5(1, tp4Var, bi5Var);
            case 2:
                return new eh5(2, tp4Var, bi5Var);
            case 3:
                return new eh5(bi5Var, (crd) null, tp4Var);
            default:
                return new eh5(4, tp4Var, bi5Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((eh5) create(bool, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((eh5) create((lp7) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((eh5) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                return ((eh5) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((eh5) create(bool2, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        bi5 bi5Var = this.G;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
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
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (bi5.c(bi5Var, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    el5 el5Var = bi5Var.h;
                    this.F = 1;
                    Object objW = ((v84) el5Var.F).w(this);
                    if (objW != m45Var) {
                        objW = ieiVar;
                    }
                    if (objW != m45Var) {
                    }
                } else if (i4 == 1) {
                    sf5.h0(obj);
                } else if (i4 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                kp7 kp7VarL = j8.l(bi5Var.f().c, -1, py1.E);
                o60 o60Var = new o60(3, bi5Var);
                this.F = 2;
                if (kp7VarL.a(o60Var, this) != m45Var) {
                }
                break;
            case 3:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    nh5 nh5Var = new nh5(0, tp4Var, bi5Var);
                    this.F = 1;
                    Object objY = zh4.y(this, nh5Var);
                    if (objY == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    z7g z7gVarF2 = bi5Var.f();
                    this.F = 1;
                    Integer numA2 = z7gVarF2.a();
                    if (numA2 == m45Var) {
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh5(int i, tp4 tp4Var, bi5 bi5Var) {
        super(2, tp4Var);
        this.E = i;
        this.G = bi5Var;
    }
}
