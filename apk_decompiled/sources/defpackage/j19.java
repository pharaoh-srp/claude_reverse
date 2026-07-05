package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j19 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ k19 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j19(k19 k19Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = k19Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        k19 k19Var = this.G;
        switch (i) {
            case 0:
                return new j19(k19Var, tp4Var, 0);
            case 1:
                return new j19(k19Var, tp4Var, 1);
            case 2:
                return new j19(k19Var, tp4Var, 2);
            default:
                return new j19(k19Var, tp4Var, 3);
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
        return ((j19) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        k19 k19Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    a80 a80Var = k19Var.b0;
                    if (a80Var != null) {
                        ffh ffhVarC = k19Var.a0;
                        if (ffhVarC == null) {
                            ffhVarC = vz8.C(((gwa) yb5.o(k19Var, jwa.a)).a, (nkh) yb5.o(k19Var, okh.a));
                        }
                        d54 d54Var = new d54(ffhVarC.d(k19Var.U, false, k19Var.Y));
                        mb0 mb0VarT = k19Var.U ? u00.t(((gwa) yb5.o(k19Var, jwa.a)).d, asb.H) : kxk.J();
                        this.F = 1;
                        obj = a80.c(a80Var, d54Var, mb0VarT, null, this, 12);
                        if (obj == m45Var) {
                        }
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
                    a80 a80Var2 = k19Var.d0;
                    va6 va6Var = new va6((k19Var.Y && k19Var.U) ? k19Var.W : k19Var.X);
                    mb0 mb0VarT2 = k19Var.U ? u00.t(((gwa) yb5.o(k19Var, jwa.a)).d, asb.F) : kxk.J();
                    this.F = 1;
                    if (a80.c(a80Var2, va6Var, mb0VarT2, null, this, 12) == m45Var) {
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
                    this.F = 1;
                    if (k19.s1(k19Var, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (k19.s1(k19Var, this) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
