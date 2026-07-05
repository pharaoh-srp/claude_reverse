package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f41 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f41() {
        super(2, null);
        this.E = 1;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                f41 f41Var = new f41(2, tp4Var, 0);
                f41Var.F = ((Number) obj).intValue();
                return f41Var;
            case 1:
                f41 f41Var2 = new f41(2, tp4Var, 1);
                f41Var2.F = ((Number) obj).intValue();
                return f41Var2;
            case 2:
                return new f41(2, tp4Var, 2);
            case 3:
                return new f41(2, tp4Var, 3);
            case 4:
                f41 f41Var3 = new f41(2, tp4Var, 4);
                f41Var3.F = ((Number) obj).intValue();
                return f41Var3;
            default:
                return new f41(2, tp4Var, 5);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((f41) create(Integer.valueOf(((Number) obj).intValue()), (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((f41) create(Integer.valueOf(((Number) obj).intValue()), (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((f41) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                return ((f41) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 4:
                return ((f41) create(Integer.valueOf(((Number) obj).intValue()), (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((f41) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                sf5.h0(obj);
                if (i2 != 1 && i2 != 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                int i3 = this.F;
                sf5.h0(obj);
                return Boolean.valueOf(i3 > 0);
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    xga xgaVar = new xga(3);
                    this.F = 1;
                    return j8.O(getContext()).b0(this, xgaVar) == m45Var ? m45Var : ieiVar;
                }
                if (i4 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (af8.c(this) != m45Var) {
                    }
                    return m45Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                this.F = 2;
                Object objC = af8.c(this);
                if (objC != m45Var) {
                    return objC;
                }
                return m45Var;
            case 4:
                int i6 = this.F;
                sf5.h0(obj);
                return Boolean.valueOf(i6 > 0);
            default:
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    return bqk.e(this) == m45Var ? m45Var : ieiVar;
                }
                if (i7 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f41(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }
}
