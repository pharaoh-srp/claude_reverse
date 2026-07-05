package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wc3 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ xc3 G;
    public final /* synthetic */ fn1 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc3(xc3 xc3Var, fn1 fn1Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 1;
        this.G = xc3Var;
        this.H = fn1Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        xc3 xc3Var = this.G;
        fn1 fn1Var = this.H;
        switch (i) {
            case 0:
                return new wc3(fn1Var, xc3Var, tp4Var, 0);
            case 1:
                return new wc3(xc3Var, fn1Var, tp4Var);
            case 2:
                return new wc3(fn1Var, xc3Var, tp4Var, 2);
            case 3:
                return new wc3(fn1Var, xc3Var, tp4Var, 3);
            default:
                return new wc3(fn1Var, xc3Var, tp4Var, 4);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 2:
                ((wc3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ((wc3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        xc3 xc3Var = this.G;
        fn1 fn1Var = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    b3f b3fVarD0 = mpk.d0(new xj1(fn1Var, 5));
                    vc3 vc3Var = new vc3(xc3Var, 0);
                    this.F = 1;
                    if (b3fVarD0.a(vc3Var, this) == m45Var) {
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
                    xj1 xj1Var = new xj1(fn1Var, 6);
                    xj1 xj1Var2 = new xj1(fn1Var, 7);
                    r73 r73Var = new r73(0, this.G, xc3.class, "end", "end()V", 0, 21);
                    this.F = 1;
                    if (mpk.d0(new ik1(xj1Var, 18, xj1Var2)).a(new i7(9, r73Var), this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    a4e a4eVar = (a4e) ((tn1) fn1Var).n.i;
                    w01 w01Var = new w01(1, xc3Var.e);
                    this.F = 1;
                    if (a4eVar.E.a(w01Var, this) == m45Var) {
                    }
                }
                sz6.r();
                break;
            case 3:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    b3f b3fVarD02 = mpk.d0(new xj1(fn1Var, 8));
                    vc3 vc3Var2 = new vc3(xc3Var, 1);
                    this.F = 1;
                    if (b3fVarD02.a(vc3Var2, this) == m45Var) {
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
                    b3f b3fVarD03 = mpk.d0(new xj1(fn1Var, 9));
                    vc3 vc3Var3 = new vc3(xc3Var, 2);
                    this.F = 1;
                    if (b3fVarD03.a(vc3Var3, this) == m45Var) {
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
    public /* synthetic */ wc3(fn1 fn1Var, xc3 xc3Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = fn1Var;
        this.G = xc3Var;
    }
}
