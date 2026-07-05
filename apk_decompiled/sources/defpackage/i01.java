package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i01 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ bz7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i01(int i, tp4 tp4Var, bz7 bz7Var) {
        super(2, tp4Var);
        this.E = i;
        this.G = bz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        bz7 bz7Var = this.G;
        switch (i) {
            case 0:
                return new i01(0, tp4Var, bz7Var);
            case 1:
                return new i01(1, tp4Var, bz7Var);
            case 2:
                return new i01(2, tp4Var, bz7Var);
            case 3:
                return new i01(3, tp4Var, bz7Var);
            case 4:
                return new i01(4, tp4Var, bz7Var);
            default:
                return new i01(5, tp4Var, bz7Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((i01) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    Object objInvoke = bz7Var.invoke(this);
                    if (objInvoke == m45Var) {
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
                    if (bz7Var.invoke(this) == m45Var) {
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
                    if (bz7Var.invoke(this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 3:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    Object objInvoke2 = bz7Var.invoke(this);
                    if (objInvoke2 == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 4:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (bz7Var.invoke(this) == m45Var) {
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (bz7Var.invoke(this) == m45Var) {
                    }
                } else if (i7 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
