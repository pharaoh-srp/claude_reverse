package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hu extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ lu G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu(lu luVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = luVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        lu luVar = this.G;
        switch (i) {
            case 0:
                return new hu(luVar, tp4Var, 0);
            case 1:
                return new hu(luVar, tp4Var, 1);
            case 2:
                return new hu(luVar, tp4Var, 2);
            default:
                return new hu(luVar, tp4Var, 3);
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
        return ((hu) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        int i2 = 2;
        iei ieiVar = iei.a;
        lu luVar = this.G;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                zy1 zy1Var = luVar.k;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    zy1 zy1Var2 = luVar.d.h;
                    this.F = 1;
                    if (x44.I(zy1Var2, zy1Var, this) != m45Var) {
                    }
                } else if (i3 == 1) {
                    sf5.h0(obj);
                } else if (i3 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                zy1 zy1Var3 = luVar.e.i;
                this.F = 2;
                if (x44.I(zy1Var3, zy1Var, this) != m45Var) {
                }
                break;
            case 1:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    b3f b3fVarD0 = mpk.d0(new gu(luVar, 5));
                    i7 i7Var = new i7(i2, luVar);
                    this.F = 1;
                    if (b3fVarD0.a(i7Var, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    kp7 kp7VarY = j8.y(mpk.d0(new gu(luVar, 6)), 500L);
                    m0 m0Var = new m0(luVar, tp4Var, 8);
                    this.F = 1;
                    if (j8.u(kp7VarY, m0Var, this) == m45Var) {
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
                    vd3 vd3Var = luVar.d;
                    this.F = 1;
                    if (vd3Var.g(this) == m45Var) {
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
}
