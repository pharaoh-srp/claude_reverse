package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f55 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ i55 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f55(i55 i55Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = i55Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        i55 i55Var = this.G;
        switch (i) {
            case 0:
                return new f55(i55Var, tp4Var, 0);
            case 1:
                return new f55(i55Var, tp4Var, 1);
            default:
                return new f55(i55Var, tp4Var, 2);
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
        return ((f55) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        i55 i55Var = this.G;
        int i2 = 1;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 == 1) {
                        sf5.h0(obj);
                        return (iei) obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                lf9 lf9Var = i55Var.i;
                if (lf9Var != null) {
                    this.F = 1;
                    obj = lf9Var.n(this);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                    return (iei) obj;
                }
                return null;
            case 1:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    return i55.b(i55Var, this) == m45Var ? m45Var : ieiVar;
                }
                if (i4 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    long j = i55Var.f;
                    this.F = 1;
                    if (d4c.L(j, this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i5 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                if (i55Var.j) {
                    return ieiVar;
                }
                i55Var.j = true;
                i55Var.i = trk.h(i55Var.d, b6c.F, new f55(i55Var, tp4Var, i2));
                return ieiVar;
        }
    }
}
