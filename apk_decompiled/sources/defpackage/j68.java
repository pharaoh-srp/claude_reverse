package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j68 extends xzg implements sz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ wm0 G;
    public /* synthetic */ boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j68(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 4;
        wm0 wm0Var = (wm0) obj2;
        Boolean bool = (Boolean) obj3;
        switch (i) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                j68 j68Var = new j68(i2, (tp4) obj4, 0);
                j68Var.G = wm0Var;
                j68Var.H = zBooleanValue;
                return j68Var.invokeSuspend(ieiVar);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                j68 j68Var2 = new j68(i2, (tp4) obj4, 1);
                j68Var2.G = wm0Var;
                j68Var2.H = zBooleanValue2;
                return j68Var2.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                iei ieiVar = iei.a;
                if (i2 == 0) {
                    sf5.h0(obj);
                    wm0 wm0Var = this.G;
                    if (this.H) {
                        this.F = 1;
                        Object objE = wm0Var.e(qm0.a, this);
                        if (objE != m45Var) {
                            objE = ieiVar;
                        }
                        if (objE == m45Var) {
                            return m45Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return ieiVar;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    wm0 wm0Var2 = this.G;
                    if (!this.H) {
                        this.F = 1;
                        Object objF = wm0Var2.f(this);
                        return objF == m45Var ? m45Var : objF;
                    }
                } else {
                    if (i3 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
